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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MasterCandidate. This utility wraps
 * {@link at.meduni.liferay.portlet.rdconnect.service.impl.MasterCandidateLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Robert Reihs
 * @see MasterCandidateLocalService
 * @see at.meduni.liferay.portlet.rdconnect.service.base.MasterCandidateLocalServiceBaseImpl
 * @see at.meduni.liferay.portlet.rdconnect.service.impl.MasterCandidateLocalServiceImpl
 * @generated
 */
public class MasterCandidateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link at.meduni.liferay.portlet.rdconnect.service.impl.MasterCandidateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the master candidate to the database. Also notifies the appropriate model listeners.
	*
	* @param masterCandidate the master candidate
	* @return the master candidate that was added
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate addMasterCandidate(
		at.meduni.liferay.portlet.rdconnect.model.MasterCandidate masterCandidate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMasterCandidate(masterCandidate);
	}

	/**
	* Creates a new master candidate with the primary key. Does not add the master candidate to the database.
	*
	* @param masterCandidateId the primary key for the new master candidate
	* @return the new master candidate
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate createMasterCandidate(
		long masterCandidateId) {
		return getService().createMasterCandidate(masterCandidateId);
	}

	/**
	* Deletes the master candidate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param masterCandidateId the primary key of the master candidate
	* @return the master candidate that was removed
	* @throws PortalException if a master candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate deleteMasterCandidate(
		long masterCandidateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMasterCandidate(masterCandidateId);
	}

	/**
	* Deletes the master candidate from the database. Also notifies the appropriate model listeners.
	*
	* @param masterCandidate the master candidate
	* @return the master candidate that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate deleteMasterCandidate(
		at.meduni.liferay.portlet.rdconnect.model.MasterCandidate masterCandidate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMasterCandidate(masterCandidate);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.MasterCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.MasterCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate fetchMasterCandidate(
		long masterCandidateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMasterCandidate(masterCandidateId);
	}

	/**
	* Returns the master candidate with the primary key.
	*
	* @param masterCandidateId the primary key of the master candidate
	* @return the master candidate
	* @throws PortalException if a master candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate getMasterCandidate(
		long masterCandidateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMasterCandidate(masterCandidateId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the master candidates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.MasterCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of master candidates
	* @param end the upper bound of the range of master candidates (not inclusive)
	* @return the range of master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> getMasterCandidates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMasterCandidates(start, end);
	}

	/**
	* Returns the number of master candidates.
	*
	* @return the number of master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static int getMasterCandidatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMasterCandidatesCount();
	}

	/**
	* Updates the master candidate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param masterCandidate the master candidate
	* @return the master candidate that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate updateMasterCandidate(
		at.meduni.liferay.portlet.rdconnect.model.MasterCandidate masterCandidate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMasterCandidate(masterCandidate);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> getFilterdCandidates(
		long organisationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFilterdCandidates(organisationId);
	}

	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> getFilterdCandidates(
		java.lang.String searchstring, java.lang.String country,
		java.lang.String type, java.lang.String state, java.lang.String source)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getFilterdCandidates(searchstring, country, type, state,
			source);
	}

	public static void clearService() {
		_service = null;
	}

	public static MasterCandidateLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MasterCandidateLocalService.class.getName());

			if (invokableLocalService instanceof MasterCandidateLocalService) {
				_service = (MasterCandidateLocalService)invokableLocalService;
			}
			else {
				_service = new MasterCandidateLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MasterCandidateLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MasterCandidateLocalService service) {
	}

	private static MasterCandidateLocalService _service;
}