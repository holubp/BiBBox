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

package at.meduni.liferay.portlet.rdconnect.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SearchIndex}.
 * </p>
 *
 * @author Robert Reihs
 * @see SearchIndex
 * @generated
 */
public class SearchIndexWrapper implements SearchIndex,
	ModelWrapper<SearchIndex> {
	public SearchIndexWrapper(SearchIndex searchIndex) {
		_searchIndex = searchIndex;
	}

	@Override
	public Class<?> getModelClass() {
		return SearchIndex.class;
	}

	@Override
	public String getModelClassName() {
		return SearchIndex.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("searchid", getSearchid());
		attributes.put("organisationid", getOrganisationid());
		attributes.put("locationid", getLocationid());
		attributes.put("location", getLocation());
		attributes.put("key", getKey());
		attributes.put("value", getValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long searchid = (Long)attributes.get("searchid");

		if (searchid != null) {
			setSearchid(searchid);
		}

		Long organisationid = (Long)attributes.get("organisationid");

		if (organisationid != null) {
			setOrganisationid(organisationid);
		}

		Long locationid = (Long)attributes.get("locationid");

		if (locationid != null) {
			setLocationid(locationid);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String key = (String)attributes.get("key");

		if (key != null) {
			setKey(key);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}
	}

	/**
	* Returns the primary key of this search index.
	*
	* @return the primary key of this search index
	*/
	@Override
	public long getPrimaryKey() {
		return _searchIndex.getPrimaryKey();
	}

	/**
	* Sets the primary key of this search index.
	*
	* @param primaryKey the primary key of this search index
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_searchIndex.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the searchid of this search index.
	*
	* @return the searchid of this search index
	*/
	@Override
	public long getSearchid() {
		return _searchIndex.getSearchid();
	}

	/**
	* Sets the searchid of this search index.
	*
	* @param searchid the searchid of this search index
	*/
	@Override
	public void setSearchid(long searchid) {
		_searchIndex.setSearchid(searchid);
	}

	/**
	* Returns the organisationid of this search index.
	*
	* @return the organisationid of this search index
	*/
	@Override
	public long getOrganisationid() {
		return _searchIndex.getOrganisationid();
	}

	/**
	* Sets the organisationid of this search index.
	*
	* @param organisationid the organisationid of this search index
	*/
	@Override
	public void setOrganisationid(long organisationid) {
		_searchIndex.setOrganisationid(organisationid);
	}

	/**
	* Returns the locationid of this search index.
	*
	* @return the locationid of this search index
	*/
	@Override
	public long getLocationid() {
		return _searchIndex.getLocationid();
	}

	/**
	* Sets the locationid of this search index.
	*
	* @param locationid the locationid of this search index
	*/
	@Override
	public void setLocationid(long locationid) {
		_searchIndex.setLocationid(locationid);
	}

	/**
	* Returns the location of this search index.
	*
	* @return the location of this search index
	*/
	@Override
	public java.lang.String getLocation() {
		return _searchIndex.getLocation();
	}

	/**
	* Sets the location of this search index.
	*
	* @param location the location of this search index
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_searchIndex.setLocation(location);
	}

	/**
	* Returns the key of this search index.
	*
	* @return the key of this search index
	*/
	@Override
	public java.lang.String getKey() {
		return _searchIndex.getKey();
	}

	/**
	* Sets the key of this search index.
	*
	* @param key the key of this search index
	*/
	@Override
	public void setKey(java.lang.String key) {
		_searchIndex.setKey(key);
	}

	/**
	* Returns the value of this search index.
	*
	* @return the value of this search index
	*/
	@Override
	public java.lang.String getValue() {
		return _searchIndex.getValue();
	}

	/**
	* Sets the value of this search index.
	*
	* @param value the value of this search index
	*/
	@Override
	public void setValue(java.lang.String value) {
		_searchIndex.setValue(value);
	}

	@Override
	public boolean isNew() {
		return _searchIndex.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_searchIndex.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _searchIndex.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_searchIndex.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _searchIndex.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _searchIndex.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_searchIndex.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _searchIndex.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_searchIndex.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_searchIndex.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_searchIndex.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SearchIndexWrapper((SearchIndex)_searchIndex.clone());
	}

	@Override
	public int compareTo(
		at.meduni.liferay.portlet.rdconnect.model.SearchIndex searchIndex) {
		return _searchIndex.compareTo(searchIndex);
	}

	@Override
	public int hashCode() {
		return _searchIndex.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<at.meduni.liferay.portlet.rdconnect.model.SearchIndex> toCacheModel() {
		return _searchIndex.toCacheModel();
	}

	@Override
	public at.meduni.liferay.portlet.rdconnect.model.SearchIndex toEscapedModel() {
		return new SearchIndexWrapper(_searchIndex.toEscapedModel());
	}

	@Override
	public at.meduni.liferay.portlet.rdconnect.model.SearchIndex toUnescapedModel() {
		return new SearchIndexWrapper(_searchIndex.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _searchIndex.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _searchIndex.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_searchIndex.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SearchIndexWrapper)) {
			return false;
		}

		SearchIndexWrapper searchIndexWrapper = (SearchIndexWrapper)obj;

		if (Validator.equals(_searchIndex, searchIndexWrapper._searchIndex)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SearchIndex getWrappedSearchIndex() {
		return _searchIndex;
	}

	@Override
	public SearchIndex getWrappedModel() {
		return _searchIndex;
	}

	@Override
	public void resetOriginalValues() {
		_searchIndex.resetOriginalValues();
	}

	private SearchIndex _searchIndex;
}