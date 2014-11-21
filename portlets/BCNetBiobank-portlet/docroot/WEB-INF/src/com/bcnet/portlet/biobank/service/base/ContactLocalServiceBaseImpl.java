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

package com.bcnet.portlet.biobank.service.base;

import com.bcnet.portlet.biobank.model.Contact;
import com.bcnet.portlet.biobank.service.ContactLocalService;
import com.bcnet.portlet.biobank.service.persistence.BiobankAtrributeListsMasterPersistence;
import com.bcnet.portlet.biobank.service.persistence.BiobankAttributeListsPersistence;
import com.bcnet.portlet.biobank.service.persistence.BiobankContactPersistence;
import com.bcnet.portlet.biobank.service.persistence.BiobankGeneralInformationFinder;
import com.bcnet.portlet.biobank.service.persistence.BiobankGeneralInformationPersistence;
import com.bcnet.portlet.biobank.service.persistence.ContactPersistence;
import com.bcnet.portlet.biobank.service.persistence.CountryPersistence;
import com.bcnet.portlet.biobank.service.persistence.JuristicPersonPersistence;

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
 * Provides the base implementation for the contact local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.bcnet.portlet.biobank.service.impl.ContactLocalServiceImpl}.
 * </p>
 *
 * @author suyama
 * @see com.bcnet.portlet.biobank.service.impl.ContactLocalServiceImpl
 * @see com.bcnet.portlet.biobank.service.ContactLocalServiceUtil
 * @generated
 */
public abstract class ContactLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements ContactLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.bcnet.portlet.biobank.service.ContactLocalServiceUtil} to access the contact local service.
	 */

	/**
	 * Adds the contact to the database. Also notifies the appropriate model listeners.
	 *
	 * @param contact the contact
	 * @return the contact that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Contact addContact(Contact contact) throws SystemException {
		contact.setNew(true);

		return contactPersistence.update(contact);
	}

	/**
	 * Creates a new contact with the primary key. Does not add the contact to the database.
	 *
	 * @param contactId the primary key for the new contact
	 * @return the new contact
	 */
	@Override
	public Contact createContact(long contactId) {
		return contactPersistence.create(contactId);
	}

	/**
	 * Deletes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact that was removed
	 * @throws PortalException if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 * @throws com.bcnet.portlet.biobank.NoSuchContactException
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Contact deleteContact(long contactId)
		throws PortalException, SystemException,
			com.bcnet.portlet.biobank.NoSuchContactException {
		return contactPersistence.remove(contactId);
	}

	/**
	 * Deletes the contact from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contact the contact
	 * @return the contact that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Contact deleteContact(Contact contact) throws SystemException {
		return contactPersistence.remove(contact);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Contact.class,
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
		return contactPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bcnet.portlet.biobank.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return contactPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bcnet.portlet.biobank.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return contactPersistence.findWithDynamicQuery(dynamicQuery, start,
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
		return contactPersistence.countWithDynamicQuery(dynamicQuery);
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
		return contactPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Contact fetchContact(long contactId) throws SystemException {
		return contactPersistence.fetchByPrimaryKey(contactId);
	}

	/**
	 * Returns the contact with the primary key.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact
	 * @throws PortalException if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 * @throws com.bcnet.portlet.biobank.NoSuchContactException
	 */
	@Override
	public Contact getContact(long contactId)
		throws PortalException, SystemException,
			com.bcnet.portlet.biobank.NoSuchContactException {
		return contactPersistence.findByPrimaryKey(contactId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return contactPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bcnet.portlet.biobank.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @return the range of contacts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Contact> getContacts(int start, int end)
		throws SystemException {
		return contactPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of contacts.
	 *
	 * @return the number of contacts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getContactsCount() throws SystemException {
		return contactPersistence.countAll();
	}

	/**
	 * Updates the contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param contact the contact
	 * @return the contact that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Contact updateContact(Contact contact) throws SystemException {
		return contactPersistence.update(contact);
	}

	/**
	 * Returns the biobank atrribute lists master local service.
	 *
	 * @return the biobank atrribute lists master local service
	 */
	public com.bcnet.portlet.biobank.service.BiobankAtrributeListsMasterLocalService getBiobankAtrributeListsMasterLocalService() {
		return biobankAtrributeListsMasterLocalService;
	}

	/**
	 * Sets the biobank atrribute lists master local service.
	 *
	 * @param biobankAtrributeListsMasterLocalService the biobank atrribute lists master local service
	 */
	public void setBiobankAtrributeListsMasterLocalService(
		com.bcnet.portlet.biobank.service.BiobankAtrributeListsMasterLocalService biobankAtrributeListsMasterLocalService) {
		this.biobankAtrributeListsMasterLocalService = biobankAtrributeListsMasterLocalService;
	}

	/**
	 * Returns the biobank atrribute lists master remote service.
	 *
	 * @return the biobank atrribute lists master remote service
	 */
	public com.bcnet.portlet.biobank.service.BiobankAtrributeListsMasterService getBiobankAtrributeListsMasterService() {
		return biobankAtrributeListsMasterService;
	}

	/**
	 * Sets the biobank atrribute lists master remote service.
	 *
	 * @param biobankAtrributeListsMasterService the biobank atrribute lists master remote service
	 */
	public void setBiobankAtrributeListsMasterService(
		com.bcnet.portlet.biobank.service.BiobankAtrributeListsMasterService biobankAtrributeListsMasterService) {
		this.biobankAtrributeListsMasterService = biobankAtrributeListsMasterService;
	}

	/**
	 * Returns the biobank atrribute lists master persistence.
	 *
	 * @return the biobank atrribute lists master persistence
	 */
	public BiobankAtrributeListsMasterPersistence getBiobankAtrributeListsMasterPersistence() {
		return biobankAtrributeListsMasterPersistence;
	}

	/**
	 * Sets the biobank atrribute lists master persistence.
	 *
	 * @param biobankAtrributeListsMasterPersistence the biobank atrribute lists master persistence
	 */
	public void setBiobankAtrributeListsMasterPersistence(
		BiobankAtrributeListsMasterPersistence biobankAtrributeListsMasterPersistence) {
		this.biobankAtrributeListsMasterPersistence = biobankAtrributeListsMasterPersistence;
	}

	/**
	 * Returns the biobank attribute lists local service.
	 *
	 * @return the biobank attribute lists local service
	 */
	public com.bcnet.portlet.biobank.service.BiobankAttributeListsLocalService getBiobankAttributeListsLocalService() {
		return biobankAttributeListsLocalService;
	}

	/**
	 * Sets the biobank attribute lists local service.
	 *
	 * @param biobankAttributeListsLocalService the biobank attribute lists local service
	 */
	public void setBiobankAttributeListsLocalService(
		com.bcnet.portlet.biobank.service.BiobankAttributeListsLocalService biobankAttributeListsLocalService) {
		this.biobankAttributeListsLocalService = biobankAttributeListsLocalService;
	}

	/**
	 * Returns the biobank attribute lists remote service.
	 *
	 * @return the biobank attribute lists remote service
	 */
	public com.bcnet.portlet.biobank.service.BiobankAttributeListsService getBiobankAttributeListsService() {
		return biobankAttributeListsService;
	}

	/**
	 * Sets the biobank attribute lists remote service.
	 *
	 * @param biobankAttributeListsService the biobank attribute lists remote service
	 */
	public void setBiobankAttributeListsService(
		com.bcnet.portlet.biobank.service.BiobankAttributeListsService biobankAttributeListsService) {
		this.biobankAttributeListsService = biobankAttributeListsService;
	}

	/**
	 * Returns the biobank attribute lists persistence.
	 *
	 * @return the biobank attribute lists persistence
	 */
	public BiobankAttributeListsPersistence getBiobankAttributeListsPersistence() {
		return biobankAttributeListsPersistence;
	}

	/**
	 * Sets the biobank attribute lists persistence.
	 *
	 * @param biobankAttributeListsPersistence the biobank attribute lists persistence
	 */
	public void setBiobankAttributeListsPersistence(
		BiobankAttributeListsPersistence biobankAttributeListsPersistence) {
		this.biobankAttributeListsPersistence = biobankAttributeListsPersistence;
	}

	/**
	 * Returns the biobank contact local service.
	 *
	 * @return the biobank contact local service
	 */
	public com.bcnet.portlet.biobank.service.BiobankContactLocalService getBiobankContactLocalService() {
		return biobankContactLocalService;
	}

	/**
	 * Sets the biobank contact local service.
	 *
	 * @param biobankContactLocalService the biobank contact local service
	 */
	public void setBiobankContactLocalService(
		com.bcnet.portlet.biobank.service.BiobankContactLocalService biobankContactLocalService) {
		this.biobankContactLocalService = biobankContactLocalService;
	}

	/**
	 * Returns the biobank contact remote service.
	 *
	 * @return the biobank contact remote service
	 */
	public com.bcnet.portlet.biobank.service.BiobankContactService getBiobankContactService() {
		return biobankContactService;
	}

	/**
	 * Sets the biobank contact remote service.
	 *
	 * @param biobankContactService the biobank contact remote service
	 */
	public void setBiobankContactService(
		com.bcnet.portlet.biobank.service.BiobankContactService biobankContactService) {
		this.biobankContactService = biobankContactService;
	}

	/**
	 * Returns the biobank contact persistence.
	 *
	 * @return the biobank contact persistence
	 */
	public BiobankContactPersistence getBiobankContactPersistence() {
		return biobankContactPersistence;
	}

	/**
	 * Sets the biobank contact persistence.
	 *
	 * @param biobankContactPersistence the biobank contact persistence
	 */
	public void setBiobankContactPersistence(
		BiobankContactPersistence biobankContactPersistence) {
		this.biobankContactPersistence = biobankContactPersistence;
	}

	/**
	 * Returns the biobank general information local service.
	 *
	 * @return the biobank general information local service
	 */
	public com.bcnet.portlet.biobank.service.BiobankGeneralInformationLocalService getBiobankGeneralInformationLocalService() {
		return biobankGeneralInformationLocalService;
	}

	/**
	 * Sets the biobank general information local service.
	 *
	 * @param biobankGeneralInformationLocalService the biobank general information local service
	 */
	public void setBiobankGeneralInformationLocalService(
		com.bcnet.portlet.biobank.service.BiobankGeneralInformationLocalService biobankGeneralInformationLocalService) {
		this.biobankGeneralInformationLocalService = biobankGeneralInformationLocalService;
	}

	/**
	 * Returns the biobank general information remote service.
	 *
	 * @return the biobank general information remote service
	 */
	public com.bcnet.portlet.biobank.service.BiobankGeneralInformationService getBiobankGeneralInformationService() {
		return biobankGeneralInformationService;
	}

	/**
	 * Sets the biobank general information remote service.
	 *
	 * @param biobankGeneralInformationService the biobank general information remote service
	 */
	public void setBiobankGeneralInformationService(
		com.bcnet.portlet.biobank.service.BiobankGeneralInformationService biobankGeneralInformationService) {
		this.biobankGeneralInformationService = biobankGeneralInformationService;
	}

	/**
	 * Returns the biobank general information persistence.
	 *
	 * @return the biobank general information persistence
	 */
	public BiobankGeneralInformationPersistence getBiobankGeneralInformationPersistence() {
		return biobankGeneralInformationPersistence;
	}

	/**
	 * Sets the biobank general information persistence.
	 *
	 * @param biobankGeneralInformationPersistence the biobank general information persistence
	 */
	public void setBiobankGeneralInformationPersistence(
		BiobankGeneralInformationPersistence biobankGeneralInformationPersistence) {
		this.biobankGeneralInformationPersistence = biobankGeneralInformationPersistence;
	}

	/**
	 * Returns the biobank general information finder.
	 *
	 * @return the biobank general information finder
	 */
	public BiobankGeneralInformationFinder getBiobankGeneralInformationFinder() {
		return biobankGeneralInformationFinder;
	}

	/**
	 * Sets the biobank general information finder.
	 *
	 * @param biobankGeneralInformationFinder the biobank general information finder
	 */
	public void setBiobankGeneralInformationFinder(
		BiobankGeneralInformationFinder biobankGeneralInformationFinder) {
		this.biobankGeneralInformationFinder = biobankGeneralInformationFinder;
	}

	/**
	 * Returns the contact local service.
	 *
	 * @return the contact local service
	 */
	public com.bcnet.portlet.biobank.service.ContactLocalService getContactLocalService() {
		return contactLocalService;
	}

	/**
	 * Sets the contact local service.
	 *
	 * @param contactLocalService the contact local service
	 */
	public void setContactLocalService(
		com.bcnet.portlet.biobank.service.ContactLocalService contactLocalService) {
		this.contactLocalService = contactLocalService;
	}

	/**
	 * Returns the contact remote service.
	 *
	 * @return the contact remote service
	 */
	public com.bcnet.portlet.biobank.service.ContactService getContactService() {
		return contactService;
	}

	/**
	 * Sets the contact remote service.
	 *
	 * @param contactService the contact remote service
	 */
	public void setContactService(
		com.bcnet.portlet.biobank.service.ContactService contactService) {
		this.contactService = contactService;
	}

	/**
	 * Returns the contact persistence.
	 *
	 * @return the contact persistence
	 */
	public ContactPersistence getContactPersistence() {
		return contactPersistence;
	}

	/**
	 * Sets the contact persistence.
	 *
	 * @param contactPersistence the contact persistence
	 */
	public void setContactPersistence(ContactPersistence contactPersistence) {
		this.contactPersistence = contactPersistence;
	}

	/**
	 * Returns the country local service.
	 *
	 * @return the country local service
	 */
	public com.bcnet.portlet.biobank.service.CountryLocalService getCountryLocalService() {
		return countryLocalService;
	}

	/**
	 * Sets the country local service.
	 *
	 * @param countryLocalService the country local service
	 */
	public void setCountryLocalService(
		com.bcnet.portlet.biobank.service.CountryLocalService countryLocalService) {
		this.countryLocalService = countryLocalService;
	}

	/**
	 * Returns the country remote service.
	 *
	 * @return the country remote service
	 */
	public com.bcnet.portlet.biobank.service.CountryService getCountryService() {
		return countryService;
	}

	/**
	 * Sets the country remote service.
	 *
	 * @param countryService the country remote service
	 */
	public void setCountryService(
		com.bcnet.portlet.biobank.service.CountryService countryService) {
		this.countryService = countryService;
	}

	/**
	 * Returns the country persistence.
	 *
	 * @return the country persistence
	 */
	public CountryPersistence getCountryPersistence() {
		return countryPersistence;
	}

	/**
	 * Sets the country persistence.
	 *
	 * @param countryPersistence the country persistence
	 */
	public void setCountryPersistence(CountryPersistence countryPersistence) {
		this.countryPersistence = countryPersistence;
	}

	/**
	 * Returns the juristic person local service.
	 *
	 * @return the juristic person local service
	 */
	public com.bcnet.portlet.biobank.service.JuristicPersonLocalService getJuristicPersonLocalService() {
		return juristicPersonLocalService;
	}

	/**
	 * Sets the juristic person local service.
	 *
	 * @param juristicPersonLocalService the juristic person local service
	 */
	public void setJuristicPersonLocalService(
		com.bcnet.portlet.biobank.service.JuristicPersonLocalService juristicPersonLocalService) {
		this.juristicPersonLocalService = juristicPersonLocalService;
	}

	/**
	 * Returns the juristic person remote service.
	 *
	 * @return the juristic person remote service
	 */
	public com.bcnet.portlet.biobank.service.JuristicPersonService getJuristicPersonService() {
		return juristicPersonService;
	}

	/**
	 * Sets the juristic person remote service.
	 *
	 * @param juristicPersonService the juristic person remote service
	 */
	public void setJuristicPersonService(
		com.bcnet.portlet.biobank.service.JuristicPersonService juristicPersonService) {
		this.juristicPersonService = juristicPersonService;
	}

	/**
	 * Returns the juristic person persistence.
	 *
	 * @return the juristic person persistence
	 */
	public JuristicPersonPersistence getJuristicPersonPersistence() {
		return juristicPersonPersistence;
	}

	/**
	 * Sets the juristic person persistence.
	 *
	 * @param juristicPersonPersistence the juristic person persistence
	 */
	public void setJuristicPersonPersistence(
		JuristicPersonPersistence juristicPersonPersistence) {
		this.juristicPersonPersistence = juristicPersonPersistence;
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

		PersistedModelLocalServiceRegistryUtil.register("com.bcnet.portlet.biobank.model.Contact",
			contactLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.bcnet.portlet.biobank.model.Contact");
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
		return Contact.class;
	}

	protected String getModelClassName() {
		return Contact.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = contactPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.bcnet.portlet.biobank.service.BiobankAtrributeListsMasterLocalService.class)
	protected com.bcnet.portlet.biobank.service.BiobankAtrributeListsMasterLocalService biobankAtrributeListsMasterLocalService;
	@BeanReference(type = com.bcnet.portlet.biobank.service.BiobankAtrributeListsMasterService.class)
	protected com.bcnet.portlet.biobank.service.BiobankAtrributeListsMasterService biobankAtrributeListsMasterService;
	@BeanReference(type = BiobankAtrributeListsMasterPersistence.class)
	protected BiobankAtrributeListsMasterPersistence biobankAtrributeListsMasterPersistence;
	@BeanReference(type = com.bcnet.portlet.biobank.service.BiobankAttributeListsLocalService.class)
	protected com.bcnet.portlet.biobank.service.BiobankAttributeListsLocalService biobankAttributeListsLocalService;
	@BeanReference(type = com.bcnet.portlet.biobank.service.BiobankAttributeListsService.class)
	protected com.bcnet.portlet.biobank.service.BiobankAttributeListsService biobankAttributeListsService;
	@BeanReference(type = BiobankAttributeListsPersistence.class)
	protected BiobankAttributeListsPersistence biobankAttributeListsPersistence;
	@BeanReference(type = com.bcnet.portlet.biobank.service.BiobankContactLocalService.class)
	protected com.bcnet.portlet.biobank.service.BiobankContactLocalService biobankContactLocalService;
	@BeanReference(type = com.bcnet.portlet.biobank.service.BiobankContactService.class)
	protected com.bcnet.portlet.biobank.service.BiobankContactService biobankContactService;
	@BeanReference(type = BiobankContactPersistence.class)
	protected BiobankContactPersistence biobankContactPersistence;
	@BeanReference(type = com.bcnet.portlet.biobank.service.BiobankGeneralInformationLocalService.class)
	protected com.bcnet.portlet.biobank.service.BiobankGeneralInformationLocalService biobankGeneralInformationLocalService;
	@BeanReference(type = com.bcnet.portlet.biobank.service.BiobankGeneralInformationService.class)
	protected com.bcnet.portlet.biobank.service.BiobankGeneralInformationService biobankGeneralInformationService;
	@BeanReference(type = BiobankGeneralInformationPersistence.class)
	protected BiobankGeneralInformationPersistence biobankGeneralInformationPersistence;
	@BeanReference(type = BiobankGeneralInformationFinder.class)
	protected BiobankGeneralInformationFinder biobankGeneralInformationFinder;
	@BeanReference(type = com.bcnet.portlet.biobank.service.ContactLocalService.class)
	protected com.bcnet.portlet.biobank.service.ContactLocalService contactLocalService;
	@BeanReference(type = com.bcnet.portlet.biobank.service.ContactService.class)
	protected com.bcnet.portlet.biobank.service.ContactService contactService;
	@BeanReference(type = ContactPersistence.class)
	protected ContactPersistence contactPersistence;
	@BeanReference(type = com.bcnet.portlet.biobank.service.CountryLocalService.class)
	protected com.bcnet.portlet.biobank.service.CountryLocalService countryLocalService;
	@BeanReference(type = com.bcnet.portlet.biobank.service.CountryService.class)
	protected com.bcnet.portlet.biobank.service.CountryService countryService;
	@BeanReference(type = CountryPersistence.class)
	protected CountryPersistence countryPersistence;
	@BeanReference(type = com.bcnet.portlet.biobank.service.JuristicPersonLocalService.class)
	protected com.bcnet.portlet.biobank.service.JuristicPersonLocalService juristicPersonLocalService;
	@BeanReference(type = com.bcnet.portlet.biobank.service.JuristicPersonService.class)
	protected com.bcnet.portlet.biobank.service.JuristicPersonService juristicPersonService;
	@BeanReference(type = JuristicPersonPersistence.class)
	protected JuristicPersonPersistence juristicPersonPersistence;
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
	private ContactLocalServiceClpInvoker _clpInvoker = new ContactLocalServiceClpInvoker();
}