<!-- 
BiBBoxCommonServices
user/invitation

 -->
<%@ include file="/html/user/init.jsp" %> 

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
// Parameters for permission Checking
long groupId = scopeGroupId;
String name = portletDisplay.getRootPortletId();
String primKey = portletDisplay.getResourcePK();
String actionId_add_invitation = "ADD_INVITATION";
String actionId_edit_invitation = "EDIT_INVITATION";

String redirect = PortalUtil.getCurrentURL(renderRequest);
SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
String optionsInvitationTypeFilter_cfg = GetterUtil.getString(portletPreferences.getValue("optionsInvitationTypeFilter", ""));
//optionsInvitationTypeFilter_cfg
%>

<c:choose>
	<c:when test="<%= permissionChecker.hasPermission(groupId, name, primKey, actionId_add_invitation) %>">
		<aui:button-row>
			<portlet:renderURL var="addInvitationURL">
				<portlet:param name="mvcPath" value="/html/user/invitation/edit_invitation.jsp" />
				<portlet:param name="redirect" value="<%= redirect %>" />
			</portlet:renderURL>
				<aui:button value="add-invitation" onClick="<%= addInvitationURL.toString() %>"/>
		</aui:button-row>
	</c:when>
</c:choose>

<liferay-ui:search-container delta='<%= GetterUtil.getInteger(prefs.getValue("rowsPerPage", "10")) %>' emptyResultsMessage="invitation-empty-results-message">
	<liferay-ui:search-container-results
		results="<%= InvitationLocalServiceUtil.getMyFilteredInvitations(optionsInvitationTypeFilter_cfg) %>"
		total="<%= InvitationLocalServiceUtil.getMyFilteredInvitationsCount(optionsInvitationTypeFilter_cfg) %>"
	/>
	
	<liferay-ui:search-container-row
		className="at.graz.meduni.liferay.portlet.bibbox.service.model.Invitation"
		keyProperty="invitationId"
		modelVar="invitation" escapedModel="<%= true %>"
	>
		
		<liferay-ui:search-container-column-text
			name="Name"
			value="<%= invitation.getName() %>"
		/>
		
		<liferay-ui:search-container-column-text
			name="Status"
			value='<%= InvitationLocalServiceUtil.getStatusFromLong(invitation.getStatus()) %>'
		/>
		<liferay-ui:search-container-column-text
			name="Last Edited"
			value='<%= dateFormat.format(invitation.getLastchanged()) %>'
		/>
		<liferay-ui:search-container-column-text
			name='Number of Organizations (all/respons/rejected)'
			value='<%= "" + InvitationOrganisationLocalServiceUtil.getOrganisationByInvitationCount(invitation.getInvitationId()) 
				+ "/" + InvitationOrganisationLocalServiceUtil.getInvitationRespons(invitation.getInvitationId())
			%>'
		/>
		<%
		if (permissionChecker.isOmniadmin() || true) { 
			%>
			<liferay-ui:search-container-column-jsp
				align="right"
				path="/html/user/invitation/invitation_actions.jsp"
			/>
			<% 
		} 
		%>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>