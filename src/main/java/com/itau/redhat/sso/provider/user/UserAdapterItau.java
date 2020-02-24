package com.itau.redhat.sso.provider.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.storage.StorageId;
import org.keycloak.storage.adapter.AbstractUserAdapterFederatedStorage;

public class UserAdapterItau extends AbstractUserAdapterFederatedStorage {
	protected KeycloakSession session;
	protected RealmModel realm;
	protected ComponentModel storageProviderModel;
	protected StorageId storageId;
	protected String userName;
	protected String typeId;
	protected String numId;
	protected String email;

	public UserAdapterItau(KeycloakSession session, RealmModel realm, ComponentModel storageProviderModel) {
		super(session, realm, storageProviderModel);
		this.session = session;
		this.realm = realm;
		this.storageProviderModel = storageProviderModel;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public void setUsername(String username) {
		this.userName = username;
	}

	@Override
	public String getFirstAttribute(String name) {
		if (name.equals("type_id")) {
			return this.getTypeId();
		} else if (name.equals("num_id")) {
			return this.getNumId();
		}

		System.out.println("Entro a getFirstAttribute " + name);

		return null;
	}

	@Override
	public void setSingleAttribute(String name, String value) {
		if (name.equals("type_id")) {
			this.setTypeId(value);
		} else if (name.equals("num_id")) {
			this.setNumId(value);
		} else {
			getFederatedStorage().setSingleAttribute(realm, this.getId(), name, value);
		}

	}

	@Override
	public List<String> getAttribute(String name) {
		List<String> retorno = new ArrayList<String>();

		if (name.equals("type_id")) {
			retorno.add(getTypeId());
		} else if (name.equals("num_id")) {
			retorno.add(getNumId());
		} else {
			
		}

		System.out.println("Entro a getAttribute " + name);

		return retorno;
	}

	@Override
	public Map<String, List<String>> getAttributes() {
		Map<String, List<String>> atributos = new HashMap<String, List<String>>();

		List<String> typeId = new ArrayList<String>();
		List<String> numId = new ArrayList<String>();

		typeId.add(this.getTypeId());
		numId.add(this.getNumId());

		atributos.put("num_id", numId);
		atributos.put("type_id", typeId);

		System.out.println("Entro getAttributes");

		return atributos;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getNumId() {
		return numId;
	}

	public void setNumId(String numId) {
		this.numId = numId;
	}
}
