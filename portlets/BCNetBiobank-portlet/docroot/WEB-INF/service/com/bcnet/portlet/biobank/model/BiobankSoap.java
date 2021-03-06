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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.bcnet.portlet.biobank.service.http.BiobankServiceSoap}.
 *
 * @author suyama
 * @see com.bcnet.portlet.biobank.service.http.BiobankServiceSoap
 * @generated
 */
public class BiobankSoap implements Serializable {
	public static BiobankSoap toSoapModel(Biobank model) {
		BiobankSoap soapModel = new BiobankSoap();

		soapModel.setBiobankDbId(model.getBiobankDbId());
		soapModel.setBiobankId(model.getBiobankId());
		soapModel.setAcronym(model.getAcronym());
		soapModel.setName(model.getName());
		soapModel.setUrl(model.getUrl());
		soapModel.setJuristicPersonId(model.getJuristicPersonId());
		soapModel.setCountryCode(model.getCountryCode());
		soapModel.setDescription(model.getDescription());
		soapModel.setBackup(model.getBackup());
		soapModel.setTrainingCourses(model.getTrainingCourses());

		return soapModel;
	}

	public static BiobankSoap[] toSoapModels(Biobank[] models) {
		BiobankSoap[] soapModels = new BiobankSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BiobankSoap[][] toSoapModels(Biobank[][] models) {
		BiobankSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BiobankSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BiobankSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BiobankSoap[] toSoapModels(List<Biobank> models) {
		List<BiobankSoap> soapModels = new ArrayList<BiobankSoap>(models.size());

		for (Biobank model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BiobankSoap[soapModels.size()]);
	}

	public BiobankSoap() {
	}

	public long getPrimaryKey() {
		return _biobankDbId;
	}

	public void setPrimaryKey(long pk) {
		setBiobankDbId(pk);
	}

	public long getBiobankDbId() {
		return _biobankDbId;
	}

	public void setBiobankDbId(long biobankDbId) {
		_biobankDbId = biobankDbId;
	}

	public String getBiobankId() {
		return _biobankId;
	}

	public void setBiobankId(String biobankId) {
		_biobankId = biobankId;
	}

	public String getAcronym() {
		return _acronym;
	}

	public void setAcronym(String acronym) {
		_acronym = acronym;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public long getJuristicPersonId() {
		return _juristicPersonId;
	}

	public void setJuristicPersonId(long juristicPersonId) {
		_juristicPersonId = juristicPersonId;
	}

	public String getCountryCode() {
		return _countryCode;
	}

	public void setCountryCode(String countryCode) {
		_countryCode = countryCode;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public boolean getBackup() {
		return _backup;
	}

	public boolean isBackup() {
		return _backup;
	}

	public void setBackup(boolean backup) {
		_backup = backup;
	}

	public boolean getTrainingCourses() {
		return _trainingCourses;
	}

	public boolean isTrainingCourses() {
		return _trainingCourses;
	}

	public void setTrainingCourses(boolean trainingCourses) {
		_trainingCourses = trainingCourses;
	}

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
}