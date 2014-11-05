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

package at.meduni.graz.patho.haybaeck.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for TMA. This utility wraps
 * {@link at.meduni.graz.patho.haybaeck.service.impl.TMALocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author reihsr
 * @see TMALocalService
 * @see at.meduni.graz.patho.haybaeck.service.base.TMALocalServiceBaseImpl
 * @see at.meduni.graz.patho.haybaeck.service.impl.TMALocalServiceImpl
 * @generated
 */
public class TMALocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link at.meduni.graz.patho.haybaeck.service.impl.TMALocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the t m a to the database. Also notifies the appropriate model listeners.
	*
	* @param tma the t m a
	* @return the t m a that was added
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.graz.patho.haybaeck.model.TMA addTMA(
		at.meduni.graz.patho.haybaeck.model.TMA tma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTMA(tma);
	}

	/**
	* Creates a new t m a with the primary key. Does not add the t m a to the database.
	*
	* @param tma_Id the primary key for the new t m a
	* @return the new t m a
	*/
	public static at.meduni.graz.patho.haybaeck.model.TMA createTMA(long tma_Id) {
		return getService().createTMA(tma_Id);
	}

	/**
	* Deletes the t m a with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tma_Id the primary key of the t m a
	* @return the t m a that was removed
	* @throws PortalException if a t m a with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.graz.patho.haybaeck.model.TMA deleteTMA(long tma_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTMA(tma_Id);
	}

	/**
	* Deletes the t m a from the database. Also notifies the appropriate model listeners.
	*
	* @param tma the t m a
	* @return the t m a that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.graz.patho.haybaeck.model.TMA deleteTMA(
		at.meduni.graz.patho.haybaeck.model.TMA tma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTMA(tma);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.graz.patho.haybaeck.model.impl.TMAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.graz.patho.haybaeck.model.impl.TMAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static at.meduni.graz.patho.haybaeck.model.TMA fetchTMA(long tma_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTMA(tma_Id);
	}

	/**
	* Returns the t m a with the primary key.
	*
	* @param tma_Id the primary key of the t m a
	* @return the t m a
	* @throws PortalException if a t m a with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.graz.patho.haybaeck.model.TMA getTMA(long tma_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTMA(tma_Id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the t m as.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.graz.patho.haybaeck.model.impl.TMAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t m as
	* @param end the upper bound of the range of t m as (not inclusive)
	* @return the range of t m as
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.meduni.graz.patho.haybaeck.model.TMA> getTMAs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTMAs(start, end);
	}

	/**
	* Returns the number of t m as.
	*
	* @return the number of t m as
	* @throws SystemException if a system exception occurred
	*/
	public static int getTMAsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTMAsCount();
	}

	/**
	* Updates the t m a in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tma the t m a
	* @return the t m a that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.graz.patho.haybaeck.model.TMA updateTMA(
		at.meduni.graz.patho.haybaeck.model.TMA tma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTMA(tma);
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

	public static void clearService() {
		_service = null;
	}

	public static TMALocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TMALocalService.class.getName());

			if (invokableLocalService instanceof TMALocalService) {
				_service = (TMALocalService)invokableLocalService;
			}
			else {
				_service = new TMALocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TMALocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TMALocalService service) {
	}

	private static TMALocalService _service;
}