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

package at.graz.meduni.liferay.portlet.bibbox.service.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for InvitationOrganisation. This utility wraps
 * {@link at.graz.meduni.liferay.portlet.bibbox.service.service.impl.InvitationOrganisationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author reihsr
 * @see InvitationOrganisationLocalService
 * @see at.graz.meduni.liferay.portlet.bibbox.service.service.base.InvitationOrganisationLocalServiceBaseImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.service.service.impl.InvitationOrganisationLocalServiceImpl
 * @generated
 */
public class InvitationOrganisationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link at.graz.meduni.liferay.portlet.bibbox.service.service.impl.InvitationOrganisationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the invitation organisation to the database. Also notifies the appropriate model listeners.
	*
	* @param invitationOrganisation the invitation organisation
	* @return the invitation organisation that was added
	* @throws SystemException if a system exception occurred
	*/
	public static at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation addInvitationOrganisation(
		at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation invitationOrganisation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addInvitationOrganisation(invitationOrganisation);
	}

	/**
	* Creates a new invitation organisation with the primary key. Does not add the invitation organisation to the database.
	*
	* @param invitationOrganisationId the primary key for the new invitation organisation
	* @return the new invitation organisation
	*/
	public static at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation createInvitationOrganisation(
		long invitationOrganisationId) {
		return getService()
				   .createInvitationOrganisation(invitationOrganisationId);
	}

	/**
	* Deletes the invitation organisation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param invitationOrganisationId the primary key of the invitation organisation
	* @return the invitation organisation that was removed
	* @throws PortalException if a invitation organisation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation deleteInvitationOrganisation(
		long invitationOrganisationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteInvitationOrganisation(invitationOrganisationId);
	}

	/**
	* Deletes the invitation organisation from the database. Also notifies the appropriate model listeners.
	*
	* @param invitationOrganisation the invitation organisation
	* @return the invitation organisation that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation deleteInvitationOrganisation(
		at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation invitationOrganisation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteInvitationOrganisation(invitationOrganisation);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.graz.meduni.liferay.portlet.bibbox.service.model.impl.InvitationOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.graz.meduni.liferay.portlet.bibbox.service.model.impl.InvitationOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation fetchInvitationOrganisation(
		long invitationOrganisationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchInvitationOrganisation(invitationOrganisationId);
	}

	/**
	* Returns the invitation organisation with the primary key.
	*
	* @param invitationOrganisationId the primary key of the invitation organisation
	* @return the invitation organisation
	* @throws PortalException if a invitation organisation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation getInvitationOrganisation(
		long invitationOrganisationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getInvitationOrganisation(invitationOrganisationId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the invitation organisations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.graz.meduni.liferay.portlet.bibbox.service.model.impl.InvitationOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of invitation organisations
	* @param end the upper bound of the range of invitation organisations (not inclusive)
	* @return the range of invitation organisations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation> getInvitationOrganisations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInvitationOrganisations(start, end);
	}

	/**
	* Returns the number of invitation organisations.
	*
	* @return the number of invitation organisations
	* @throws SystemException if a system exception occurred
	*/
	public static int getInvitationOrganisationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInvitationOrganisationsCount();
	}

	/**
	* Updates the invitation organisation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param invitationOrganisation the invitation organisation
	* @return the invitation organisation that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation updateInvitationOrganisation(
		at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation invitationOrganisation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateInvitationOrganisation(invitationOrganisation);
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

	/**
	* Gets the number of organizations for invitation
	*/
	public static int getOrganisationByInvitationCount(long invitationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrganisationByInvitationCount(invitationId);
	}

	/**
	* Get organizations by invitation
	*/
	public static java.util.List<at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation> getOrganisationByInvitation(
		long invitationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrganisationByInvitation(invitationId);
	}

	/**
	* Get organizations by organisationId
	*/
	public static java.util.List<at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation> getInvitationsByOrganisation(
		long organisationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInvitationsByOrganisation(organisationId);
	}

	/**
	* Get organizations by status
	*/
	public static java.util.List<at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation> getInvitationsByStatus(
		long status) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInvitationsByStatus(status);
	}

	/**
	* Get organizations by invitation
	*/
	public static at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation getInvitationOrganisation(
		long invitationId, long organisationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getInvitationOrganisation(invitationId, organisationId);
	}

	/**
	* Get organizations responded by invitation
	*/
	public static java.lang.String getInvitationRespons(long invitationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInvitationRespons(invitationId);
	}

	/**
	* @throws SystemException
	*/
	public static java.util.List<at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation> getInvitationOrganisationByStatus(
		boolean rejacted)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInvitationOrganisationByStatus(rejacted);
	}

	/**
	* @return
	*/
	public static java.lang.String getInvitationStatisticsInvitationsSend() {
		return getService().getInvitationStatisticsInvitationsSend();
	}

	/**
	* @return
	*/
	public static java.lang.String getInvitationStatisticsReacted() {
		return getService().getInvitationStatisticsReacted();
	}

	/**
	* @return
	*/
	public static java.lang.String getInvitationStatisticsRejected() {
		return getService().getInvitationStatisticsRejected();
	}

	public static void clearService() {
		_service = null;
	}

	public static InvitationOrganisationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					InvitationOrganisationLocalService.class.getName());

			if (invokableLocalService instanceof InvitationOrganisationLocalService) {
				_service = (InvitationOrganisationLocalService)invokableLocalService;
			}
			else {
				_service = new InvitationOrganisationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(InvitationOrganisationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(InvitationOrganisationLocalService service) {
	}

	private static InvitationOrganisationLocalService _service;
}