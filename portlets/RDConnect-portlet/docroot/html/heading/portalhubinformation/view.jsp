<%@include file="/html/init.jsp" %>
<%@ page import="com.liferay.portal.model.Role" %>

<portlet:defineObjects />


<div class="rdchubportalinfo">
	<div class="rdchubportalinfoheader">
	<% 
			boolean portaleditorrole = false;
			String titlecuratorportal = "Linking up rare disease resarch across the world";
		    for(Role role : themeDisplay.getUser().getRoles()) {
		    	if(role.getName().equalsIgnoreCase("PORTAL-EDITOR"))
		    		portaleditorrole = true;
		    	if(role.getName().equalsIgnoreCase("Administrator"))
		    		portaleditorrole = true;
		    }
		    if(portaleditorrole) {
		    	titlecuratorportal = "Curator Portal - RD-Connect";
		    }
		    if(themeDisplay.getUserId() == 105078 || themeDisplay.getUserId() == 105092) {
		    	titlecuratorportal = "BBMRI.AT";
		    }
		    if(themeDisplay.getURLPortal().contains("bbmri.at")) {
		    	titlecuratorportal = "Biobanking and BioMolecular resources Research Infrastructure Austria";
		    }
    %>
    
		<h3><%= titlecuratorportal %></h3>
	</div>
	<div class="rdchubportalinfosubmenu">
	<div id='cssmenu'>
	<ul>
		<%
		List<Layout> pagelayouts = themeDisplay.getLayouts();

		int width_all = 1000;//999 - pagelayouts.size() +1;
		int width = (int)Math.floor(width_all/pagelayouts.size());
		int offset = width_all - (width*pagelayouts.size());
		
		boolean right = true;
		for(Layout l : pagelayouts) {
			String pagesurl = themeDisplay.getURLPortal() + "/web" + themeDisplay.getSiteGroup().getFriendlyURL() + l.getFriendlyURL();
			
			String aktiveli = "<li class='rdconnect-heading-submenue-border' style='width:" + width + "px;'>";
			if(themeDisplay.getURLCurrent().equalsIgnoreCase("/web" + themeDisplay.getSiteGroup().getFriendlyURL() + l.getFriendlyURL())
					|| themeDisplay.getURLCurrent().equalsIgnoreCase(l.getFriendlyURL())) {
				aktiveli = "<li class='active rdconnect-heading-submenue-border-active' style='width:" + (width+offset) + "px;'>";
				right = false;
			} else if(right) {
				aktiveli = "<li class='rdconnect-heading-submenue-border-right' style='width:" + width + "px;'>";
			} else {
				aktiveli = "<li class='rdconnect-heading-submenue-border-left' style='width:" + width + "px;'>";
			}
			
			%>	
			<%= aktiveli %><aui:a href="<%= pagesurl %>"><%= l.getName() %></aui:a></li>
			<%
		}
		%>
	</ul>
	</div>
	</div>
</div>