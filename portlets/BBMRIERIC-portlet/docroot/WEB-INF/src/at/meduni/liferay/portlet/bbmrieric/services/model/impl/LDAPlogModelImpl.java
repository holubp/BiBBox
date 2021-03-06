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

package at.meduni.liferay.portlet.bbmrieric.services.model.impl;

import at.meduni.liferay.portlet.bbmrieric.services.model.LDAPlog;
import at.meduni.liferay.portlet.bbmrieric.services.model.LDAPlogModel;

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
 * The base model implementation for the LDAPlog service. Represents a row in the &quot;LDAP_LDAPlog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.meduni.liferay.portlet.bbmrieric.services.model.LDAPlogModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LDAPlogImpl}.
 * </p>
 *
 * @author reihsr
 * @see LDAPlogImpl
 * @see at.meduni.liferay.portlet.bbmrieric.services.model.LDAPlog
 * @see at.meduni.liferay.portlet.bbmrieric.services.model.LDAPlogModel
 * @generated
 */
public class LDAPlogModelImpl extends BaseModelImpl<LDAPlog>
	implements LDAPlogModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a l d a plog model instance should use the {@link at.meduni.liferay.portlet.bbmrieric.services.model.LDAPlog} interface instead.
	 */
	public static final String TABLE_NAME = "LDAP_LDAPlog";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ldaplogId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table LDAP_LDAPlog (ldaplogId LONG not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table LDAP_LDAPlog";
	public static final String ORDER_BY_JPQL = " ORDER BY ldaPlog.ldaplogId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LDAP_LDAPlog.ldaplogId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.meduni.liferay.portlet.bbmrieric.services.model.LDAPlog"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.meduni.liferay.portlet.bbmrieric.services.model.LDAPlog"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.meduni.liferay.portlet.bbmrieric.services.model.LDAPlog"));

	public LDAPlogModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _ldaplogId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLdaplogId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ldaplogId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LDAPlog.class;
	}

	@Override
	public String getModelClassName() {
		return LDAPlog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ldaplogId", getLdaplogId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ldaplogId = (Long)attributes.get("ldaplogId");

		if (ldaplogId != null) {
			setLdaplogId(ldaplogId);
		}
	}

	@Override
	public long getLdaplogId() {
		return _ldaplogId;
	}

	@Override
	public void setLdaplogId(long ldaplogId) {
		_ldaplogId = ldaplogId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			LDAPlog.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LDAPlog toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LDAPlog)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LDAPlogImpl ldaPlogImpl = new LDAPlogImpl();

		ldaPlogImpl.setLdaplogId(getLdaplogId());

		ldaPlogImpl.resetOriginalValues();

		return ldaPlogImpl;
	}

	@Override
	public int compareTo(LDAPlog ldaPlog) {
		long primaryKey = ldaPlog.getPrimaryKey();

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

		if (!(obj instanceof LDAPlog)) {
			return false;
		}

		LDAPlog ldaPlog = (LDAPlog)obj;

		long primaryKey = ldaPlog.getPrimaryKey();

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
	public CacheModel<LDAPlog> toCacheModel() {
		LDAPlogCacheModel ldaPlogCacheModel = new LDAPlogCacheModel();

		ldaPlogCacheModel.ldaplogId = getLdaplogId();

		return ldaPlogCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{ldaplogId=");
		sb.append(getLdaplogId());

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(7);

		sb.append("<model><model-name>");
		sb.append("at.meduni.liferay.portlet.bbmrieric.services.model.LDAPlog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ldaplogId</column-name><column-value><![CDATA[");
		sb.append(getLdaplogId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LDAPlog.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LDAPlog.class
		};
	private long _ldaplogId;
	private LDAPlog _escapedModel;
}