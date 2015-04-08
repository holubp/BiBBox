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

package at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.persistence;

import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpParameterConfiguration;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the kdssmp parameter configuration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author reihsr
 * @see KdssmpParameterConfigurationPersistenceImpl
 * @see KdssmpParameterConfigurationUtil
 * @generated
 */
public interface KdssmpParameterConfigurationPersistence extends BasePersistence<KdssmpParameterConfiguration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KdssmpParameterConfigurationUtil} to access the kdssmp parameter configuration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the kdssmp parameter configuration in the entity cache if it is enabled.
	*
	* @param kdssmpParameterConfiguration the kdssmp parameter configuration
	*/
	public void cacheResult(
		at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpParameterConfiguration kdssmpParameterConfiguration);

	/**
	* Caches the kdssmp parameter configurations in the entity cache if it is enabled.
	*
	* @param kdssmpParameterConfigurations the kdssmp parameter configurations
	*/
	public void cacheResult(
		java.util.List<at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpParameterConfiguration> kdssmpParameterConfigurations);

	/**
	* Creates a new kdssmp parameter configuration with the primary key. Does not add the kdssmp parameter configuration to the database.
	*
	* @param parameterconfigurationId the primary key for the new kdssmp parameter configuration
	* @return the new kdssmp parameter configuration
	*/
	public at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpParameterConfiguration create(
		long parameterconfigurationId);

	/**
	* Removes the kdssmp parameter configuration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param parameterconfigurationId the primary key of the kdssmp parameter configuration
	* @return the kdssmp parameter configuration that was removed
	* @throws at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.NoSuchKdssmpParameterConfigurationException if a kdssmp parameter configuration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpParameterConfiguration remove(
		long parameterconfigurationId)
		throws at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.NoSuchKdssmpParameterConfigurationException,
			com.liferay.portal.kernel.exception.SystemException;

	public at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpParameterConfiguration updateImpl(
		at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpParameterConfiguration kdssmpParameterConfiguration)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the kdssmp parameter configuration with the primary key or throws a {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.NoSuchKdssmpParameterConfigurationException} if it could not be found.
	*
	* @param parameterconfigurationId the primary key of the kdssmp parameter configuration
	* @return the kdssmp parameter configuration
	* @throws at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.NoSuchKdssmpParameterConfigurationException if a kdssmp parameter configuration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpParameterConfiguration findByPrimaryKey(
		long parameterconfigurationId)
		throws at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.NoSuchKdssmpParameterConfigurationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the kdssmp parameter configuration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param parameterconfigurationId the primary key of the kdssmp parameter configuration
	* @return the kdssmp parameter configuration, or <code>null</code> if a kdssmp parameter configuration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpParameterConfiguration fetchByPrimaryKey(
		long parameterconfigurationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the kdssmp parameter configurations.
	*
	* @return the kdssmp parameter configurations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpParameterConfiguration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the kdssmp parameter configurations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.impl.KdssmpParameterConfigurationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kdssmp parameter configurations
	* @param end the upper bound of the range of kdssmp parameter configurations (not inclusive)
	* @return the range of kdssmp parameter configurations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpParameterConfiguration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the kdssmp parameter configurations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.impl.KdssmpParameterConfigurationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kdssmp parameter configurations
	* @param end the upper bound of the range of kdssmp parameter configurations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of kdssmp parameter configurations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpParameterConfiguration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the kdssmp parameter configurations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of kdssmp parameter configurations.
	*
	* @return the number of kdssmp parameter configurations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}