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

package at.rdconnect.update.service.base;

import at.rdconnect.update.model.CoreUpdate;
import at.rdconnect.update.service.CoreUpdateLocalService;
import at.rdconnect.update.service.persistence.AccessibilityUpdatePersistence;
import at.rdconnect.update.service.persistence.AddressUpdatePersistence;
import at.rdconnect.update.service.persistence.CoreUpdatePersistence;
import at.rdconnect.update.service.persistence.QualityUpdatePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the core update local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link at.rdconnect.update.service.impl.CoreUpdateLocalServiceImpl}.
 * </p>
 *
 * @author reihsr
 * @see at.rdconnect.update.service.impl.CoreUpdateLocalServiceImpl
 * @see at.rdconnect.update.service.CoreUpdateLocalServiceUtil
 * @generated
 */
public abstract class CoreUpdateLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements CoreUpdateLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link at.rdconnect.update.service.CoreUpdateLocalServiceUtil} to access the core update local service.
	 */

	/**
	 * Adds the core update to the database. Also notifies the appropriate model listeners.
	 *
	 * @param coreUpdate the core update
	 * @return the core update that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CoreUpdate addCoreUpdate(CoreUpdate coreUpdate)
		throws SystemException {
		coreUpdate.setNew(true);

		return coreUpdatePersistence.update(coreUpdate);
	}

	/**
	 * Creates a new core update with the primary key. Does not add the core update to the database.
	 *
	 * @param coreid the primary key for the new core update
	 * @return the new core update
	 */
	@Override
	public CoreUpdate createCoreUpdate(long coreid) {
		return coreUpdatePersistence.create(coreid);
	}

	/**
	 * Deletes the core update with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param coreid the primary key of the core update
	 * @return the core update that was removed
	 * @throws PortalException if a core update with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CoreUpdate deleteCoreUpdate(long coreid)
		throws PortalException, SystemException {
		return coreUpdatePersistence.remove(coreid);
	}

	/**
	 * Deletes the core update from the database. Also notifies the appropriate model listeners.
	 *
	 * @param coreUpdate the core update
	 * @return the core update that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CoreUpdate deleteCoreUpdate(CoreUpdate coreUpdate)
		throws SystemException {
		return coreUpdatePersistence.remove(coreUpdate);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(CoreUpdate.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return coreUpdatePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.rdconnect.update.model.impl.CoreUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return coreUpdatePersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.rdconnect.update.model.impl.CoreUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return coreUpdatePersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return coreUpdatePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return coreUpdatePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public CoreUpdate fetchCoreUpdate(long coreid) throws SystemException {
		return coreUpdatePersistence.fetchByPrimaryKey(coreid);
	}

	/**
	 * Returns the core update with the primary key.
	 *
	 * @param coreid the primary key of the core update
	 * @return the core update
	 * @throws PortalException if a core update with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoreUpdate getCoreUpdate(long coreid)
		throws PortalException, SystemException {
		return coreUpdatePersistence.findByPrimaryKey(coreid);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return coreUpdatePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the core updates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.rdconnect.update.model.impl.CoreUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of core updates
	 * @param end the upper bound of the range of core updates (not inclusive)
	 * @return the range of core updates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CoreUpdate> getCoreUpdates(int start, int end)
		throws SystemException {
		return coreUpdatePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of core updates.
	 *
	 * @return the number of core updates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getCoreUpdatesCount() throws SystemException {
		return coreUpdatePersistence.countAll();
	}

	/**
	 * Updates the core update in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param coreUpdate the core update
	 * @return the core update that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CoreUpdate updateCoreUpdate(CoreUpdate coreUpdate)
		throws SystemException {
		return coreUpdatePersistence.update(coreUpdate);
	}

	/**
	 * Returns the accessibility update local service.
	 *
	 * @return the accessibility update local service
	 */
	public at.rdconnect.update.service.AccessibilityUpdateLocalService getAccessibilityUpdateLocalService() {
		return accessibilityUpdateLocalService;
	}

	/**
	 * Sets the accessibility update local service.
	 *
	 * @param accessibilityUpdateLocalService the accessibility update local service
	 */
	public void setAccessibilityUpdateLocalService(
		at.rdconnect.update.service.AccessibilityUpdateLocalService accessibilityUpdateLocalService) {
		this.accessibilityUpdateLocalService = accessibilityUpdateLocalService;
	}

	/**
	 * Returns the accessibility update remote service.
	 *
	 * @return the accessibility update remote service
	 */
	public at.rdconnect.update.service.AccessibilityUpdateService getAccessibilityUpdateService() {
		return accessibilityUpdateService;
	}

	/**
	 * Sets the accessibility update remote service.
	 *
	 * @param accessibilityUpdateService the accessibility update remote service
	 */
	public void setAccessibilityUpdateService(
		at.rdconnect.update.service.AccessibilityUpdateService accessibilityUpdateService) {
		this.accessibilityUpdateService = accessibilityUpdateService;
	}

	/**
	 * Returns the accessibility update persistence.
	 *
	 * @return the accessibility update persistence
	 */
	public AccessibilityUpdatePersistence getAccessibilityUpdatePersistence() {
		return accessibilityUpdatePersistence;
	}

	/**
	 * Sets the accessibility update persistence.
	 *
	 * @param accessibilityUpdatePersistence the accessibility update persistence
	 */
	public void setAccessibilityUpdatePersistence(
		AccessibilityUpdatePersistence accessibilityUpdatePersistence) {
		this.accessibilityUpdatePersistence = accessibilityUpdatePersistence;
	}

	/**
	 * Returns the address update local service.
	 *
	 * @return the address update local service
	 */
	public at.rdconnect.update.service.AddressUpdateLocalService getAddressUpdateLocalService() {
		return addressUpdateLocalService;
	}

	/**
	 * Sets the address update local service.
	 *
	 * @param addressUpdateLocalService the address update local service
	 */
	public void setAddressUpdateLocalService(
		at.rdconnect.update.service.AddressUpdateLocalService addressUpdateLocalService) {
		this.addressUpdateLocalService = addressUpdateLocalService;
	}

	/**
	 * Returns the address update remote service.
	 *
	 * @return the address update remote service
	 */
	public at.rdconnect.update.service.AddressUpdateService getAddressUpdateService() {
		return addressUpdateService;
	}

	/**
	 * Sets the address update remote service.
	 *
	 * @param addressUpdateService the address update remote service
	 */
	public void setAddressUpdateService(
		at.rdconnect.update.service.AddressUpdateService addressUpdateService) {
		this.addressUpdateService = addressUpdateService;
	}

	/**
	 * Returns the address update persistence.
	 *
	 * @return the address update persistence
	 */
	public AddressUpdatePersistence getAddressUpdatePersistence() {
		return addressUpdatePersistence;
	}

	/**
	 * Sets the address update persistence.
	 *
	 * @param addressUpdatePersistence the address update persistence
	 */
	public void setAddressUpdatePersistence(
		AddressUpdatePersistence addressUpdatePersistence) {
		this.addressUpdatePersistence = addressUpdatePersistence;
	}

	/**
	 * Returns the core update local service.
	 *
	 * @return the core update local service
	 */
	public at.rdconnect.update.service.CoreUpdateLocalService getCoreUpdateLocalService() {
		return coreUpdateLocalService;
	}

	/**
	 * Sets the core update local service.
	 *
	 * @param coreUpdateLocalService the core update local service
	 */
	public void setCoreUpdateLocalService(
		at.rdconnect.update.service.CoreUpdateLocalService coreUpdateLocalService) {
		this.coreUpdateLocalService = coreUpdateLocalService;
	}

	/**
	 * Returns the core update remote service.
	 *
	 * @return the core update remote service
	 */
	public at.rdconnect.update.service.CoreUpdateService getCoreUpdateService() {
		return coreUpdateService;
	}

	/**
	 * Sets the core update remote service.
	 *
	 * @param coreUpdateService the core update remote service
	 */
	public void setCoreUpdateService(
		at.rdconnect.update.service.CoreUpdateService coreUpdateService) {
		this.coreUpdateService = coreUpdateService;
	}

	/**
	 * Returns the core update persistence.
	 *
	 * @return the core update persistence
	 */
	public CoreUpdatePersistence getCoreUpdatePersistence() {
		return coreUpdatePersistence;
	}

	/**
	 * Sets the core update persistence.
	 *
	 * @param coreUpdatePersistence the core update persistence
	 */
	public void setCoreUpdatePersistence(
		CoreUpdatePersistence coreUpdatePersistence) {
		this.coreUpdatePersistence = coreUpdatePersistence;
	}

	/**
	 * Returns the quality update local service.
	 *
	 * @return the quality update local service
	 */
	public at.rdconnect.update.service.QualityUpdateLocalService getQualityUpdateLocalService() {
		return qualityUpdateLocalService;
	}

	/**
	 * Sets the quality update local service.
	 *
	 * @param qualityUpdateLocalService the quality update local service
	 */
	public void setQualityUpdateLocalService(
		at.rdconnect.update.service.QualityUpdateLocalService qualityUpdateLocalService) {
		this.qualityUpdateLocalService = qualityUpdateLocalService;
	}

	/**
	 * Returns the quality update remote service.
	 *
	 * @return the quality update remote service
	 */
	public at.rdconnect.update.service.QualityUpdateService getQualityUpdateService() {
		return qualityUpdateService;
	}

	/**
	 * Sets the quality update remote service.
	 *
	 * @param qualityUpdateService the quality update remote service
	 */
	public void setQualityUpdateService(
		at.rdconnect.update.service.QualityUpdateService qualityUpdateService) {
		this.qualityUpdateService = qualityUpdateService;
	}

	/**
	 * Returns the quality update persistence.
	 *
	 * @return the quality update persistence
	 */
	public QualityUpdatePersistence getQualityUpdatePersistence() {
		return qualityUpdatePersistence;
	}

	/**
	 * Sets the quality update persistence.
	 *
	 * @param qualityUpdatePersistence the quality update persistence
	 */
	public void setQualityUpdatePersistence(
		QualityUpdatePersistence qualityUpdatePersistence) {
		this.qualityUpdatePersistence = qualityUpdatePersistence;
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

		PersistedModelLocalServiceRegistryUtil.register("at.rdconnect.update.model.CoreUpdate",
			coreUpdateLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"at.rdconnect.update.model.CoreUpdate");
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
		return CoreUpdate.class;
	}

	protected String getModelClassName() {
		return CoreUpdate.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = coreUpdatePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = at.rdconnect.update.service.AccessibilityUpdateLocalService.class)
	protected at.rdconnect.update.service.AccessibilityUpdateLocalService accessibilityUpdateLocalService;
	@BeanReference(type = at.rdconnect.update.service.AccessibilityUpdateService.class)
	protected at.rdconnect.update.service.AccessibilityUpdateService accessibilityUpdateService;
	@BeanReference(type = AccessibilityUpdatePersistence.class)
	protected AccessibilityUpdatePersistence accessibilityUpdatePersistence;
	@BeanReference(type = at.rdconnect.update.service.AddressUpdateLocalService.class)
	protected at.rdconnect.update.service.AddressUpdateLocalService addressUpdateLocalService;
	@BeanReference(type = at.rdconnect.update.service.AddressUpdateService.class)
	protected at.rdconnect.update.service.AddressUpdateService addressUpdateService;
	@BeanReference(type = AddressUpdatePersistence.class)
	protected AddressUpdatePersistence addressUpdatePersistence;
	@BeanReference(type = at.rdconnect.update.service.CoreUpdateLocalService.class)
	protected at.rdconnect.update.service.CoreUpdateLocalService coreUpdateLocalService;
	@BeanReference(type = at.rdconnect.update.service.CoreUpdateService.class)
	protected at.rdconnect.update.service.CoreUpdateService coreUpdateService;
	@BeanReference(type = CoreUpdatePersistence.class)
	protected CoreUpdatePersistence coreUpdatePersistence;
	@BeanReference(type = at.rdconnect.update.service.QualityUpdateLocalService.class)
	protected at.rdconnect.update.service.QualityUpdateLocalService qualityUpdateLocalService;
	@BeanReference(type = at.rdconnect.update.service.QualityUpdateService.class)
	protected at.rdconnect.update.service.QualityUpdateService qualityUpdateService;
	@BeanReference(type = QualityUpdatePersistence.class)
	protected QualityUpdatePersistence qualityUpdatePersistence;
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
	private CoreUpdateLocalServiceClpInvoker _clpInvoker = new CoreUpdateLocalServiceClpInvoker();
}