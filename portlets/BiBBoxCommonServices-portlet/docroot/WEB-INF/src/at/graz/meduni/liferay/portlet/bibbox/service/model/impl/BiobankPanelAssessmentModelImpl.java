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

package at.graz.meduni.liferay.portlet.bibbox.service.model.impl;

import at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessment;
import at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessmentModel;
import at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessmentSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the BiobankPanelAssessment service. Represents a row in the &quot;bibboxcs.biobankpanelassessment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BiobankPanelAssessmentImpl}.
 * </p>
 *
 * @author reihsr
 * @see BiobankPanelAssessmentImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessment
 * @see at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessmentModel
 * @generated
 */
@JSON(strict = true)
public class BiobankPanelAssessmentModelImpl extends BaseModelImpl<BiobankPanelAssessment>
	implements BiobankPanelAssessmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a biobank panel assessment model instance should use the {@link at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessment} interface instead.
	 */
	public static final String TABLE_NAME = "bibboxcs.biobankpanelassessment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "biobankpanelassessmentId", Types.BIGINT },
			{ "organizationId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "reviewer", Types.VARCHAR },
			{ "dateofassessment", Types.TIMESTAMP },
			{ "background1_1", Types.VARCHAR },
			{ "background1_1_comments", Types.VARCHAR },
			{ "elsi1_2", Types.VARCHAR },
			{ "quality1_3", Types.VARCHAR },
			{ "quality1_3_comments", Types.VARCHAR },
			{ "cataloguemeetpurposes2_1", Types.VARCHAR },
			{ "adequateitplatform2_2", Types.VARCHAR },
			{ "addedvaluecatalogue2_3", Types.VARCHAR },
			{ "associateddata2_4", Types.VARCHAR },
			{ "associateddata2_4_comments", Types.VARCHAR },
			{ "reasonstoaccept3_1", Types.VARCHAR },
			{ "recommendation3_2", Types.VARCHAR },
			{ "needadditionalinformation3_3", Types.VARCHAR },
			{ "finalrecommendation_4", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table bibboxcs.biobankpanelassessment (biobankpanelassessmentId LONG not null primary key,organizationId LONG,userId LONG,reviewer VARCHAR(75) null,dateofassessment DATE null,background1_1 VARCHAR(75) null,background1_1_comments TEXT null,elsi1_2 VARCHAR(75) null,quality1_3 VARCHAR(75) null,quality1_3_comments TEXT null,cataloguemeetpurposes2_1 VARCHAR(75) null,adequateitplatform2_2 VARCHAR(75) null,addedvaluecatalogue2_3 VARCHAR(75) null,associateddata2_4 VARCHAR(75) null,associateddata2_4_comments TEXT null,reasonstoaccept3_1 TEXT null,recommendation3_2 TEXT null,needadditionalinformation3_3 TEXT null,finalrecommendation_4 TEXT null)";
	public static final String TABLE_SQL_DROP = "drop table bibboxcs.biobankpanelassessment";
	public static final String ORDER_BY_JPQL = " ORDER BY biobankPanelAssessment.biobankpanelassessmentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY bibboxcs.biobankpanelassessment.biobankpanelassessmentId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessment"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessment"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessment"),
			true);
	public static long ORGANIZATIONID_COLUMN_BITMASK = 1L;
	public static long BIOBANKPANELASSESSMENTID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static BiobankPanelAssessment toModel(
		BiobankPanelAssessmentSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		BiobankPanelAssessment model = new BiobankPanelAssessmentImpl();

		model.setBiobankpanelassessmentId(soapModel.getBiobankpanelassessmentId());
		model.setOrganizationId(soapModel.getOrganizationId());
		model.setUserId(soapModel.getUserId());
		model.setReviewer(soapModel.getReviewer());
		model.setDateofassessment(soapModel.getDateofassessment());
		model.setBackground1_1(soapModel.getBackground1_1());
		model.setBackground1_1_comments(soapModel.getBackground1_1_comments());
		model.setElsi1_2(soapModel.getElsi1_2());
		model.setQuality1_3(soapModel.getQuality1_3());
		model.setQuality1_3_comments(soapModel.getQuality1_3_comments());
		model.setCataloguemeetpurposes2_1(soapModel.getCataloguemeetpurposes2_1());
		model.setAdequateitplatform2_2(soapModel.getAdequateitplatform2_2());
		model.setAddedvaluecatalogue2_3(soapModel.getAddedvaluecatalogue2_3());
		model.setAssociateddata2_4(soapModel.getAssociateddata2_4());
		model.setAssociateddata2_4_comments(soapModel.getAssociateddata2_4_comments());
		model.setReasonstoaccept3_1(soapModel.getReasonstoaccept3_1());
		model.setRecommendation3_2(soapModel.getRecommendation3_2());
		model.setNeedadditionalinformation3_3(soapModel.getNeedadditionalinformation3_3());
		model.setFinalrecommendation_4(soapModel.getFinalrecommendation_4());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<BiobankPanelAssessment> toModels(
		BiobankPanelAssessmentSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<BiobankPanelAssessment> models = new ArrayList<BiobankPanelAssessment>(soapModels.length);

		for (BiobankPanelAssessmentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessment"));

	public BiobankPanelAssessmentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _biobankpanelassessmentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBiobankpanelassessmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _biobankpanelassessmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return BiobankPanelAssessment.class;
	}

	@Override
	public String getModelClassName() {
		return BiobankPanelAssessment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("biobankpanelassessmentId", getBiobankpanelassessmentId());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("userId", getUserId());
		attributes.put("reviewer", getReviewer());
		attributes.put("dateofassessment", getDateofassessment());
		attributes.put("background1_1", getBackground1_1());
		attributes.put("background1_1_comments", getBackground1_1_comments());
		attributes.put("elsi1_2", getElsi1_2());
		attributes.put("quality1_3", getQuality1_3());
		attributes.put("quality1_3_comments", getQuality1_3_comments());
		attributes.put("cataloguemeetpurposes2_1", getCataloguemeetpurposes2_1());
		attributes.put("adequateitplatform2_2", getAdequateitplatform2_2());
		attributes.put("addedvaluecatalogue2_3", getAddedvaluecatalogue2_3());
		attributes.put("associateddata2_4", getAssociateddata2_4());
		attributes.put("associateddata2_4_comments",
			getAssociateddata2_4_comments());
		attributes.put("reasonstoaccept3_1", getReasonstoaccept3_1());
		attributes.put("recommendation3_2", getRecommendation3_2());
		attributes.put("needadditionalinformation3_3",
			getNeedadditionalinformation3_3());
		attributes.put("finalrecommendation_4", getFinalrecommendation_4());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long biobankpanelassessmentId = (Long)attributes.get(
				"biobankpanelassessmentId");

		if (biobankpanelassessmentId != null) {
			setBiobankpanelassessmentId(biobankpanelassessmentId);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String reviewer = (String)attributes.get("reviewer");

		if (reviewer != null) {
			setReviewer(reviewer);
		}

		Date dateofassessment = (Date)attributes.get("dateofassessment");

		if (dateofassessment != null) {
			setDateofassessment(dateofassessment);
		}

		String background1_1 = (String)attributes.get("background1_1");

		if (background1_1 != null) {
			setBackground1_1(background1_1);
		}

		String background1_1_comments = (String)attributes.get(
				"background1_1_comments");

		if (background1_1_comments != null) {
			setBackground1_1_comments(background1_1_comments);
		}

		String elsi1_2 = (String)attributes.get("elsi1_2");

		if (elsi1_2 != null) {
			setElsi1_2(elsi1_2);
		}

		String quality1_3 = (String)attributes.get("quality1_3");

		if (quality1_3 != null) {
			setQuality1_3(quality1_3);
		}

		String quality1_3_comments = (String)attributes.get(
				"quality1_3_comments");

		if (quality1_3_comments != null) {
			setQuality1_3_comments(quality1_3_comments);
		}

		String cataloguemeetpurposes2_1 = (String)attributes.get(
				"cataloguemeetpurposes2_1");

		if (cataloguemeetpurposes2_1 != null) {
			setCataloguemeetpurposes2_1(cataloguemeetpurposes2_1);
		}

		String adequateitplatform2_2 = (String)attributes.get(
				"adequateitplatform2_2");

		if (adequateitplatform2_2 != null) {
			setAdequateitplatform2_2(adequateitplatform2_2);
		}

		String addedvaluecatalogue2_3 = (String)attributes.get(
				"addedvaluecatalogue2_3");

		if (addedvaluecatalogue2_3 != null) {
			setAddedvaluecatalogue2_3(addedvaluecatalogue2_3);
		}

		String associateddata2_4 = (String)attributes.get("associateddata2_4");

		if (associateddata2_4 != null) {
			setAssociateddata2_4(associateddata2_4);
		}

		String associateddata2_4_comments = (String)attributes.get(
				"associateddata2_4_comments");

		if (associateddata2_4_comments != null) {
			setAssociateddata2_4_comments(associateddata2_4_comments);
		}

		String reasonstoaccept3_1 = (String)attributes.get("reasonstoaccept3_1");

		if (reasonstoaccept3_1 != null) {
			setReasonstoaccept3_1(reasonstoaccept3_1);
		}

		String recommendation3_2 = (String)attributes.get("recommendation3_2");

		if (recommendation3_2 != null) {
			setRecommendation3_2(recommendation3_2);
		}

		String needadditionalinformation3_3 = (String)attributes.get(
				"needadditionalinformation3_3");

		if (needadditionalinformation3_3 != null) {
			setNeedadditionalinformation3_3(needadditionalinformation3_3);
		}

		String finalrecommendation_4 = (String)attributes.get(
				"finalrecommendation_4");

		if (finalrecommendation_4 != null) {
			setFinalrecommendation_4(finalrecommendation_4);
		}
	}

	@JSON
	@Override
	public long getBiobankpanelassessmentId() {
		return _biobankpanelassessmentId;
	}

	@Override
	public void setBiobankpanelassessmentId(long biobankpanelassessmentId) {
		_biobankpanelassessmentId = biobankpanelassessmentId;
	}

	@JSON
	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_columnBitmask |= ORGANIZATIONID_COLUMN_BITMASK;

		if (!_setOriginalOrganizationId) {
			_setOriginalOrganizationId = true;

			_originalOrganizationId = _organizationId;
		}

		_organizationId = organizationId;
	}

	public long getOriginalOrganizationId() {
		return _originalOrganizationId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getReviewer() {
		if (_reviewer == null) {
			return StringPool.BLANK;
		}
		else {
			return _reviewer;
		}
	}

	@Override
	public void setReviewer(String reviewer) {
		_reviewer = reviewer;
	}

	@JSON
	@Override
	public Date getDateofassessment() {
		return _dateofassessment;
	}

	@Override
	public void setDateofassessment(Date dateofassessment) {
		_dateofassessment = dateofassessment;
	}

	@JSON
	@Override
	public String getBackground1_1() {
		if (_background1_1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _background1_1;
		}
	}

	@Override
	public void setBackground1_1(String background1_1) {
		_background1_1 = background1_1;
	}

	@JSON
	@Override
	public String getBackground1_1_comments() {
		if (_background1_1_comments == null) {
			return StringPool.BLANK;
		}
		else {
			return _background1_1_comments;
		}
	}

	@Override
	public void setBackground1_1_comments(String background1_1_comments) {
		_background1_1_comments = background1_1_comments;
	}

	@JSON
	@Override
	public String getElsi1_2() {
		if (_elsi1_2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _elsi1_2;
		}
	}

	@Override
	public void setElsi1_2(String elsi1_2) {
		_elsi1_2 = elsi1_2;
	}

	@JSON
	@Override
	public String getQuality1_3() {
		if (_quality1_3 == null) {
			return StringPool.BLANK;
		}
		else {
			return _quality1_3;
		}
	}

	@Override
	public void setQuality1_3(String quality1_3) {
		_quality1_3 = quality1_3;
	}

	@JSON
	@Override
	public String getQuality1_3_comments() {
		if (_quality1_3_comments == null) {
			return StringPool.BLANK;
		}
		else {
			return _quality1_3_comments;
		}
	}

	@Override
	public void setQuality1_3_comments(String quality1_3_comments) {
		_quality1_3_comments = quality1_3_comments;
	}

	@JSON
	@Override
	public String getCataloguemeetpurposes2_1() {
		if (_cataloguemeetpurposes2_1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _cataloguemeetpurposes2_1;
		}
	}

	@Override
	public void setCataloguemeetpurposes2_1(String cataloguemeetpurposes2_1) {
		_cataloguemeetpurposes2_1 = cataloguemeetpurposes2_1;
	}

	@JSON
	@Override
	public String getAdequateitplatform2_2() {
		if (_adequateitplatform2_2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _adequateitplatform2_2;
		}
	}

	@Override
	public void setAdequateitplatform2_2(String adequateitplatform2_2) {
		_adequateitplatform2_2 = adequateitplatform2_2;
	}

	@JSON
	@Override
	public String getAddedvaluecatalogue2_3() {
		if (_addedvaluecatalogue2_3 == null) {
			return StringPool.BLANK;
		}
		else {
			return _addedvaluecatalogue2_3;
		}
	}

	@Override
	public void setAddedvaluecatalogue2_3(String addedvaluecatalogue2_3) {
		_addedvaluecatalogue2_3 = addedvaluecatalogue2_3;
	}

	@JSON
	@Override
	public String getAssociateddata2_4() {
		if (_associateddata2_4 == null) {
			return StringPool.BLANK;
		}
		else {
			return _associateddata2_4;
		}
	}

	@Override
	public void setAssociateddata2_4(String associateddata2_4) {
		_associateddata2_4 = associateddata2_4;
	}

	@JSON
	@Override
	public String getAssociateddata2_4_comments() {
		if (_associateddata2_4_comments == null) {
			return StringPool.BLANK;
		}
		else {
			return _associateddata2_4_comments;
		}
	}

	@Override
	public void setAssociateddata2_4_comments(String associateddata2_4_comments) {
		_associateddata2_4_comments = associateddata2_4_comments;
	}

	@JSON
	@Override
	public String getReasonstoaccept3_1() {
		if (_reasonstoaccept3_1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _reasonstoaccept3_1;
		}
	}

	@Override
	public void setReasonstoaccept3_1(String reasonstoaccept3_1) {
		_reasonstoaccept3_1 = reasonstoaccept3_1;
	}

	@JSON
	@Override
	public String getRecommendation3_2() {
		if (_recommendation3_2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _recommendation3_2;
		}
	}

	@Override
	public void setRecommendation3_2(String recommendation3_2) {
		_recommendation3_2 = recommendation3_2;
	}

	@JSON
	@Override
	public String getNeedadditionalinformation3_3() {
		if (_needadditionalinformation3_3 == null) {
			return StringPool.BLANK;
		}
		else {
			return _needadditionalinformation3_3;
		}
	}

	@Override
	public void setNeedadditionalinformation3_3(
		String needadditionalinformation3_3) {
		_needadditionalinformation3_3 = needadditionalinformation3_3;
	}

	@JSON
	@Override
	public String getFinalrecommendation_4() {
		if (_finalrecommendation_4 == null) {
			return StringPool.BLANK;
		}
		else {
			return _finalrecommendation_4;
		}
	}

	@Override
	public void setFinalrecommendation_4(String finalrecommendation_4) {
		_finalrecommendation_4 = finalrecommendation_4;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			BiobankPanelAssessment.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public BiobankPanelAssessment toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (BiobankPanelAssessment)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BiobankPanelAssessmentImpl biobankPanelAssessmentImpl = new BiobankPanelAssessmentImpl();

		biobankPanelAssessmentImpl.setBiobankpanelassessmentId(getBiobankpanelassessmentId());
		biobankPanelAssessmentImpl.setOrganizationId(getOrganizationId());
		biobankPanelAssessmentImpl.setUserId(getUserId());
		biobankPanelAssessmentImpl.setReviewer(getReviewer());
		biobankPanelAssessmentImpl.setDateofassessment(getDateofassessment());
		biobankPanelAssessmentImpl.setBackground1_1(getBackground1_1());
		biobankPanelAssessmentImpl.setBackground1_1_comments(getBackground1_1_comments());
		biobankPanelAssessmentImpl.setElsi1_2(getElsi1_2());
		biobankPanelAssessmentImpl.setQuality1_3(getQuality1_3());
		biobankPanelAssessmentImpl.setQuality1_3_comments(getQuality1_3_comments());
		biobankPanelAssessmentImpl.setCataloguemeetpurposes2_1(getCataloguemeetpurposes2_1());
		biobankPanelAssessmentImpl.setAdequateitplatform2_2(getAdequateitplatform2_2());
		biobankPanelAssessmentImpl.setAddedvaluecatalogue2_3(getAddedvaluecatalogue2_3());
		biobankPanelAssessmentImpl.setAssociateddata2_4(getAssociateddata2_4());
		biobankPanelAssessmentImpl.setAssociateddata2_4_comments(getAssociateddata2_4_comments());
		biobankPanelAssessmentImpl.setReasonstoaccept3_1(getReasonstoaccept3_1());
		biobankPanelAssessmentImpl.setRecommendation3_2(getRecommendation3_2());
		biobankPanelAssessmentImpl.setNeedadditionalinformation3_3(getNeedadditionalinformation3_3());
		biobankPanelAssessmentImpl.setFinalrecommendation_4(getFinalrecommendation_4());

		biobankPanelAssessmentImpl.resetOriginalValues();

		return biobankPanelAssessmentImpl;
	}

	@Override
	public int compareTo(BiobankPanelAssessment biobankPanelAssessment) {
		long primaryKey = biobankPanelAssessment.getPrimaryKey();

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

		if (!(obj instanceof BiobankPanelAssessment)) {
			return false;
		}

		BiobankPanelAssessment biobankPanelAssessment = (BiobankPanelAssessment)obj;

		long primaryKey = biobankPanelAssessment.getPrimaryKey();

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
		BiobankPanelAssessmentModelImpl biobankPanelAssessmentModelImpl = this;

		biobankPanelAssessmentModelImpl._originalOrganizationId = biobankPanelAssessmentModelImpl._organizationId;

		biobankPanelAssessmentModelImpl._setOriginalOrganizationId = false;

		biobankPanelAssessmentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<BiobankPanelAssessment> toCacheModel() {
		BiobankPanelAssessmentCacheModel biobankPanelAssessmentCacheModel = new BiobankPanelAssessmentCacheModel();

		biobankPanelAssessmentCacheModel.biobankpanelassessmentId = getBiobankpanelassessmentId();

		biobankPanelAssessmentCacheModel.organizationId = getOrganizationId();

		biobankPanelAssessmentCacheModel.userId = getUserId();

		biobankPanelAssessmentCacheModel.reviewer = getReviewer();

		String reviewer = biobankPanelAssessmentCacheModel.reviewer;

		if ((reviewer != null) && (reviewer.length() == 0)) {
			biobankPanelAssessmentCacheModel.reviewer = null;
		}

		Date dateofassessment = getDateofassessment();

		if (dateofassessment != null) {
			biobankPanelAssessmentCacheModel.dateofassessment = dateofassessment.getTime();
		}
		else {
			biobankPanelAssessmentCacheModel.dateofassessment = Long.MIN_VALUE;
		}

		biobankPanelAssessmentCacheModel.background1_1 = getBackground1_1();

		String background1_1 = biobankPanelAssessmentCacheModel.background1_1;

		if ((background1_1 != null) && (background1_1.length() == 0)) {
			biobankPanelAssessmentCacheModel.background1_1 = null;
		}

		biobankPanelAssessmentCacheModel.background1_1_comments = getBackground1_1_comments();

		String background1_1_comments = biobankPanelAssessmentCacheModel.background1_1_comments;

		if ((background1_1_comments != null) &&
				(background1_1_comments.length() == 0)) {
			biobankPanelAssessmentCacheModel.background1_1_comments = null;
		}

		biobankPanelAssessmentCacheModel.elsi1_2 = getElsi1_2();

		String elsi1_2 = biobankPanelAssessmentCacheModel.elsi1_2;

		if ((elsi1_2 != null) && (elsi1_2.length() == 0)) {
			biobankPanelAssessmentCacheModel.elsi1_2 = null;
		}

		biobankPanelAssessmentCacheModel.quality1_3 = getQuality1_3();

		String quality1_3 = biobankPanelAssessmentCacheModel.quality1_3;

		if ((quality1_3 != null) && (quality1_3.length() == 0)) {
			biobankPanelAssessmentCacheModel.quality1_3 = null;
		}

		biobankPanelAssessmentCacheModel.quality1_3_comments = getQuality1_3_comments();

		String quality1_3_comments = biobankPanelAssessmentCacheModel.quality1_3_comments;

		if ((quality1_3_comments != null) &&
				(quality1_3_comments.length() == 0)) {
			biobankPanelAssessmentCacheModel.quality1_3_comments = null;
		}

		biobankPanelAssessmentCacheModel.cataloguemeetpurposes2_1 = getCataloguemeetpurposes2_1();

		String cataloguemeetpurposes2_1 = biobankPanelAssessmentCacheModel.cataloguemeetpurposes2_1;

		if ((cataloguemeetpurposes2_1 != null) &&
				(cataloguemeetpurposes2_1.length() == 0)) {
			biobankPanelAssessmentCacheModel.cataloguemeetpurposes2_1 = null;
		}

		biobankPanelAssessmentCacheModel.adequateitplatform2_2 = getAdequateitplatform2_2();

		String adequateitplatform2_2 = biobankPanelAssessmentCacheModel.adequateitplatform2_2;

		if ((adequateitplatform2_2 != null) &&
				(adequateitplatform2_2.length() == 0)) {
			biobankPanelAssessmentCacheModel.adequateitplatform2_2 = null;
		}

		biobankPanelAssessmentCacheModel.addedvaluecatalogue2_3 = getAddedvaluecatalogue2_3();

		String addedvaluecatalogue2_3 = biobankPanelAssessmentCacheModel.addedvaluecatalogue2_3;

		if ((addedvaluecatalogue2_3 != null) &&
				(addedvaluecatalogue2_3.length() == 0)) {
			biobankPanelAssessmentCacheModel.addedvaluecatalogue2_3 = null;
		}

		biobankPanelAssessmentCacheModel.associateddata2_4 = getAssociateddata2_4();

		String associateddata2_4 = biobankPanelAssessmentCacheModel.associateddata2_4;

		if ((associateddata2_4 != null) && (associateddata2_4.length() == 0)) {
			biobankPanelAssessmentCacheModel.associateddata2_4 = null;
		}

		biobankPanelAssessmentCacheModel.associateddata2_4_comments = getAssociateddata2_4_comments();

		String associateddata2_4_comments = biobankPanelAssessmentCacheModel.associateddata2_4_comments;

		if ((associateddata2_4_comments != null) &&
				(associateddata2_4_comments.length() == 0)) {
			biobankPanelAssessmentCacheModel.associateddata2_4_comments = null;
		}

		biobankPanelAssessmentCacheModel.reasonstoaccept3_1 = getReasonstoaccept3_1();

		String reasonstoaccept3_1 = biobankPanelAssessmentCacheModel.reasonstoaccept3_1;

		if ((reasonstoaccept3_1 != null) && (reasonstoaccept3_1.length() == 0)) {
			biobankPanelAssessmentCacheModel.reasonstoaccept3_1 = null;
		}

		biobankPanelAssessmentCacheModel.recommendation3_2 = getRecommendation3_2();

		String recommendation3_2 = biobankPanelAssessmentCacheModel.recommendation3_2;

		if ((recommendation3_2 != null) && (recommendation3_2.length() == 0)) {
			biobankPanelAssessmentCacheModel.recommendation3_2 = null;
		}

		biobankPanelAssessmentCacheModel.needadditionalinformation3_3 = getNeedadditionalinformation3_3();

		String needadditionalinformation3_3 = biobankPanelAssessmentCacheModel.needadditionalinformation3_3;

		if ((needadditionalinformation3_3 != null) &&
				(needadditionalinformation3_3.length() == 0)) {
			biobankPanelAssessmentCacheModel.needadditionalinformation3_3 = null;
		}

		biobankPanelAssessmentCacheModel.finalrecommendation_4 = getFinalrecommendation_4();

		String finalrecommendation_4 = biobankPanelAssessmentCacheModel.finalrecommendation_4;

		if ((finalrecommendation_4 != null) &&
				(finalrecommendation_4.length() == 0)) {
			biobankPanelAssessmentCacheModel.finalrecommendation_4 = null;
		}

		return biobankPanelAssessmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{biobankpanelassessmentId=");
		sb.append(getBiobankpanelassessmentId());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", reviewer=");
		sb.append(getReviewer());
		sb.append(", dateofassessment=");
		sb.append(getDateofassessment());
		sb.append(", background1_1=");
		sb.append(getBackground1_1());
		sb.append(", background1_1_comments=");
		sb.append(getBackground1_1_comments());
		sb.append(", elsi1_2=");
		sb.append(getElsi1_2());
		sb.append(", quality1_3=");
		sb.append(getQuality1_3());
		sb.append(", quality1_3_comments=");
		sb.append(getQuality1_3_comments());
		sb.append(", cataloguemeetpurposes2_1=");
		sb.append(getCataloguemeetpurposes2_1());
		sb.append(", adequateitplatform2_2=");
		sb.append(getAdequateitplatform2_2());
		sb.append(", addedvaluecatalogue2_3=");
		sb.append(getAddedvaluecatalogue2_3());
		sb.append(", associateddata2_4=");
		sb.append(getAssociateddata2_4());
		sb.append(", associateddata2_4_comments=");
		sb.append(getAssociateddata2_4_comments());
		sb.append(", reasonstoaccept3_1=");
		sb.append(getReasonstoaccept3_1());
		sb.append(", recommendation3_2=");
		sb.append(getRecommendation3_2());
		sb.append(", needadditionalinformation3_3=");
		sb.append(getNeedadditionalinformation3_3());
		sb.append(", finalrecommendation_4=");
		sb.append(getFinalrecommendation_4());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append(
			"at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>biobankpanelassessmentId</column-name><column-value><![CDATA[");
		sb.append(getBiobankpanelassessmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reviewer</column-name><column-value><![CDATA[");
		sb.append(getReviewer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateofassessment</column-name><column-value><![CDATA[");
		sb.append(getDateofassessment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>background1_1</column-name><column-value><![CDATA[");
		sb.append(getBackground1_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>background1_1_comments</column-name><column-value><![CDATA[");
		sb.append(getBackground1_1_comments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>elsi1_2</column-name><column-value><![CDATA[");
		sb.append(getElsi1_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quality1_3</column-name><column-value><![CDATA[");
		sb.append(getQuality1_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quality1_3_comments</column-name><column-value><![CDATA[");
		sb.append(getQuality1_3_comments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cataloguemeetpurposes2_1</column-name><column-value><![CDATA[");
		sb.append(getCataloguemeetpurposes2_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>adequateitplatform2_2</column-name><column-value><![CDATA[");
		sb.append(getAdequateitplatform2_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addedvaluecatalogue2_3</column-name><column-value><![CDATA[");
		sb.append(getAddedvaluecatalogue2_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>associateddata2_4</column-name><column-value><![CDATA[");
		sb.append(getAssociateddata2_4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>associateddata2_4_comments</column-name><column-value><![CDATA[");
		sb.append(getAssociateddata2_4_comments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reasonstoaccept3_1</column-name><column-value><![CDATA[");
		sb.append(getReasonstoaccept3_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recommendation3_2</column-name><column-value><![CDATA[");
		sb.append(getRecommendation3_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>needadditionalinformation3_3</column-name><column-value><![CDATA[");
		sb.append(getNeedadditionalinformation3_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>finalrecommendation_4</column-name><column-value><![CDATA[");
		sb.append(getFinalrecommendation_4());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = BiobankPanelAssessment.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			BiobankPanelAssessment.class
		};
	private long _biobankpanelassessmentId;
	private long _organizationId;
	private long _originalOrganizationId;
	private boolean _setOriginalOrganizationId;
	private long _userId;
	private String _userUuid;
	private String _reviewer;
	private Date _dateofassessment;
	private String _background1_1;
	private String _background1_1_comments;
	private String _elsi1_2;
	private String _quality1_3;
	private String _quality1_3_comments;
	private String _cataloguemeetpurposes2_1;
	private String _adequateitplatform2_2;
	private String _addedvaluecatalogue2_3;
	private String _associateddata2_4;
	private String _associateddata2_4_comments;
	private String _reasonstoaccept3_1;
	private String _recommendation3_2;
	private String _needadditionalinformation3_3;
	private String _finalrecommendation_4;
	private long _columnBitmask;
	private BiobankPanelAssessment _escapedModel;
}