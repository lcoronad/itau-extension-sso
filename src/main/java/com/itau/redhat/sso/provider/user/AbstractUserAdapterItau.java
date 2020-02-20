package com.itau.redhat.sso.provider.user;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.keycloak.common.util.MultivaluedHashMap;
import org.keycloak.component.ComponentModel;
import org.keycloak.models.ClientModel;
import org.keycloak.models.GroupModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.RoleContainerModel;
import org.keycloak.models.RoleModel;
import org.keycloak.models.UserModel;
import org.keycloak.models.utils.DefaultRoles;
import org.keycloak.models.utils.RoleUtils;
import org.keycloak.storage.ReadOnlyException;
import org.keycloak.storage.StorageId;

public abstract class AbstractUserAdapterItau implements UserModel {
	protected KeycloakSession session;
	protected RealmModel realm;
	protected ComponentModel storageProviderModel;

	public AbstractUserAdapterItau(KeycloakSession session, RealmModel realm, ComponentModel storageProviderModel) {
		this.session = session;
		this.realm = realm;
		this.storageProviderModel = storageProviderModel;
	}

	@Override
	public Set<String> getRequiredActions() {
		return Collections.EMPTY_SET;
	}

	@Override
	public abstract void addRequiredAction(String action);

	@Override
	public abstract void removeRequiredAction(String action);

	@Override
	public abstract void addRequiredAction(RequiredAction action);

	@Override
	public abstract void removeRequiredAction(RequiredAction action);

	/**
	 * Get group membership mappings that are managed by this storage provider
	 *
	 * @return
	 */
	protected Set<GroupModel> getGroupsInternal() {
		return Collections.EMPTY_SET;
	}

	/**
	 * Should the realm's default groups be appended to getGroups() call? If your
	 * storage provider is not managing group mappings then it is recommended that
	 * this method return true
	 *
	 * @return
	 */
	protected boolean appendDefaultGroups() {
		return true;
	}

	@Override
	public Set<GroupModel> getGroups() {
		Set<GroupModel> set = new HashSet<>();
		if (appendDefaultGroups())
			set.addAll(realm.getDefaultGroups());
		set.addAll(getGroupsInternal());
		return set;
	}

	@Override
	public abstract void joinGroup(GroupModel group);

	@Override
	public abstract void leaveGroup(GroupModel group);

	@Override
	public boolean isMemberOf(GroupModel group) {
		Set<GroupModel> roles = getGroups();
		return RoleUtils.isMember(roles, group);
	}

	@Override
	public Set<RoleModel> getRealmRoleMappings() {
		Set<RoleModel> roleMappings = getRoleMappings();

		Set<RoleModel> realmRoles = new HashSet<RoleModel>();
		for (RoleModel role : roleMappings) {
			RoleContainerModel container = role.getContainer();
			if (container instanceof RealmModel) {
				realmRoles.add(role);
			}
		}
		return realmRoles;
	}

	@Override
	public Set<RoleModel> getClientRoleMappings(ClientModel app) {
		Set<RoleModel> roleMappings = getRoleMappings();

		Set<RoleModel> roles = new HashSet<RoleModel>();
		for (RoleModel role : roleMappings) {
			RoleContainerModel container = role.getContainer();
			if (container instanceof ClientModel) {
				ClientModel appModel = (ClientModel) container;
				if (appModel.getId().equals(app.getId())) {
					roles.add(role);
				}
			}
		}
		return roles;
	}

	@Override
	public boolean hasRole(RoleModel role) {
		Set<RoleModel> roles = getRoleMappings();
		return RoleUtils.hasRole(roles, role) || RoleUtils.hasRoleFromGroup(getGroups(), role, true);
	}

	@Override
	public abstract void grantRole(RoleModel role);

	/**
	 * Should the realm's default roles be appended to getRoleMappings() call? If
	 * your storage provider is not managing all role mappings then it is
	 * recommended that this method return true
	 *
	 * @return
	 */
	protected boolean appendDefaultRolesToRoleMappings() {
		return true;
	}

	protected Set<RoleModel> getRoleMappingsInternal() {
		return Collections.EMPTY_SET;
	}

	@Override
	public Set<RoleModel> getRoleMappings() {
		Set<RoleModel> set = new HashSet<>();
		if (appendDefaultRolesToRoleMappings())
			set.addAll(DefaultRoles.getDefaultRoles(realm));
		set.addAll(getRoleMappingsInternal());
		return set;
	}

	@Override
	public abstract void deleteRoleMapping(RoleModel role);

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public void setEnabled(boolean enabled) {
		throw new ReadOnlyException("user is read only for this update");
	}

	/**
	 * This method should not be overriden
	 *
	 * @return
	 */
	@Override
	public String getFederationLink() {
		return null;
	}

	/**
	 * This method should not be overriden
	 *
	 * @return
	 */
	@Override
	public void setFederationLink(String link) {
		throw new ReadOnlyException("user is read only for this update");

	}

	/**
	 * This method should not be overriden
	 *
	 * @return
	 */
	@Override
	public String getServiceAccountClientLink() {
		return null;
	}

	/**
	 * This method should not be overriden
	 *
	 * @return
	 */
	@Override
	public void setServiceAccountClientLink(String clientInternalId) {
		throw new ReadOnlyException("user is read only for this update");

	}

	protected StorageId storageId;

	/**
	 * Defaults to 'f:' + storageProvider.getId() + ':' + getUsername()
	 *
	 * @return
	 */
	@Override
	public String getId() {
		if (storageId == null) {
			storageId = new StorageId(storageProviderModel.getId(), getUsername());
		}
		return storageId.getId();
	}

	@Override
	public abstract void setUsername(String username);

	protected long created = System.currentTimeMillis();

	@Override
	public Long getCreatedTimestamp() {
		return created;
	}

	@Override
	public abstract void setCreatedTimestamp(Long timestamp);

	@Override
	public void setSingleAttribute(String name, String value) {

	}

	@Override
	public void removeAttribute(String name) {
		throw new ReadOnlyException("user is read only for this update");

	}

	@Override
	public void setAttribute(String name, List<String> values){

    }

	@Override
	public String getFirstAttribute(String name) {
		return null;
	}

	@Override
	public Map<String, List<String>> getAttributes() {
		return new MultivaluedHashMap<>();
	}

	@Override
	public List<String> getAttribute(String name) {
		return null;
	}

	@Override
	public String getFirstName() {
		return null;
	}

	@Override
	public abstract void setFirstName(String firstName);

	@Override
	public String getLastName() {
		return null;
	}

	@Override
	public abstract void setLastName(String lastName);

	@Override
	public String getEmail() {
		return null;
	}

	@Override
	public abstract void setEmail(String email);

	@Override
	public boolean isEmailVerified() {
		return false;
	}

	@Override
	public abstract void setEmailVerified(boolean verified);

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || !(o instanceof UserModel))
			return false;

		UserModel that = (UserModel) o;
		return that.getId().equals(getId());
	}

	@Override
	public int hashCode() {
		return getId().hashCode();
	}
}
