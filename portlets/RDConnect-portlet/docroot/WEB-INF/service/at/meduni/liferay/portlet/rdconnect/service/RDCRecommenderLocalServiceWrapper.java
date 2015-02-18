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

package at.meduni.liferay.portlet.rdconnect.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RDCRecommenderLocalService}.
 *
 * @author Robert Reihs
 * @see RDCRecommenderLocalService
 * @generated
 */
public class RDCRecommenderLocalServiceWrapper
	implements RDCRecommenderLocalService,
		ServiceWrapper<RDCRecommenderLocalService> {
	public RDCRecommenderLocalServiceWrapper(
		RDCRecommenderLocalService rdcRecommenderLocalService) {
		_rdcRecommenderLocalService = rdcRecommenderLocalService;
	}

	/**
	* Adds the r d c recommender to the database. Also notifies the appropriate model listeners.
	*
	* @param rdcRecommender the r d c recommender
	* @return the r d c recommender that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public at.meduni.liferay.portlet.rdconnect.model.RDCRecommender addRDCRecommender(
		at.meduni.liferay.portlet.rdconnect.model.RDCRecommender rdcRecommender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.addRDCRecommender(rdcRecommender);
	}

	/**
	* Creates a new r d c recommender with the primary key. Does not add the r d c recommender to the database.
	*
	* @param rdcrecommenderid the primary key for the new r d c recommender
	* @return the new r d c recommender
	*/
	@Override
	public at.meduni.liferay.portlet.rdconnect.model.RDCRecommender createRDCRecommender(
		long rdcrecommenderid) {
		return _rdcRecommenderLocalService.createRDCRecommender(rdcrecommenderid);
	}

	/**
	* Deletes the r d c recommender with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rdcrecommenderid the primary key of the r d c recommender
	* @return the r d c recommender that was removed
	* @throws PortalException if a r d c recommender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public at.meduni.liferay.portlet.rdconnect.model.RDCRecommender deleteRDCRecommender(
		long rdcrecommenderid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.deleteRDCRecommender(rdcrecommenderid);
	}

	/**
	* Deletes the r d c recommender from the database. Also notifies the appropriate model listeners.
	*
	* @param rdcRecommender the r d c recommender
	* @return the r d c recommender that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public at.meduni.liferay.portlet.rdconnect.model.RDCRecommender deleteRDCRecommender(
		at.meduni.liferay.portlet.rdconnect.model.RDCRecommender rdcRecommender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.deleteRDCRecommender(rdcRecommender);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rdcRecommenderLocalService.dynamicQuery();
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.RDCRecommenderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.RDCRecommenderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.dynamicQuery(dynamicQuery, start,
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
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.dynamicQueryCount(dynamicQuery);
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
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public at.meduni.liferay.portlet.rdconnect.model.RDCRecommender fetchRDCRecommender(
		long rdcrecommenderid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.fetchRDCRecommender(rdcrecommenderid);
	}

	/**
	* Returns the r d c recommender with the primary key.
	*
	* @param rdcrecommenderid the primary key of the r d c recommender
	* @return the r d c recommender
	* @throws PortalException if a r d c recommender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public at.meduni.liferay.portlet.rdconnect.model.RDCRecommender getRDCRecommender(
		long rdcrecommenderid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.getRDCRecommender(rdcrecommenderid);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the r d c recommenders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.RDCRecommenderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of r d c recommenders
	* @param end the upper bound of the range of r d c recommenders (not inclusive)
	* @return the range of r d c recommenders
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<at.meduni.liferay.portlet.rdconnect.model.RDCRecommender> getRDCRecommenders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.getRDCRecommenders(start, end);
	}

	/**
	* Returns the number of r d c recommenders.
	*
	* @return the number of r d c recommenders
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRDCRecommendersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.getRDCRecommendersCount();
	}

	/**
	* Updates the r d c recommender in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rdcRecommender the r d c recommender
	* @return the r d c recommender that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public at.meduni.liferay.portlet.rdconnect.model.RDCRecommender updateRDCRecommender(
		at.meduni.liferay.portlet.rdconnect.model.RDCRecommender rdcRecommender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdcRecommenderLocalService.updateRDCRecommender(rdcRecommender);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _rdcRecommenderLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_rdcRecommenderLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _rdcRecommenderLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RDCRecommenderLocalService getWrappedRDCRecommenderLocalService() {
		return _rdcRecommenderLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRDCRecommenderLocalService(
		RDCRecommenderLocalService rdcRecommenderLocalService) {
		_rdcRecommenderLocalService = rdcRecommenderLocalService;
	}

	@Override
	public RDCRecommenderLocalService getWrappedService() {
		return _rdcRecommenderLocalService;
	}

	@Override
	public void setWrappedService(
		RDCRecommenderLocalService rdcRecommenderLocalService) {
		_rdcRecommenderLocalService = rdcRecommenderLocalService;
	}

	private RDCRecommenderLocalService _rdcRecommenderLocalService;
}