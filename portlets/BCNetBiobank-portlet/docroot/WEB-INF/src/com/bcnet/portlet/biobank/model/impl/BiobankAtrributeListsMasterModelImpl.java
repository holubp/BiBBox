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

import com.bcnet.portlet.biobank.model.BiobankAtrributeListsMaster;
import com.bcnet.portlet.biobank.model.BiobankAtrributeListsMasterModel;
import com.bcnet.portlet.biobank.model.BiobankAtrributeListsMasterSoap;

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
 * The base model implementation for the BiobankAtrributeListsMaster service. Represents a row in the &quot;biobankattributelistsmaster&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.bcnet.portlet.biobank.model.BiobankAtrributeListsMasterModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BiobankAtrributeListsMasterImpl}.
 * </p>
 *
 * @author suyama
 * @see BiobankAtrributeListsMasterImpl
 * @see com.bcnet.portlet.biobank.model.BiobankAtrributeListsMaster
 * @see com.bcnet.portlet.biobank.model.BiobankAtrributeListsMasterModel
 * @generated
 */
@JSON(strict = true)
public class BiobankAtrributeListsMasterModelImpl extends BaseModelImpl<BiobankAtrributeListsMaster>
	implements BiobankAtrributeListsMasterModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a biobank atrribute lists master model instance should use the {@link com.bcnet.portlet.biobank.model.BiobankAtrributeListsMaster} interface instead.
	 */
	public static final String TABLE_NAME = "biobankattributelistsmaster";
	public static final Object[][] TABLE_COLUMNS = {
			{ "biobankAttributeListsMasterId", Types.BIGINT },
			{ "attributeListName", Types.VARCHAR },
			{ "attributeListValue", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table biobankattributelistsmaster (biobankAttributeListsMasterId LONG not null primary key,attributeListName VARCHAR(75) null,attributeListValue VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table biobankattributelistsmaster";
	public static final String ORDER_BY_JPQL = " ORDER BY biobankAtrributeListsMaster.biobankAttributeListsMasterId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY biobankattributelistsmaster.biobankAttributeListsMasterId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.bcnet.portlet.biobank.model.BiobankAtrributeListsMaster"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.bcnet.portlet.biobank.model.BiobankAtrributeListsMaster"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.bcnet.portlet.biobank.model.BiobankAtrributeListsMaster"),
			true);
	public static long ATTRIBUTELISTNAME_COLUMN_BITMASK = 1L;
	public static long BIOBANKATTRIBUTELISTSMASTERID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static BiobankAtrributeListsMaster toModel(
		BiobankAtrributeListsMasterSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		BiobankAtrributeListsMaster model = new BiobankAtrributeListsMasterImpl();

		model.setBiobankAttributeListsMasterId(soapModel.getBiobankAttributeListsMasterId());
		model.setAttributeListName(soapModel.getAttributeListName());
		model.setAttributeListValue(soapModel.getAttributeListValue());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<BiobankAtrributeListsMaster> toModels(
		BiobankAtrributeListsMasterSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<BiobankAtrributeListsMaster> models = new ArrayList<BiobankAtrributeListsMaster>(soapModels.length);

		for (BiobankAtrributeListsMasterSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.bcnet.portlet.biobank.model.BiobankAtrributeListsMaster"));

	public BiobankAtrributeListsMasterModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _biobankAttributeListsMasterId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBiobankAttributeListsMasterId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _biobankAttributeListsMasterId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return BiobankAtrributeListsMaster.class;
	}

	@Override
	public String getModelClassName() {
		return BiobankAtrributeListsMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("biobankAttributeListsMasterId",
			getBiobankAttributeListsMasterId());
		attributes.put("attributeListName", getAttributeListName());
		attributes.put("attributeListValue", getAttributeListValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long biobankAttributeListsMasterId = (Long)attributes.get(
				"biobankAttributeListsMasterId");

		if (biobankAttributeListsMasterId != null) {
			setBiobankAttributeListsMasterId(biobankAttributeListsMasterId);
		}

		String attributeListName = (String)attributes.get("attributeListName");

		if (attributeListName != null) {
			setAttributeListName(attributeListName);
		}

		String attributeListValue = (String)attributes.get("attributeListValue");

		if (attributeListValue != null) {
			setAttributeListValue(attributeListValue);
		}
	}

	@JSON
	@Override
	public long getBiobankAttributeListsMasterId() {
		return _biobankAttributeListsMasterId;
	}

	@Override
	public void setBiobankAttributeListsMasterId(
		long biobankAttributeListsMasterId) {
		_biobankAttributeListsMasterId = biobankAttributeListsMasterId;
	}

	@JSON
	@Override
	public String getAttributeListName() {
		if (_attributeListName == null) {
			return StringPool.BLANK;
		}
		else {
			return _attributeListName;
		}
	}

	@Override
	public void setAttributeListName(String attributeListName) {
		_columnBitmask |= ATTRIBUTELISTNAME_COLUMN_BITMASK;

		if (_originalAttributeListName == null) {
			_originalAttributeListName = _attributeListName;
		}

		_attributeListName = attributeListName;
	}

	public String getOriginalAttributeListName() {
		return GetterUtil.getString(_originalAttributeListName);
	}

	@JSON
	@Override
	public String getAttributeListValue() {
		if (_attributeListValue == null) {
			return StringPool.BLANK;
		}
		else {
			return _attributeListValue;
		}
	}

	@Override
	public void setAttributeListValue(String attributeListValue) {
		_attributeListValue = attributeListValue;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			BiobankAtrributeListsMaster.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public BiobankAtrributeListsMaster toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (BiobankAtrributeListsMaster)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BiobankAtrributeListsMasterImpl biobankAtrributeListsMasterImpl = new BiobankAtrributeListsMasterImpl();

		biobankAtrributeListsMasterImpl.setBiobankAttributeListsMasterId(getBiobankAttributeListsMasterId());
		biobankAtrributeListsMasterImpl.setAttributeListName(getAttributeListName());
		biobankAtrributeListsMasterImpl.setAttributeListValue(getAttributeListValue());

		biobankAtrributeListsMasterImpl.resetOriginalValues();

		return biobankAtrributeListsMasterImpl;
	}

	@Override
	public int compareTo(
		BiobankAtrributeListsMaster biobankAtrributeListsMaster) {
		long primaryKey = biobankAtrributeListsMaster.getPrimaryKey();

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

		if (!(obj instanceof BiobankAtrributeListsMaster)) {
			return false;
		}

		BiobankAtrributeListsMaster biobankAtrributeListsMaster = (BiobankAtrributeListsMaster)obj;

		long primaryKey = biobankAtrributeListsMaster.getPrimaryKey();

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
		BiobankAtrributeListsMasterModelImpl biobankAtrributeListsMasterModelImpl =
			this;

		biobankAtrributeListsMasterModelImpl._originalAttributeListName = biobankAtrributeListsMasterModelImpl._attributeListName;

		biobankAtrributeListsMasterModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<BiobankAtrributeListsMaster> toCacheModel() {
		BiobankAtrributeListsMasterCacheModel biobankAtrributeListsMasterCacheModel =
			new BiobankAtrributeListsMasterCacheModel();

		biobankAtrributeListsMasterCacheModel.biobankAttributeListsMasterId = getBiobankAttributeListsMasterId();

		biobankAtrributeListsMasterCacheModel.attributeListName = getAttributeListName();

		String attributeListName = biobankAtrributeListsMasterCacheModel.attributeListName;

		if ((attributeListName != null) && (attributeListName.length() == 0)) {
			biobankAtrributeListsMasterCacheModel.attributeListName = null;
		}

		biobankAtrributeListsMasterCacheModel.attributeListValue = getAttributeListValue();

		String attributeListValue = biobankAtrributeListsMasterCacheModel.attributeListValue;

		if ((attributeListValue != null) && (attributeListValue.length() == 0)) {
			biobankAtrributeListsMasterCacheModel.attributeListValue = null;
		}

		return biobankAtrributeListsMasterCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{biobankAttributeListsMasterId=");
		sb.append(getBiobankAttributeListsMasterId());
		sb.append(", attributeListName=");
		sb.append(getAttributeListName());
		sb.append(", attributeListValue=");
		sb.append(getAttributeListValue());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.bcnet.portlet.biobank.model.BiobankAtrributeListsMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>biobankAttributeListsMasterId</column-name><column-value><![CDATA[");
		sb.append(getBiobankAttributeListsMasterId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attributeListName</column-name><column-value><![CDATA[");
		sb.append(getAttributeListName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attributeListValue</column-name><column-value><![CDATA[");
		sb.append(getAttributeListValue());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = BiobankAtrributeListsMaster.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			BiobankAtrributeListsMaster.class
		};
	private long _biobankAttributeListsMasterId;
	private String _attributeListName;
	private String _originalAttributeListName;
	private String _attributeListValue;
	private long _columnBitmask;
	private BiobankAtrributeListsMaster _escapedModel;
}