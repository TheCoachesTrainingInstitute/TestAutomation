package test.java.com.cti.common;

import java.util.ArrayList;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.HasInputDevices;
//import org.openqa.selenium.Mouse;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
/**
 * @author Preethi
 *
 */
public class Common extends SetupBase {
    
	/* Websites */

	protected String _UK_SITE = "http://www.coaching-courses.com/";	
	protected String _MARKETING = "http://www.thecoaches.com/mktcal/index.php/main/index";
	
	/* Header xpaths */
	protected final String _HOME_LINK = "xpath=//*[@id='general']/li[2]/a";
	protected final String _COACTIVE_NETWORK_LINK = "xpath=//*[@id='general']/li[3]/a";
	protected final String _FIND_COACH_LINK = "xpath=//*[@id='general']/li[4]/a";
	protected final String _ENEWSLETTER_LINK = "xpath=//*[@id='general']/li[5]/a/abbr";
	protected final String _CONTACT_US_LINK = "xpath=//*[@id='general']/li[6]/a";
	protected final String _CART_LINK = "xpath=//*[@id='ecommerce']/li[1]/a";
	protected final String _CHECKOUT_LINK = "xpath=//*[@id='checkout']";
	protected final String _BLOG_LINK = "xpath=//*[@id='general']/li[7]/a";
	protected final String _CTI_INT_LINK = "xpath=//*[@id='general']/li[8]/a";
	
	/* Breadcrumbs */
	
	protected final String _B_HOME_LINK = "xpath=//*[@id='breadcrumbs']/p/a[1]";
	protected final String _B_LINK2 = "xpath=//*[@id='breadcrumbs']/p/a[2]";
	
	/* Sign In form */
	protected final String _USERNAME= "xpath=//*[@id='signin_username']";
	protected final String _PASSWORD= "xpath=//*[@id='signin_password']";
	protected final String _LOG_IN = "xpath=//html/body/div[3]/div/div/div[2]/form/table/tbody/tr[3]/td[2]/input";
	protected final String _TEST_USERNAME = "ping@me.com";
	protected final String _TEST_PASSWORD = "abc123";
	
	/* Sign In for Administration */
	protected final String _SIGN_IN_BTTN = "xpath=//*[@id='main']/div[2]/div[1]/form/table/tbody/tr[3]/td[2]/input";
	
	/* Footer xpaths */
	
	protected String _FOOTER = "xpath=//*[@id='footer-legal']"; 
	protected String _DISCLOSURE = "xpath=//*[@id='footer-legal']/a[2]"; 
	protected String _HOME = "xpath=//*[@id='quick-nav']/li[1]/a";
	protected String _COACTIVE_NETWORK = "xpath=//*[@id='quick-nav']/li[2]/a";
	protected String _JOBS = "xpath=//*[@id='quick-nav']/li[3]/a";
	protected String _CONTACT_US = "xpath=//*[@id='quick-nav']/li[4]/a";
	
	/* Sub-Menus xpath */
	protected final String _WHY_CTI                 = "xpath=//*[@id='nav-sub-why-cti']/a[@href='http://www.thecoaches.com/why-cti']";
	protected final String _COACH_TRAINING          = "xpath=//*[@id='nav-sub-coach-training']/a[@href='http://www.thecoaches.com/coach-training']";
	protected final String _LEADERSHIP              = "xpath=//*[@id='nav-sub-leadership']/a[@href='http://www.thecoaches.com/leadership']";
	protected final String _FOR_ORGANIZATIONS       = "xpath=//*[@id='nav-sub-for-organizations']/a[@href='http://www.thecoaches.com/for-organizations']";
	protected final String _COMMUNITY               = "xpath=//*[@id='nav-sub-community']/a[@href='http://www.thecoaches.com/community']";
	
	protected final String _ABOUT_CTI_SUBMENU               = "xpath=//*[@id='nav-sub-about-cti']/a";
	protected final String _WHAT_IS_COACTIVE_SUBMENU        = "xpath=//*[@id='nav-sub-what-is-co-active']/a";
	protected final String _MANAGEMENT_TEAM_SUBMENU         = "xpath=//*[@id='nav-sub-management']/a";
	protected final String _FACULTY_SUBMENU                 = "xpath=//*[@id='nav-sub-faculty']/a";
	protected final String _BUY_THEBOOK_SUBMENU             = "xpath=//*[@id='nav-sub-buy-the-book']/a"; 
	protected final String _ACCREDITATIONS_SUBMENU          = "xpath=//*[@id='nav-sub-accreditation-faqs']/a";
	
	protected final String _CTI_INTERNATIONAL_SUBMENU       = "xpath=//*[@id='nav-sub-cti-international']/a";
	protected final String _CORE_COURSES_SUBMENU            = "xpath=//*[@id='nav-sub-courses']/a";
	protected final String _CERTIFICATION_SUBMENU           = "xpath=//*[@id='nav-sub-certification']/a";
	protected final String _DATES_LOCATIONS_SUBMENU         = "xpath=//*[@id='nav-sub-dates-locations']/a";
	protected final String _PRICING_REGISTRATION_SUBMENU    = "xpath=//*[@id='nav-sub-pricing-registration']/a";
	protected final String _COACHTRAINING_FACULTY_SUBMENU   = "xpath=//*[@id='nav-sub-faculty']/a";
	protected final String _FAQS_SUBMENU                    = "xpath=//*[@id='nav-sub-faqs']/a";
	protected final String _COLLEGE_EQUIVALENCE_SUBMENU     = "xpath=//*[@id='nav-sub-college-equivalence']/a";
	protected final String _PROFILES_SUBMENU                = "xpath=//*[@id='nav-sub-profiles-testimonials']/a";
	protected final String _RESOURCES_SUBMENU               = "xpath=//*[@id='nav-sub-resources']/a";
	protected final String _BUSINESS_SUCCESS_TRAINING_SUBMENU= "xpath=//*[@id='nav-sub-business-success-training']/a";
	protected final String _BUILDING_BUSINESS_SUBMENU 	    = "xpath=//*[@id='nav-sub-building-business']/a";
	protected final String _ASSISTING_SUBMENU               = "xpath=//*[@id='nav-sub-assisting']/a";
	
	protected final String _ORG_INTERNAL_COACTIVECOACH_SUBMENU = "xpath=//*[@id='nav-sub-internal-co-active-coach']/a";
	protected final String _ORG_TALENTCHAMPIONS_SUBMENU        = "xpath=//*[@id='nav-sub-talent-champions']/a";
	protected final String _ORG_LEADERSHIPADVANTAGE_SUBMENU    = "xpath=//*[@id='nav-sub-leadership-advantage']/a";
	protected final String _ORG_RELATIONSHIPAGILITY_SUBMENU    = "xpath=//*[@id='nav-sub-relationship-agility']/a";
	protected final String _ORG_CLIENTLIST_SUBMENU             = "xpath=//*[@id='nav-sub-client-list']/a";
	protected final String _ORG_PROFILES_SUBMENU               = "xpath=(//a[contains(text(),'Profiles')])[3]";
	protected final String _ORG_RESOURCES_SUBMENU            = "xpath=//*[@id='nav-sub-resources']/a[@href='http://www.thecoaches.com/for-organizations/resources']";
	protected final String _ORG_TRAINING_SUBMENU               = "xpath=//*[@id='nav-sub-profiles']/a";
	
	protected final String _LEADERSHIP_PROGRAM_OVERVIEW_SUBMENU     = "xpath=//*[@id='nav-sub-program-overview']/a";
	protected final String _LEADERSHIP_RETREATS_SUBMENU             = "xpath=//*[@id='nav-sub-retreats']/a";
	protected final String _LEADERSHIP_DATESLOCATIONS_SUBMENU       = "xpath=(//li[@id='nav-sub-dates-locations']/a)[2]";
	protected final String _LEADERSHIP_PROGRAM_FAQS_SUBMENU         = "xpath=//*[@id='nav-sub-program-faqs']/a";
	protected final String _LEADERSHIP_FAQS_SUBMENU    		   	    = "xpath=(//a[contains(text(),'FAQs')])[3]";
	protected final String _LEADERSHIP_PRICING_REGISTRATION_SUBMENU = "xpath=(//a[contains(text(),'Pricing & Registration')])[2]";
	protected final String _LEADERSHIP_FACULTY_SUBMENU              = "xpath=(//a[contains(text(),'Faculty')])[2]";
	protected final String _LEADERSHIP_COLLEGE_EQUIVALENCE_SUBMENU  = "xpath=//*[@id='nav-sub-college-equivalence']/a";
	protected final String _LEADERSHIP_ACCREDITATION_SUBMENU  	    = "xpath=(//a[contains(text(),'Accreditation')])[2]";
	protected final String _LEADERSHIP_PROFILES_SUBMENU             = "xpath=(//a[contains(text(),'Profiles')])[2]";
	protected final String _LEADER_CREATINGFROMSELF_SUBMENU         = "xpath=//*[@id='nav-sub-creating-from-self']/a";
	protected final String _LEADERSHIP_RESOURCES_SUBMENU            = "xpath=(//a[contains(text(),'Resources')])[2]";
	protected final String _LEADER_FROMWITHIN_SUBMENU               = "xpath=//*[@id='nav-sub-leader-from-within']/a";
	protected final String _THELEADERSHIP_WAY_SUBMENU               = "xpath=//*[@id='nav-sub-the-leadership-way']/a";
	
	protected final String _CONNECT_LOCALLY_SUBMENU                = "xpath=//*[@id='nav-sub-connect-locally']/a";
	protected final String _EVENTS_CALENDAR_SUBMENU                = "xpath=//*[@id='nav-sub-events-calendar']/a";
	protected final String _2014_COACTIVE_SUMMIT_SUBMENU           = "xpath=//*[@id='nav-sub-2014-summit']/a";
	protected final String _INSTITUTE_OF_COACHING_SUBMENU          = "xpath=//*[@id='nav-sub-institute-of-coaching']/a";
	protected final String _HENRY_ONTHE_RADIO_SUBMENU              = "xpath=//*[@id='nav-sub-henry-on-the-radio']/a";
	protected final String _DISRUPT_YOURLIFE_GOODWAY_SUBMENU       = "xpath=//*[@id='nav-sub-disrupt-your-life-in-a-good-way']/a";
	protected final String _COACTIVE_GLOBAL_NEWSLETTER_SUBMENU     = "xpath=//*[@id='nav-sub-co-active-global-newsletter']/a";
	
	/*Header links for UK site */
	protected final String _SHARE = "xpath=//*[@id='general']/li[1]/a";
	protected final String _HOMEPAGE_LINK = "xpath=//*[@id='general']/li[2]/a";
	protected final String _COACTIVE_LINK = "xpath=//*[@id='general']/li[3]/a";
	protected final String _FIND_A_COACH_LINK = "xpath=//*[@id='general']/li[4]/a";
	protected final String _UK_CONTACT_US_LINK = "xpath=//*[@id='general']/li[5]/a";
	protected final String _CTI_INTERNATIONAL_LINK = "xpath=//*[@id='general']/li[8]/a";
	protected final String _PRIVACY_POLICY_LINK = "xpath=//*[@id='privacy-link']";
	
	
	/* Menus xpath for UK site */
	protected final String _UK_WHY_CTI_ = "xpath=//*[@id='main-nav']/li[1]/a";
	protected final String _UK_COACH_TRAINING_ = "xpath=//*[@id='main-nav']/li[2]/a";
	protected final String _UK_LEADERSHIP_ = "xpath=//*[@id='main-nav']/li[3]/a";
	protected final String _UK_FOR_ORG_ = "xpath=//*[@id='main-nav']/li[4]/a";
	protected final String _UK_OUR_FAC_ = "xpath=//*[@id='main-nav']/li[5]/a";
	protected final String _UK_RES_ = "xpath=//*[@id='main-nav']/li[6]/a"; 
	protected final String _FOOTER_LEADERSHIP = "xpath=//*[@id='cta1']/dt/a/img";
	protected final String _FOOTER_NETWORK = "xpath=//*[@id='cta2']/dt/a/img";
	protected final String _FOOTER_SCH_CALL = "xpath=//*[@id='cta3']/dt/a/img";
	protected final String _FOOTER_ASSESMENT = "xpath=//*[@id='cta4']/dd/a/b";
	
	protected final String _UK_SUB_MENU1 = "xpath=//*[@id='section-nav']/li[1]/a";
	protected final String _UK_SUB_MENU2 = "xpath=//*[@id='section-nav']/li[2]/a";
	protected final String _UK_SUB_MENU3 = "xpath=//*[@id='section-nav']/li[3]/a";
	protected final String _UK_SUB_MENU4 = "xpath=//*[@id='section-nav']/li[4]/a";
	protected final String _UK_SUB_MENU5 = "xpath=//*[@id='section-nav']/li[5]/a";
	protected final String _UK_SUB_MENU6 = "xpath=//*[@id='section-nav']/li[6]/a";
	protected final String _UK_SUB_MENU7 = "xpath=//*[@id='section-nav']/li[7]/a";
	protected final String _UK_SUB_MENU8 = "xpath=//*[@id='section-nav']/li[8]/a";
	protected final String _UK_SUB_MENU9 = "xpath=//*[@id='section-nav']/li[9]/a";
	protected final String _UK_SUB_MENU10 = "xpath=//*[@id='section-nav']/li[10]/a";
	
	protected String _UK_RR1 = "xpath=//*[@id='related-links']/ul/li[1]/a";
	protected String _UK_RR2 = "xpath=//*[@id='related-links']/ul/li[2]/a";
	protected String _UK_RR3 = "xpath=//*[@id='related-links']/ul/li[3]/a";
	protected String _UK_RR4 = "xpath=//*[@id='related-links']/ul/li[4]/a";

	protected String _WEBINAR_SIGNUP_LINK = "xpath=//*[@id='webinar-link']";
	
	/* Titles for UK sub menus */
	protected final String _HOMEPAGE_TITLE = "The Coaches Training Institute (CTI)";

	protected final String _UK_WHY_CTI_TITLE = "The Coaches Training Institute (CTI) : Why Coaches Training Institute?";
	protected final String _UK_COACH_TRAINING_TITLE = "The Coaches Training Institute (CTI) : Coach Training and Certification";
	protected final String _UK_ABT_CTI_TITLE = "CTI: Why Coaches Training Institute?: About CTI";
	protected final String _UK_WHAT_IS_COACTIVE_TITLE = "CTI: Why Coaches Training Institute?: What is Co-active?";
	protected final String _UK_MANAGEMENT_TITLE = "CTI: Why Coaches Training Institute?: Management";
	protected final String _UK_HISTORY_TITLE = "CTI: Why Coaches Training Institute?: History";
	protected final String _UK_BUY_BOOK_TITLE = "CTI: Why Coaches Training Institute?: Buy The Book";
	protected final String _CONTACT_PROG_ADV_TITLE = "CTI: Contact a Programme Advisor";
	protected final String _JOIN_FREE_CALL_TITLE = "CTI: Join Us for a Free Information Call";
	protected final String _UK_CTI_INT_TITLE = "CTI: International Partners";
	protected final String _UK_COURSES_TITLE = "CTI: Coach Training and Certification: Courses";
	protected final String _UK_DATES_TITLE = "CTI: Coach Training and Certification: Dates & Locations";
	protected final String _UK_COURSE1_TITLE = "CTI: Coach Training and Certification: Courses - Co-active Fundamentals";
	protected final String _UK_COURSE2_TITLE = "CTI: Coach Training and Certification: Courses - Fulfillment";
	protected final String _UK_COURSE3_TITLE = "CTI: Coach Training and Certification: Courses - Balance";
	protected final String _UK_COURSE4_TITLE = "CTI: Coach Training and Certification: Courses - Process";
	protected final String _UK_COURSE5_TITLE = "CTI: Coach Training and Certification: Courses - Synergy";
	protected final String _UK_LEARNING_SUPPORT_TITLE = "CTI: Coach Training and Certification: Support Your Learning";
	protected final String _UK_LEARNING_SUPPORT_TITLE2 = "CTI: Coach Training and Certification: Learning Support";
	protected final String _UK_LEADERSHIP_TITLE = "The Coaches Training Institute (CTI) : Leadership";
	protected final String _UK_DISCLOSURE_TITLE = "CTI: Disclosure";
	protected final String _UK_JOBS_TITLE = "CTI: Careers at CTI";
	protected final String _CONTACT_US_TITLE = "CTI: Contact Us";
	protected final String _UK_FAQS_TITLE = "CTI: Coach Training and Certification: Frequently Asked Questions";
	protected final String _UK_ASSISTING_TITLE = "CTI: Coach Training and Certification: Be an Assistant";
	protected final String _UK_ACC_TITLE = "CTI: Coach Training and Certification: Accreditation";
	protected final String _UK_PROFILES_TITLE = "CTI Profile: Christine Alexander Smith";
	protected final String _UK_FAC_LEADERS_TITLE = "CTI: Our Faculty: The Leaders";
	protected final String _UK_PROG_OVERVIEW_TITLE = "CTI: Leadership: Programme Overview";
	protected final String _UK_RETREATS_TITLE = "CTI: Leadership: Retreats";
	protected final String _UK_LEAD_DATES_TITLE = "CTI: Leadership: Dates & Locations";
	protected final String _UK_LEAD_FAQs_TITLE = "CTI: Leadership: Frequently Asked Questions";
	protected final String _UK_LEAD_PROFILES_TITLE = "CTI: Profile: Matthew Montgomery";
	protected final String _UK_FOR_ORG_TITLE = "The Coaches Training Institute (CTI) : For Organisations";
	protected final String _UK_ORG_INHOUSE_TITLE = "CTI: For Organisations: In House Internal Co-active Coach";
	protected final String _UK_ORG_EXEC_LEAD_TITLE = "CTI: For Organisations: Transformational Executive Leadership";
	protected final String _UK_ORG_CLIENTLIST_TITLE = "CTI: For Organisations: Client List";
	protected final String _UK_OUR_FAC_TITLE = "The Coaches Training Institute (CTI) : Our Faculty";
	protected final String _UK_COACH_TRAIN_FAC_TITLE = "CTI: Our Faculty: Coach Training Faculty";
	protected final String _UK_LEAD_FAC_TITLE = "CTI: Our Faculty: Leadership Faculty";
	protected final String _UK_BECOME_FAC_TITLE = "CTI: Our Faculty: Become a Faculty Member";
	protected final String _UK_RES_TITLE = "The Coaches Training Institute (CTI) : Resources";
	protected final String _UK_MUL_TITLE = "CTI: Resources: Multimedia";
	protected final String _UK_WEB_CC_TITLE = "CTI: Resources: Why Co-Active Coaching WEBINAR";
	protected final String _UK_WEB_LEAD_TITLE = "CTI: Resources: Why Co-Active Leadership WEBINAR";
	protected final String _UK_BUS_BUILDER_TITLE = "CTI: Resources: Business Builder WEBINAR";
	protected final String _UK_TOOLS_TITLE = "CTI: Resources: Tools";
	protected final String _UK_BOOKS_TITLE = "CTI: Resources: Books";	
	protected final String _UK_NEWS_TITLE = "CTI: Resources: News & Events";	
	
	/* Titles for US site */
	protected final String HOMEPAGE_TITLE = "The Coaches Training Institute CTI | Life Coaching | Executive Life Coaching | Business Coaching | CTI"; 
	protected final String COACHTRAINING_TITLE = "Co-Active Coach Training Program | Coaches Training Institute | CTI | CTI";
	protected final String COACTIVE_TITLE = "Main Community - Home";
	protected final String FIND_A_COACH_TITLE = "CTI";
	protected final String E_NEWSLETTER_TITLE = "Sign Up for Our e-Newsletter | CTI";
	protected final String CONTACT_US_TITLE = "Contact Us | CTI";
	protected final String _MYCART_TITLE = "AmeriCart";
	protected final String _CHECKOUT_TITLE = "AmeriCart";
	protected final String _BLOG_TITLE = "Coaches Training Institute : Transforum";
	protected final String _PRESS_TITLE = "Press Room | CTI";
	protected final String _CTI_INT_TITLE = "CTI International | Coaches Training Institute | CTI | CTI";
	protected final String SUMMIT_TITLE = "2014 Global Co-Active Summit";
	protected final String _MZINGA_TITLE = "Mzinga Signon";
	protected final String _AMBASSADOR_TITLE = "CTI Ambassadors DC Diary";
	protected final String _STAKEBOOK_TITLE = "The Stake: The Making of Leaders";
	
	/* Sub Navigation Title */
	/* Sub Menu Titles for WHY CTI */
	protected final String _ABOUT_CTI_TITLE = "About CTI | Coaches Training Institute | CTI | CTI";
	protected final String _COACTIVE_TITLE  = "What is Co-Active? | Coaches Training Institute | CTI | CTI"; 
	protected final String _MNGT_TITLE      = "Management Team | Coaches Training Institute | CTI | CTI"; 
	protected final String _BUY_BOOK_TITLE  = "Buy the Book | Coaches Training Institute | CTI | CTI"; 
	protected final String _ACC_FAQ_TITLE   = "Accreditations & Affiliations | Coaches Training Institute | CTI | CTI"; 

	/*Sub Menu Titles for Coach Training */

	protected final String _COURSES_TITLE       = "Core Course Curriculum - Co-Active Coach Training Program | CTI | CTI"; 
	protected final String _CERTIFICATION_TITLE = "Certification Program - Co-Active Coach Training Program | CTI | CTI"; 
	protected final String _DATES_TITLE         = "Dates & Locations - Co-Active Coach Training Program | CTI | CTI";
	protected final String _PRICING_TITLE       = "Pricing & Registration - Co-Active Coach Training Program | CTI | CTI";
	protected final String _FACULTY_TITLE       = "Faculty - Co-Active Coach Training Program |CTI | CTI";
	protected final String _FAQS_TITLE          = "Co-Active Coach Training Program FAQs |Coaches Training Institute |CTI | CTI";
	protected final String _PROFILES_TITLE      = "Profiles | CTI";
	protected final String _RESOURCES_TITLE     = "Coaching Resources - Co-Active Coach Training Program | CTI | CTI";
	protected final String _BUILDING_BUS_TITLE  = "Building Business | CTI";
	protected final String _ASSISTING_TITLE     = "Co-Active Course Assisting - Co-Active Coach Training Program | CTI | CTI";
	
	/*Sub Menu Titles for Leadership */

	protected final String _PRG_OVR_TITLE        = "Co-Active Leader Program Overview - Leadership Training | CTI | CTI"; 
	protected final String _RETREATS_TITLE 		 = "Residential Leadership Retreats - Co-Active Leader Program | CTI | CTI";
	protected final String _LEADER_DATES_TITLE   = "Dates & Locations - Co-Active Leader Training Program | CTI | CTI";
	protected final String _LEADER_FAQS_TITLE    = "Co-Active Leader Training Program FAQs | CTI | CTI";
	protected final String _LEADER_PRICING_TITLE = "Pricing & Registration - Co-Active Leader Training Program | CTI | CTI";
	protected final String _LEADER_FACULTY_TITLE = "Leadership Faculty - Co-Active Leader Training Program | CTI | CTI";
	protected final String _LEADER_ACC_TITLE     = "College Equivalence - Co-Active Leader Training Program | CTI | CTI";
	protected final String _LEADER_PROFILES_TITLE= "Profiles | CTI";
	protected final String _LEADER_CREATING_SELF_TITLE = "Leadership Discovery Retreat - Co-Active Leader Training Program | CTI | CTI";
	protected final String _LEADER_RESOURCES_TITLE     = "Leadership Resources - Co-Active Leader Training Program | CTI | CTI";
	
	/*Sub Menu Titles for Organizations */

	protected final String _ORG_INTERNAL_COACTIVECOACH_TITLE = "Internal Co-Active Coach | Coaches Training Institute | CTI | CTI";
	protected final String _ORG_TALENTCHAMPIONS_TITLE       = "Talent Champions | Coaches Training Institute | CTI | CTI";
	protected final String _ORG_LEADERSHIPADVANTAGE_TITLE   = "Leadership Advantage | Coaches Training Institute | CTI | CTI";
	protected final String _ORG_RELATIONSHIPAGILITY_TITLE   = "Relationship Agility | Coaches Training Institute | CTI | CTI";
	protected final String _ORG_CLIENTLIST_TITLE            = "Client List | Coaches Training Institute | CTI | CTI";
	protected final String _ORG_PROFILES_TITLE              = "Profiles | CTI";
	protected final String _ORG_RESOURCES_TITLE             = "Organizational Resources | Coaches Training Institute | CTI | CTI";
	
	/*Sub Menu Titles for Community */ 
	
	protected final String _CONNECT_LOCALLY_TITLE                = "Connect Locally | Coaches Training Institute | CTI | CTI";
	protected final String _EVENTS_CALENDAR_TITLE                = "Events Calendar | Coaches Training Institute | CTI | CTI";
	protected final String _2014_COACTIVE_SUMMIT_TITLE           = "2014 Co-Active Summit | Coaches Training Institute | CTI | CTI";
	protected final String _INSTITUTE_OF_COACHING_TITLE          = "Institute of Coaching | Coaches Training Institute | CTI | CTI";
	protected final String _HENRY_ONTHE_RADIO_TITLE              = "Henry on the Radio | Coaches Training Institute | CTI | CTI";
	protected final String _DISRUPT_YOURLIFE_GOODWAY_TITLE       = "Disrupt Your Life in a Good Way | Coaches Training Institute | CTI | CTI";
	protected final String _COACTIVE_GLOBAL_NEWSLETTER_TITLE	 = "Co-Active Global Newsletter | Coaches Training Institute | CTI | CTI";
		 
	/*Footer Titles */
	protected final String JOBS_TITLE = "Careers at CTI | CTI";
	
	/* Header URL's */
	protected final String $contactusURL = "/contact-us";
	
	/* CTI - home links */
	protected final String _C_HOME = "xpath=//html/body/div[1]/header/ul[1]/li[1]/a";
	protected final String _COACHING_HOME ="xpath=//*[@id='general']/li[2]/a";
	
	protected String $winHandleBefore = null;
	
	/*Common method for Login into account by passing user-name and password as parameters */
	public void loginIntoAccount(String username,String password) throws Exception{
		type(_USERNAME,username);
		type(_PASSWORD,password);
		click(_SIGN_IN_BTTN);
	}
	
	/**
	 * Login using Portal User credentials
	 */
	protected void login() {

		try {
			//Enter username and password in the respective fields
			type(_USERNAME,_TEST_USERNAME);
			type(_PASSWORD,_TEST_PASSWORD);
			//click login button
			click(_LOG_IN);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * This function is used to wait until an element is present in the page
	 * 
	 */
	protected String waitForElementPresent(String locator) throws Exception
	
	{
		 Integer i=1;
		 for(i=1;i<=10;i++)
		 {
			 if(verifyElementPresent(locator))
			 {
				 
				 break;
			 }
			 Thread.sleep(1000);
		 }
		 
		 return locator;
	}
	
	/**
	 * Generic method to see if an element exists on the page.  The method will determine if the element is xpath or id and use the proper function.
	 * @param element
	 * @throws Exception
	 */
	protected boolean verifyElementPresent(String element) throws Exception
	{
		// Depending on the passed in element, we choose the right function.
		if (element.startsWith("xpath="))
		{
			element = element.replace("xpath=", "");
			return verifyElementPresentByXpath(element);
		}
		else if (element.startsWith("id="))
		{
			element = element.replace("id=", "");
			return verifyElementPresentById(element);
		}
		else
		{
			throw new Exception("*****ERROR*****  Unknown element type: " + element);
		}
	}

	/**
	 * Simple method to verify an element with an id being on the page.
	 * @param element
	 * @throws Exception
	 */
	private boolean verifyElementPresentById(String element)
	{
		try
		{
			driver.findElement(By.id(element));
		}
		catch (NoSuchElementException e)
		{
			return false;
		}

		return true;
	}

	/**
	 * Simple method to verify an element with an xpath being on the page.
	 * @param element
	 * @throws Exception
	 */
	private boolean verifyElementPresentByXpath(String element)
	{
		try
		{
			driver.findElement(By.xpath(element));
		}
		catch (NoSuchElementException e)
		{
			return false;
		}

		return true;
	}
	/**
	 * Generic method that verifies that an element is no longer showing up on the page.  The method will determine if the element is xpath or id and use the proper function.
	 * @param element
	 * @return
	 * @throws Exception 
	 */
	protected boolean verifyElementNotPresent(String element) throws Exception
	{
		// Depending on the passed in element, we choose the right function.
		if (element.startsWith("xpath="))
		{
			element = element.replace("xpath=", "");
			// If the element is found on the page, we need to return false because it shouldn't be there.
			if (verifyElementPresentByXpath(element))
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else if (element.startsWith("id="))
		{
			element = element.replace("id=", "");
			// If the element is found on the page, we need to return false because it shouldn't be there.
			if (verifyElementPresentById(element))
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else
		{
			throw new Exception("*****ERROR*****  Unknown element type: " + element);
		}
	}
	/**
	 * Generic method that verifies that text is no longer showing up on the page.  The method will determine if the element is xpath or id and use the proper function.
	 * @param element
	 * @return
	 * @throws Exception 
	 */
	
	protected boolean verifyTextNotPresent(String element) throws Exception
	{
	// Depending on the passed in element, we choose the right function.
	if (element.startsWith("xpath="))
	{
	element = element.replace("xpath=", "");
	// If the element is found on the page, we need to return false because it shouldn't be there.
	if (verifyTextPresent(element))
		{
		return false;
		}
	else
		{
		return true;
		}
	}
	return true;
	}
	/**
	 * Generic method to see if an element exists on the page.  The method will determine if the element is xpath or id and use the proper function.
	 * @param element
	 * @throws Exception
	 */
	protected boolean verifyIsSelected(String element) throws Exception
	{
		// Depending on the passed in element, we choose the right function.
		if (element.startsWith("xpath="))
		{
			element = element.replace("xpath=", "");
			return verifyElementPresentByXpath(element);
		}
		else if (element.startsWith("id="))
		{
			element = element.replace("id=", "");
			return verifyElementPresentById(element);
		}
		else
		{
			throw new Exception("*****ERROR*****  Unknown element type: " + element);
		}
	}

	/**
	 * Simple method to verify an element with an id being on the page.
	 * @param element
	 * @throws Exception
	 */
	private boolean verifyIsSelectedByxpath(String element)
	{
		try
		{
			driver.findElement(By.xpath(element)).isSelected();
		}
		catch (NoSuchElementException e)
		{
			return false;
		}

		return true;
	}
	/**
	 * Generic method to type in an element.  The method will determine if the element is xpath or id and use the proper function.
	 * @param element
	 */
	protected void type(String element, String typeMe) throws Exception
	{
		// Depending on the passed in element, we choose the right function.		
		if (element.startsWith("xpath="))
		{
			element = element.replace("xpath=", "");
			typeByXpath(element, typeMe);
		}
		else if (element.startsWith("id="))
		{
			element = element.replace("id=", "");
			typeById(element, typeMe);
		}
		else
		{
			throw new Exception("*****ERROR*****  Unknown element type: " + element);
		}
	}

	/**
	 * Simplified version of typing a given string into a given element.
	 * @param element
	 * @param typeMe
	 */
	private void typeByXpath(String element, String typeMe)
	{
		// We have to clear the field to make sure no default text is there when we type.
		driver.findElement(By.xpath(element)).clear();
		delay(100);
		driver.findElement(By.xpath(element)).sendKeys(typeMe);
	}

	/**
	 * Simplified version of typing a given string into a given element with an id.
	 * @param element
	 * @param typeMe
	 */
	private void typeById(String element, String typeMe)
	{
		// We have to clear the field to make sure no default text is there when we type.
		driver.findElement(By.id(element)).clear();
		delay(100);
		driver.findElement(By.id(element)).sendKeys(typeMe);
	}

	/**
	 * Generic method to click an element.  The method will determine if the element is xpath or id and use the proper function.
	 * @param element
	 */
	protected void click(String element) throws Exception
	{
		// Depending on the passed in element, we choose the right function.
		if (element.startsWith("xpath="))
		{
			element = element.replace("xpath=", "");
			clickByXpath(element);
		}
		else if (element.startsWith("id="))
		{
			element = element.replace("id=", "");
			clickById(element);
		}
		else if (element.startsWith("css="))
		{
			element = element.replace("css=", "");
			clickBycss(element);
		}
		else
		{
			throw new Exception("*****ERROR*****  Unknown element type: " + element);
		}
	}
	
	/**
	 * Generic method to select and element from a drop down menu.  The method will determine if the element is xpath, id, or css and use the proper function.
	 * @param element
	 * @return
	 * @throws Exception
	 */
	public void select(String element, String value) throws Exception
	{
		// Depending on the passed in element, we choose the right function.
		if (element.startsWith("xpath="))
		{
			element = element.replace("xpath=", "");
			selectByXpath(element, value);
		}
		else if (element.startsWith("id="))
		{
			element = element.replace("id=", "");
			selectById(element, value);
		}
		else if (element.startsWith("css="))
		{
			element = element.replace("css=", "");
			selectByCss(element, value);
		}
		else if (element.startsWith("name="))
		{
			element = element.replace("name=", "");
			selectByName(element, value);
		}
		else
		{
			throw new Exception("*****ERROR*****  Unknown element type: " + element);
		}
	}

	/**
	 * Simplified version of selecting an element from a drop down.
	 * @param element
	 * @param value
	 */
	private void selectByXpath(String element, String value)
	{
		Select select = new Select(driver.findElement(By.xpath(element)));
		select.deselectAll();
		select.selectByVisibleText(value);

	}

	/**
	 * Simplified version of selecting an element from a drop down.
	 * @param element
	 * @param value
	 */
	private void selectById(String element, String value)
	{
		new Select(driver.findElement(By.id(element))).selectByVisibleText(value);

	}

	/**
	 * Simplified version of selecting an element from a drop down.
	 * @param element
	 * @param value
	 */
	private void selectByCss(String element, String value)
	{
		Select select = new Select(driver.findElement(By.cssSelector(element)));
		select.deselectAll();
		select.selectByVisibleText(value);
	}
	/**
	 * Simplified version of selecting an element from a drop down.
	 * @param element
	 * @param value
	 */
	protected void selectByName(String element, String value)
	{
		Select select = new Select(driver.findElement(By.name(element)));
		//select.deselectAll();
		select.selectByVisibleText(value);
	}

	/**
	 * Simplified version of clicking a given element.
	 * @param element
	 */
	protected void clickByXpath(String element)
	{
		driver.findElement(By.xpath(element)).click();
	}

	/**
	 * Simple function to get out of having to surround ever Thread.sleep with a try/catch.
	 * @param milliseconds
	 */
	protected void delay(int milliseconds)
	{
		try
		{
			Thread.sleep(milliseconds);
		}
		catch (Exception e)
		{
			// Do nothing.
		}
	}
	 /**
     * Generic method to see if an element exists on the page.  The method will determine if the element is xpath or id and use the proper function.
     * @param element
     * @throws Exception
     */
    protected boolean IsChecked(String element) throws Exception
    {
            // Depending on the passed in element, we choose the right function.
            if (element.startsWith("xpath="))
            {
                    element = element.replace("xpath=", "");
                    return IsCheckedByXpath(element);
            }
            else if (element.startsWith("id="))
            {
                    element = element.replace("id=", "");
                    return IsCheckedById(element);
            }
            else
            {
                    throw new Exception("****ERROR****  Unknown element type: " + element);
            }
    }

    /**
     * Simple method to verify an element with an id being on the page.
     * @param element
     * @throws Exception
     */
    private boolean IsCheckedByXpath(String element)
    {
            return driver.findElement(By.xpath(element)).isSelected();
    }
     /* Simple method to verify an element with an id being on the page.
     * @param element
     * @throws Exception
     */
    private boolean IsCheckedById(String element)
    {
            return driver.findElement(By.id(element)).isSelected();
    }
	/**
	 * Simplified version of clicking a given element with an id.
	 * @param element
	 */
	private void clickById(String element)
	{
		driver.findElement(By.id(element)).click();
	}
	
	/**
	 * Simplified version of clicking a given element with an id.
	 * @param element
	 */
	private void clickBycss(String element)
	{
		driver.findElement(By.cssSelector(element)).click();
	}

	/**
	 * Generic method to create a webelement so that selenium can interact with it.  The method will determine if the element is xpath or id and use the proper function.
	 * @param element
	 * @return
	 * @throws Exception
	 */
	protected WebElement findElement(String element) throws Exception
	{
		// Depending on the passed in element, we choose the right function.
		if (element.startsWith("xpath="))
		{
			element = element.replace("xpath=", "");
			return findElementByXpath(element);
		}
		else if (element.startsWith("id="))
		{
			element = element.replace("id=", "");
			return findElementById(element);
		}
		else
		{
			throw new Exception("*****ERROR*****  Unknown element type: " + element);
		}
	}

	/**
	 * Simplified version of finding an WebElement.
	 * @param element
	 * @return
	 */
	private WebElement findElementByXpath(String element)
	{
		return driver.findElement(By.xpath(element));
	}

	/**
	 * Simplified version of finding an WebElement.
	 * @param element
	 * @return
	 */
	private WebElement findElementById(String element)
	{
		return driver.findElement(By.id(element));
	}

	/**
	 * Method to check if a given string exists on the page anywhere.
	 * @param findMe
	 * @return
	 */
	protected boolean verifyTextPresent(String findMe)
	{
		return driver.getPageSource().contains(findMe);
	}
	/**
	 * Generic method to see if a given text exists at a given element on the page.
	 * @param element
	 * @param findMe
	 * @return
	 * @throws Exception
	 */
	protected boolean verifyTextAtElement(String element, String findMe) throws Exception
	{
		// Depending on the passed in element, we choose the right function.
		if (element.startsWith("xpath="))
		{
			element = element.replace("xpath=", "");
			return verifyTextAtElementByXpath(element, findMe);
		}
		else if (element.startsWith("id="))
		{
			element = element.replace("id=", "");
			return verifyTextAtElementById(element, findMe);
		}
		else
		{
			throw new Exception("*****ERROR*****  Unknown element type: " + element);
		}
	}

	/**
	 * Finds the element based on xpath and compares the text there to the one passed in.
	 * @param element
	 * @param findMe
	 * @return
	 * @throws Exception
	 */
	private boolean verifyTextAtElementByXpath(String element, String findMe) throws Exception
	{
		if (verifyElementPresent(element))
		{
			String elementText = driver.findElement(By.xpath(element)).getText();
			if (elementText.contains(findMe))
			{
				return true;
			}
		}
		else
		{
			throw new Exception ("The element you are trying to make a text match on: " + element + 
					"does not exist on this page: " + driver.getCurrentUrl());
		}

		// If we got here, either the element wasn't there, or no text match...
		return false;
	}

	/**
	 * Finds the element based on Id and compares the text there to the one passed in.
	 * @param element
	 * @param findMe
	 * @return
	 * @throws Exception
	 */
	private boolean verifyTextAtElementById(String element, String findMe) throws Exception
	{
		if (verifyElementPresent(element))
		{
			String elementText = driver.findElement(By.id(element)).getText();
			if (elementText.contains(findMe))
			{
				return true;
			}
		}
		else
		{
			throw new Exception ("The element you are trying to make a text match on: " + element + 
					"does not exist on this page: " + driver.getCurrentUrl());
		}

		// If we got here, either the element wasn't there, or no text match...
		return false;
	}
	/**
	 * Generic method to return the text to the user based on the element passed in.
	 * @param element
	 * @return
	 * @throws Exception
	 */
	protected String getText(String element) throws Exception
	{
		// Depending on the passed in element, we choose the right function.
		if (element.startsWith("xpath="))
		{
			element = element.replace("xpath=", "");
			return getTextByXpath(element);
		}
		else if (element.startsWith("id="))
		{
			element = element.replace("id=", "");
			return getTextById(element);
		}
		else
		{
			throw new Exception("*****ERROR*****  Unknown element type: " + element);
		}
	}

	/**
	 * Gets text for an element based on xpath.
	 * @param element
	 * @return
	 */
	protected String getTextByXpath(String element)
	{
		return driver.findElement(By.xpath(element)).getText();
	}

	/**
	 * Gets text for an element based on id.
	 * @param element
	 * @return
	 */
	private String getTextById(String element)
	{
		return driver.findElement(By.id(element)).getText();
	}
	
	protected String mouseOverElement(String element) throws Exception
	{
		// Depending on the passed in element, we choose the right function.
		if (element.startsWith("xpath="))
		{
			element = element.replace("xpath=", "");
			return mouseOverElementByXpath(element);
		}
		else if (element.startsWith("id="))
		{
			element = element.replace("id=", "");
			return mouseOverElementById(element);
		}
		else
		{
			throw new Exception("*****ERROR*****  Unknown element type: " + element);
		}
	}
	protected String mouseOverElementByXpath(String element){ 

		Actions builder = new Actions(driver);
		WebElement tagElement = driver.findElement(By.xpath(element));
		builder.moveToElement(tagElement).build().perform();
		return element;

		}
	//Actions action = new Actions(driver)
	//WebElement Elem = driver.findElement(By.xpath(element));
	//action.moveToElement(Elem).moveToElement(webdriver.findElement(By.xpath("/expression-here")).click().build().perform();
	
	private String mouseOverElementById(String element){ 

		Actions builder = new Actions(driver);
		WebElement tagElement = driver.findElement(By.id(element));
		builder.moveToElement(tagElement).build().perform();
		return element;

		}
	/**
	 * Generic method to get the value from the textbox.
	 * @param element
	 * @return
	 * @throws Exception
	 */	
	protected String getAttribute(String element) throws Exception
	{
		// Depending on the passed in element, we choose the right function.
		if (element.startsWith("xpath="))
		{
			element = element.replace("xpath=", "");
			return getAttributeByXpath(element);
		}
		else if (element.startsWith("id="))
		{
			element = element.replace("id=", "");
			return getAttributeById(element);
		}
				else
		{
			throw new Exception("*****ERROR*****  Unknown element type: " + element);
		}
	}
	private String getAttributeByXpath(String element)
	{
		return driver.findElement(By.xpath(element)).getAttribute("value");
	}
	private String getAttributeById(String element)
	{
		return driver.findElement(By.id(element)).getAttribute("value");
	}
	
	
	/**
	 * Simple method to verify an selected element surrounding color on the page.
	 * @param element and preference
	 * Element is xpath and preference is the style for which color code required
	 * @throws Exception
	 */
	protected String getElementcolor(String element,String preference) throws Exception
	{
		if (element.startsWith("xpath="))
		{
			element = element.replace("xpath=", "");
			if(preference.equals("background-color")){
			  return getslectedElementbackgroundcolorByXpath(element);
			}
			else{
			  return getElementcolorByXpath(element);
			}
		}
		else if (element.startsWith("id="))
		{
			element = element.replace("id=", "");
			if(preference.equals("background-color")){
			  return getslectedElementbackgroundcolorById(element);
			}
			else{
			  return getElementcolorById(element);
			}
		}
		else
		{
			throw new Exception("*****ERROR*****  Unknown element type: " + element);
		}
	}
	protected String getslectedElementbackgroundcolorByXpath(String element){
		String color = null;
		try{
			/*.getCssValue("background-color") will give the rbga format color code ex:rgba(191, 235, 249, 1) which is the color of background of selected element*/
		  color = driver.findElement(By.xpath(element)).getCssValue("background-color");
		}
		catch (NoSuchElementException e){
		  return "";
		}
		return color;
	}
	protected String getslectedElementbackgroundcolorById(String element){
		String color = null;
		try{
			/*.getCssValue("background-color") will give the rbga format color code ex:rgba(191, 235, 249, 1) which is the color of background of selected element*/
		  color = driver.findElement(By.id(element)).getCssValue("background-color");
		}
		catch (NoSuchElementException e){
		  return "";
		}
		return color;
	}
	protected String getElementcolorByXpath(String element){
		String color = null;
		try{
			/*.getCssValue("color") will give the rbga format color code ex:rgba(191, 235, 249, 1) which is the color of element*/
		  color = driver.findElement(By.xpath(element)).getCssValue("color");
		}
		catch (NoSuchElementException e){
		  return "";
		}
		return color;
	}
	protected String getElementcolorById(String element){
		String color = null;
		try{
			/*.getCssValue("background-color") will give the rbga format color code ex:rgba(191, 235, 249, 1) which is the color of background of selected element*/
		  color = driver.findElement(By.id(element)).getCssValue("color");
		}
		catch (NoSuchElementException e){
		  return "";
		}
		return color;
	}
	/**
	 * Simple method to get current URL of the page.
	 */
	protected String getCurrentURL(){
		String url= driver.getCurrentUrl();
		return url;
	}
	
	protected void windowSelection() throws Exception{
		$winHandleBefore = driver.getWindowHandle();
		String latestWinHandle = null;
		for(String winHandle : driver.getWindowHandles()) 
			latestWinHandle = winHandle;
		{            
			driver.switchTo().window(latestWinHandle);

		}
	}
}

