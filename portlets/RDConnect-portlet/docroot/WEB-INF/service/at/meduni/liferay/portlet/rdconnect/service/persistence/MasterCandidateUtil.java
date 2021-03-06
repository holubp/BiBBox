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

package at.meduni.liferay.portlet.rdconnect.service.persistence;

import at.meduni.liferay.portlet.rdconnect.model.MasterCandidate;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the master candidate service. This utility wraps {@link MasterCandidatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Robert Reihs
 * @see MasterCandidatePersistence
 * @see MasterCandidatePersistenceImpl
 * @generated
 */
public class MasterCandidateUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MasterCandidate masterCandidate) {
		getPersistence().clearCache(masterCandidate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MasterCandidate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MasterCandidate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MasterCandidate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MasterCandidate update(MasterCandidate masterCandidate)
		throws SystemException {
		return getPersistence().update(masterCandidate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MasterCandidate update(MasterCandidate masterCandidate,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(masterCandidate, serviceContext);
	}

	/**
	* Returns all the master candidates where country LIKE &#63; and name LIKE &#63; and candidatetype LIKE &#63;.
	*
	* @param country the country
	* @param name the name
	* @param candidatetype the candidatetype
	* @return the matching master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> findByCNST(
		java.lang.String country, java.lang.String name,
		java.lang.String candidatetype)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCNST(country, name, candidatetype);
	}

	/**
	* Returns a range of all the master candidates where country LIKE &#63; and name LIKE &#63; and candidatetype LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.MasterCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param country the country
	* @param name the name
	* @param candidatetype the candidatetype
	* @param start the lower bound of the range of master candidates
	* @param end the upper bound of the range of master candidates (not inclusive)
	* @return the range of matching master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> findByCNST(
		java.lang.String country, java.lang.String name,
		java.lang.String candidatetype, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCNST(country, name, candidatetype, start, end);
	}

	/**
	* Returns an ordered range of all the master candidates where country LIKE &#63; and name LIKE &#63; and candidatetype LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.MasterCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param country the country
	* @param name the name
	* @param candidatetype the candidatetype
	* @param start the lower bound of the range of master candidates
	* @param end the upper bound of the range of master candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> findByCNST(
		java.lang.String country, java.lang.String name,
		java.lang.String candidatetype, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCNST(country, name, candidatetype, start, end,
			orderByComparator);
	}

	/**
	* Returns the first master candidate in the ordered set where country LIKE &#63; and name LIKE &#63; and candidatetype LIKE &#63;.
	*
	* @param country the country
	* @param name the name
	* @param candidatetype the candidatetype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching master candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException if a matching master candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate findByCNST_First(
		java.lang.String country, java.lang.String name,
		java.lang.String candidatetype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCNST_First(country, name, candidatetype,
			orderByComparator);
	}

	/**
	* Returns the first master candidate in the ordered set where country LIKE &#63; and name LIKE &#63; and candidatetype LIKE &#63;.
	*
	* @param country the country
	* @param name the name
	* @param candidatetype the candidatetype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching master candidate, or <code>null</code> if a matching master candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate fetchByCNST_First(
		java.lang.String country, java.lang.String name,
		java.lang.String candidatetype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCNST_First(country, name, candidatetype,
			orderByComparator);
	}

	/**
	* Returns the last master candidate in the ordered set where country LIKE &#63; and name LIKE &#63; and candidatetype LIKE &#63;.
	*
	* @param country the country
	* @param name the name
	* @param candidatetype the candidatetype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching master candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException if a matching master candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate findByCNST_Last(
		java.lang.String country, java.lang.String name,
		java.lang.String candidatetype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCNST_Last(country, name, candidatetype,
			orderByComparator);
	}

	/**
	* Returns the last master candidate in the ordered set where country LIKE &#63; and name LIKE &#63; and candidatetype LIKE &#63;.
	*
	* @param country the country
	* @param name the name
	* @param candidatetype the candidatetype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching master candidate, or <code>null</code> if a matching master candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate fetchByCNST_Last(
		java.lang.String country, java.lang.String name,
		java.lang.String candidatetype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCNST_Last(country, name, candidatetype,
			orderByComparator);
	}

	/**
	* Returns the master candidates before and after the current master candidate in the ordered set where country LIKE &#63; and name LIKE &#63; and candidatetype LIKE &#63;.
	*
	* @param masterCandidateId the primary key of the current master candidate
	* @param country the country
	* @param name the name
	* @param candidatetype the candidatetype
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next master candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException if a master candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate[] findByCNST_PrevAndNext(
		long masterCandidateId, java.lang.String country,
		java.lang.String name, java.lang.String candidatetype,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCNST_PrevAndNext(masterCandidateId, country, name,
			candidatetype, orderByComparator);
	}

	/**
	* Removes all the master candidates where country LIKE &#63; and name LIKE &#63; and candidatetype LIKE &#63; from the database.
	*
	* @param country the country
	* @param name the name
	* @param candidatetype the candidatetype
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCNST(java.lang.String country,
		java.lang.String name, java.lang.String candidatetype)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCNST(country, name, candidatetype);
	}

	/**
	* Returns the number of master candidates where country LIKE &#63; and name LIKE &#63; and candidatetype LIKE &#63;.
	*
	* @param country the country
	* @param name the name
	* @param candidatetype the candidatetype
	* @return the number of matching master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCNST(java.lang.String country,
		java.lang.String name, java.lang.String candidatetype)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCNST(country, name, candidatetype);
	}

	/**
	* Returns all the master candidates where country = &#63;.
	*
	* @param country the country
	* @return the matching master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> findByCountry(
		java.lang.String country)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCountry(country);
	}

	/**
	* Returns a range of all the master candidates where country = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.MasterCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param country the country
	* @param start the lower bound of the range of master candidates
	* @param end the upper bound of the range of master candidates (not inclusive)
	* @return the range of matching master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> findByCountry(
		java.lang.String country, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCountry(country, start, end);
	}

	/**
	* Returns an ordered range of all the master candidates where country = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.MasterCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param country the country
	* @param start the lower bound of the range of master candidates
	* @param end the upper bound of the range of master candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> findByCountry(
		java.lang.String country, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCountry(country, start, end, orderByComparator);
	}

	/**
	* Returns the first master candidate in the ordered set where country = &#63;.
	*
	* @param country the country
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching master candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException if a matching master candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate findByCountry_First(
		java.lang.String country,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCountry_First(country, orderByComparator);
	}

	/**
	* Returns the first master candidate in the ordered set where country = &#63;.
	*
	* @param country the country
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching master candidate, or <code>null</code> if a matching master candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate fetchByCountry_First(
		java.lang.String country,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCountry_First(country, orderByComparator);
	}

	/**
	* Returns the last master candidate in the ordered set where country = &#63;.
	*
	* @param country the country
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching master candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException if a matching master candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate findByCountry_Last(
		java.lang.String country,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCountry_Last(country, orderByComparator);
	}

	/**
	* Returns the last master candidate in the ordered set where country = &#63;.
	*
	* @param country the country
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching master candidate, or <code>null</code> if a matching master candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate fetchByCountry_Last(
		java.lang.String country,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCountry_Last(country, orderByComparator);
	}

	/**
	* Returns the master candidates before and after the current master candidate in the ordered set where country = &#63;.
	*
	* @param masterCandidateId the primary key of the current master candidate
	* @param country the country
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next master candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException if a master candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate[] findByCountry_PrevAndNext(
		long masterCandidateId, java.lang.String country,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCountry_PrevAndNext(masterCandidateId, country,
			orderByComparator);
	}

	/**
	* Removes all the master candidates where country = &#63; from the database.
	*
	* @param country the country
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCountry(java.lang.String country)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCountry(country);
	}

	/**
	* Returns the number of master candidates where country = &#63;.
	*
	* @param country the country
	* @return the number of matching master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCountry(java.lang.String country)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCountry(country);
	}

	/**
	* Returns all the master candidates where organisationid = &#63;.
	*
	* @param organisationid the organisationid
	* @return the matching master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> findByOrganisationId(
		long organisationid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOrganisationId(organisationid);
	}

	/**
	* Returns a range of all the master candidates where organisationid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.MasterCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organisationid the organisationid
	* @param start the lower bound of the range of master candidates
	* @param end the upper bound of the range of master candidates (not inclusive)
	* @return the range of matching master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> findByOrganisationId(
		long organisationid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOrganisationId(organisationid, start, end);
	}

	/**
	* Returns an ordered range of all the master candidates where organisationid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.MasterCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organisationid the organisationid
	* @param start the lower bound of the range of master candidates
	* @param end the upper bound of the range of master candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> findByOrganisationId(
		long organisationid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOrganisationId(organisationid, start, end,
			orderByComparator);
	}

	/**
	* Returns the first master candidate in the ordered set where organisationid = &#63;.
	*
	* @param organisationid the organisationid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching master candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException if a matching master candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate findByOrganisationId_First(
		long organisationid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOrganisationId_First(organisationid, orderByComparator);
	}

	/**
	* Returns the first master candidate in the ordered set where organisationid = &#63;.
	*
	* @param organisationid the organisationid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching master candidate, or <code>null</code> if a matching master candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate fetchByOrganisationId_First(
		long organisationid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOrganisationId_First(organisationid,
			orderByComparator);
	}

	/**
	* Returns the last master candidate in the ordered set where organisationid = &#63;.
	*
	* @param organisationid the organisationid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching master candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException if a matching master candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate findByOrganisationId_Last(
		long organisationid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOrganisationId_Last(organisationid, orderByComparator);
	}

	/**
	* Returns the last master candidate in the ordered set where organisationid = &#63;.
	*
	* @param organisationid the organisationid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching master candidate, or <code>null</code> if a matching master candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate fetchByOrganisationId_Last(
		long organisationid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOrganisationId_Last(organisationid, orderByComparator);
	}

	/**
	* Returns the master candidates before and after the current master candidate in the ordered set where organisationid = &#63;.
	*
	* @param masterCandidateId the primary key of the current master candidate
	* @param organisationid the organisationid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next master candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException if a master candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate[] findByOrganisationId_PrevAndNext(
		long masterCandidateId, long organisationid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOrganisationId_PrevAndNext(masterCandidateId,
			organisationid, orderByComparator);
	}

	/**
	* Removes all the master candidates where organisationid = &#63; from the database.
	*
	* @param organisationid the organisationid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByOrganisationId(long organisationid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByOrganisationId(organisationid);
	}

	/**
	* Returns the number of master candidates where organisationid = &#63;.
	*
	* @param organisationid the organisationid
	* @return the number of matching master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByOrganisationId(long organisationid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByOrganisationId(organisationid);
	}

	/**
	* Caches the master candidate in the entity cache if it is enabled.
	*
	* @param masterCandidate the master candidate
	*/
	public static void cacheResult(
		at.meduni.liferay.portlet.rdconnect.model.MasterCandidate masterCandidate) {
		getPersistence().cacheResult(masterCandidate);
	}

	/**
	* Caches the master candidates in the entity cache if it is enabled.
	*
	* @param masterCandidates the master candidates
	*/
	public static void cacheResult(
		java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> masterCandidates) {
		getPersistence().cacheResult(masterCandidates);
	}

	/**
	* Creates a new master candidate with the primary key. Does not add the master candidate to the database.
	*
	* @param masterCandidateId the primary key for the new master candidate
	* @return the new master candidate
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate create(
		long masterCandidateId) {
		return getPersistence().create(masterCandidateId);
	}

	/**
	* Removes the master candidate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param masterCandidateId the primary key of the master candidate
	* @return the master candidate that was removed
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException if a master candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate remove(
		long masterCandidateId)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(masterCandidateId);
	}

	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate updateImpl(
		at.meduni.liferay.portlet.rdconnect.model.MasterCandidate masterCandidate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(masterCandidate);
	}

	/**
	* Returns the master candidate with the primary key or throws a {@link at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException} if it could not be found.
	*
	* @param masterCandidateId the primary key of the master candidate
	* @return the master candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException if a master candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate findByPrimaryKey(
		long masterCandidateId)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchMasterCandidateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(masterCandidateId);
	}

	/**
	* Returns the master candidate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param masterCandidateId the primary key of the master candidate
	* @return the master candidate, or <code>null</code> if a master candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static at.meduni.liferay.portlet.rdconnect.model.MasterCandidate fetchByPrimaryKey(
		long masterCandidateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(masterCandidateId);
	}

	/**
	* Returns all the master candidates.
	*
	* @return the master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the master candidates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.MasterCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of master candidates
	* @param end the upper bound of the range of master candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the master candidates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of master candidates.
	*
	* @return the number of master candidates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MasterCandidatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MasterCandidatePersistence)PortletBeanLocatorUtil.locate(at.meduni.liferay.portlet.rdconnect.service.ClpSerializer.getServletContextName(),
					MasterCandidatePersistence.class.getName());

			ReferenceRegistry.registerReference(MasterCandidateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MasterCandidatePersistence persistence) {
	}

	private static MasterCandidatePersistence _persistence;
}