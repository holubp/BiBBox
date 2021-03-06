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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Robert Reihs
 * @generated
 */
public class MasterCandidateSoap implements Serializable {
	public static MasterCandidateSoap toSoapModel(MasterCandidate model) {
		MasterCandidateSoap soapModel = new MasterCandidateSoap();

		soapModel.setMasterCandidateId(model.getMasterCandidateId());
		soapModel.setName(model.getName());
		soapModel.setUrl(model.getUrl());
		soapModel.setContactperson(model.getContactperson());
		soapModel.setCandidatetype(model.getCandidatetype());
		soapModel.setCandidatesubtype(model.getCandidatesubtype());
		soapModel.setCountry(model.getCountry());
		soapModel.setDiseasescodes(model.getDiseasescodes());
		soapModel.setDiseasesfreetext(model.getDiseasesfreetext());
		soapModel.setComment(model.getComment());
		soapModel.setAddress(model.getAddress());
		soapModel.setDate(model.getDate());
		soapModel.setMail(model.getMail());
		soapModel.setHead(model.getHead());
		soapModel.setGroupid(model.getGroupid());
		soapModel.setCompanyid(model.getCompanyid());
		soapModel.setOrganisationid(model.getOrganisationid());
		soapModel.setJoinId(model.getJoinId());
		soapModel.setAccepted(model.getAccepted());
		soapModel.setState(model.getState());
		soapModel.setDiseasescodesauto(model.getDiseasescodesauto());
		soapModel.setSource(model.getSource());

		return soapModel;
	}

	public static MasterCandidateSoap[] toSoapModels(MasterCandidate[] models) {
		MasterCandidateSoap[] soapModels = new MasterCandidateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MasterCandidateSoap[][] toSoapModels(
		MasterCandidate[][] models) {
		MasterCandidateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MasterCandidateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MasterCandidateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MasterCandidateSoap[] toSoapModels(
		List<MasterCandidate> models) {
		List<MasterCandidateSoap> soapModels = new ArrayList<MasterCandidateSoap>(models.size());

		for (MasterCandidate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MasterCandidateSoap[soapModels.size()]);
	}

	public MasterCandidateSoap() {
	}

	public long getPrimaryKey() {
		return _masterCandidateId;
	}

	public void setPrimaryKey(long pk) {
		setMasterCandidateId(pk);
	}

	public long getMasterCandidateId() {
		return _masterCandidateId;
	}

	public void setMasterCandidateId(long masterCandidateId) {
		_masterCandidateId = masterCandidateId;
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

	public String getContactperson() {
		return _contactperson;
	}

	public void setContactperson(String contactperson) {
		_contactperson = contactperson;
	}

	public String getCandidatetype() {
		return _candidatetype;
	}

	public void setCandidatetype(String candidatetype) {
		_candidatetype = candidatetype;
	}

	public String getCandidatesubtype() {
		return _candidatesubtype;
	}

	public void setCandidatesubtype(String candidatesubtype) {
		_candidatesubtype = candidatesubtype;
	}

	public String getCountry() {
		return _country;
	}

	public void setCountry(String country) {
		_country = country;
	}

	public String getDiseasescodes() {
		return _diseasescodes;
	}

	public void setDiseasescodes(String diseasescodes) {
		_diseasescodes = diseasescodes;
	}

	public String getDiseasesfreetext() {
		return _diseasesfreetext;
	}

	public void setDiseasesfreetext(String diseasesfreetext) {
		_diseasesfreetext = diseasesfreetext;
	}

	public String getComment() {
		return _comment;
	}

	public void setComment(String comment) {
		_comment = comment;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public Date getDate() {
		return _date;
	}

	public void setDate(Date date) {
		_date = date;
	}

	public String getMail() {
		return _mail;
	}

	public void setMail(String mail) {
		_mail = mail;
	}

	public String getHead() {
		return _head;
	}

	public void setHead(String head) {
		_head = head;
	}

	public long getGroupid() {
		return _groupid;
	}

	public void setGroupid(long groupid) {
		_groupid = groupid;
	}

	public long getCompanyid() {
		return _companyid;
	}

	public void setCompanyid(long companyid) {
		_companyid = companyid;
	}

	public long getOrganisationid() {
		return _organisationid;
	}

	public void setOrganisationid(long organisationid) {
		_organisationid = organisationid;
	}

	public long getJoinId() {
		return _joinId;
	}

	public void setJoinId(long joinId) {
		_joinId = joinId;
	}

	public boolean getAccepted() {
		return _accepted;
	}

	public boolean isAccepted() {
		return _accepted;
	}

	public void setAccepted(boolean accepted) {
		_accepted = accepted;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getDiseasescodesauto() {
		return _diseasescodesauto;
	}

	public void setDiseasescodesauto(String diseasescodesauto) {
		_diseasescodesauto = diseasescodesauto;
	}

	public String getSource() {
		return _source;
	}

	public void setSource(String source) {
		_source = source;
	}

	private long _masterCandidateId;
	private String _name;
	private String _url;
	private String _contactperson;
	private String _candidatetype;
	private String _candidatesubtype;
	private String _country;
	private String _diseasescodes;
	private String _diseasesfreetext;
	private String _comment;
	private String _address;
	private Date _date;
	private String _mail;
	private String _head;
	private long _groupid;
	private long _companyid;
	private long _organisationid;
	private long _joinId;
	private boolean _accepted;
	private String _state;
	private String _diseasescodesauto;
	private String _source;
}