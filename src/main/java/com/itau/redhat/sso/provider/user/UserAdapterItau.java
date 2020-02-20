package com.itau.redhat.sso.provider.user;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.keycloak.common.util.MultivaluedHashMap;
import org.keycloak.component.ComponentModel;
import org.keycloak.models.GroupModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.RoleModel;

public class UserAdapterItau extends AbstractUserAdapterItau {

	protected String usuario = "";
	private MultivaluedHashMap<String, String> all = new MultivaluedHashMap<>();
	private List<String> tipoId = new LinkedList<>();
	private List<String> numId = new LinkedList<>();

	public UserAdapterItau(KeycloakSession session, RealmModel realm, ComponentModel storageProviderModel) {
		super(session, realm, storageProviderModel);
	}

	public String getUsername() {
		return usuario;
	}

	public void setUsername(String username) {
		this.usuario = username;
	}

	@Override
	public void setSingleAttribute(String name, String value) {
		if (name.equals("tipoId")) {
			// entity.setPhone(value);
			tipoId.add(value);
		} else if (name.equals("numId")) {
			// entity.setPhone(value);
			tipoId.add(value);
		} else {
			super.setSingleAttribute(name, value);
		}
	}

	@Override
	public void removeAttribute(String name) {
		if (name.equals("tipoId")) {
			// entity.setPhone(null);
			tipoId.remove(name);
		}
		if (name.equals("numId")) {
			// entity.setPhone(null);
			tipoId.remove(name);
		} else {
			super.removeAttribute(name);
		}
	}

	@Override
	public void setAttribute(String name, List<String> values) {
		if (name.equals("tipoId")) {
			// entity.setPhone(values.get(0));
			all.add("tipoId", values.get(0));
		}
		if (name.equals("numId")) {
			// entity.setPhone(values.get(0));
			all.add("numId", values.get(0));
		} else {
			super.setAttribute(name, values);
		}
	}

	@Override
	public String getFirstAttribute(String name) {
		if (name.equals("tipoId")) {
			// entity.getPhone();
			return Objects.isNull(all.get("tipoId")) ? "" : all.get("tipoId").toString();
		}
		if (name.equals("numId")) {
			// entity.getPhone();
			return Objects.isNull(all.get("numId")) ? "" : all.get("numId").toString();
		} else {
			return super.getFirstAttribute(name);
		}
	}

	@Override
	public Map<String, List<String>> getAttributes() {
		Map<String, List<String>> attrs = super.getAttributes();
		all.putAll(attrs);
		return all;
	}

	@Override
	public List<String> getAttribute(String name) {
		if (name.equals("tipoId")) {
			return tipoId;
		} else if (name.equals("numId")) {
			return numId;
		} else {
			return super.getAttribute(name);
		}
	}

	@Override
	public void addRequiredAction(String action) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeRequiredAction(String action) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addRequiredAction(RequiredAction action) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeRequiredAction(RequiredAction action) {
		// TODO Auto-generated method stub

	}

	@Override
	public void joinGroup(GroupModel group) {
		// TODO Auto-generated method stub

	}

	@Override
	public void leaveGroup(GroupModel group) {
		// TODO Auto-generated method stub

	}

	@Override
	public void grantRole(RoleModel role) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRoleMapping(RoleModel role) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCreatedTimestamp(Long timestamp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFirstName(String firstName) {
		all.add("firstName", firstName);

	}

	@Override
	public void setLastName(String lastName) {
		all.add("lastName", lastName);

	}

	@Override
	public void setEmail(String email) {
		all.add("email", email);

	}

	@Override
	public void setEmailVerified(boolean verified) {
		// TODO Auto-generated method stub

	}
}
