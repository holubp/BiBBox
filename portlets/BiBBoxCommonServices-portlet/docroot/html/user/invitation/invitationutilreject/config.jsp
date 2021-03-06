<%@ include file="/html/user/init.jsp" %> 
<%@ page import="com.liferay.portal.kernel.util.Constants" %> 

<portlet:defineObjects />

<%
long optionsDeleteParentOrganisation_cfg = GetterUtil.getLong(portletPreferences.getValue("optionsDeleteParentOrganisation", "0"));
String optionsText_cfg = GetterUtil.getString(portletPreferences.getValue("optionsText", "We are sorry you don't want to participate in the RD-Connect Network. Please fill in the security code you received with this link to remove your organization from the RD-Connect list."));
%>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />
<aui:form action="<%= configurationURL %>" method="post" name="fm">
	<aui:fieldset>
		<aui:layout cssClass="proposelayout">
			<aui:column columnWidth="100" first="true">
				<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
				<aui:select label="Select Organization for move to on delete" name="preferences--optionsDeleteParentOrganisation--">
					<%
					List<Organization> organizations = OrganizationLocalServiceUtil.getOrganizations(themeDisplay.getCompanyId(), 0);
					for(Organization organization : organizations) {
						%>
						<aui:option value="<%= organization.getOrganizationId() %>" selected='<%= optionsDeleteParentOrganisation_cfg == organization.getOrganizationId() ? true : false %>' >Move to (delete): <%= organization.getName() %></aui:option>
						<%
					}
					%>
				</aui:select>
			</aui:column>
			<aui:column columnWidth="100" first="true">
				<aui:input label="Text to displayed in the portlet" name="preferences--optionsText--" />
			</aui:column>
		</aui:layout>
	</aui:fieldset>
	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>