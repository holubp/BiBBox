/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package at.graz.meduni.liferay.portlet.bibbox.service.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the InvitationOrganisation service. Represents a row in the &quot;bibboxcs.invitation_organisation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link at.graz.meduni.liferay.portlet.bibbox.service.model.impl.InvitationOrganisationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link at.graz.meduni.liferay.portlet.bibbox.service.model.impl.InvitationOrganisationImpl}.
 * </p>
 *
 * @author reihsr
 * @see InvitationOrganisation
 * @see at.graz.meduni.liferay.portlet.bibbox.service.model.impl.InvitationOrganisationImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.service.model.impl.InvitationOrganisationModelImpl
 * @generated
 */
public interface InvitationOrganisationModel extends BaseModel<InvitationOrganisation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a invitation organisation model instance should use the {@link InvitationOrganisation} interface instead.
	 */

	/**
	 * Returns the primary key of this invitation organisation.
	 *
	 * @return the primary key of this invitation organisation
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this invitation organisation.
	 *
	 * @param primaryKey the primary key of this invitation organisation
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the invitation organisation ID of this invitation organisation.
	 *
	 * @return the invitation organisation ID of this invitation organisation
	 */
	public long getInvitationOrganisationId();

	/**
	 * Sets the invitation organisation ID of this invitation organisation.
	 *
	 * @param invitationOrganisationId the invitation organisation ID of this invitation organisation
	 */
	public void setInvitationOrganisationId(long invitationOrganisationId);

	/**
	 * Returns the invitation ID of this invitation organisation.
	 *
	 * @return the invitation ID of this invitation organisation
	 */
	public long getInvitationId();

	/**
	 * Sets the invitation ID of this invitation organisation.
	 *
	 * @param invitationId the invitation ID of this invitation organisation
	 */
	public void setInvitationId(long invitationId);

	/**
	 * Returns the organisation ID of this invitation organisation.
	 *
	 * @return the organisation ID of this invitation organisation
	 */
	public long getOrganisationId();

	/**
	 * Sets the organisation ID of this invitation organisation.
	 *
	 * @param organisationId the organisation ID of this invitation organisation
	 */
	public void setOrganisationId(long organisationId);

	/**
	 * Returns the user ID of this invitation organisation.
	 *
	 * @return the user ID of this invitation organisation
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this invitation organisation.
	 *
	 * @param userId the user ID of this invitation organisation
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this invitation organisation.
	 *
	 * @return the user uuid of this invitation organisation
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this invitation organisation.
	 *
	 * @param userUuid the user uuid of this invitation organisation
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the lastchanged of this invitation organisation.
	 *
	 * @return the lastchanged of this invitation organisation
	 */
	public Date getLastchanged();

	/**
	 * Sets the lastchanged of this invitation organisation.
	 *
	 * @param lastchanged the lastchanged of this invitation organisation
	 */
	public void setLastchanged(Date lastchanged);

	/**
	 * Returns the lastchanger of this invitation organisation.
	 *
	 * @return the lastchanger of this invitation organisation
	 */
	public long getLastchanger();

	/**
	 * Sets the lastchanger of this invitation organisation.
	 *
	 * @param lastchanger the lastchanger of this invitation organisation
	 */
	public void setLastchanger(long lastchanger);

	/**
	 * Returns the reactdate of this invitation organisation.
	 *
	 * @return the reactdate of this invitation organisation
	 */
	public Date getReactdate();

	/**
	 * Sets the reactdate of this invitation organisation.
	 *
	 * @param reactdate the reactdate of this invitation organisation
	 */
	public void setReactdate(Date reactdate);

	/**
	 * Returns the lastusedlink of this invitation organisation.
	 *
	 * @return the lastusedlink of this invitation organisation
	 */
	public Date getLastusedlink();

	/**
	 * Sets the lastusedlink of this invitation organisation.
	 *
	 * @param lastusedlink the lastusedlink of this invitation organisation
	 */
	public void setLastusedlink(Date lastusedlink);

	/**
	 * Returns the rejectdate of this invitation organisation.
	 *
	 * @return the rejectdate of this invitation organisation
	 */
	public Date getRejectdate();

	/**
	 * Sets the rejectdate of this invitation organisation.
	 *
	 * @param rejectdate the rejectdate of this invitation organisation
	 */
	public void setRejectdate(Date rejectdate);

	/**
	 * Returns the securitylinktoken of this invitation organisation.
	 *
	 * @return the securitylinktoken of this invitation organisation
	 */
	public long getSecuritylinktoken();

	/**
	 * Sets the securitylinktoken of this invitation organisation.
	 *
	 * @param securitylinktoken the securitylinktoken of this invitation organisation
	 */
	public void setSecuritylinktoken(long securitylinktoken);

	/**
	 * Returns the securitytoken of this invitation organisation.
	 *
	 * @return the securitytoken of this invitation organisation
	 */
	public long getSecuritytoken();

	/**
	 * Sets the securitytoken of this invitation organisation.
	 *
	 * @param securitytoken the securitytoken of this invitation organisation
	 */
	public void setSecuritytoken(long securitytoken);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(InvitationOrganisation invitationOrganisation);

	@Override
	public int hashCode();

	@Override
	public CacheModel<InvitationOrganisation> toCacheModel();

	@Override
	public InvitationOrganisation toEscapedModel();

	@Override
	public InvitationOrganisation toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}