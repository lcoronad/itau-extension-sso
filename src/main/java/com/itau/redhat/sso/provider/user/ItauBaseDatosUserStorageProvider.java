/**
 * 
 */
package com.itau.redhat.sso.provider.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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

import com.itau.redhat.sso.commoncannonical.schemas.SignOnCustomerInfoRecordType;
import com.itau.redhat.sso.util.Constant;
import com.itau.redhat.sso.util.ValidatePasswordClient;

import co.com.itau.services.security.validatepassword.v1.schemas.DoValidatePasswordRsType;

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
	private List<String> datosTipoId = new ArrayList<String>();
	private List<String> datosNumId = new ArrayList<String>();
	private Map<String, String> map = new HashMap<>();
	private String tipoId = "";
	private String numId = "";

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
		if ("U66858679_66858679".equalsIgnoreCase(username)) {

			// Se crea el modelo de usuario consultando un Store procedure
			adapter = createAdapter(realm, username);
			loadedUsers.put(username, adapter);
			LOG.info("ItauBaseDatosUserStorageProvider.getUserByUsername Encontro adapter");
		}
		
		return adapter;
	}

	protected UserAdapterItau createAdapter(RealmModel realm, String username) {
		LOG.info("ItauBaseDatosUserStorageProvider.getUserByUsername creando adapter");
		
		UserAdapterItau userAdapterItau = new UserAdapterItau(session, realm, model);
		userAdapterItau.setUsername(username);
		userAdapterItau.setSingleAttribute("type_id", "1");
		userAdapterItau.setSingleAttribute("num_id", "748596");
		userAdapterItau.setEmail("pruebaasdasd@asdasd.com");
		userAdapterItau.setEmailVerified(true);
		userAdapterItau.setTypeId("1");
		userAdapterItau.setNumId("11111");
		
		return userAdapterItau;
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
		SignOnCustomerInfoRecordType signOnDatosCliente = new SignOnCustomerInfoRecordType();

		if (!supportsCredentialType(input.getType()) || !(input instanceof UserCredentialModel)) {
			return false;
		}

		UserCredentialModel cred = (UserCredentialModel) input;

		String usuario = user.getUsername();
		String password = cred.getValue();

		UserModel userAdapterItau = this.getUserByUsername(usuario, realm);

		LOG.info("ItauBaseDatosUserStorageProvider.isValid Usuario que llego: " + usuario);
		LOG.info("ItauBaseDatosUserStorageProvider.isValid Password que llego: " + password);

		try {
//	        String respuesta = CryptChannelTools.validateLogin( SECURITY_CHANNELLOGINPN_IPCRYPTO, SECURITY_CHANNELLOGINPN_PORTCRYPTO, usuario, password );	        
//	    	System.out.println( "ItauBaseDatosUserStorageProvider.isValid Respuesta de CryptoUtils que llego: " + respuesta );
//	    	userValid = respuesta.equals( RESPUESTA_OK_CRYPTOUTILS );
			Long statusCode = 0L;
			String serverStatusCode = "";
			String serverSeverity = "";

			response = ValidatePasswordClient.consumeWSValidatePassword(usuario, password);

			statusCode = response.getHeaderResponse().getStatus().getStatusCode();
			serverStatusCode = response.getHeaderResponse().getStatus().getServerStatusCode();
			serverSeverity = response.getHeaderResponse().getStatus().getSeverity();
			LOG.info("statusCode: " + statusCode);
			LOG.info("serverStatusCode: " + serverStatusCode);
			LOG.info("serverSeverity: " + serverSeverity);
			if (Constant.STATUS_CODE.equals(statusCode.toString())
					&& Constant.SERVER_STATUS_CODE.equals(serverStatusCode)
					&& Constant.SERVER_SEVERITY.equals(serverSeverity)) {
				userValid = true;
				signOnDatosCliente = response.getSignOnCustomerInfo().getValue().getSignOnCustomerInfoRecord();

				userAdapterItau.setFirstName(signOnDatosCliente.getCustName().getValue());
				userAdapterItau.setLastName(signOnDatosCliente.getUserName().getValue());
				userAdapterItau.setEmail(signOnDatosCliente.getEmailAddr().getValue());
				userAdapterItau.setSingleAttribute("type_id", signOnDatosCliente.getCustIdType().getValue());
				userAdapterItau.setSingleAttribute("num_id", signOnDatosCliente.getCustPermId().getValue());
				userAdapterItau.setSingleAttribute("UserIdType", signOnDatosCliente.getUserIdType().getValue());
				userAdapterItau.setSingleAttribute("SessionId", signOnDatosCliente.getSessionId().getValue());

				loadedUsers.put(usuario, userAdapterItau);
			}
			try {
				LOG.info("userValid: " + userValid);
				// LOG.info("Obteniendo Datos del Usuario");
				// setCustomerData(response);
				// createAdapter(realm, usuario);
			} catch (Exception e) {
				LOG.error("Error obteniendo datos del usuario");
			}
		} catch (Exception ex) {
			LOG.error("ItauBaseDatosUserStorageProvider.isValid Error obteniendo respuesta del servicio con error: "
					+ ex.getMessage());
			ex.printStackTrace();
		}

		return userValid;
	}

	private void setCustomerData(DoValidatePasswordRsType response) {
		tipoId = response.getSignOnCustomerInfo().getValue().getSignOnCustomerInfoRecord().getCustIdType().getValue();
		numId = response.getSignOnCustomerInfo().getValue().getSignOnCustomerInfoRecord().getCustPermId().getValue();
		LOG.info("tipoId: " + tipoId);
		LOG.info("numId: " + numId);
		datosTipoId.add(tipoId);
		datosNumId.add(numId);
		map.put("firstName",
				response.getSignOnCustomerInfo().getValue().getSignOnCustomerInfoRecord().getUserName().getValue());
		map.put("lastName",
				response.getSignOnCustomerInfo().getValue().getSignOnCustomerInfoRecord().getCustName().getValue());
		map.put("email",
				response.getSignOnCustomerInfo().getValue().getSignOnCustomerInfoRecord().getEmailAddr().getValue());

	}

	public boolean updateCredential(RealmModel realm, UserModel user, CredentialInput input) {
		if (input.getType().equals(CredentialModel.PASSWORD)) {
			throw new ReadOnlyException("user is read only for this update");
		}

		return false;
	}

	public void disableCredentialType(RealmModel realm, UserModel user, String credentialType) {

	}

	public Set<String> getDisableableCredentialTypes(RealmModel realm, UserModel user) {
		return Collections.emptySet();
	}

	public void close() {

	}
}
