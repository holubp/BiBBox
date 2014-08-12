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

package at.graz.meduni.liferay.portlet.bibbox.service.service.base;

import at.graz.meduni.liferay.portlet.bibbox.service.model.Invitation;
import at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationService;
import at.graz.meduni.liferay.portlet.bibbox.service.service.persistence.InvitationOrganisationPersistence;
import at.graz.meduni.liferay.portlet.bibbox.service.service.persistence.InvitationPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the invitation remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link at.graz.meduni.liferay.portlet.bibbox.service.service.impl.InvitationServiceImpl}.
 * </p>
 *
 * @author reihsr
 * @see at.graz.meduni.liferay.portlet.bibbox.service.service.impl.InvitationServiceImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationServiceUtil
 * @generated
 */
public abstract class InvitationServiceBaseImpl extends BaseServiceImpl
	implements InvitationService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationServiceUtil} to access the invitation remote service.
	 */

	/**
	 * Returns the invitation local service.
	 *
	 * @return the invitation local service
	 */
	public at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationLocalService getInvitationLocalService() {
		return invitationLocalService;
	}

	/**
	 * Sets the invitation local service.
	 *
	 * @param invitationLocalService the invitation local service
	 */
	public void setInvitationLocalService(
		at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationLocalService invitationLocalService) {
		this.invitationLocalService = invitationLocalService;
	}

	/**
	 * Returns the invitation remote service.
	 *
	 * @return the invitation remote service
	 */
	public at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationService getInvitationService() {
		return invitationService;
	}

	/**
	 * Sets the invitation remote service.
	 *
	 * @param invitationService the invitation remote service
	 */
	public void setInvitationService(
		at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationService invitationService) {
		this.invitationService = invitationService;
	}

	/**
	 * Returns the invitation persistence.
	 *
	 * @return the invitation persistence
	 */
	public InvitationPersistence getInvitationPersistence() {
		return invitationPersistence;
	}

	/**
	 * Sets the invitation persistence.
	 *
	 * @param invitationPersistence the invitation persistence
	 */
	public void setInvitationPersistence(
		InvitationPersistence invitationPersistence) {
		this.invitationPersistence = invitationPersistence;
	}

	/**
	 * Returns the invitation organisation local service.
	 *
	 * @return the invitation organisation local service
	 */
	public at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationOrganisationLocalService getInvitationOrganisationLocalService() {
		return invitationOrganisationLocalService;
	}

	/**
	 * Sets the invitation organisation local service.
	 *
	 * @param invitationOrganisationLocalService the invitation organisation local service
	 */
	public void setInvitationOrganisationLocalService(
		at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationOrganisationLocalService invitationOrganisationLocalService) {
		this.invitationOrganisationLocalService = invitationOrganisationLocalService;
	}

	/**
	 * Returns the invitation organisation remote service.
	 *
	 * @return the invitation organisation remote service
	 */
	public at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationOrganisationService getInvitationOrganisationService() {
		return invitationOrganisationService;
	}

	/**
	 * Sets the invitation organisation remote service.
	 *
	 * @param invitationOrganisationService the invitation organisation remote service
	 */
	public void setInvitationOrganisationService(
		at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationOrganisationService invitationOrganisationService) {
		this.invitationOrganisationService = invitationOrganisationService;
	}

	/**
	 * Returns the invitation organisation persistence.
	 *
	 * @return the invitation organisation persistence
	 */
	public InvitationOrganisationPersistence getInvitationOrganisationPersistence() {
		return invitationOrganisationPersistence;
	}

	/**
	 * Sets the invitation organisation persistence.
	 *
	 * @param invitationOrganisationPersistence the invitation organisation persistence
	 */
	public void setInvitationOrganisationPersistence(
		InvitationOrganisationPersistence invitationOrganisationPersistence) {
		this.invitationOrganisationPersistence = invitationOrganisationPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Invitation.class;
	}

	protected String getModelClassName() {
		return Invitation.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = invitationPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationLocalService.class)
	protected at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationLocalService invitationLocalService;
	@BeanReference(type = at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationService.class)
	protected at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationService invitationService;
	@BeanReference(type = InvitationPersistence.class)
	protected InvitationPersistence invitationPersistence;
	@BeanReference(type = at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationOrganisationLocalService.class)
	protected at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationOrganisationLocalService invitationOrganisationLocalService;
	@BeanReference(type = at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationOrganisationService.class)
	protected at.graz.meduni.liferay.portlet.bibbox.service.service.InvitationOrganisationService invitationOrganisationService;
	@BeanReference(type = InvitationOrganisationPersistence.class)
	protected InvitationOrganisationPersistence invitationOrganisationPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private InvitationServiceClpInvoker _clpInvoker = new InvitationServiceClpInvoker();
}