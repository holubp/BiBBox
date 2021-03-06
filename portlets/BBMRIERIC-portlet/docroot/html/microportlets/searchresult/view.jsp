<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@ include file="/html/init.jsp" %>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ page import="com.liferay.portal.kernel.search.SearchContext"%>
<%@ page import="com.liferay.portal.kernel.search.SearchContextFactory"%>
<%@ page import="com.liferay.portal.kernel.search.facet.AssetEntriesFacet"%>
<%@ page import="com.liferay.portal.kernel.search.facet.Facet"%>
<%@ page import="com.liferay.portal.kernel.search.facet.ScopeFacet"%>
<%@ page import="com.liferay.portal.kernel.search.facet.SimpleFacet"%>
<%@ page import="com.liferay.portal.kernel.search.Indexer"%>
<%@ page import="com.liferay.portal.kernel.search.IndexerRegistryUtil"%>
<%@ page import="com.liferay.portlet.dynamicdatalists.model.DDLRecordSet" %>
<%@ page import="com.liferay.portlet.dynamicdatalists.model.DDLRecord" %>
<%@ page import="com.liferay.portal.kernel.search.FacetedSearcher" %>
<%@ page import="com.liferay.portal.kernel.search.Hits" %>
<%@ page import="com.liferay.portal.kernel.search.Document" %>
<%@ page import="com.liferay.portal.kernel.search.facet.collector.FacetCollector" %>
<%@ page import="com.liferay.portal.kernel.search.facet.collector.TermCollector" %>
<%@ page import="com.liferay.portal.kernel.search.facet.config.FacetConfiguration" %>
<%@ page import="com.liferay.util.PropertyComparator" %>
<%@ page import="com.liferay.portal.kernel.search.facet.config.FacetConfigurationUtil" %>
<%@ page import="com.liferay.portal.kernel.search.facet.util.FacetFactoryUtil" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.liferay.portlet.PortletURLFactoryUtil" %>
<%@ page import="javax.portlet.PortletRequest" %>
<%@ page import="com.liferay.portal.kernel.search.Field" %>
<%@ page import="com.liferay.portlet.asset.model.AssetRenderer" %>
<%@ page import="com.liferay.portal.kernel.util.GetterUtil" %>
<%@ page import="com.liferay.portlet.asset.model.AssetRendererFactory" %>
<%@ page import="com.liferay.portlet.asset.AssetRendererFactoryRegistryUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portlet.journal.service.JournalContentSearchLocalServiceUtil" %>
<%@ page import="com.liferay.portal.service.LayoutLocalServiceUtil" %>
<%@ page import="com.liferay.portal.model.Layout" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.liferay.portlet.journal.model.JournalContentSearch" %>
<%@ page import="com.liferay.portal.service.GroupLocalServiceUtil" %>
<%@ page import="com.liferay.portal.model.Group" %>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayPortletURL" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<portlet:defineObjects />

<!--  -->
<% 
String portletId = themeDisplay.getPpid();
String currentURL = PortalUtil.getCurrentURL(request);
PortletURL portletURL = PortletURLFactoryUtil.create(request, portletId, plid, PortletRequest.RENDER_PHASE);
SearchContainer mainSearchSearchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, SearchContainer.DEFAULT_DELTA, portletURL, null, null);


SearchContext searchContext = SearchContextFactory.getInstance(request);

searchContext.setAttribute("paginationType", "more");
searchContext.setEnd(-1);
searchContext.setStart(-1);

String[] entryCalssName = {DDLRecord.class.getName()};
searchContext.setEntryClassNames(entryCalssName);

String keywords = "";
HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(renderRequest);
httpRequest = PortalUtil.getOriginalServletRequest(httpRequest);
keywords = httpRequest.getParameter("SEARCH");
searchContext.setKeywords(keywords);

String searchConfiguration = "{\"facets\": ["+
		"{"+
		"    \"displayStyle\": \"scopes\","+
		"    \"weight\": 1.6,"+
		"    \"static\": false,"+
		"    \"order\": \"OrderHitsDesc\","+
		"    \"data\": {"+
		"        \"maxTerms\": 10,"+
		"        \"frequencyThreshold\": 1,"+
		"        \"showAssetCount\": true"+
		"    },"+
		"    \"label\": \"site\","+
		"    \"className\": \"com.liferay.portal.kernel.search.facet.ScopeFacet\","+
		"   \"fieldName\": \"groupId\""+
		"},"+
		"{"+
		"   \"displayStyle\": \"asset_entries\","+
		"    \"weight\": 1.5,"+
		"    \"static\": false,"+
		"    \"order\": \"OrderHitsDesc\","+
		"    \"data\": {"+
		"        \"values\": ["+
		"            \"com.liferay.portlet.documentlibrary.model.DLFileEntry\","+
		"            \"com.liferay.portlet.documentlibrary.model.DLFolder\","+
		"            \"com.liferay.portlet.journal.model.JournalArticle\","+
		"            \"com.liferay.portlet.journal.model.JournalFolder\","+
		"            \"com.liferay.portlet.messageboards.model.MBMessage\","+
		"            \"com.liferay.portlet.wiki.model.WikiPage\""+
		"        ],"+
		"        \"frequencyThreshold\": 1"+
		"    },"+
		"    \"label\": \"asset-type\","+
		"    \"className\": \"com.liferay.portal.kernel.search.facet.AssetEntriesFacet\","+
		"    \"fieldName\": \"entryClassName\""+
		"},"+
		"{"+
		"    \"displayStyle\": \"asset_tags\","+
		"    \"weight\": 1.4,"+
		"    \"static\": false,"+
		"    \"order\": \"OrderHitsDesc\","+
		"    \"data\": {"+
		"        \"maxTerms\": 10,"+
		"        \"displayStyle\": \"list\","+
		"        \"frequencyThreshold\": 1,"+
		"        \"showAssetCount\": true"+
		"    },"+
		"    \"label\": \"tag\","+
		"    \"className\": \"com.liferay.portal.kernel.search.facet.MultiValueFacet\","+
		"    \"fieldName\": \"assetTagNames\""+
		"},"+
		"{"+
		"    \"displayStyle\": \"folders\","+
		"    \"weight\": 1.2,"+
		"    \"static\": false,"+
		"    \"order\": \"OrderHitsDesc\","+
		"    \"data\": {"+
		"        \"maxTerms\": 10,"+
		"        \"frequencyThreshold\": 1,"+
		"        \"showAssetCount\": true"+
		"    },"+
		"    \"label\": \"folder\","+
		"    \"className\": \"com.liferay.portal.kernel.search.facet.MultiValueFacet\","+
		"    \"fieldName\": \"folderId\""+
		"},"+
		"{"+
		"    \"displayStyle\": \"users\","+
		"    \"weight\": 1.1,"+
		"    \"static\": false,"+
		"    \"order\": \"OrderHitsDesc\","+
		"    \"data\": {"+
		"        \"maxTerms\": 10,"+
		"        \"frequencyThreshold\": 1,"+
		"        \"showAssetCount\": true"+
		"    },"+
		"    \"label\": \"user\","+
		"    \"className\": \"com.liferay.portal.kernel.search.facet.MultiValueFacet\","+
		"    \"fieldName\": \"userId\""+
		"},"+
		"{"+
		"    \"displayStyle\": \"modified\","+
		"    \"weight\": 1,"+
		"    \"static\": false,"+
		"    \"order\": \"OrderHitsDesc\","+
		"    \"data\": {"+
		"        \"ranges\": ["+
		"            {"+
		"                \"range\": \"[past-hour TO *]\","+
		"                \"label\": \"past-hour\""+
		"            },"+
		"            {"+
		"                \"range\": \"[past-24-hours TO *]\","+
		"                \"label\": \"past-24-hours\""+
		"            },"+
		"            {"+
		"                \"range\": \"[past-week TO *]\","+
		"                \"label\": \"past-week\""+
		"            },"+
		"            {"+
		"                \"range\": \"[past-month TO *]\","+
		"                \"label\": \"past-month\""+
		"            },"+
		"            {"+
		"                \"range\": \"[past-year TO *]\","+
		"                \"label\": \"past-year\""+
		"            }"+
		"        ],"+
		"        \"frequencyThreshold\": 0"+
		"    },"+
		"    \"label\": \"modified\","+
		"    \"className\": \"com.liferay.portal.kernel.search.facet.ModifiedFacet\","+
		"    \"fieldName\": \"modified\""+
		"}"+
		"]}";

List<FacetConfiguration> facetConfigurations = FacetConfigurationUtil.load(searchConfiguration);

for (FacetConfiguration facetConfiguration : facetConfigurations) {
	Facet facet = FacetFactoryUtil.create(searchContext, facetConfiguration);

	searchContext.addFacet(facet);
}

Indexer indexer = FacetedSearcher.getInstance();

Hits hits = indexer.search(searchContext);

List<Document> docs = hits.toList();

Document[] docs2 = hits.getDocs();


Map<String, Facet> facets = searchContext.getFacets();
List<Facet> facetsList = ListUtil.fromCollection(facets.values());

boolean displayResultsInDocumentForm = true;
boolean displayMainQuery = false;

for(Document d : docs2) {
	String title = d.get(locale, Field.TITLE);
	String target = "_self";
	Map<String, Field> fieldmap = d.getFields();
	Field f = fieldmap.get("classTypeId");
	String class_type_id = "";
	if(f != null) {
		class_type_id = f.getValue();
	}
	Field f_class = fieldmap.get("entryClassName");
	String class_type = "";
	if(f_class != null) {
		class_type = f_class.getValue();
	}
	String content = "";
	Field f_content = fieldmap.get("content");
	if(f_content != null) {
		content = f_content.getValue();
		content = StringUtil.shorten(HtmlUtil.stripHtml(content), 200);
	}
	String entryClassName = d.get(Field.ENTRY_CLASS_NAME);
	AssetRendererFactory assetRendererFactory = AssetRendererFactoryRegistryUtil.getAssetRendererFactoryByClassName(entryClassName);
	long classPK = GetterUtil.getLong(d.get(Field.ENTRY_CLASS_PK));
	AssetRenderer assetRenderer = assetRendererFactory.getAssetRenderer(classPK);
	
	String href = "";
	String image_url = "";
	int hitsize = 0;
	
	if(false) {
	%><br>---------<br>Hit:<br>
	class_type_id<%=class_type_id%><br>
	class_type<%=class_type%><br>
	title<%=title%><br>
	<%
	if(class_type.equalsIgnoreCase("com.liferay.portlet.documentlibrary.model.DLFileEntry")) {
		%>A File<%
	} else {
		%>Not a File<%
	}
	}
	
	if(class_type_id.equalsIgnoreCase("0")) {
		if(class_type.equalsIgnoreCase("com.liferay.portlet.documentlibrary.model.DLFileEntry")) {
			image_url = request.getContextPath() + "/images/Document-Blank-icon.png";
			href = assetRenderer.getURLDownload(themeDisplay);
			target = "_blank";
			content = "<a href=\"" + href + "\" target=\"" + target + "\"><img src=\"" + assetRenderer.getThumbnailPath(renderRequest) + "\" height=\"50px\" /></a>";
		}
	} else if(class_type_id.equalsIgnoreCase("")) {
			class_type_id = "Articel";
			String articleid = "";
			image_url = request.getContextPath() + "/images/article.png";
			Field f_articleid = fieldmap.get("articleId");
			if(f_articleid != null) {
				articleid = f_articleid.getValue();
			}
			
			List<Long> hitLayoutIds = JournalContentSearchLocalServiceUtil.getLayoutIds(themeDisplay.getSiteGroupId(), false, articleid); 
			hitsize = hitLayoutIds.size();
			if (hitsize > 0) {
				Long hitLayoutId = hitLayoutIds.get(0);
				Layout hitLayout = LayoutLocalServiceUtil.getLayout(
				layout.getGroupId(), layout.isPrivateLayout(),
				hitLayoutId.longValue());
				href = PortalUtil.getLayoutURL(hitLayout, themeDisplay);
			} else {
				
				String redirect = themeDisplay.getURLCurrent();
				href = redirect.split("\\?")[0];
				
				Layout search_layout = LayoutLocalServiceUtil.getFriendlyURLLayout(themeDisplay.getLayout().getGroupId(), false, "/search");
				
				Group controlPanelGroup = GroupLocalServiceUtil.getGroup(themeDisplay.getCompanyId(), "Control Panel");
				long controlPanelPlid = LayoutLocalServiceUtil.getDefaultPlid(controlPanelGroup.getGroupId(), true);
				LiferayPortletURL editmyusersURL = PortletURLFactoryUtil.create(request, "101", search_layout.getPlid(), "RENDER_PHASE");
				editmyusersURL.setWindowState(WindowState.MAXIMIZED);
				editmyusersURL.setParameter("redirect", currentURL);
				editmyusersURL.setParameter("struts_action", "/asset_publisher/view_content");
				editmyusersURL.setParameter("assetEntryId", "47103");
				editmyusersURL.setParameter("type", "content");
				editmyusersURL.setParameter("urlTitle", "the-second-lpc-forum-meeting");
				String portletResource = ParamUtil.getString(request, "portletResource");
				
				PortletURL myRenderURL=renderResponse.createRenderURL();
				myRenderURL.setWindowState(WindowState.MAXIMIZED);
				myRenderURL.setParameter("redirect", currentURL);
				myRenderURL.setParameter("struts_action", "/asset_publisher/view_content");
				myRenderURL.setParameter("assetEntryId", "47103");
				myRenderURL.setParameter("type", "content");
				myRenderURL.setParameter("urlTitle", "the-second-lpc-forum-meeting");
				
	
				/*LiferayPortletURL editsitemembershipURL = PortletURLFactoryUtil.create(request, "174", controlPanelPlid, "RENDER_PHASE");
				editsitemembershipURL.setDoAsGroupId(themeDisplay.getSiteGroupId());
				editsitemembershipURL.setControlPanelCategory("current_site.users");
				editsitemembershipURL.setParameter("redirect", currentURL);
				editsitemembershipURL.setWindowState(WindowState.MAXIMIZED);*/
				
				//href = myRenderURL.toString();
				
				/*href = href.replaceAll("group", "web");
				href = href.replaceAll("control_panel", "guest");
				href = href.replaceAll("manage", "search");*/
				//continue;
				href = "about/-/asset_publisher/ZJa3Watm6LHZ/content/" + assetRenderer.getUrlTitle();
			}
	} else if(class_type_id.equalsIgnoreCase("10822")) {
		class_type_id = "News";
		image_url = request.getContextPath() + "/images/news.png";
		href = "/web/guest/news/-/asset_publisher/V6WfCYIg8I5M/content/" + assetRenderer.getUrlTitle();
	} else if(class_type_id.equalsIgnoreCase("12029")) {
		class_type_id = "Event";
		image_url = request.getContextPath() + "/images/event.png";
		href = "/web/guest/meetings/-/asset_publisher/arvlkkWh2955/content/" + assetRenderer.getUrlTitle();
	}
%>
	<div class="bbmri-eric-search-container">
	  <div class="bbmri-eric-search-images">
	     <a href="<%= href %>" target="<%= target %>"><img src="<%= image_url %>" height="30px" width="31px" /></a>
	  </div>
	  <div class="bbmri-eric-search-result">
		<a href="<%= href %>" target="<%= target %>"><h3><%= title %></h3></a>
		<%= content %>
		</div>
	</div>
	<br>
<%	
	
}

%>
	
<%
/*

for(Document d : docs2) {
%>
<hr>
<div style="border-style:solid;border-width:3px;">
Documnet Name:<%= d.get(locale, Field.TITLE) %><br>
<%	
	
	Map<String, Field> fieldmap = d.getFields();
	for(String key : fieldmap.keySet()) {
		Field f = fieldmap.get(key);
		String value = f.getValue();
		if((key.contains("ddm/10822/HTML") && !key.endsWith("en_US ")) || (key.contains("ddm/12029/HTML") && !key.endsWith("en_US "))) {
			value = "yy";
		}
%>
		<%= key %> - <%= f.getName() %> - <%= value %> <br>
<%
	}
	
%>
</div>
<%
}
*/
%>



