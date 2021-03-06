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

package com.bcnet.portlet.biobank.model.impl;

import com.bcnet.portlet.biobank.model.Contact;
import com.bcnet.portlet.biobank.model.ContactModel;
import com.bcnet.portlet.biobank.model.ContactSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Contact service. Represents a row in the &quot;contact&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.bcnet.portlet.biobank.model.ContactModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ContactImpl}.
 * </p>
 *
 * @author suyama
 * @see ContactImpl
 * @see com.bcnet.portlet.biobank.model.Contact
 * @see com.bcnet.portlet.biobank.model.ContactModel
 * @generated
 */
@JSON(strict = true)
public class ContactModelImpl extends BaseModelImpl<Contact>
	implements ContactModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a contact model instance should use the {@link com.bcnet.portlet.biobank.model.Contact} interface instead.
	 */
	public static final String TABLE_NAME = "contact";
	public static final Object[][] TABLE_COLUMNS = {
			{ "contactId", Types.BIGINT },
			{ "firstName", Types.VARCHAR },
			{ "lastName", Types.VARCHAR },
			{ "phone", Types.VARCHAR },
			{ "email", Types.VARCHAR },
			{ "address", Types.VARCHAR },
			{ "zip", Types.VARCHAR },
			{ "city", Types.VARCHAR },
			{ "countryCode", Types.VARCHAR },
			{ "juristicPersonId", Types.BIGINT },
			{ "department", Types.VARCHAR },
			{ "orcId", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table contact (contactId LONG not null primary key,firstName VARCHAR(75) null,lastName VARCHAR(75) null,phone VARCHAR(75) null,email VARCHAR(75) null,address VARCHAR(75) null,zip VARCHAR(75) null,city VARCHAR(75) null,countryCode VARCHAR(75) null,juristicPersonId LONG,department VARCHAR(75) null,orcId VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table contact";
	public static final String ORDER_BY_JPQL = " ORDER BY contact.contactId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY contact.contactId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.bcnet.portlet.biobank.model.Contact"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.bcnet.portlet.biobank.model.Contact"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Contact toModel(ContactSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Contact model = new ContactImpl();

		model.setContactId(soapModel.getContactId());
		model.setFirstName(soapModel.getFirstName());
		model.setLastName(soapModel.getLastName());
		model.setPhone(soapModel.getPhone());
		model.setEmail(soapModel.getEmail());
		model.setAddress(soapModel.getAddress());
		model.setZip(soapModel.getZip());
		model.setCity(soapModel.getCity());
		model.setCountryCode(soapModel.getCountryCode());
		model.setJuristicPersonId(soapModel.getJuristicPersonId());
		model.setDepartment(soapModel.getDepartment());
		model.setOrcId(soapModel.getOrcId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Contact> toModels(ContactSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Contact> models = new ArrayList<Contact>(soapModels.length);

		for (ContactSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.bcnet.portlet.biobank.model.Contact"));

	public ContactModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _contactId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setContactId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _contactId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Contact.class;
	}

	@Override
	public String getModelClassName() {
		return Contact.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contactId", getContactId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("phone", getPhone());
		attributes.put("email", getEmail());
		attributes.put("address", getAddress());
		attributes.put("zip", getZip());
		attributes.put("city", getCity());
		attributes.put("countryCode", getCountryCode());
		attributes.put("juristicPersonId", getJuristicPersonId());
		attributes.put("department", getDepartment());
		attributes.put("orcId", getOrcId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String zip = (String)attributes.get("zip");

		if (zip != null) {
			setZip(zip);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String countryCode = (String)attributes.get("countryCode");

		if (countryCode != null) {
			setCountryCode(countryCode);
		}

		Long juristicPersonId = (Long)attributes.get("juristicPersonId");

		if (juristicPersonId != null) {
			setJuristicPersonId(juristicPersonId);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		String orcId = (String)attributes.get("orcId");

		if (orcId != null) {
			setOrcId(orcId);
		}
	}

	@JSON
	@Override
	public long getContactId() {
		return _contactId;
	}

	@Override
	public void setContactId(long contactId) {
		_contactId = contactId;
	}

	@JSON
	@Override
	public String getFirstName() {
		if (_firstName == null) {
			return StringPool.BLANK;
		}
		else {
			return _firstName;
		}
	}

	@Override
	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	@JSON
	@Override
	public String getLastName() {
		if (_lastName == null) {
			return StringPool.BLANK;
		}
		else {
			return _lastName;
		}
	}

	@Override
	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	@JSON
	@Override
	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	@JSON
	@Override
	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		_address = address;
	}

	@JSON
	@Override
	public String getZip() {
		if (_zip == null) {
			return StringPool.BLANK;
		}
		else {
			return _zip;
		}
	}

	@Override
	public void setZip(String zip) {
		_zip = zip;
	}

	@JSON
	@Override
	public String getCity() {
		if (_city == null) {
			return StringPool.BLANK;
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@JSON
	@Override
	public String getCountryCode() {
		if (_countryCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _countryCode;
		}
	}

	@Override
	public void setCountryCode(String countryCode) {
		_countryCode = countryCode;
	}

	@JSON
	@Override
	public long getJuristicPersonId() {
		return _juristicPersonId;
	}

	@Override
	public void setJuristicPersonId(long juristicPersonId) {
		_juristicPersonId = juristicPersonId;
	}

	@JSON
	@Override
	public String getDepartment() {
		if (_department == null) {
			return StringPool.BLANK;
		}
		else {
			return _department;
		}
	}

	@Override
	public void setDepartment(String department) {
		_department = department;
	}

	@JSON
	@Override
	public String getOrcId() {
		if (_orcId == null) {
			return StringPool.BLANK;
		}
		else {
			return _orcId;
		}
	}

	@Override
	public void setOrcId(String orcId) {
		_orcId = orcId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Contact.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Contact toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Contact)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ContactImpl contactImpl = new ContactImpl();

		contactImpl.setContactId(getContactId());
		contactImpl.setFirstName(getFirstName());
		contactImpl.setLastName(getLastName());
		contactImpl.setPhone(getPhone());
		contactImpl.setEmail(getEmail());
		contactImpl.setAddress(getAddress());
		contactImpl.setZip(getZip());
		contactImpl.setCity(getCity());
		contactImpl.setCountryCode(getCountryCode());
		contactImpl.setJuristicPersonId(getJuristicPersonId());
		contactImpl.setDepartment(getDepartment());
		contactImpl.setOrcId(getOrcId());

		contactImpl.resetOriginalValues();

		return contactImpl;
	}

	@Override
	public int compareTo(Contact contact) {
		long primaryKey = contact.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Contact)) {
			return false;
		}

		Contact contact = (Contact)obj;

		long primaryKey = contact.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Contact> toCacheModel() {
		ContactCacheModel contactCacheModel = new ContactCacheModel();

		contactCacheModel.contactId = getContactId();

		contactCacheModel.firstName = getFirstName();

		String firstName = contactCacheModel.firstName;

		if ((firstName != null) && (firstName.length() == 0)) {
			contactCacheModel.firstName = null;
		}

		contactCacheModel.lastName = getLastName();

		String lastName = contactCacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			contactCacheModel.lastName = null;
		}

		contactCacheModel.phone = getPhone();

		String phone = contactCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			contactCacheModel.phone = null;
		}

		contactCacheModel.email = getEmail();

		String email = contactCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			contactCacheModel.email = null;
		}

		contactCacheModel.address = getAddress();

		String address = contactCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			contactCacheModel.address = null;
		}

		contactCacheModel.zip = getZip();

		String zip = contactCacheModel.zip;

		if ((zip != null) && (zip.length() == 0)) {
			contactCacheModel.zip = null;
		}

		contactCacheModel.city = getCity();

		String city = contactCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			contactCacheModel.city = null;
		}

		contactCacheModel.countryCode = getCountryCode();

		String countryCode = contactCacheModel.countryCode;

		if ((countryCode != null) && (countryCode.length() == 0)) {
			contactCacheModel.countryCode = null;
		}

		contactCacheModel.juristicPersonId = getJuristicPersonId();

		contactCacheModel.department = getDepartment();

		String department = contactCacheModel.department;

		if ((department != null) && (department.length() == 0)) {
			contactCacheModel.department = null;
		}

		contactCacheModel.orcId = getOrcId();

		String orcId = contactCacheModel.orcId;

		if ((orcId != null) && (orcId.length() == 0)) {
			contactCacheModel.orcId = null;
		}

		return contactCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{contactId=");
		sb.append(getContactId());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", zip=");
		sb.append(getZip());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", countryCode=");
		sb.append(getCountryCode());
		sb.append(", juristicPersonId=");
		sb.append(getJuristicPersonId());
		sb.append(", department=");
		sb.append(getDepartment());
		sb.append(", orcId=");
		sb.append(getOrcId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.bcnet.portlet.biobank.model.Contact");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>contactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>firstName</column-name><column-value><![CDATA[");
		sb.append(getFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastName</column-name><column-value><![CDATA[");
		sb.append(getLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zip</column-name><column-value><![CDATA[");
		sb.append(getZip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryCode</column-name><column-value><![CDATA[");
		sb.append(getCountryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>juristicPersonId</column-name><column-value><![CDATA[");
		sb.append(getJuristicPersonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>department</column-name><column-value><![CDATA[");
		sb.append(getDepartment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orcId</column-name><column-value><![CDATA[");
		sb.append(getOrcId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Contact.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Contact.class
		};
	private long _contactId;
	private String _firstName;
	private String _lastName;
	private String _phone;
	private String _email;
	private String _address;
	private String _zip;
	private String _city;
	private String _countryCode;
	private long _juristicPersonId;
	private String _department;
	private String _orcId;
	private Contact _escapedModel;
}