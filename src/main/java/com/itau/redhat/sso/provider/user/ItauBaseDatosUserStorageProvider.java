/**
 * 
 */
package com.itau.redhat.sso.provider.user;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.keycloak.component.ComponentModel;
import org.keycloak.credential.CredentialInput;
import org.keycloak.credential.CredentialInputUpdater;
import org.keycloak.credential.CredentialInputValidator;
import org.keycloak.credential.CredentialModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserCredentialModel;
import org.keycloak.models.UserModel;
import org.keycloak.storage.ReadOnlyException;
import org.keycloak.storage.UserStorageProvider;
import org.keycloak.storage.user.UserLookupProvider;

import com.itau.redhat.sso.util.Constant;
import com.itau.redhat.sso.util.Util;
import com.itau.redhat.sso.util.ValidatePasswordClient;

import co.com.itau.services.security.validatepassword.v1.schemas.DoValidatePasswordRsType;
import co.com.itau.services.security.validatepassword.v1.schemas.GetCustomerLoginRs;

/**
 * Clase que permite realizar el login por medio de username y clave
 * conectandose a la base de datos de ITAU esta validacion se realiza con un Jar
 * provisto por ITAU.
 * 
 * @author Lazaro Miguel Coronado Torres
 * @since 29/01/2020
 * @version 0.1
 *
 */
public class ItauBaseDatosUserStorageProvider
		implements UserStorageProvider, UserLookupProvider, CredentialInputValidator, CredentialInputUpdater {

	protected KeycloakSession session;
	protected ComponentModel model;
	// map of loaded users in this transaction
	protected Map<String, UserModel> loadedUsers = new HashMap<String, UserModel>();


	private Logger LOG = Logger.getLogger(ItauBaseDatosUserStorageProvider.class);

	public ItauBaseDatosUserStorageProvider(KeycloakSession session, ComponentModel model) {
		this.session = session;
		this.model = model;
	}

	public UserModel getUserByEmail(String email, RealmModel realm) {
		return null;
	}

	public UserModel getUserById(String id, RealmModel realm) {
		return null;
	}

	/**
	 * Metodo para validar el usuario y la clave de un usuario por medio del
	 * username
	 * 
	 * @param username Usuario a validar
	 * @param realm    Realm que se esta usando
	 */
	public UserModel getUserByUsername(String username, RealmModel realm) {
		LOG.info("ItauBaseDatosUserStorageProvider.getUserByUsername Usuario: " + username);

		UserModel adapter = loadedUsers.get(username);
		if (adapter == null) {

			try {
				String userMD5 = Util.getHashMD5(username.toUpperCase());
				GetCustomerLoginRs getCustomerLoginRs = ValidatePasswordClient.consumeWScustomerLogin(userMD5);
				LOG.info("Valores encontrados statuscode: " + getCustomerLoginRs.getHeaderResponse().getStatus().getStatusCode());
				LOG.info("Valores encontrados serverstatuscode: " + getCustomerLoginRs.getHeaderResponse().getStatus().getServerStatusCode() );
				if (!(Constant.STATUS_CODE.equals(String.valueOf(getCustomerLoginRs.getHeaderResponse().getStatus().getStatusCode()))
						&& Constant.SERVER_STATUS_CODE_LOGIN
								.equals(getCustomerLoginRs.getHeaderResponse().getStatus().getServerStatusCode()))) {
					return adapter;
				}

				adapter = new UserAdapterItau(session, realm, model);
				adapter.setUsername(getCustomerLoginRs.getCustLoginId());
				adapter.setSingleAttribute("type_id", getCustomerLoginRs.getCustType());
				adapter.setSingleAttribute("num_id", getCustomerLoginRs.getCustPermId());
				
				loadedUsers.put(username, adapter);
				LOG.info("ItauBaseDatosUserStorageProvider.getUserByUsername Encontro adapter");

			} catch (Exception e) {
				LOG.error("Error el MD5", e);
			}
		}

		return adapter;
	}

	public boolean supportsCredentialType(String credentialType) {
		return credentialType.equals(CredentialModel.PASSWORD);
	}

	public boolean isConfiguredFor(RealmModel realm, UserModel user, String credentialType) {
		return credentialType.equals(CredentialModel.PASSWORD);
	}

	/**
	 * Metodo que valida el password de un usuario.
	 * 
	 */
	public boolean isValid(RealmModel realm, UserModel user, CredentialInput input) {
		boolean userValid = false;
		DoValidatePasswordRsType response = new DoValidatePasswordRsType();
		if (!supportsCredentialType(input.getType()) || !(input instanceof UserCredentialModel)) {
			return false;
		}

		UserCredentialModel cred = (UserCredentialModel) input;

		String usuario = user.getUsername();
		String password = cred.getValue();

		

		LOG.info("ItauBaseDatosUserStorageProvider.isValid Usuario que llego: " + usuario);
		LOG.info("ItauBaseDatosUserStorageProvider.isValid Password que llego: " + password);

		try {

			
			String serverStatusCode = "";
			String serverSeverity = "";

			response = ValidatePasswordClient.consumeWSValidatePassword(usuario, password);

			Long statusCode = response.getHeaderResponse().getStatus().getStatusCode();
			serverStatusCode = response.getHeaderResponse().getStatus().getServerStatusCode();
			serverSeverity = response.getHeaderResponse().getStatus().getSeverity();
			LOG.info("statusCode: " + statusCode);
			LOG.info("serverStatusCode: " + serverStatusCode);
			LOG.info("serverSeverity: " + serverSeverity);
			if (Constant.STATUS_CODE.equals(statusCode.toString())
					&& Constant.SERVER_STATUS_CODE.equals(serverStatusCode)
					&& Constant.SERVER_SEVERITY.equals(serverSeverity)) {
				userValid = true;

			}
			try {
				LOG.info("userValid: " + userValid);

			} catch (Exception e) {
				LOG.error("Error obteniendo datos del usuario");
			}
		} catch (Exception ex) {
			LOG.error("ItauBaseDatosUserStorageProvider.isValid Error obteniendo respuesta del servicio con error: "
					+ ex.getMessage());
	
		}

		return userValid;
	}



	public boolean updateCredential(RealmModel realm, UserModel user, CredentialInput input) {
		if (input.getType().equals(CredentialModel.PASSWORD)) {
			throw new ReadOnlyException("user is read only for this update");
		}

		return false;
	}

	public void disableCredentialType(RealmModel realm, UserModel user, String credentialType) {
		//
	}

	public Set<String> getDisableableCredentialTypes(RealmModel realm, UserModel user) {
		return Collections.emptySet();
	}

	public void close() {
		//
	}
}
