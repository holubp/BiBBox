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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Invitation service. Represents a row in the &quot;bibboxcs.invitation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link at.graz.meduni.liferay.portlet.bibbox.service.model.impl.InvitationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link at.graz.meduni.liferay.portlet.bibbox.service.model.impl.InvitationImpl}.
 * </p>
 *
 * @author reihsr
 * @see Invitation
 * @see at.graz.meduni.liferay.portlet.bibbox.service.model.impl.InvitationImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.service.model.impl.InvitationModelImpl
 * @generated
 */
public interface InvitationModel extends BaseModel<Invitation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a invitation model instance should use the {@link Invitation} interface instead.
	 */

	/**
	 * Returns the primary key of this invitation.
	 *
	 * @return the primary key of this invitation
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this invitation.
	 *
	 * @param primaryKey the primary key of this invitation
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the invitation ID of this invitation.
	 *
	 * @return the invitation ID of this invitation
	 */
	public long getInvitationId();

	/**
	 * Sets the invitation ID of this invitation.
	 *
	 * @param invitationId the invitation ID of this invitation
	 */
	public void setInvitationId(long invitationId);

	/**
	 * Returns the name of this invitation.
	 *
	 * @return the name of this invitation
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this invitation.
	 *
	 * @param name the name of this invitation
	 */
	public void setName(String name);

	/**
	 * Returns the subject of this invitation.
	 *
	 * @return the subject of this invitation
	 */
	@AutoEscape
	public String getSubject();

	/**
	 * Sets the subject of this invitation.
	 *
	 * @param subject the subject of this invitation
	 */
	public void setSubject(String subject);

	/**
	 * Returns the body of this invitation.
	 *
	 * @return the body of this invitation
	 */
	@AutoEscape
	public String getBody();

	/**
	 * Sets the body of this invitation.
	 *
	 * @param body the body of this invitation
	 */
	public void setBody(String body);

	/**
	 * Returns the status of this invitation.
	 *
	 * @return the status of this invitation
	 */
	public long getStatus();

	/**
	 * Sets the status of this invitation.
	 *
	 * @param status the status of this invitation
	 */
	public void setStatus(long status);

	/**
	 * Returns the invitationsend of this invitation.
	 *
	 * @return the invitationsend of this invitation
	 */
	public Date getInvitationsend();

	/**
	 * Sets the invitationsend of this invitation.
	 *
	 * @param invitationsend the invitationsend of this invitation
	 */
	public void setInvitationsend(Date invitationsend);

	/**
	 * Returns the lastchanged of this invitation.
	 *
	 * @return the lastchanged of this invitation
	 */
	public Date getLastchanged();

	/**
	 * Sets the lastchanged of this invitation.
	 *
	 * @param lastchanged the lastchanged of this invitation
	 */
	public void setLastchanged(Date lastchanged);

	/**
	 * Returns the lastchanger of this invitation.
	 *
	 * @return the lastchanger of this invitation
	 */
	public long getLastchanger();

	/**
	 * Sets the lastchanger of this invitation.
	 *
	 * @param lastchanger the lastchanger of this invitation
	 */
	public void setLastchanger(long lastchanger);

	/**
	 * Returns the filter of this invitation.
	 *
	 * @return the filter of this invitation
	 */
	@AutoEscape
	public String getFilter();

	/**
	 * Sets the filter of this invitation.
	 *
	 * @param filter the filter of this invitation
	 */
	public void setFilter(String filter);

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
	public int compareTo(Invitation invitation);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Invitation> toCacheModel();

	@Override
	public Invitation toEscapedModel();

	@Override
	public Invitation toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}