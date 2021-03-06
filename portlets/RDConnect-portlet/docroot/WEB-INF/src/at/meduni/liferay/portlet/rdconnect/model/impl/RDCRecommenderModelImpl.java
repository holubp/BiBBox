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

package at.meduni.liferay.portlet.rdconnect.model.impl;

import at.meduni.liferay.portlet.rdconnect.model.RDCRecommender;
import at.meduni.liferay.portlet.rdconnect.model.RDCRecommenderModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the RDCRecommender service. Represents a row in the &quot;rdconnect.rdcrecommender&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.meduni.liferay.portlet.rdconnect.model.RDCRecommenderModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RDCRecommenderImpl}.
 * </p>
 *
 * @author Robert Reihs
 * @see RDCRecommenderImpl
 * @see at.meduni.liferay.portlet.rdconnect.model.RDCRecommender
 * @see at.meduni.liferay.portlet.rdconnect.model.RDCRecommenderModel
 * @generated
 */
public class RDCRecommenderModelImpl extends BaseModelImpl<RDCRecommender>
	implements RDCRecommenderModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a r d c recommender model instance should use the {@link at.meduni.liferay.portlet.rdconnect.model.RDCRecommender} interface instead.
	 */
	public static final String TABLE_NAME = "rdconnect.rdcrecommender";
	public static final Object[][] TABLE_COLUMNS = {
			{ "rdcrecommenderid", Types.BIGINT },
			{ "organisationId", Types.BIGINT },
			{ "recommendedorganisationId", Types.BIGINT },
			{ "recommendervalue", Types.DOUBLE }
		};
	public static final String TABLE_SQL_CREATE = "create table rdconnect.rdcrecommender (rdcrecommenderid LONG not null primary key,organisationId LONG,recommendedorganisationId LONG,recommendervalue DOUBLE)";
	public static final String TABLE_SQL_DROP = "drop table rdconnect.rdcrecommender";
	public static final String ORDER_BY_JPQL = " ORDER BY rdcRecommender.rdcrecommenderid ASC";
	public static final String ORDER_BY_SQL = " ORDER BY rdconnect.rdcrecommender.rdcrecommenderid ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.meduni.liferay.portlet.rdconnect.model.RDCRecommender"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.meduni.liferay.portlet.rdconnect.model.RDCRecommender"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.meduni.liferay.portlet.rdconnect.model.RDCRecommender"),
			true);
	public static long ORGANISATIONID_COLUMN_BITMASK = 1L;
	public static long RECOMMENDEDORGANISATIONID_COLUMN_BITMASK = 2L;
	public static long RDCRECOMMENDERID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.meduni.liferay.portlet.rdconnect.model.RDCRecommender"));

	public RDCRecommenderModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _rdcrecommenderid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRdcrecommenderid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _rdcrecommenderid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return RDCRecommender.class;
	}

	@Override
	public String getModelClassName() {
		return RDCRecommender.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("rdcrecommenderid", getRdcrecommenderid());
		attributes.put("organisationId", getOrganisationId());
		attributes.put("recommendedorganisationId",
			getRecommendedorganisationId());
		attributes.put("recommendervalue", getRecommendervalue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long rdcrecommenderid = (Long)attributes.get("rdcrecommenderid");

		if (rdcrecommenderid != null) {
			setRdcrecommenderid(rdcrecommenderid);
		}

		Long organisationId = (Long)attributes.get("organisationId");

		if (organisationId != null) {
			setOrganisationId(organisationId);
		}

		Long recommendedorganisationId = (Long)attributes.get(
				"recommendedorganisationId");

		if (recommendedorganisationId != null) {
			setRecommendedorganisationId(recommendedorganisationId);
		}

		Double recommendervalue = (Double)attributes.get("recommendervalue");

		if (recommendervalue != null) {
			setRecommendervalue(recommendervalue);
		}
	}

	@Override
	public long getRdcrecommenderid() {
		return _rdcrecommenderid;
	}

	@Override
	public void setRdcrecommenderid(long rdcrecommenderid) {
		_rdcrecommenderid = rdcrecommenderid;
	}

	@Override
	public long getOrganisationId() {
		return _organisationId;
	}

	@Override
	public void setOrganisationId(long organisationId) {
		_columnBitmask |= ORGANISATIONID_COLUMN_BITMASK;

		if (!_setOriginalOrganisationId) {
			_setOriginalOrganisationId = true;

			_originalOrganisationId = _organisationId;
		}

		_organisationId = organisationId;
	}

	public long getOriginalOrganisationId() {
		return _originalOrganisationId;
	}

	@Override
	public long getRecommendedorganisationId() {
		return _recommendedorganisationId;
	}

	@Override
	public void setRecommendedorganisationId(long recommendedorganisationId) {
		_columnBitmask |= RECOMMENDEDORGANISATIONID_COLUMN_BITMASK;

		if (!_setOriginalRecommendedorganisationId) {
			_setOriginalRecommendedorganisationId = true;

			_originalRecommendedorganisationId = _recommendedorganisationId;
		}

		_recommendedorganisationId = recommendedorganisationId;
	}

	public long getOriginalRecommendedorganisationId() {
		return _originalRecommendedorganisationId;
	}

	@Override
	public double getRecommendervalue() {
		return _recommendervalue;
	}

	@Override
	public void setRecommendervalue(double recommendervalue) {
		_recommendervalue = recommendervalue;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			RDCRecommender.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public RDCRecommender toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (RDCRecommender)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RDCRecommenderImpl rdcRecommenderImpl = new RDCRecommenderImpl();

		rdcRecommenderImpl.setRdcrecommenderid(getRdcrecommenderid());
		rdcRecommenderImpl.setOrganisationId(getOrganisationId());
		rdcRecommenderImpl.setRecommendedorganisationId(getRecommendedorganisationId());
		rdcRecommenderImpl.setRecommendervalue(getRecommendervalue());

		rdcRecommenderImpl.resetOriginalValues();

		return rdcRecommenderImpl;
	}

	@Override
	public int compareTo(RDCRecommender rdcRecommender) {
		long primaryKey = rdcRecommender.getPrimaryKey();

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

		if (!(obj instanceof RDCRecommender)) {
			return false;
		}

		RDCRecommender rdcRecommender = (RDCRecommender)obj;

		long primaryKey = rdcRecommender.getPrimaryKey();

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
		RDCRecommenderModelImpl rdcRecommenderModelImpl = this;

		rdcRecommenderModelImpl._originalOrganisationId = rdcRecommenderModelImpl._organisationId;

		rdcRecommenderModelImpl._setOriginalOrganisationId = false;

		rdcRecommenderModelImpl._originalRecommendedorganisationId = rdcRecommenderModelImpl._recommendedorganisationId;

		rdcRecommenderModelImpl._setOriginalRecommendedorganisationId = false;

		rdcRecommenderModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<RDCRecommender> toCacheModel() {
		RDCRecommenderCacheModel rdcRecommenderCacheModel = new RDCRecommenderCacheModel();

		rdcRecommenderCacheModel.rdcrecommenderid = getRdcrecommenderid();

		rdcRecommenderCacheModel.organisationId = getOrganisationId();

		rdcRecommenderCacheModel.recommendedorganisationId = getRecommendedorganisationId();

		rdcRecommenderCacheModel.recommendervalue = getRecommendervalue();

		return rdcRecommenderCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{rdcrecommenderid=");
		sb.append(getRdcrecommenderid());
		sb.append(", organisationId=");
		sb.append(getOrganisationId());
		sb.append(", recommendedorganisationId=");
		sb.append(getRecommendedorganisationId());
		sb.append(", recommendervalue=");
		sb.append(getRecommendervalue());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("at.meduni.liferay.portlet.rdconnect.model.RDCRecommender");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>rdcrecommenderid</column-name><column-value><![CDATA[");
		sb.append(getRdcrecommenderid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organisationId</column-name><column-value><![CDATA[");
		sb.append(getOrganisationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recommendedorganisationId</column-name><column-value><![CDATA[");
		sb.append(getRecommendedorganisationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recommendervalue</column-name><column-value><![CDATA[");
		sb.append(getRecommendervalue());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = RDCRecommender.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			RDCRecommender.class
		};
	private long _rdcrecommenderid;
	private long _organisationId;
	private long _originalOrganisationId;
	private boolean _setOriginalOrganisationId;
	private long _recommendedorganisationId;
	private long _originalRecommendedorganisationId;
	private boolean _setOriginalRecommendedorganisationId;
	private double _recommendervalue;
	private long _columnBitmask;
	private RDCRecommender _escapedModel;
}