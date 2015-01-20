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

package at.rdconnect.update.model.impl;

import at.rdconnect.update.model.AccessibilityUpdate;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AccessibilityUpdate in entity cache.
 *
 * @author reihsr
 * @see AccessibilityUpdate
 * @generated
 */
public class AccessibilityUpdateCacheModel implements CacheModel<AccessibilityUpdate>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{coreid=");
		sb.append(coreid);
		sb.append(", organizationid=");
		sb.append(organizationid);
		sb.append(", fieldname=");
		sb.append(fieldname);
		sb.append(", value=");
		sb.append(value);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccessibilityUpdate toEntityModel() {
		AccessibilityUpdateImpl accessibilityUpdateImpl = new AccessibilityUpdateImpl();

		accessibilityUpdateImpl.setCoreid(coreid);
		accessibilityUpdateImpl.setOrganizationid(organizationid);

		if (fieldname == null) {
			accessibilityUpdateImpl.setFieldname(StringPool.BLANK);
		}
		else {
			accessibilityUpdateImpl.setFieldname(fieldname);
		}

		if (value == null) {
			accessibilityUpdateImpl.setValue(StringPool.BLANK);
		}
		else {
			accessibilityUpdateImpl.setValue(value);
		}

		accessibilityUpdateImpl.resetOriginalValues();

		return accessibilityUpdateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		coreid = objectInput.readLong();
		organizationid = objectInput.readLong();
		fieldname = objectInput.readUTF();
		value = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(coreid);
		objectOutput.writeLong(organizationid);

		if (fieldname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldname);
		}

		if (value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(value);
		}
	}

	public long coreid;
	public long organizationid;
	public String fieldname;
	public String value;
}