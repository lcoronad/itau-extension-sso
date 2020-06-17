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

import com.itau.redhat.sso.util.Constant;

public class UserAdapterItau extends AbstractUserAdapterFederatedStorage {
	protected KeycloakSession sessionAdapter;
	protected RealmModel realmAdapter;
	protected ComponentModel storageProviderModeladapter;
	protected StorageId storageIdAdapter;
	protected String userName;
	protected String typeId;
	protected String numId;
	protected String email;

	public UserAdapterItau(KeycloakSession session, RealmModel realm, ComponentModel storageProviderModel) {
		super(session, realm, storageProviderModel);
		this.sessionAdapter = session;
		this.realmAdapter = realm;
		this.storageProviderModeladapter = storageProviderModel;
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
		if (name.equals(Constant.TYPE_ID)) {
			return this.getTypeId();
		} else if (name.equals(Constant.NUM_ID)) {
			return this.getNumId();
		}

		return null;
	}

	@Override
	public void setSingleAttribute(String name, String value) {
		if (name.equals(Constant.TYPE_ID)) {
			this.setTypeId(value);
		} else if (name.equals(Constant.NUM_ID)) {
			this.setNumId(value);
		} else {
			getFederatedStorage().setSingleAttribute(realmAdapter, this.getId(), name, value);
		}

	}

	@Override
	public List<String> getAttribute(String name) {
		List<String> retorno = new ArrayList<>();

		if (name.equals(Constant.TYPE_ID)) {
			retorno.add(getTypeId());
		} else if (name.equals(Constant.NUM_ID)) {
			retorno.add(getNumId());
		}

		return retorno;
	}

	@Override
	public Map<String, List<String>> getAttributes() {
		Map<String, List<String>> atributos = new HashMap<>();

		List<String> typeId = new ArrayList<>();
		List<String> numId = new ArrayList<>();

		typeId.add(this.getTypeId());
		numId.add(this.getNumId());

		atributos.put(Constant.NUM_ID, numId);
		atributos.put(Constant.TYPE_ID, typeId);

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

	@Override
	public boolean equals(Object o) {
		return true;
	}

	@Override
	public int hashCode() {
		/* ... */
		return 0;
	}
}
