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

import com.bcnet.portlet.biobank.model.Biobank;
import com.bcnet.portlet.biobank.model.BiobankModel;
import com.bcnet.portlet.biobank.model.BiobankSoap;

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
 * The base model implementation for the Biobank service. Represents a row in the &quot;biobank&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.bcnet.portlet.biobank.model.BiobankModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BiobankImpl}.
 * </p>
 *
 * @author suyama
 * @see BiobankImpl
 * @see com.bcnet.portlet.biobank.model.Biobank
 * @see com.bcnet.portlet.biobank.model.BiobankModel
 * @generated
 */
@JSON(strict = true)
public class BiobankModelImpl extends BaseModelImpl<Biobank>
	implements BiobankModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a biobank model instance should use the {@link com.bcnet.portlet.biobank.model.Biobank} interface instead.
	 */
	public static final String TABLE_NAME = "biobank";
	public static final Object[][] TABLE_COLUMNS = {
			{ "biobankDbId", Types.BIGINT },
			{ "biobankId", Types.VARCHAR },
			{ "acronym", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "url", Types.VARCHAR },
			{ "juristicPersonId", Types.BIGINT },
			{ "countryCode", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "backup", Types.BOOLEAN },
			{ "trainingCourses", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table biobank (biobankDbId LONG not null primary key,biobankId VARCHAR(75) null,acronym VARCHAR(75) null,name VARCHAR(75) null,url VARCHAR(75) null,juristicPersonId LONG,countryCode VARCHAR(75) null,description VARCHAR(75) null,backup BOOLEAN,trainingCourses BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table biobank";
	public static final String ORDER_BY_JPQL = " ORDER BY biobank.biobankDbId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY biobank.biobankDbId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.bcnet.portlet.biobank.model.Biobank"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.bcnet.portlet.biobank.model.Biobank"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Biobank toModel(BiobankSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Biobank model = new BiobankImpl();

		model.setBiobankDbId(soapModel.getBiobankDbId());
		model.setBiobankId(soapModel.getBiobankId());
		model.setAcronym(soapModel.getAcronym());
		model.setName(soapModel.getName());
		model.setUrl(soapModel.getUrl());
		model.setJuristicPersonId(soapModel.getJuristicPersonId());
		model.setCountryCode(soapModel.getCountryCode());
		model.setDescription(soapModel.getDescription());
		model.setBackup(soapModel.getBackup());
		model.setTrainingCourses(soapModel.getTrainingCourses());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Biobank> toModels(BiobankSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Biobank> models = new ArrayList<Biobank>(soapModels.length);

		for (BiobankSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.bcnet.portlet.biobank.model.Biobank"));

	public BiobankModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _biobankDbId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBiobankDbId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _biobankDbId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Biobank.class;
	}

	@Override
	public String getModelClassName() {
		return Biobank.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("biobankDbId", getBiobankDbId());
		attributes.put("biobankId", getBiobankId());
		attributes.put("acronym", getAcronym());
		attributes.put("name", getName());
		attributes.put("url", getUrl());
		attributes.put("juristicPersonId", getJuristicPersonId());
		attributes.put("countryCode", getCountryCode());
		attributes.put("description", getDescription());
		attributes.put("backup", getBackup());
		attributes.put("trainingCourses", getTrainingCourses());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long biobankDbId = (Long)attributes.get("biobankDbId");

		if (biobankDbId != null) {
			setBiobankDbId(biobankDbId);
		}

		String biobankId = (String)attributes.get("biobankId");

		if (biobankId != null) {
			setBiobankId(biobankId);
		}

		String acronym = (String)attributes.get("acronym");

		if (acronym != null) {
			setAcronym(acronym);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		Long juristicPersonId = (Long)attributes.get("juristicPersonId");

		if (juristicPersonId != null) {
			setJuristicPersonId(juristicPersonId);
		}

		String countryCode = (String)attributes.get("countryCode");

		if (countryCode != null) {
			setCountryCode(countryCode);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Boolean backup = (Boolean)attributes.get("backup");

		if (backup != null) {
			setBackup(backup);
		}

		Boolean trainingCourses = (Boolean)attributes.get("trainingCourses");

		if (trainingCourses != null) {
			setTrainingCourses(trainingCourses);
		}
	}

	@JSON
	@Override
	public long getBiobankDbId() {
		return _biobankDbId;
	}

	@Override
	public void setBiobankDbId(long biobankDbId) {
		_biobankDbId = biobankDbId;
	}

	@JSON
	@Override
	public String getBiobankId() {
		if (_biobankId == null) {
			return StringPool.BLANK;
		}
		else {
			return _biobankId;
		}
	}

	@Override
	public void setBiobankId(String biobankId) {
		_biobankId = biobankId;
	}

	@JSON
	@Override
	public String getAcronym() {
		if (_acronym == null) {
			return StringPool.BLANK;
		}
		else {
			return _acronym;
		}
	}

	@Override
	public void setAcronym(String acronym) {
		_acronym = acronym;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@JSON
	@Override
	public String getUrl() {
		if (_url == null) {
			return StringPool.BLANK;
		}
		else {
			return _url;
		}
	}

	@Override
	public void setUrl(String url) {
		_url = url;
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
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public boolean getBackup() {
		return _backup;
	}

	@Override
	public boolean isBackup() {
		return _backup;
	}

	@Override
	public void setBackup(boolean backup) {
		_backup = backup;
	}

	@JSON
	@Override
	public boolean getTrainingCourses() {
		return _trainingCourses;
	}

	@Override
	public boolean isTrainingCourses() {
		return _trainingCourses;
	}

	@Override
	public void setTrainingCourses(boolean trainingCourses) {
		_trainingCourses = trainingCourses;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Biobank.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Biobank toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Biobank)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BiobankImpl biobankImpl = new BiobankImpl();

		biobankImpl.setBiobankDbId(getBiobankDbId());
		biobankImpl.setBiobankId(getBiobankId());
		biobankImpl.setAcronym(getAcronym());
		biobankImpl.setName(getName());
		biobankImpl.setUrl(getUrl());
		biobankImpl.setJuristicPersonId(getJuristicPersonId());
		biobankImpl.setCountryCode(getCountryCode());
		biobankImpl.setDescription(getDescription());
		biobankImpl.setBackup(getBackup());
		biobankImpl.setTrainingCourses(getTrainingCourses());

		biobankImpl.resetOriginalValues();

		return biobankImpl;
	}

	@Override
	public int compareTo(Biobank biobank) {
		long primaryKey = biobank.getPrimaryKey();

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

		if (!(obj instanceof Biobank)) {
			return false;
		}

		Biobank biobank = (Biobank)obj;

		long primaryKey = biobank.getPrimaryKey();

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
	public CacheModel<Biobank> toCacheModel() {
		BiobankCacheModel biobankCacheModel = new BiobankCacheModel();

		biobankCacheModel.biobankDbId = getBiobankDbId();

		biobankCacheModel.biobankId = getBiobankId();

		String biobankId = biobankCacheModel.biobankId;

		if ((biobankId != null) && (biobankId.length() == 0)) {
			biobankCacheModel.biobankId = null;
		}

		biobankCacheModel.acronym = getAcronym();

		String acronym = biobankCacheModel.acronym;

		if ((acronym != null) && (acronym.length() == 0)) {
			biobankCacheModel.acronym = null;
		}

		biobankCacheModel.name = getName();

		String name = biobankCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			biobankCacheModel.name = null;
		}

		biobankCacheModel.url = getUrl();

		String url = biobankCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			biobankCacheModel.url = null;
		}

		biobankCacheModel.juristicPersonId = getJuristicPersonId();

		biobankCacheModel.countryCode = getCountryCode();

		String countryCode = biobankCacheModel.countryCode;

		if ((countryCode != null) && (countryCode.length() == 0)) {
			biobankCacheModel.countryCode = null;
		}

		biobankCacheModel.description = getDescription();

		String description = biobankCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			biobankCacheModel.description = null;
		}

		biobankCacheModel.backup = getBackup();

		biobankCacheModel.trainingCourses = getTrainingCourses();

		return biobankCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{biobankDbId=");
		sb.append(getBiobankDbId());
		sb.append(", biobankId=");
		sb.append(getBiobankId());
		sb.append(", acronym=");
		sb.append(getAcronym());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", juristicPersonId=");
		sb.append(getJuristicPersonId());
		sb.append(", countryCode=");
		sb.append(getCountryCode());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", backup=");
		sb.append(getBackup());
		sb.append(", trainingCourses=");
		sb.append(getTrainingCourses());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.bcnet.portlet.biobank.model.Biobank");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>biobankDbId</column-name><column-value><![CDATA[");
		sb.append(getBiobankDbId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>biobankId</column-name><column-value><![CDATA[");
		sb.append(getBiobankId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acronym</column-name><column-value><![CDATA[");
		sb.append(getAcronym());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>juristicPersonId</column-name><column-value><![CDATA[");
		sb.append(getJuristicPersonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryCode</column-name><column-value><![CDATA[");
		sb.append(getCountryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>backup</column-name><column-value><![CDATA[");
		sb.append(getBackup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trainingCourses</column-name><column-value><![CDATA[");
		sb.append(getTrainingCourses());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Biobank.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Biobank.class
		};
	private long _biobankDbId;
	private String _biobankId;
	private String _acronym;
	private String _name;
	private String _url;
	private long _juristicPersonId;
	private String _countryCode;
	private String _description;
	private boolean _backup;
	private boolean _trainingCourses;
	private Biobank _escapedModel;
}