<%@ include file="/html/init.jsp" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.QueryUtil" %>
<%@ page import="com.liferay.portlet.dynamicdatalists.model.DDLRecordSet" %>
<%@ page import="com.liferay.portlet.dynamicdatalists.service.DDLRecordSetLocalServiceUtil" %>
<%@ page import="com.liferay.portlet.PortletURLFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayPortletURL" %>
<%@page import="com.liferay.portal.service.GroupLocalServiceUtil"%>
<%@ page import="com.liferay.portal.service.OrganizationLocalServiceUtil" %>
<%@ page import="com.liferay.portal.service.UserLocalServiceUtil" %>
<%@ page import="com.liferay.portal.model.User" %>
<%@ page import="com.liferay.portal.model.Organization" %>
<%@ page import="com.liferay.portal.service.LayoutLocalServiceUtil" %>
<%@ page import="com.liferay.portal.model.Group" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>

<portlet:defineObjects />

<div class="rdc-portalmenu-div-container">
<div class="rdc-portalmenu-div-container-homologocontainer">
<aui:a href='<%= themeDisplay.getURLPortal()+"/home" %>'><img class="rdc-portalmenu-div-container-homelogo" alt="homelogo" src="<%= request.getContextPath() %>/images/home.png" height="16px" width="19px" /></aui:a>
</div>
<div class="rdc-portalmenu-div-container-myorganisations">
<ul>
<li>my organisations <img src="<%= request.getContextPath() %>/images/arrow.png" height="9px" width="13px" /><ul>
<%

long organizationId = 0;
long userId = themeDisplay.getUserId();
List<Organization> organisations = OrganizationLocalServiceUtil.getUserOrganizations(userId);
for(Organization o : organisations) {
	organizationId = o.getOrganizationId();
	String imgPath = themeDisplay.getPathImage()+"/layout_set_logo?img_id="+o.getLogoId();
	String orgPath = themeDisplay.getURLPortal()+"/web"+o.getGroup().getFriendlyURL();
	
	%>
	<li><aui:a href="<%= orgPath %>"><img class="rdc-portalmenu-div-container-logo" alt="logo" height="40px" width="40px" src="<%= imgPath %>" /><%= o.getName() %></aui:a></li>
	<%
}

%>
</ul></li>
</ul>
</div>

<div class="rdc_portalmenu-search-input">
<portlet:actionURL name='searchRDC' var="searchRDCURL" />
<% String searchurl1 = themeDisplay.getURLPortal()+"/web/guest/unified-list"; %>
<aui:form name="filterform" action="<%= searchurl1 %>" method="get" >
<aui:input name="name" label="" size="190" />
</aui:form>
<% String imgLupePath = request.getContextPath() + "/images/search.png"; %>
<div class="rdc_portalmenu-search-input-lupe"><img class="rdc_portalmenu-search-input-lupe-img" alt="logo" height="19px" width="20px" src="<%= imgLupePath %>" /></div>
</div>

<%
Group controlPanelGroup = GroupLocalServiceUtil.getGroup(themeDisplay.getCompanyId(), "Control Panel");
long controlPanelPlid = LayoutLocalServiceUtil.getDefaultPlid(controlPanelGroup.getGroupId(), true);
LiferayPortletURL editmyusersURL = PortletURLFactoryUtil.create(request, "2", controlPanelPlid, "RENDER_PHASE");
editmyusersURL.setParameter("p_p_state", "maximized");
editmyusersURL.setParameter("controlPanelCategory", "my");
String portletResource = ParamUtil.getString(request, "portletResource");
%>

<div class="rdc_portalmenu-myuseraccount-container">
<ul><li>
<% if(themeDisplay.isSignedIn()) { %>
<img style="opacity:0.5;filter:alpha(opacity=50);" alt="myaccount" height="18px" width="10px" src="<%= request.getContextPath() %>/images/profile.png" />
<ul>
<li id="portalmyuseredit" style="cursor:pointer;"><%= themeDisplay.getUser().getFullName() %></li>
<li class="sign-out"><aui:a href="<%= themeDisplay.getURLSignOut() %>">Sign Out</aui:a></li>
</ul>
<% } else { %>
<img alt="myaccount" height="18px" width="18px" src="<%= request.getContextPath() %>/images/signinkey.png" />
<ul>
<%
LiferayPortletURL createaccountURL = PortletURLFactoryUtil.create(request, "58", controlPanelPlid, "RENDER_PHASE");
editmyusersURL.setParameter("p_p_state", "maximized");
editmyusersURL.setParameter("struts_action", "/login/create_account");
editmyusersURL.setParameter("saveLastPath", "false");
editmyusersURL.setParameter("p_p_lifecycle", "0");
String register = "http://rd-connect.bibbox.org/home?p_p_id=58&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&saveLastPath=false&_58_struts_action=%2Flogin%2Fcreate_account";
%>
<li class="sign-in"><aui:a href="<%= themeDisplay.getURLSignIn() %>">Sign In</aui:a></li>
<li class="sign-in"><aui:a href="<%= register %>">Register</aui:a></li>
<li style="visibility:hidden;" id="portalmyuseredit" style="cursor:pointer;"><%= themeDisplay.getUser().getFullName() %></li>
</ul>
<% } %>
</li></ul>
</div>

</div>
<aui:script use="aui-base">
				A.all('#portalmyuseredit').on(
					'click',
					function(event) {
						Liferay.Util.selectEntity(
							{
								dialog: {
									constrain: true,
									modal: true,
									width: 1000
								},
								id: '_<%=HtmlUtil.escapeJS(portletResource)%>_selectFolder',
								title: 'Edit my account.',
								uri: '<%=editmyusersURL.toString()%>'
							}
						);
					}
				);
</aui:script>
