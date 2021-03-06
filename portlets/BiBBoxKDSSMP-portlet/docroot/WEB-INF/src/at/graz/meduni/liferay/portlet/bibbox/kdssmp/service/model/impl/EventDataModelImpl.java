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

package at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.impl;

import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventData;
import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventDataModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
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

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the EventData service. Represents a row in the &quot;kdssmp.eventdata&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventDataModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EventDataImpl}.
 * </p>
 *
 * @author reihsr
 * @see EventDataImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventData
 * @see at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventDataModel
 * @generated
 */
public class EventDataModelImpl extends BaseModelImpl<EventData>
	implements EventDataModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a event data model instance should use the {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventData} interface instead.
	 */
	public static final String TABLE_NAME = "kdssmp.eventdata";
	public static final Object[][] TABLE_COLUMNS = {
			{ "eventdataId", Types.BIGINT },
			{ "eventlayoutId", Types.BIGINT },
			{ "patientId", Types.BIGINT },
			{ "ontology", Types.VARCHAR },
			{ "value", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table kdssmp.eventdata (eventdataId LONG not null primary key,eventlayoutId LONG,patientId LONG,ontology TEXT null,value TEXT null)";
	public static final String TABLE_SQL_DROP = "drop table kdssmp.eventdata";
	public static final String ORDER_BY_JPQL = " ORDER BY eventData.eventlayoutId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY kdssmp.eventdata.eventlayoutId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventData"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventData"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventData"),
			true);
	public static long EVENTLAYOUTID_COLUMN_BITMASK = 1L;
	public static long ONTOLOGY_COLUMN_BITMASK = 2L;
	public static long PATIENTID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventData"));

	public EventDataModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _eventdataId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEventdataId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _eventdataId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EventData.class;
	}

	@Override
	public String getModelClassName() {
		return EventData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eventdataId", getEventdataId());
		attributes.put("eventlayoutId", getEventlayoutId());
		attributes.put("patientId", getPatientId());
		attributes.put("ontology", getOntology());
		attributes.put("value", getValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eventdataId = (Long)attributes.get("eventdataId");

		if (eventdataId != null) {
			setEventdataId(eventdataId);
		}

		Long eventlayoutId = (Long)attributes.get("eventlayoutId");

		if (eventlayoutId != null) {
			setEventlayoutId(eventlayoutId);
		}

		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
		}

		String ontology = (String)attributes.get("ontology");

		if (ontology != null) {
			setOntology(ontology);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}
	}

	@Override
	public long getEventdataId() {
		return _eventdataId;
	}

	@Override
	public void setEventdataId(long eventdataId) {
		_eventdataId = eventdataId;
	}

	@Override
	public long getEventlayoutId() {
		return _eventlayoutId;
	}

	@Override
	public void setEventlayoutId(long eventlayoutId) {
		_columnBitmask = -1L;

		if (!_setOriginalEventlayoutId) {
			_setOriginalEventlayoutId = true;

			_originalEventlayoutId = _eventlayoutId;
		}

		_eventlayoutId = eventlayoutId;
	}

	public long getOriginalEventlayoutId() {
		return _originalEventlayoutId;
	}

	@Override
	public long getPatientId() {
		return _patientId;
	}

	@Override
	public void setPatientId(long patientId) {
		_columnBitmask |= PATIENTID_COLUMN_BITMASK;

		if (!_setOriginalPatientId) {
			_setOriginalPatientId = true;

			_originalPatientId = _patientId;
		}

		_patientId = patientId;
	}

	public long getOriginalPatientId() {
		return _originalPatientId;
	}

	@Override
	public String getOntology() {
		if (_ontology == null) {
			return StringPool.BLANK;
		}
		else {
			return _ontology;
		}
	}

	@Override
	public void setOntology(String ontology) {
		_columnBitmask |= ONTOLOGY_COLUMN_BITMASK;

		if (_originalOntology == null) {
			_originalOntology = _ontology;
		}

		_ontology = ontology;
	}

	public String getOriginalOntology() {
		return GetterUtil.getString(_originalOntology);
	}

	@Override
	public String getValue() {
		if (_value == null) {
			return StringPool.BLANK;
		}
		else {
			return _value;
		}
	}

	@Override
	public void setValue(String value) {
		_value = value;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			EventData.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EventData toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EventData)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EventDataImpl eventDataImpl = new EventDataImpl();

		eventDataImpl.setEventdataId(getEventdataId());
		eventDataImpl.setEventlayoutId(getEventlayoutId());
		eventDataImpl.setPatientId(getPatientId());
		eventDataImpl.setOntology(getOntology());
		eventDataImpl.setValue(getValue());

		eventDataImpl.resetOriginalValues();

		return eventDataImpl;
	}

	@Override
	public int compareTo(EventData eventData) {
		int value = 0;

		if (getEventlayoutId() < eventData.getEventlayoutId()) {
			value = -1;
		}
		else if (getEventlayoutId() > eventData.getEventlayoutId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EventData)) {
			return false;
		}

		EventData eventData = (EventData)obj;

		long primaryKey = eventData.getPrimaryKey();

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
		EventDataModelImpl eventDataModelImpl = this;

		eventDataModelImpl._originalEventlayoutId = eventDataModelImpl._eventlayoutId;

		eventDataModelImpl._setOriginalEventlayoutId = false;

		eventDataModelImpl._originalPatientId = eventDataModelImpl._patientId;

		eventDataModelImpl._setOriginalPatientId = false;

		eventDataModelImpl._originalOntology = eventDataModelImpl._ontology;

		eventDataModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<EventData> toCacheModel() {
		EventDataCacheModel eventDataCacheModel = new EventDataCacheModel();

		eventDataCacheModel.eventdataId = getEventdataId();

		eventDataCacheModel.eventlayoutId = getEventlayoutId();

		eventDataCacheModel.patientId = getPatientId();

		eventDataCacheModel.ontology = getOntology();

		String ontology = eventDataCacheModel.ontology;

		if ((ontology != null) && (ontology.length() == 0)) {
			eventDataCacheModel.ontology = null;
		}

		eventDataCacheModel.value = getValue();

		String value = eventDataCacheModel.value;

		if ((value != null) && (value.length() == 0)) {
			eventDataCacheModel.value = null;
		}

		return eventDataCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{eventdataId=");
		sb.append(getEventdataId());
		sb.append(", eventlayoutId=");
		sb.append(getEventlayoutId());
		sb.append(", patientId=");
		sb.append(getPatientId());
		sb.append(", ontology=");
		sb.append(getOntology());
		sb.append(", value=");
		sb.append(getValue());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append(
			"at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>eventdataId</column-name><column-value><![CDATA[");
		sb.append(getEventdataId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventlayoutId</column-name><column-value><![CDATA[");
		sb.append(getEventlayoutId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>patientId</column-name><column-value><![CDATA[");
		sb.append(getPatientId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ontology</column-name><column-value><![CDATA[");
		sb.append(getOntology());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EventData.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EventData.class
		};
	private long _eventdataId;
	private long _eventlayoutId;
	private long _originalEventlayoutId;
	private boolean _setOriginalEventlayoutId;
	private long _patientId;
	private long _originalPatientId;
	private boolean _setOriginalPatientId;
	private String _ontology;
	private String _originalOntology;
	private String _value;
	private long _columnBitmask;
	private EventData _escapedModel;
}