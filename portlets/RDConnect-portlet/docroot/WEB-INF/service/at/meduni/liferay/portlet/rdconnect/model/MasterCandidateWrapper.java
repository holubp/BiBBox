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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MasterCandidate}.
 * </p>
 *
 * @author Robert Reihs
 * @see MasterCandidate
 * @generated
 */
public class MasterCandidateWrapper implements MasterCandidate,
	ModelWrapper<MasterCandidate> {
	public MasterCandidateWrapper(MasterCandidate masterCandidate) {
		_masterCandidate = masterCandidate;
	}

	@Override
	public Class<?> getModelClass() {
		return MasterCandidate.class;
	}

	@Override
	public String getModelClassName() {
		return MasterCandidate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("masterCandidateId", getMasterCandidateId());
		attributes.put("name", getName());
		attributes.put("url", getUrl());
		attributes.put("contactperson", getContactperson());
		attributes.put("candidatetype", getCandidatetype());
		attributes.put("candidatesubtype", getCandidatesubtype());
		attributes.put("country", getCountry());
		attributes.put("diseasescodes", getDiseasescodes());
		attributes.put("diseasesfreetext", getDiseasesfreetext());
		attributes.put("comment", getComment());
		attributes.put("address", getAddress());
		attributes.put("date", getDate());
		attributes.put("mail", getMail());
		attributes.put("head", getHead());
		attributes.put("groupid", getGroupid());
		attributes.put("companyid", getCompanyid());
		attributes.put("organisationid", getOrganisationid());
		attributes.put("joinId", getJoinId());
		attributes.put("accepted", getAccepted());
		attributes.put("state", getState());
		attributes.put("diseasescodesauto", getDiseasescodesauto());
		attributes.put("source", getSource());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long masterCandidateId = (Long)attributes.get("masterCandidateId");

		if (masterCandidateId != null) {
			setMasterCandidateId(masterCandidateId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String contactperson = (String)attributes.get("contactperson");

		if (contactperson != null) {
			setContactperson(contactperson);
		}

		String candidatetype = (String)attributes.get("candidatetype");

		if (candidatetype != null) {
			setCandidatetype(candidatetype);
		}

		String candidatesubtype = (String)attributes.get("candidatesubtype");

		if (candidatesubtype != null) {
			setCandidatesubtype(candidatesubtype);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String diseasescodes = (String)attributes.get("diseasescodes");

		if (diseasescodes != null) {
			setDiseasescodes(diseasescodes);
		}

		String diseasesfreetext = (String)attributes.get("diseasesfreetext");

		if (diseasesfreetext != null) {
			setDiseasesfreetext(diseasesfreetext);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String mail = (String)attributes.get("mail");

		if (mail != null) {
			setMail(mail);
		}

		String head = (String)attributes.get("head");

		if (head != null) {
			setHead(head);
		}

		Long groupid = (Long)attributes.get("groupid");

		if (groupid != null) {
			setGroupid(groupid);
		}

		Long companyid = (Long)attributes.get("companyid");

		if (companyid != null) {
			setCompanyid(companyid);
		}

		Long organisationid = (Long)attributes.get("organisationid");

		if (organisationid != null) {
			setOrganisationid(organisationid);
		}

		Long joinId = (Long)attributes.get("joinId");

		if (joinId != null) {
			setJoinId(joinId);
		}

		Boolean accepted = (Boolean)attributes.get("accepted");

		if (accepted != null) {
			setAccepted(accepted);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String diseasescodesauto = (String)attributes.get("diseasescodesauto");

		if (diseasescodesauto != null) {
			setDiseasescodesauto(diseasescodesauto);
		}

		String source = (String)attributes.get("source");

		if (source != null) {
			setSource(source);
		}
	}

	/**
	* Returns the primary key of this master candidate.
	*
	* @return the primary key of this master candidate
	*/
	@Override
	public long getPrimaryKey() {
		return _masterCandidate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this master candidate.
	*
	* @param primaryKey the primary key of this master candidate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_masterCandidate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the master candidate ID of this master candidate.
	*
	* @return the master candidate ID of this master candidate
	*/
	@Override
	public long getMasterCandidateId() {
		return _masterCandidate.getMasterCandidateId();
	}

	/**
	* Sets the master candidate ID of this master candidate.
	*
	* @param masterCandidateId the master candidate ID of this master candidate
	*/
	@Override
	public void setMasterCandidateId(long masterCandidateId) {
		_masterCandidate.setMasterCandidateId(masterCandidateId);
	}

	/**
	* Returns the name of this master candidate.
	*
	* @return the name of this master candidate
	*/
	@Override
	public java.lang.String getName() {
		return _masterCandidate.getName();
	}

	/**
	* Sets the name of this master candidate.
	*
	* @param name the name of this master candidate
	*/
	@Override
	public void setName(java.lang.String name) {
		_masterCandidate.setName(name);
	}

	/**
	* Returns the url of this master candidate.
	*
	* @return the url of this master candidate
	*/
	@Override
	public java.lang.String getUrl() {
		return _masterCandidate.getUrl();
	}

	/**
	* Sets the url of this master candidate.
	*
	* @param url the url of this master candidate
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_masterCandidate.setUrl(url);
	}

	/**
	* Returns the contactperson of this master candidate.
	*
	* @return the contactperson of this master candidate
	*/
	@Override
	public java.lang.String getContactperson() {
		return _masterCandidate.getContactperson();
	}

	/**
	* Sets the contactperson of this master candidate.
	*
	* @param contactperson the contactperson of this master candidate
	*/
	@Override
	public void setContactperson(java.lang.String contactperson) {
		_masterCandidate.setContactperson(contactperson);
	}

	/**
	* Returns the candidatetype of this master candidate.
	*
	* @return the candidatetype of this master candidate
	*/
	@Override
	public java.lang.String getCandidatetype() {
		return _masterCandidate.getCandidatetype();
	}

	/**
	* Sets the candidatetype of this master candidate.
	*
	* @param candidatetype the candidatetype of this master candidate
	*/
	@Override
	public void setCandidatetype(java.lang.String candidatetype) {
		_masterCandidate.setCandidatetype(candidatetype);
	}

	/**
	* Returns the candidatesubtype of this master candidate.
	*
	* @return the candidatesubtype of this master candidate
	*/
	@Override
	public java.lang.String getCandidatesubtype() {
		return _masterCandidate.getCandidatesubtype();
	}

	/**
	* Sets the candidatesubtype of this master candidate.
	*
	* @param candidatesubtype the candidatesubtype of this master candidate
	*/
	@Override
	public void setCandidatesubtype(java.lang.String candidatesubtype) {
		_masterCandidate.setCandidatesubtype(candidatesubtype);
	}

	/**
	* Returns the country of this master candidate.
	*
	* @return the country of this master candidate
	*/
	@Override
	public java.lang.String getCountry() {
		return _masterCandidate.getCountry();
	}

	/**
	* Sets the country of this master candidate.
	*
	* @param country the country of this master candidate
	*/
	@Override
	public void setCountry(java.lang.String country) {
		_masterCandidate.setCountry(country);
	}

	/**
	* Returns the diseasescodes of this master candidate.
	*
	* @return the diseasescodes of this master candidate
	*/
	@Override
	public java.lang.String getDiseasescodes() {
		return _masterCandidate.getDiseasescodes();
	}

	/**
	* Sets the diseasescodes of this master candidate.
	*
	* @param diseasescodes the diseasescodes of this master candidate
	*/
	@Override
	public void setDiseasescodes(java.lang.String diseasescodes) {
		_masterCandidate.setDiseasescodes(diseasescodes);
	}

	/**
	* Returns the diseasesfreetext of this master candidate.
	*
	* @return the diseasesfreetext of this master candidate
	*/
	@Override
	public java.lang.String getDiseasesfreetext() {
		return _masterCandidate.getDiseasesfreetext();
	}

	/**
	* Sets the diseasesfreetext of this master candidate.
	*
	* @param diseasesfreetext the diseasesfreetext of this master candidate
	*/
	@Override
	public void setDiseasesfreetext(java.lang.String diseasesfreetext) {
		_masterCandidate.setDiseasesfreetext(diseasesfreetext);
	}

	/**
	* Returns the comment of this master candidate.
	*
	* @return the comment of this master candidate
	*/
	@Override
	public java.lang.String getComment() {
		return _masterCandidate.getComment();
	}

	/**
	* Sets the comment of this master candidate.
	*
	* @param comment the comment of this master candidate
	*/
	@Override
	public void setComment(java.lang.String comment) {
		_masterCandidate.setComment(comment);
	}

	/**
	* Returns the address of this master candidate.
	*
	* @return the address of this master candidate
	*/
	@Override
	public java.lang.String getAddress() {
		return _masterCandidate.getAddress();
	}

	/**
	* Sets the address of this master candidate.
	*
	* @param address the address of this master candidate
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_masterCandidate.setAddress(address);
	}

	/**
	* Returns the date of this master candidate.
	*
	* @return the date of this master candidate
	*/
	@Override
	public java.util.Date getDate() {
		return _masterCandidate.getDate();
	}

	/**
	* Sets the date of this master candidate.
	*
	* @param date the date of this master candidate
	*/
	@Override
	public void setDate(java.util.Date date) {
		_masterCandidate.setDate(date);
	}

	/**
	* Returns the mail of this master candidate.
	*
	* @return the mail of this master candidate
	*/
	@Override
	public java.lang.String getMail() {
		return _masterCandidate.getMail();
	}

	/**
	* Sets the mail of this master candidate.
	*
	* @param mail the mail of this master candidate
	*/
	@Override
	public void setMail(java.lang.String mail) {
		_masterCandidate.setMail(mail);
	}

	/**
	* Returns the head of this master candidate.
	*
	* @return the head of this master candidate
	*/
	@Override
	public java.lang.String getHead() {
		return _masterCandidate.getHead();
	}

	/**
	* Sets the head of this master candidate.
	*
	* @param head the head of this master candidate
	*/
	@Override
	public void setHead(java.lang.String head) {
		_masterCandidate.setHead(head);
	}

	/**
	* Returns the groupid of this master candidate.
	*
	* @return the groupid of this master candidate
	*/
	@Override
	public long getGroupid() {
		return _masterCandidate.getGroupid();
	}

	/**
	* Sets the groupid of this master candidate.
	*
	* @param groupid the groupid of this master candidate
	*/
	@Override
	public void setGroupid(long groupid) {
		_masterCandidate.setGroupid(groupid);
	}

	/**
	* Returns the companyid of this master candidate.
	*
	* @return the companyid of this master candidate
	*/
	@Override
	public long getCompanyid() {
		return _masterCandidate.getCompanyid();
	}

	/**
	* Sets the companyid of this master candidate.
	*
	* @param companyid the companyid of this master candidate
	*/
	@Override
	public void setCompanyid(long companyid) {
		_masterCandidate.setCompanyid(companyid);
	}

	/**
	* Returns the organisationid of this master candidate.
	*
	* @return the organisationid of this master candidate
	*/
	@Override
	public long getOrganisationid() {
		return _masterCandidate.getOrganisationid();
	}

	/**
	* Sets the organisationid of this master candidate.
	*
	* @param organisationid the organisationid of this master candidate
	*/
	@Override
	public void setOrganisationid(long organisationid) {
		_masterCandidate.setOrganisationid(organisationid);
	}

	/**
	* Returns the join ID of this master candidate.
	*
	* @return the join ID of this master candidate
	*/
	@Override
	public long getJoinId() {
		return _masterCandidate.getJoinId();
	}

	/**
	* Sets the join ID of this master candidate.
	*
	* @param joinId the join ID of this master candidate
	*/
	@Override
	public void setJoinId(long joinId) {
		_masterCandidate.setJoinId(joinId);
	}

	/**
	* Returns the accepted of this master candidate.
	*
	* @return the accepted of this master candidate
	*/
	@Override
	public boolean getAccepted() {
		return _masterCandidate.getAccepted();
	}

	/**
	* Returns <code>true</code> if this master candidate is accepted.
	*
	* @return <code>true</code> if this master candidate is accepted; <code>false</code> otherwise
	*/
	@Override
	public boolean isAccepted() {
		return _masterCandidate.isAccepted();
	}

	/**
	* Sets whether this master candidate is accepted.
	*
	* @param accepted the accepted of this master candidate
	*/
	@Override
	public void setAccepted(boolean accepted) {
		_masterCandidate.setAccepted(accepted);
	}

	/**
	* Returns the state of this master candidate.
	*
	* @return the state of this master candidate
	*/
	@Override
	public java.lang.String getState() {
		return _masterCandidate.getState();
	}

	/**
	* Sets the state of this master candidate.
	*
	* @param state the state of this master candidate
	*/
	@Override
	public void setState(java.lang.String state) {
		_masterCandidate.setState(state);
	}

	/**
	* Returns the diseasescodesauto of this master candidate.
	*
	* @return the diseasescodesauto of this master candidate
	*/
	@Override
	public java.lang.String getDiseasescodesauto() {
		return _masterCandidate.getDiseasescodesauto();
	}

	/**
	* Sets the diseasescodesauto of this master candidate.
	*
	* @param diseasescodesauto the diseasescodesauto of this master candidate
	*/
	@Override
	public void setDiseasescodesauto(java.lang.String diseasescodesauto) {
		_masterCandidate.setDiseasescodesauto(diseasescodesauto);
	}

	/**
	* Returns the source of this master candidate.
	*
	* @return the source of this master candidate
	*/
	@Override
	public java.lang.String getSource() {
		return _masterCandidate.getSource();
	}

	/**
	* Sets the source of this master candidate.
	*
	* @param source the source of this master candidate
	*/
	@Override
	public void setSource(java.lang.String source) {
		_masterCandidate.setSource(source);
	}

	@Override
	public boolean isNew() {
		return _masterCandidate.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_masterCandidate.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _masterCandidate.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_masterCandidate.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _masterCandidate.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _masterCandidate.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_masterCandidate.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _masterCandidate.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_masterCandidate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_masterCandidate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_masterCandidate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MasterCandidateWrapper((MasterCandidate)_masterCandidate.clone());
	}

	@Override
	public int compareTo(
		at.meduni.liferay.portlet.rdconnect.model.MasterCandidate masterCandidate) {
		return _masterCandidate.compareTo(masterCandidate);
	}

	@Override
	public int hashCode() {
		return _masterCandidate.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<at.meduni.liferay.portlet.rdconnect.model.MasterCandidate> toCacheModel() {
		return _masterCandidate.toCacheModel();
	}

	@Override
	public at.meduni.liferay.portlet.rdconnect.model.MasterCandidate toEscapedModel() {
		return new MasterCandidateWrapper(_masterCandidate.toEscapedModel());
	}

	@Override
	public at.meduni.liferay.portlet.rdconnect.model.MasterCandidate toUnescapedModel() {
		return new MasterCandidateWrapper(_masterCandidate.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _masterCandidate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _masterCandidate.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_masterCandidate.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MasterCandidateWrapper)) {
			return false;
		}

		MasterCandidateWrapper masterCandidateWrapper = (MasterCandidateWrapper)obj;

		if (Validator.equals(_masterCandidate,
					masterCandidateWrapper._masterCandidate)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MasterCandidate getWrappedMasterCandidate() {
		return _masterCandidate;
	}

	@Override
	public MasterCandidate getWrappedModel() {
		return _masterCandidate;
	}

	@Override
	public void resetOriginalValues() {
		_masterCandidate.resetOriginalValues();
	}

	private MasterCandidate _masterCandidate;
}