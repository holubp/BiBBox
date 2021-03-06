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

package at.rdconnect.update.model;

import at.rdconnect.update.service.AccessibilityUpdateLocalServiceUtil;
import at.rdconnect.update.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author reihsr
 */
public class AccessibilityUpdateClp extends BaseModelImpl<AccessibilityUpdate>
	implements AccessibilityUpdate {
	public AccessibilityUpdateClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AccessibilityUpdate.class;
	}

	@Override
	public String getModelClassName() {
		return AccessibilityUpdate.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _coreid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCoreid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _coreid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("coreid", getCoreid());
		attributes.put("organizationid", getOrganizationid());
		attributes.put("fieldname", getFieldname());
		attributes.put("value", getValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long coreid = (Long)attributes.get("coreid");

		if (coreid != null) {
			setCoreid(coreid);
		}

		Long organizationid = (Long)attributes.get("organizationid");

		if (organizationid != null) {
			setOrganizationid(organizationid);
		}

		String fieldname = (String)attributes.get("fieldname");

		if (fieldname != null) {
			setFieldname(fieldname);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}
	}

	@Override
	public long getCoreid() {
		return _coreid;
	}

	@Override
	public void setCoreid(long coreid) {
		_coreid = coreid;

		if (_accessibilityUpdateRemoteModel != null) {
			try {
				Class<?> clazz = _accessibilityUpdateRemoteModel.getClass();

				Method method = clazz.getMethod("setCoreid", long.class);

				method.invoke(_accessibilityUpdateRemoteModel, coreid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOrganizationid() {
		return _organizationid;
	}

	@Override
	public void setOrganizationid(long organizationid) {
		_organizationid = organizationid;

		if (_accessibilityUpdateRemoteModel != null) {
			try {
				Class<?> clazz = _accessibilityUpdateRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationid", long.class);

				method.invoke(_accessibilityUpdateRemoteModel, organizationid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFieldname() {
		return _fieldname;
	}

	@Override
	public void setFieldname(String fieldname) {
		_fieldname = fieldname;

		if (_accessibilityUpdateRemoteModel != null) {
			try {
				Class<?> clazz = _accessibilityUpdateRemoteModel.getClass();

				Method method = clazz.getMethod("setFieldname", String.class);

				method.invoke(_accessibilityUpdateRemoteModel, fieldname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValue() {
		return _value;
	}

	@Override
	public void setValue(String value) {
		_value = value;

		if (_accessibilityUpdateRemoteModel != null) {
			try {
				Class<?> clazz = _accessibilityUpdateRemoteModel.getClass();

				Method method = clazz.getMethod("setValue", String.class);

				method.invoke(_accessibilityUpdateRemoteModel, value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAccessibilityUpdateRemoteModel() {
		return _accessibilityUpdateRemoteModel;
	}

	public void setAccessibilityUpdateRemoteModel(
		BaseModel<?> accessibilityUpdateRemoteModel) {
		_accessibilityUpdateRemoteModel = accessibilityUpdateRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _accessibilityUpdateRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_accessibilityUpdateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AccessibilityUpdateLocalServiceUtil.addAccessibilityUpdate(this);
		}
		else {
			AccessibilityUpdateLocalServiceUtil.updateAccessibilityUpdate(this);
		}
	}

	@Override
	public AccessibilityUpdate toEscapedModel() {
		return (AccessibilityUpdate)ProxyUtil.newProxyInstance(AccessibilityUpdate.class.getClassLoader(),
			new Class[] { AccessibilityUpdate.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AccessibilityUpdateClp clone = new AccessibilityUpdateClp();

		clone.setCoreid(getCoreid());
		clone.setOrganizationid(getOrganizationid());
		clone.setFieldname(getFieldname());
		clone.setValue(getValue());

		return clone;
	}

	@Override
	public int compareTo(AccessibilityUpdate accessibilityUpdate) {
		int value = 0;

		if (getOrganizationid() < accessibilityUpdate.getOrganizationid()) {
			value = -1;
		}
		else if (getOrganizationid() > accessibilityUpdate.getOrganizationid()) {
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

		if (!(obj instanceof AccessibilityUpdateClp)) {
			return false;
		}

		AccessibilityUpdateClp accessibilityUpdate = (AccessibilityUpdateClp)obj;

		long primaryKey = accessibilityUpdate.getPrimaryKey();

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
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{coreid=");
		sb.append(getCoreid());
		sb.append(", organizationid=");
		sb.append(getOrganizationid());
		sb.append(", fieldname=");
		sb.append(getFieldname());
		sb.append(", value=");
		sb.append(getValue());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("at.rdconnect.update.model.AccessibilityUpdate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>coreid</column-name><column-value><![CDATA[");
		sb.append(getCoreid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationid</column-name><column-value><![CDATA[");
		sb.append(getOrganizationid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fieldname</column-name><column-value><![CDATA[");
		sb.append(getFieldname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _coreid;
	private long _organizationid;
	private String _fieldname;
	private String _value;
	private BaseModel<?> _accessibilityUpdateRemoteModel;
}