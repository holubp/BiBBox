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

package com.bcnet.portlet.biobank.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the BiobankAttributeLists service. Represents a row in the &quot;biobankattributelists&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.bcnet.portlet.biobank.model.impl.BiobankAttributeListsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.bcnet.portlet.biobank.model.impl.BiobankAttributeListsImpl}.
 * </p>
 *
 * @author suyama
 * @see BiobankAttributeLists
 * @see com.bcnet.portlet.biobank.model.impl.BiobankAttributeListsImpl
 * @see com.bcnet.portlet.biobank.model.impl.BiobankAttributeListsModelImpl
 * @generated
 */
public interface BiobankAttributeListsModel extends BaseModel<BiobankAttributeLists> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a biobank attribute lists model instance should use the {@link BiobankAttributeLists} interface instead.
	 */

	/**
	 * Returns the primary key of this biobank attribute lists.
	 *
	 * @return the primary key of this biobank attribute lists
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this biobank attribute lists.
	 *
	 * @param primaryKey the primary key of this biobank attribute lists
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the biobank attribute lists ID of this biobank attribute lists.
	 *
	 * @return the biobank attribute lists ID of this biobank attribute lists
	 */
	public long getBiobankAttributeListsId();

	/**
	 * Sets the biobank attribute lists ID of this biobank attribute lists.
	 *
	 * @param biobankAttributeListsId the biobank attribute lists ID of this biobank attribute lists
	 */
	public void setBiobankAttributeListsId(long biobankAttributeListsId);

	/**
	 * Returns the biobank db ID of this biobank attribute lists.
	 *
	 * @return the biobank db ID of this biobank attribute lists
	 */
	public long getBiobankDbId();

	/**
	 * Sets the biobank db ID of this biobank attribute lists.
	 *
	 * @param biobankDbId the biobank db ID of this biobank attribute lists
	 */
	public void setBiobankDbId(long biobankDbId);

	/**
	 * Returns the attribute list name of this biobank attribute lists.
	 *
	 * @return the attribute list name of this biobank attribute lists
	 */
	@AutoEscape
	public String getAttributeListName();

	/**
	 * Sets the attribute list name of this biobank attribute lists.
	 *
	 * @param attributeListName the attribute list name of this biobank attribute lists
	 */
	public void setAttributeListName(String attributeListName);

	/**
	 * Returns the attribute list value of this biobank attribute lists.
	 *
	 * @return the attribute list value of this biobank attribute lists
	 */
	@AutoEscape
	public String getAttributeListValue();

	/**
	 * Sets the attribute list value of this biobank attribute lists.
	 *
	 * @param attributeListValue the attribute list value of this biobank attribute lists
	 */
	public void setAttributeListValue(String attributeListValue);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(BiobankAttributeLists biobankAttributeLists);

	@Override
	public int hashCode();

	@Override
	public CacheModel<BiobankAttributeLists> toCacheModel();

	@Override
	public BiobankAttributeLists toEscapedModel();

	@Override
	public BiobankAttributeLists toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}