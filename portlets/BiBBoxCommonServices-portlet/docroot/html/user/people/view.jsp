<!-- 
BiBBoxCommonServices
user/people

 -->
<%@ include file="/html/user/init.jsp" %> 

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
// Parameters for permission Checking
long groupId = scopeGroupId;
String name = portletDisplay.getRootPortletId();
String primKey = portletDisplay.getResourcePK();
String actionId_manage_maincontact = "MANAGE_MAINCONTACT";
String actionId_add_user = "ADD_USER";
String actionId_edit_user = "EDIT_USER";
%>

<!-- Main Contact  -->
<%
long optionsMainContactRole_option = GetterUtil.getLong(portletPreferences.getValue("optionsMainContactRole", "0"));
boolean optionsDisplayMaincontact_option = GetterUtil.getBoolean(portletPreferences.getValue("optionsDisplayMaincontact", "false"));
String optionsDisplayMaincontactTitle_option = GetterUtil.getString(portletPreferences.getValue("optionsDisplayMaincontactTitle", "Main contact"));
String redirect = ParamUtil.getString(request, "redirect");

String currentURL = PortalUtil.getCurrentURL(request);
String editimgpath = request.getContextPath() + "/images/edit.png";
	
long organizationId = 0;
Organization organization = null;
com.liferay.portal.model.Group currentGroup =  themeDisplay.getLayout().getGroup();
if (currentGroup.isOrganization()) {
  	// the group is an Organization
  	organizationId = currentGroup.getClassPK();
  	organization = OrganizationLocalServiceUtil.getOrganization(organizationId);
}

long maincontactid = 0;
if(optionsDisplayMaincontact_option) {
	User maincontact = null;
	List<User> userlist = UserLocalServiceUtil.getOrganizationUsers(organizationId);
	for(User user_mc : userlist) {
		List<UserGroupRole> usergrouprolles = UserGroupRoleLocalServiceUtil.getUserGroupRoles(user_mc.getUserId(), organization.getGroup().getGroupId());
		for (UserGroupRole ugr : usergrouprolles) {
			if(ugr.getRoleId() == optionsMainContactRole_option) {
				maincontact =  user_mc;
				maincontactid = user_mc.getUserId();
			}
		}
	}
	%>
	
	<portlet:renderURL var="editmaincontactURL">
		<portlet:param name="mvcPath" value="/html/user/people/maincontact.jsp" />
		<portlet:param name="redirect" value="<%= currentURL %>"/>
		<portlet:param name="maincontactid" value="<%= String.valueOf(maincontactid) %>"/>
	</portlet:renderURL>
	
	
	<div style="height:100%;width:100%;">
		<span class="rdc_idcard_idcaibody-headlines" style="height:100%;width:100%;margin-bottom:5px;"><b style="font-size: 20px;"><%= optionsDisplayMaincontactTitle_option %></b>
			<c:choose>
				<c:when test="<%= permissionChecker.hasPermission(groupId, name, primKey, actionId_manage_maincontact) %>">
					&nbsp;&nbsp;<aui:a href="<%= editmaincontactURL.toString() %>"><img alt="logo" src="<%= editimgpath %>" width="10px" height="10px" /></aui:a>
				</c:when>
			</c:choose>
		</span>
		<% 
		if(maincontact != null) {
			String imgPath = themeDisplay.getPathImage()+"/user_portrait?screenName="+maincontact.getScreenName()+"&amp;companyId="+maincontact.getCompanyId();
			String role = "";
			String[] user_roles = maincontact.getExpandoBridge().getAttribute("Role within the organisation").toString().split(";");
			for(String user_role : user_roles) {
				String[] our = user_role.split("_");
				if(our.length == 0 || our[0].length() == 0) {
					continue;
				}
				long orgid = Long.parseLong(our[0]);
				if(orgid == organizationId) {
					if(our.length == 1) {
						role = "";
					} else {
						role = our[1];
					}
				}
			}
			%>
			<br><br>
			<div class="rdc_idcard_idcaibody-avatar"><img alt="" style="margin-left:10px;float:right;" src="<%= imgPath %>" /></div>
			<span class="rdc_idcard_idcaibody-contactname"><%= maincontact.getFullName() %>
			<c:choose>
				<c:when test="<%= permissionChecker.hasPermission(groupId, name, primKey, actionId_edit_user) %>">
					<portlet:renderURL var="editUserURL">
						<portlet:param name="mvcPath" value="/html/user/people/edit.jsp" />
						<portlet:param name="redirect" value="<%= currentURL %>"/>
						<portlet:param name="bibbox_cs_userid" value="<%= String.valueOf(maincontact.getUserId()) %>"/>
						<portlet:param name="bibbox_cs_cmd" value="edit"/>
						<portlet:param name="bibbox_cs_organizationid" value="<%= String.valueOf(organizationId) %>"/>
					</portlet:renderURL>
					&nbsp;&nbsp;<aui:a  href="<%= editUserURL.toString() %>"><img alt="logo" src="<%= editimgpath %>" width="10px" height="10px" /></aui:a>
					&nbsp;&nbsp;<a id="deleteUserFromOrganisation" class="icon-remove" style="color: red;" organisationid="<%= organizationId %>" userid="<%= maincontact.getUserId() %>" userfulename="<%= maincontact.getFullName() %>"></a>
				</c:when>
			</c:choose>
			</span><br />
			<%
			if(role.length() != 0) {
				%>
				<span class="rdc_idcard_idcaibody-contactrole"><%= role %></span><br />
				<%
			}
			%>
			<span class="rdc_idcard_idcaibody-contactemail"><aui:a href='<%= "mailto:" + maincontact.getEmailAddress() %>'><%= maincontact.getEmailAddress() %></aui:a></span>
			<%
		}
		%>
	</div>
	<br />
	<hr />
	<%
}
%>
<!-- Personal List -->
<%
String optionsDisplayPeopleTitle_option = GetterUtil.getString(portletPreferences.getValue("optionsDisplayPeopleTitle", "Personal"));
%>
<div style="height:100%;width:100%;">
	<span class="rdc_idcard_idcaibody-headlines"  style="height:100%;width:100%;margin-bottom:5px;"><b style="font-size: 20px;"><%= optionsDisplayPeopleTitle_option %></b>
		<c:choose>
			<c:when test="<%= permissionChecker.hasPermission(groupId, name, primKey, actionId_add_user) %>">
				<portlet:renderURL var="addUserURL">
					<portlet:param name="mvcPath" value="/html/user/people/edit.jsp" />
					<portlet:param name="redirect" value="<%= currentURL %>"/>
					<portlet:param name="bibbox_cs_userid" value="0"/>
					<portlet:param name="bibbox_cs_cmd" value="add"/>
					<portlet:param name="bibbox_cs_organizationid" value="<%= String.valueOf(organizationId) %>"/>
				</portlet:renderURL>
				&nbsp;&nbsp;/&nbsp;&nbsp;<aui:a  href="<%= addUserURL.toString() %>" cssClass="icon-user">&nbsp;Add User</aui:a>
			</c:when>
		</c:choose>
	</span>
</div>
<br>
<% 
//Get Users From Organisations
List<User> users = UserLocalServiceUtil.getOrganizationUsers(organizationId);
for(User user_om : users) {
	if(maincontactid == user_om.getUserId()) {
		continue;
	}
	String role = "";
	String imgPath = themeDisplay.getPathImage()+"/user_portrait?screenName="+user_om.getScreenName()+"&amp;companyId="+user_om.getCompanyId();
	if(user_om.getExpandoBridge() != null) {
		if(user_om.getExpandoBridge().getAttribute("Role within the organisation") != null) {
			String user_roles_string = user_om.getExpandoBridge().getAttribute("Role within the organisation").toString();
			String[] user_roles = user_roles_string.split(";");
			for(String user_role : user_roles) {
				String[] our = user_role.split("_");
				if(our.length == 0 || our[0].length() == 0) {
					continue;
				}
				long orgid = Long.parseLong(our[0]);
				if(orgid == organizationId) {
					if(our.length == 1) {
						role = "";
					} else {
						role = our[1];
					}
				}
			}
		}
	}
	%>
	<div class="rdc-people-dispaly"  style="height:100%;width:100%;">
		<img style="float:left;margin-right:10px;" alt="" class="avatar" src="<%= imgPath %>" width="35" /> 
		<%= user_om.getFullName() %>
		<c:choose>
			<c:when test="<%= permissionChecker.hasPermission(groupId, name, primKey, actionId_edit_user) %>">
				<portlet:renderURL var="editUserURL">
					<portlet:param name="mvcPath" value="/html/user/people/edit.jsp" />
					<portlet:param name="redirect" value="<%= currentURL %>"/>
					<portlet:param name="bibbox_cs_userid" value="<%= String.valueOf(user_om.getUserId()) %>"/>
					<portlet:param name="bibbox_cs_cmd" value="edit"/>
					<portlet:param name="bibbox_cs_organizationid" value="<%= String.valueOf(organizationId) %>"/>
				</portlet:renderURL>
				&nbsp;&nbsp;<aui:a  href="<%= editUserURL.toString() %>"><img alt="logo" src="<%= editimgpath %>" width="10px" height="10px" /></aui:a>
				&nbsp;&nbsp;<a id="deleteUserFromOrganisation" class="icon-remove" style="color: red;" organisationid="<%= organizationId %>" userid="<%= user_om.getUserId() %>" userfulename="<%= user_om.getFullName() %>"></a>
			</c:when>
		</c:choose>
		<br>
		<%= role %> 
		<br>
	</div>
	<%
}
%>

<portlet:actionURL name='deleteUserFromOrganisation' var="deleteUserFromOrganisationURL" />

<aui:script use="aui-base,event">
	A.all('#deleteUserFromOrganisation').on(
			'click',
			function(event) {
				var confirmation_to_delete_user = confirm("Are you sure you want to delete the user " + event.currentTarget.getAttribute('userfulename') + " from your Organization?");
				if (confirmation_to_delete_user == true) {
					var url = '<%= deleteUserFromOrganisationURL.toString() %>';
					A.io.request(url,{
						//this is the data that you are sending to the action method
						data: {
						   <portlet:namespace />bibbox_cs_organisationid: event.currentTarget.getAttribute('organisationid'),
						   <portlet:namespace />bibbox_cs_userid: event.currentTarget.getAttribute('userid'),
						},
						dataType: 'json',
						on: {
						  failure: function() { alert('There is a problem with the server connection.'); },
						  success: function() { "success" }
						}
					});
				    Liferay.Portlet.refresh('#p_p_id_people_WAR_BiBBoxCommonServicesportlet_');
				} 	 
				return false;
			}
		);
</aui:script>
