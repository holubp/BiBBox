package at.meduni.liferay.portlet.rdconnect;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;
import java.net.URLEncoder;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.service.RDConnectEventLocalServiceUtil;
import at.meduni.liferay.portlet.rdconnect.model.MasterCandidate;
import at.meduni.liferay.portlet.rdconnect.service.MasterCandidateLocalServiceUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ClassName;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutConstants;
import com.liferay.portal.model.LayoutSet;
import com.liferay.portal.model.LayoutSetPrototype;
import com.liferay.portal.model.Organization;
import com.liferay.portal.service.AddressLocalServiceUtil;
import com.liferay.portal.service.ClassNameLocalServiceUtil;
import com.liferay.portal.service.EmailAddressLocalServiceUtil;
import com.liferay.portal.service.GroupLocalService;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.LayoutSetLocalServiceUtil;
import com.liferay.portal.service.LayoutSetPrototypeLocalServiceUtil;
import com.liferay.portal.service.LayoutSetPrototypeServiceUtil;
import com.liferay.portal.service.LayoutSetServiceUtil;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.RoleLocalService;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserGroupRoleLocalServiceUtil;
import com.liferay.portal.service.UserGroupRoleServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.service.WebsiteLocalServiceUtil;
import com.liferay.portal.service.WebsiteServiceUtil;
import com.liferay.portal.service.persistence.CountryUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.FriendlyURLNormalizerUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Account;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.EmailAddress;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutConstants;
import com.liferay.portal.model.LayoutTypePortlet;
import com.liferay.portal.model.ListTypeConstants;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.OrganizationConstants;
import com.liferay.portal.model.Phone;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.Address;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserGroupRole;
import com.liferay.portal.model.Website;
import com.liferay.portal.service.AccountLocalServiceUtil;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortletKeys;
import com.liferay.portlet.dynamicdatalists.model.DDLRecord;
import com.liferay.portlet.dynamicdatalists.model.DDLRecordConstants;
import com.liferay.portlet.dynamicdatalists.model.DDLRecordSet;
import com.liferay.portlet.dynamicdatalists.model.DDLRecordSetConstants;
import com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalServiceUtil;
import com.liferay.portlet.dynamicdatalists.service.DDLRecordServiceUtil;
import com.liferay.portlet.dynamicdatalists.service.DDLRecordSetLocalServiceUtil;
import com.liferay.portlet.dynamicdatalists.service.DDLRecordSetServiceUtil;
import com.liferay.portlet.dynamicdatamapping.model.DDMStructure;
import com.liferay.portlet.dynamicdatamapping.storage.Fields;
import com.liferay.portlet.dynamicdatamapping.storage.Field;
import com.liferay.portlet.dynamicdatamapping.util.DDMUtil;
import com.liferay.portlet.sites.util.SitesUtil;
import com.liferay.portlet.usersadmin.util.UsersAdminUtil;
import com.liferay.portal.security.membershippolicy.OrganizationMembershipPolicyFactoryUtil;

/**
 * Portlet implementation class MasterPublish
 */
public class MasterPublish extends MVCPortlet {
	
	String counter = "15";
	Locale default_locale_ = null;
	final String alphabet_ = "abcdefghijklmopqrstuvwxyz";
    final int N_ = alphabet_.length();
    Random random_ = new Random();
    //long ORGANISATION_ADMIN_ROLL = 22956; // local 10166 Server 22956
    //long ADMIN_ROLL = 22951;
    long BIOBANK_REG_EDITOR = 13322;
    //long BIOBANK_REG_MEMBER = 32821;
    long BIOBANK_REG_OWNER = 13321;
    long BiobanK_REG_MAINCONTACT = 13320;
    
    long BIOBANK_ASSESSMENT_ORGANIZATION = 26616;
    long CATALOGUE_ORGANIZATION = 10709;
    // Web page
    int PUBLICWEBSITETYPEID = 12020; // Public: 12020
    int INTRANETWEBSITETYPEID = 12019; // Public: 12020
    // E-mail
    int EMAILADDRESS_TYPEID = 12004;
    // Address
    int ADDRESS_BILLING = 12000;
    int ADDRESS_OTHER = 12001;
    int ADDRESS_POBOX = 12002;
    int ADDRESS_SHIPPING = 12003;
	
	public void publishToGate(ActionRequest request, ActionResponse response, MasterCandidate master) throws Exception {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		default_locale_ = themeDisplay.getLocale();
		long companyId = themeDisplay.getCompanyId();
		Organization organization = null;
		
		try {
			Company company = CompanyLocalServiceUtil.getCompanyById(companyId);
			// Create Organisation
			organization = createOrganisation(company, master);
			
			
			// Update Master
			master.setOrganisationid(organization.getOrganizationId());
			master.setState("P");
			MasterCandidateLocalServiceUtil.updateMasterCandidate(master);
			// Create Users
			createUsersFromMaster(organization, company, master.getMail(), master.getContactperson(), master.getHead());
			// Create DDL Elements
			createDDLs(request, organization, master);
			// Create Organisation Pages
			createPages(organization);
			// Add Organisation details
			addOrganisationDetails(organization, master, themeDisplay.getUserId());
			
			OrganizationLocalServiceUtil.rebuildTree(company.getCompanyId());
			
			organization.getExpandoBridge().setAttribute("Organization Type", master.getCandidatetype());
		} catch(Exception e) {
			System.out.println("RDC Exception in MasterPublish:publishToGate");
			e.printStackTrace();
		}	
		
		try {
			String shorttext = "";
			String longtext = "";
			String link = "";
			String restricted = "";
			String eventtitle = "";
			
			String orgPath = themeDisplay.getURLPortal()+"/web"+organization.getGroup().getFriendlyURL();
			
			if(master.getCandidatetype().equalsIgnoreCase("Biobank")) {
				eventtitle = "New Biobank Published: " + organization.getName();
				restricted = "RD-Connect CURATOR";
				link = link + "/bb_home";
				shorttext = "Biobank "+ organization.getName() + " from " + master.getCountry() + " was published an is now in the list redy for the pannel assessment invitation.";
				longtext = "";
			} else {
				eventtitle = "New Registry Published: " + organization.getName();
				restricted = "";
				link = link + "/reg_home";
				shorttext = "Registry "+ organization.getName() + " from " + master.getCountry() + " was published an is now listed in the catalouge.";
				longtext = "";
			}
			addEventEntry(new Date(), organization.getOrganizationId(), themeDisplay.getUserId(), shorttext, longtext, link, restricted, eventtitle);
		} catch(Exception e) {
			System.out.println("RDC Exception in MasterPublish:publishToGate -> Add Event");
			e.printStackTrace();
		}
	}
	
	/**
	 * Add event entry
	 * 
	 * @param eventdate
	 * @param organizationId
	 * @param userId
	 * @param shorttext
	 * @param longtext
	 * @param link
	 * @param restricted
	 */
	private void addEventEntry(Date eventdate, long organizationId, long userId, String shorttext, String longtext, String link, String restricted, String eventtitle) {
		RDConnectEventLocalServiceUtil.createEvent(eventtitle, eventdate, organizationId, userId, shorttext, longtext, link, restricted);
	}
	
	private void addOrganisationDetails(Organization organization, MasterCandidate master, long userid) {
		addWebpageToOrganisation(organization, master);
		addEmailAddressToOrganisation(organization, master);
		addAddressToOrganisation(organization, master, userid);
	}
	
	private void addEmailAddressToOrganisation(Organization organization, MasterCandidate master) {
		try {
			List<EmailAddress> emailAddresses = new ArrayList<EmailAddress>();
			String pattern_string_mail_ = "\\b([a-zA-Z0-9._%+-]+@([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4})*)\\b";
			Pattern pattern_mail_ = Pattern.compile(pattern_string_mail_);
			
			ServiceContext serviceContext = new ServiceContext();
	        serviceContext.setAddGroupPermissions(true);
	        serviceContext.setAddGuestPermissions(true);
			
			HashSet<String> mails = new HashSet<String>();
			Matcher matcher = pattern_mail_.matcher(master.getMail().replaceAll("mailto:", ""));
			while (matcher.find()) {
				if(!mails.contains(matcher.group().toLowerCase()))
					mails.add(matcher.group().toLowerCase());
			}
			matcher = pattern_mail_.matcher(master.getContactperson().replaceAll("mailto:", ""));
			while (matcher.find()) {
				if(!mails.contains(matcher.group().toLowerCase()))
					mails.add(matcher.group().toLowerCase());
			}
			matcher = pattern_mail_.matcher(master.getHead().replaceAll("mailto:", ""));
			while (matcher.find()) {
				if(!mails.contains(matcher.group().toLowerCase()))
					mails.add(matcher.group().toLowerCase());
			}
			
			boolean primary = true;
			for(String mail : mails) {
				EmailAddress emailAddress = EmailAddressLocalServiceUtil.createEmailAddress(0);

				emailAddress.setAddress(mail);
				emailAddress.setTypeId(EMAILADDRESS_TYPEID);
				emailAddress.setPrimary(primary);
				primary = false;
				emailAddresses.add(emailAddress);
			}
			UsersAdminUtil.updateEmailAddresses(Organization.class.getName(), organization.getOrganizationId(), emailAddresses);
		} catch (PortalException e) {
			System.out.println("RDC Exception MasterPublish::addEmailAddressToOrganisation");
			System.out.println("PortalException");
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("RDC Exception MasterPublish::addEmailAddressToOrganisation");
			System.out.println("SystemException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("RDC Exception MasterPublish::addEmailAddressToOrganisation");
			e.printStackTrace();
		}
	}
	
	private void addPhoneToOrganisation(Organization organization, MasterCandidate master) {
		try {
			List<Phone> phones = new ArrayList<Phone>();
			UsersAdminUtil.updatePhones(Organization.class.getName(), organization.getOrganizationId(), phones);
		} catch (PortalException e) {
			System.out.println("RDC Exception MasterPublish::addPhoneToOrganisation");
			System.out.println("PortalException");
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("RDC Exception MasterPublish::addPhoneToOrganisation");
			System.out.println("SystemException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("RDC Exception MasterPublish::addPhoneToOrganisation");
			e.printStackTrace();
		}
	}
	
	private void addAddressToOrganisation(Organization organization, MasterCandidate master, long userid) {
		try {
			List<Address> addresses = new ArrayList<Address>();
			String street1 = "-";
			String street2 = "";
			String street3 = "";
			String city = "-";
			String zip = "-";
			
			if(!master.getAddress().equalsIgnoreCase("")){ 
				int end = 0;
				int start = 0;
				if(master.getAddress().length() <= 75) {
					street1 = master.getAddress();
				} else if (master.getAddress().length() > 75 && master.getAddress().length() <= 150) {
					end = master.getAddress().substring(start, 75).lastIndexOf(" ");
					street1 = master.getAddress().substring(start, end);
				} else if (master.getAddress().length() > 150 && master.getAddress().length() <= 225) {
					end = master.getAddress().substring(start, 75).lastIndexOf(" ");				
					street1 = master.getAddress().substring(start, end);
					start = end;
					end = start + master.getAddress().substring(start, end+75).lastIndexOf(" ");
					street2 = master.getAddress().substring(start, end);
					if(end < master.getAddress().length())
						street3 = master.getAddress().substring(end);
				} else if (master.getAddress().length() > 225) {
					end = master.getAddress().substring(start, 75).lastIndexOf(" ");
					street1 = master.getAddress().substring(start, end);
					start = end;
					end = start + master.getAddress().substring(start, end+75).lastIndexOf(" ");
					street2 = master.getAddress().substring(start, end);
					start = end;
					end = start + master.getAddress().substring(start, start+75).lastIndexOf(" ");
					street3 = master.getAddress().substring(start, end);
				}
			}
			
			int typeId = ADDRESS_OTHER;
			long regionId = 0;
			long countryId = 0;
			boolean mailing = false;
			boolean primary = true;
			addresses.add(AddressLocalServiceUtil.addAddress(userid, Organization.class.getName(), organization.getOrganizationId(), street1, street2, street3, city, zip, 
					regionId, countryId, typeId, mailing, primary, new ServiceContext()));
			UsersAdminUtil.updateAddresses(Organization.class.getName(), organization.getOrganizationId(), addresses);
		} catch (PortalException e) {
			System.out.println("RDC Exception MasterPublish::addAddressToOrganisation");
			System.out.println("PortalException");
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("RDC Exception MasterPublish::addAddressToOrganisation");
			System.out.println("SystemException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("RDC Exception MasterPublish::addAddressToOrganisation");
			e.printStackTrace();
		}
	}
	
	private void addWebpageToOrganisation(Organization organization, MasterCandidate master) {
		try {
			List<Website> websites = new ArrayList<Website>();
			String[] urls = master.getUrl().split("[,; ]");
			boolean primary = true;
			for(String url : urls) {
				url = url.trim();
				if(url.length() == 0)
					continue;
				if(!url.startsWith("http"))
					url = "http://" + url;
				Website website = WebsiteLocalServiceUtil.createWebsite(0);
				website.setUrl(url);
				website.setTypeId(PUBLICWEBSITETYPEID);
				website.setPrimary(primary);
				primary = false;
				websites.add(website);
			}
			UsersAdminUtil.updateWebsites(Organization.class.getName(), organization.getOrganizationId(), websites);
		} catch (PortalException e) {
			System.out.println("RDC Exception MasterPublish::addWebpageToOrganisation");
			System.out.println("PortalException");
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("RDC Exception MasterPublish::addWebpageToOrganisation");
			System.out.println("SystemException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("RDC Exception MasterPublish::addWebpageToOrganisation");
			e.printStackTrace();
		}
	}
	
	private Organization createOrganisation(Company company, MasterCandidate master) throws PortalException, SystemException {
		try {
			// Create Organisation		
			User defaultUser = company.getDefaultUser();
			
			long userId = company.getDefaultUser().getUserId();
	        long parentOrganizationId = OrganizationConstants.DEFAULT_PARENT_ORGANIZATION_ID;
	        if(master.getCandidatetype().equalsIgnoreCase("biobank")) {
	        	parentOrganizationId = BIOBANK_ASSESSMENT_ORGANIZATION;
	        } else {
	        	parentOrganizationId = CATALOGUE_ORGANIZATION;
	        }
	        String name = master.getName();
	        if(name.length() > 100) {
	        	name = name.substring(0, 100);
	        }
	        String type = OrganizationConstants.TYPE_REGULAR_ORGANIZATION;
	        boolean recursable = true;
	        long regionId = 0;
	        long countryId = 0;
	        int statusId = GetterUtil.getInteger(PropsUtil.get(
	                "sql.data.com.liferay.portal.model.ListType.organization.status"));
	        String comments = null;
	
	        ServiceContext serviceContext = new ServiceContext();
	
	        serviceContext.setAddGroupPermissions(true);
	        serviceContext.setAddGuestPermissions(true);
	        
	        boolean site = true;
	
	        Organization organization =
	                OrganizationLocalServiceUtil.addOrganization(userId, parentOrganizationId, name, type, regionId, countryId, 
	                		statusId, comments, site, serviceContext);
	        
	        Group group = organization.getGroup();
	        serviceContext.setScopeGroupId(group.getGroupId());
	        
			return organization;
		} catch (Exception e) {
			System.out.println("RDC Exception in MasterPublish:createOrganisation");
			e.printStackTrace();
		}
		return null;
	}
	
	private void createUsersFromMaster(Organization organization, Company company, String emails, String contactperson, String head) {
		String pattern_string_mail_ = "\\b([a-zA-Z0-9._%+-]+@([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4})*)\\b";
		Pattern pattern_mail_ = Pattern.compile(pattern_string_mail_);
		
		ServiceContext serviceContext = new ServiceContext();
        serviceContext.setAddGroupPermissions(true);
        serviceContext.setAddGuestPermissions(true);
		
		HashSet<String> mails = new HashSet<String>();
		Matcher matcher = pattern_mail_.matcher(emails.replaceAll("mailto:", ""));
		while (matcher.find()) {
			if(!mails.contains(matcher.group().toLowerCase()))
				mails.add(matcher.group().toLowerCase());
		}
		matcher = pattern_mail_.matcher(contactperson.replaceAll("mailto:", ""));
		while (matcher.find()) {
			if(!mails.contains(matcher.group().toLowerCase()))
				mails.add(matcher.group().toLowerCase());
		}
		matcher = pattern_mail_.matcher(head.replaceAll("mailto:", ""));
		while (matcher.find()) {
			if(!mails.contains(matcher.group().toLowerCase()))
				mails.add(matcher.group().toLowerCase());
		}
		
		boolean first = true;
		for(String mail : mails) {
			try {
				addUsersToOrganisation(organization, company, mail, serviceContext, first);
				first = false;
			} catch (SystemException e) {
				System.out.println("RDC Exception in MasterPublish:createUsersFromMaster");
				System.out.println("Could not create USER");
				e.printStackTrace();
			} catch (PortalException e) {
				System.out.println("RDC Exception in MasterPublish:createUsersFromMaster");
				System.out.println("Could not create USER");
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("RDC Exception in MasterPublish:createUsersFromMaster");
				System.out.println("Could not create USER");
				e.printStackTrace();
			}
		}
	}
	
	private void addUsersToOrganisation(Organization organization, Company company, String mail, ServiceContext serviceContext, boolean first) throws SystemException, PortalException {
		// Create User
		User user = UserLocalServiceUtil.fetchUserByEmailAddress(company.getCompanyId(), mail);
		if (user == null) {
			user = createUser(user, company, mail, organization, serviceContext);
		} else {
			OrganizationLocalServiceUtil.addUserOrganization(user.getUserId(), organization);
		}
		long[] userids = {user.getUserId()};
		UserGroupRoleLocalServiceUtil.addUserGroupRoles(userids, organization.getGroupId(), BIOBANK_REG_EDITOR);
		UserGroupRoleLocalServiceUtil.addUserGroupRoles(userids, organization.getGroupId(), BIOBANK_REG_OWNER);
		if(first) {
			UserGroupRoleLocalServiceUtil.addUserGroupRoles(userids, organization.getGroupId(), BiobanK_REG_MAINCONTACT);
		}
	}
	
	private User createUser(User user, Company company, String mail, Organization organization, ServiceContext serviceContext) throws PortalException, SystemException {
		boolean autoPassword = false;
		String password1 = "rdc2015";
		boolean autoScreenName = true;
		String screenName = "";
		long facebookId = 0;
		String openId = "";
		String firstName = getFirstnameFromMail(mail);
		String middleName = "";
		String lastName = getLastnameFromMail(mail);
		int prefixId = 0;
		int suffixId = 0;
		int birthdayMonth = 1;
		int birthdayDay = 1;
		int birthdayYear = 1970;
		String jobTitle = "";
		long[] groupIds = new long[0];
		long[] organizationIds = {organization.getOrganizationId()};
		long[] roleIds = new long[0];
		long[] userGroupIds = new long[0];
		boolean male = false;
		boolean sendEmail = false;
		user = UserLocalServiceUtil.addUser(company.getDefaultUser().getUserId(), company.getCompanyId(), autoPassword, password1, password1, 
				autoScreenName, screenName, mail, facebookId, openId, default_locale_, firstName, middleName, lastName, 
				prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds, userGroupIds, sendEmail, serviceContext);
		user.setPasswordReset(false);
		UserLocalServiceUtil.updateUser(user);
		return user;
	}
	
	private String getFirstnameFromMail(String mail) {
		String name = "";
		String[] split1 = mail.split("@");
		if(split1.length > 0) {
			String[] split2 = split1[0].split("[\\._]");
			if(split2.length > 0) {
				name = split2[0];
			}
		}
		return getNameStringFormat(name);
	}
	
	private String getLastnameFromMail(String mail) {
		String name = "";
		String[] split1 = mail.split("@");
		if(split1.length > 0) {
			String[] split2 = split1[0].split("[\\._]");
			if(split2.length > 1) {
				name = split2[1];
			}
		}
		return getNameStringFormat(name);
	}
	
	private String getNameStringFormat(String name) {
		if(name.length() > 1) {
			name = name.substring(0, 1).toUpperCase() + name.substring(1);
		} else if(name.length() == 1) {
			name = name.substring(0, 1).toUpperCase();
		}
		System.out.println("Name: " + name);
		return name;
	}
	
	private void createPages(Organization organization) throws Exception {
		try {
			// Create Public Pages
			long publicLayoutSetPrototypeId = 10717; 
			boolean publicLayoutSetPrototypeLinkEnabled = true;
			boolean isPrivateLayout = false;
			long privateLayoutSetPrototypeId = 0;
			boolean privateLayoutSetPrototypeLinkEnabled = false;
					
			Group organizationGroup = organization.getGroup();
			
			long groupId = organizationGroup.getGroupId();
		    LayoutSetPrototype prototype = LayoutSetPrototypeLocalServiceUtil.getLayoutSetPrototype(publicLayoutSetPrototypeId);
		    boolean layoutSetPrototypeLinkEnabled = true;
		    LayoutSetLocalServiceUtil.updateLayoutSetPrototypeLinkEnabled(groupId, isPrivateLayout,
		            layoutSetPrototypeLinkEnabled, prototype.getUuid());
		    
		    LayoutSet layoutSet = LayoutSetLocalServiceUtil.getLayoutSet(groupId, isPrivateLayout);
		    SitesUtil.mergeLayoutSetPrototypeLayouts(organizationGroup, layoutSet);
			
			/*SitesUtil.updateLayoutSetPrototypesLinks(organizationGroup, publicLayoutSetPrototypeId,
							privateLayoutSetPrototypeId,
							publicLayoutSetPrototypeLinkEnabled,
							privateLayoutSetPrototypeLinkEnabled);
			SitesUtil.mergeLayoutSetPrototypeLayouts(organizationGroup, LayoutSetLocalServiceUtil.getLayoutSet(organizationGroup.getGroupId(), false));*/
		} catch (Exception e) {
			System.out.println("RDC Exception - MasterPublish::createPages");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		// Update Logo
		//boolean privateLayout = true;
		
		//String url = "http://localhost:8080/documents/10194/0/Biobank/a7b1fd67-d959-4170-9ea4-2139ed7b6047?t=1390941119698";
	    //File logo = new File(url);    
		//LayoutSetServiceUtil.updateLogo(organization.getGroupId(), privateLayout, true, logo);//organizationGroup.getGroupId()
		/*privateLayout = false;
		LayoutSetServiceUtil.updateLogo(organization.getGroupId(), privateLayout, true, logo);*/
	}
	
	private void createDDLs(ActionRequest request, Organization organization, MasterCandidate master) throws PortalException, SystemException {
		ServiceContext serviceContext = new ServiceContext();

        serviceContext.setAddGroupPermissions(true);
        serviceContext.setAddGuestPermissions(true);
        Group group = organization.getGroup();
        serviceContext.setScopeGroupId(group.getGroupId());
        
        serviceContext.setUserId(organization.getUserId());
        
		ServiceContext serviceContextRecord = serviceContext;
		long groupId = organization.getGroupId();
		// create Registry Core (name Core) core | ID 16059 
		try {
			DDLRecordSet recordSet = createRecordSet(request, organization, "core", 16059, serviceContext);
			creatRecordCore(recordSet, groupId, serviceContextRecord, master);
		} catch (PortalException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create core");
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create core");
			e.printStackTrace();
		}
		// create Biobank Core (name bb_core) core | ID 32327 
				try {
					DDLRecordSet recordSet = createRecordSet(request, organization, "bb_core", 32327, serviceContext);
					creatRecordCore(recordSet, groupId, serviceContextRecord, master);
				} catch (PortalException e) {
					System.out.println("RDC Exception in MasterPublish:createDDLs");
					System.out.println("Could not create core");
					e.printStackTrace();
				} catch (SystemException e) {
					System.out.println("RDC Exception in MasterPublish:createDDLs");
					System.out.println("Could not create core");
					e.printStackTrace();
				}
		// create  	reg_quality | ID 23725
		try {
			DDLRecordSet recordSet = createRecordSet(request, organization, "reg_quality", 23725, serviceContext);
			creatRecordQualityIndicator(recordSet, groupId, serviceContextRecord, master);
		} catch (PortalException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Quality Indicators");
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Quality Indicators");
			e.printStackTrace();
		}
		// create bb_quality | ID 32325
		try {
			DDLRecordSet recordSet = createRecordSet(request, organization, "bb_quality", 32325, serviceContext);
			creatRecordQualityIndicator(recordSet, groupId, serviceContextRecord, master);
		} catch (PortalException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Quality Indicators");
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Quality Indicators");
			e.printStackTrace();
		}
		// create Disease Areas (ICD10) | ID 32329
		try {
			DDLRecordSet recordSet = createRecordSet(request, organization, "Disease Areas (ICD10)", 32329, serviceContext);
			creatRecordDiseaseAreas(recordSet, groupId, serviceContextRecord, master);
		} catch (PortalException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Disease Areas (ICD10)");
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Disease Areas (ICD10)");
			e.printStackTrace();
		}
		// create reg_accessibility | ID 22594
		try {
			DDLRecordSet recordSet = createRecordSet(request, organization, "reg_accessibility", 22594, serviceContext);
			creatRecordAccesability(recordSet, groupId, serviceContextRecord, master);
		} catch (PortalException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Accessibility");
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Accessibility");
			e.printStackTrace();
		}
		// create bb_accessibility | ID 32323
		try {
			DDLRecordSet recordSet = createRecordSet(request, organization, "bb_accessibility", 32323, serviceContext);
			creatRecordAccesability(recordSet, groupId, serviceContextRecord, master);
		} catch (PortalException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Accessibility");
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Accessibility");
			e.printStackTrace();
		}
		// create Scientific publications | ID 32331
		try {
			createRecordSet(request, organization, "Scientific publications", 32331, serviceContext);
		} catch (PortalException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Sample Matrix");
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Sample Matrix");
			e.printStackTrace();
		}
		// create bb_contribution | ID 32333
		try {
			DDLRecordSet recordSet = createRecordSet(request, organization, "bb_contribution", 32333, serviceContext);
			creatRecord(recordSet, groupId, serviceContextRecord, master);
		} catch (PortalException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Sample Matrix");
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("RDC Exception in MasterPublish:createDDLs");
			System.out.println("Could not create Sample Matrix");
			e.printStackTrace();
		}
	}
	
	private DDLRecordSet createRecordSet(ActionRequest request, Organization organization, String name, long ddmStructureId, ServiceContext serviceContext) throws PortalException, SystemException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = organization.getGroupId();
		String recordSetKey = null;
		int scope = 0;
		String[] languageid = {"0"};
		String[] names = {name};
		String[] description = {name};
		Map<Locale,String> nameMap = LocalizationUtil.getLocalizationMap(languageid, names);
		Map<Locale,String> descriptionMap = LocalizationUtil.getLocalizationMap(languageid, description);

		DDLRecordSet recordSet = DDLRecordSetLocalServiceUtil.addRecordSet(themeDisplay.getUserId(), groupId, ddmStructureId, recordSetKey, nameMap, 
				descriptionMap, DDLRecordSetConstants.MIN_DISPLAY_ROWS_DEFAULT, scope, serviceContext);
		return recordSet;
	}
	
	private String randomIdGenerator() {
		String id = "_INSTANCE_";
	    for (int i = 0; i < 4; i++) {
	    	id += alphabet_.charAt(random_.nextInt(N_));
	    }
	    return id;
	}
	
	private void creatRecordCore(DDLRecordSet recordSet, long groupId, ServiceContext serviceContext, MasterCandidate master) throws PortalException, SystemException {
		try {
			DDMStructure ddmStructure = recordSet.getDDMStructure();		
			Fields fields = DDMUtil.getFields(recordSet.getDDMStructureId(), serviceContext);	
			// Define Fields
			Field field_acronym = new Field("acronym", master.getCandidatesubtype());
			fields.put(field_acronym);
			Field field_description = new Field("Description", "");
			fields.put(field_description);
			Field field_countryCode = new Field("countryCode", master.getCountry());
			fields.put(field_countryCode);
			DDLRecord record = DDLRecordLocalServiceUtil.addRecord(
				serviceContext.getUserId(),
				serviceContext.getScopeGroupId(), recordSet.getRecordSetId(),
				DDLRecordConstants.DISPLAY_INDEX_DEFAULT, fields,
				serviceContext);
		} catch(Exception e) {
			System.out.println("RDC Exception Core");
			e.printStackTrace();
		}
	}
	
	private void creatRecordQualityIndicator(DDLRecordSet recordSet, long groupId, ServiceContext serviceContext, MasterCandidate master) throws PortalException, SystemException {
		try {
			DDMStructure ddmStructure = recordSet.getDDMStructure();		
			Fields fields = DDMUtil.getFields(recordSet.getDDMStructureId(), serviceContext);	
			DDLRecord record = DDLRecordLocalServiceUtil.addRecord(
					serviceContext.getUserId(),
					serviceContext.getScopeGroupId(), recordSet.getRecordSetId(),
					DDLRecordConstants.DISPLAY_INDEX_DEFAULT, fields,
					serviceContext);
		} catch(Exception e) {
			System.out.println("RDC Exception QualityIndicator");
			e.printStackTrace();
		}
	}
	
	private void creatRecord(DDLRecordSet recordSet, long groupId, ServiceContext serviceContext, MasterCandidate master) throws PortalException, SystemException {
		try {
			DDMStructure ddmStructure = recordSet.getDDMStructure();		
			Fields fields = DDMUtil.getFields(recordSet.getDDMStructureId(), serviceContext);	
			DDLRecord record = DDLRecordLocalServiceUtil.addRecord(
					serviceContext.getUserId(),
					serviceContext.getScopeGroupId(), recordSet.getRecordSetId(),
					DDLRecordConstants.DISPLAY_INDEX_DEFAULT, fields,
					serviceContext);
		} catch(Exception e) {
			System.out.println("RDC Exception creatRecord " + recordSet.getName());
			e.printStackTrace();
		}
	}
	
	private void creatRecordDiseaseAreas(DDLRecordSet recordSet, long groupId, ServiceContext serviceContext, MasterCandidate master) throws PortalException, SystemException {
		try {
			DDMStructure ddmStructure = recordSet.getDDMStructure();		
			Fields fields = DDMUtil.getFields(recordSet.getDDMStructureId(), serviceContext);	
			DDLRecord record = DDLRecordLocalServiceUtil.addRecord(
					serviceContext.getUserId(),
					serviceContext.getScopeGroupId(), recordSet.getRecordSetId(),
					DDLRecordConstants.DISPLAY_INDEX_DEFAULT, fields,
					serviceContext);
		} catch(Exception e) {
			System.out.println("RDC Exception DiseaseAreas");
			e.printStackTrace();
		}
	}
	
	private void creatRecordAccesability(DDLRecordSet recordSet, long groupId, ServiceContext serviceContext, MasterCandidate master) throws PortalException, SystemException {
		try {
			DDMStructure ddmStructure = recordSet.getDDMStructure();		
			Fields fields = DDMUtil.getFields(recordSet.getDDMStructureId(), serviceContext);	
			DDLRecord record = DDLRecordLocalServiceUtil.addRecord(
					serviceContext.getUserId(),
					serviceContext.getScopeGroupId(), recordSet.getRecordSetId(),
					DDLRecordConstants.DISPLAY_INDEX_DEFAULT, fields,
					serviceContext);
		} catch(Exception e) {
			System.out.println("RDC Exception Accesability");
			e.printStackTrace();
		}
	}
	
	private void creatRecordDiseaseMatrix(DDLRecordSet recordSet, long groupId, ServiceContext serviceContext, MasterCandidate master) throws PortalException, SystemException {
		String[] diseascodes = master.getDiseasescodes().split(";");
		for(String s : diseascodes) {
			try {
				DDMStructure ddmStructure = recordSet.getDDMStructure();		
				Fields fields = DDMUtil.getFields(recordSet.getDDMStructureId(), serviceContext);
				
				s = s.trim();
				
				String fieldtype = "Comment";
				if(s.contains("orpha") || s.contains("ORPHA")) {
					fieldtype = "Orphanet_Number";
				}
				if(s.matches("\\w\\d\\d\\.\\d") || s.matches("\\w\\d\\d") || s.matches("ICD10:\\w\\d\\d\\.\\d") || s.matches("ICD10:\\w\\d\\d")) {
					fieldtype = "ICD10";
				}
				if(s.matches("\\d{6}") || s.matches("OMIM:\\d{6}") || s.matches("OMIM\\d{6}")) {
					fieldtype = "OMIM";
				}
				
				Field field_code = new Field(fieldtype, s);
				fields.put(field_code);
				DDLRecord record = DDLRecordLocalServiceUtil.addRecord(
						serviceContext.getUserId(),
						serviceContext.getScopeGroupId(), recordSet.getRecordSetId(),
						DDLRecordConstants.DISPLAY_INDEX_DEFAULT, fields,
						serviceContext);
			} catch(Exception e) {
				System.out.println("RDC Exception DiseaseMatrix");
				e.printStackTrace();
			}
		}
		diseascodes = master.getDiseasesfreetext().split(";");
		for(String s : diseascodes) {
			try {
				DDMStructure ddmStructure = recordSet.getDDMStructure();		
				Fields fields = DDMUtil.getFields(recordSet.getDDMStructureId(), serviceContext);
					
				Field field_code = new Field("Name", s);
				fields.put(field_code);
				DDLRecord record = DDLRecordLocalServiceUtil.addRecord(
						serviceContext.getUserId(),
						serviceContext.getScopeGroupId(), recordSet.getRecordSetId(),
						DDLRecordConstants.DISPLAY_INDEX_DEFAULT, fields,
						serviceContext);
			} catch(Exception e) {
				System.out.println("RDC Exception DiseaseMatrix");
				e.printStackTrace();
			}
		}
	}
	
	
	// --------------------------------------------------------------------
	public void deleteOrganisation(long organisationid) throws PortalException, SystemException {
		try {
		Organization organization = OrganizationLocalServiceUtil.getOrganization(organisationid);
		List<User> userlist = UserLocalServiceUtil.getOrganizationUsers(organization.getOrganizationId());
		for(User u : userlist) {
			OrganizationLocalServiceUtil.deleteUserOrganization(u.getUserId(), organization);
		}
		OrganizationLocalServiceUtil.deleteOrganization(organization);
		} catch(Exception e) {
			System.out.println("RDC Exception in MasterPublish:deleteOrganisation");
			System.out.println("Could not delete Organisation: " + organisationid);
			e.printStackTrace();
		}
	}

}
