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

package at.meduni.liferay.portlet.rdconnect.model.impl;

import at.meduni.liferay.portlet.rdconnect.model.Candidate;
import at.meduni.liferay.portlet.rdconnect.service.CandidateLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Candidate service. Represents a row in the &quot;rdconnect.candidate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CandidateImpl}.
 * </p>
 *
 * @author Robert Reihs
 * @see CandidateImpl
 * @see at.meduni.liferay.portlet.rdconnect.model.Candidate
 * @generated
 */
public abstract class CandidateBaseImpl extends CandidateModelImpl
	implements Candidate {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a candidate model instance should use the {@link Candidate} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CandidateLocalServiceUtil.addCandidate(this);
		}
		else {
			CandidateLocalServiceUtil.updateCandidate(this);
		}
	}
}