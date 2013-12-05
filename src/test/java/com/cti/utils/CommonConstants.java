package test.java.com.cti.utils;

public class CommonConstants {
	
	//Constants for XMLUtils
	public  static final String elementArray[] = { "IMAGE", "LABEL", "TEXTBOX",
		"LINK", "BUTTON", "OTHERS" , "TITLE" , "MENU" , "SUB-MENU"};
	
	public static final String xmlFilePath_survey 	 = "src/resources/content_survey.xml";
	public static final String xmlFilePath_stakebook = "src/resources/content_stakebook.xml";
	public static final String xmlFilePath_summit 	 = "src/resources/content_summit.xml";
	public static final String xmlFilePath_common  	 = "src/resources/content_common.xml";
	public static final String xmlFilePath_blog  	 = "src/resources/content_blog.xml";
	public static final String xmlFilePath_coactivemrkt   = "src/resources/content_coactivemarketing.xml";
	public static final String xmlFilePath_coactivesales  = "src/resources/content_coactivesales.xml";
	public static final String xmlFilePath_karenhuffpostblog  = "src/resources/content_karenhuffpostblog.xml";
	public static final String xmlFilePath_leadershipAdmin  = "src/resources/content_leadershipAdmin.xml";
	public static final String xmlFilePath_leadershipLaunchpad  = "src/resources/content_leadershipLaunchpad.xml";
	public static final String NAME = "NAME";
	public static final String VALUE = "VALUE";
	
	// XML tags 	
	public static final String COMMON_ELEMENTS_TAG = "COMMON-ELEMENTS";
	public static final String SURVEY_LOGIN_TAG    = "SURVEY-LOGIN-PAGE";
	public static final String SURVEY_HOME_TAG     = "SURVEY-HOME-PAGE";
	public static final String STAKE_HOME_TAG      = "STAKE-HOME-PAGE";
	public static final String SUMMIT_HOME_TAG     = "SUMMIT-PAGE";
	public static final String BLOG_TAG		       = "BLOG-PAGE";
	public static final String KAREN_BLOG_TAG		          = "KAREN-BLOG";
	public static final String COACTIVE_MARK_HOME_TAG	 	  = "HOME-PAGE";
	public static final String COACTIVE_MARK_REPORTS_TAG 	  = "REPORTS";
	public static final String COACTIVE_SALES_HOME_TAG		  = "HOME-PAGE";
	public static final String LEADERSHIP_ADMIN_HOME_TAG	  = "LEADERSHIP-ADMIN-HOME-PAGE";
	public static final String LEADERSHIP_ADMIN_CHILD_TAG	  = "CHILD-PAGES";
	public static final String LEADERSHIP_LAUNCHPAD_TAG	 	  = "LEADERSHIP-LAUNCHPAD-PAGE";
	
	// Website Name and URL's
	public static final String SURVEY_URL		  		  = "http://www.thecoaches.com/surveys/main/login";
	public static final String STAKEBOOK_URL	   		  = "http://www.thestakebook.com/";
	public static final String SUMMIT_URL	  	    	  = "http://www.coactivesummit.com/";
	public static final String BLOG_URL	 	 	   		  = "http://www.thecoaches.com/blog/";
	public static final String COACTIVE_MARK_HOME_URL	  = "/coactive-marketing-class/main/login";
	public static final String COACTIVE_SALES_HOME_URL    = "/coactive-sales-class/main/login";
	public static final String LEADERSHIP_ADMIN_URL 	  = "http://ww2.thecoaches.com/launchpad/index.php/";
	public static final String LEADERSHIP_LAUNCHPAD_URL	  = "http://www.thecoaches.com/docs/leadership/launchpad/index.html";
	
	//Constants for survey page
	public static final String SURVEY_EMAIL_ID_VALUE  = "ping@me.com";
	public static final String SURVEY_PASSWORD_VALUE  = "abc123";
	
	public static final String BREADCRUMB_HOME 		  = "BREADCRUMB_HOME";
	public static final String BREADCRUMB_LOGOUT 	  = "BREADCRUMB_LOGOUT";
	public static final String SURVEY_LEADER 		  = "SURVEY_LEADER";
	public static final String SURVEY_JOURNEY_LEADER  = "SURVEY_JOURNEY_LEADER";
	public static final String NAME_ONE  		      = "NAME_ONE";
	public static final String HOME_LINK  		      = "HOME_LINK";
	public static final String LOGOUT_LINK 		      = "LOGOUT_LINK";
	public static final String LOGIN_LINK 			  = "LOGIN_LINK";
	public static final String SORT_BY_FIRST_NAME_LINK= "SORT_BY_FIRST_NAME_LINK";
	public static final String SORT_BY_LAST_NAME_LINK = "SORT_BY_LAST_NAME_LINK";
	
	//constants for TheStakebook website
	public static final String STAKE_HOME		  	  = "STAKE_HOME";
	public static final String _ABT_AUTHORS_LINK      = "_ABT_AUTHORS_LINK";
	public static final String _PRAISE_LINK		      = "_PRAISE_LINK";
	public static final String _MORE_LINK		      = "_MORE_LINK";
	public static final String _SEARCH		    	  = "_SEARCH";
	public static final String _HEADER1		      	  = "_HEADER1";
	public static final String _HEADER1_TEXT	      = "_HEADER1_TEXT";
	public static final String _RES_HEADER		      = "_RES_HEADER";
	public static final String _ABT_AUTHORS_TITLE     = "_ABT_AUTHORS_TITLE";
	public static final String _PRAISE_TITLE		  = "_PRAISE_TITLE";
	public static final String _MORE_TITLE		      = "_MORE_TITLE";
	public static final String _RESULTS_TITLE		  = "_RESULTS_TITLE";
	public static final String _AMAZON_IMG		      = "_AMAZON_IMG";
	public static final String _AMAZON_TITLE		  = "_AMAZON_TITLE";
	public static final String _FOOTER_COACTIVE_PRESS = "_FOOTER_COACTIVE_PRESS";
	public static final String _FOOTER_COACTIVE_PRESS_INFO = "_FOOTER_COACTIVE_PRESS_INFO";
	public static final String _STAKEBOOK_TITLE		  = "The Stake: The Making of Leaders";
	
	//constants for Summit website
	public static final String _SUMMIT_LOGO		  	  = "_SUMMIT_LOGO";
	public static final String SUMMIT_HOME     	 	  = "SUMMIT_HOME";
	public static final String _KEYNOTES_LINK	      = "_KEYNOTES_LINK";
	public static final String _PRESENTERS_LINK		  = "_PRESENTERS_LINK";
	public static final String _OUR_SPONSORS_LINK	  = "_OUR_SPONSORS_LINK";
	public static final String _FAC_ATTD_LINK		  = "_FAC_ATTD_LINK";
	public static final String _BE_A_SPONSOR_LINK	  = "_BE_A_SPONSOR_LINK";
	public static final String _ARC_LINK	     	  = "_ARC_LINK";
	public static final String _KEYNOTES_TITLE		  = "Keynote Speakers 2014 Global Co-Active Summit";
	public static final String _PRESENTERS_TITLE      = "Session Presenters: Agenda and Bios 2014 Global Co-Active Summit";
	public static final String _OUR_SPONSORS_TITLE	  = "Our Sponsors 2014 Global Co-Active Summit";
	public static final String _FAC_ATTD_TITLE	      = "Faculty Attendees 2014 Global Co-Active Summit";
	public static final String _BE_A_SPONSOR_TITLE	  = "Join Us In Sponsorship 2014 Global Co-Active Summit";
	public static final String _ARC_TITLE		      = "2011 Archive 2014 Global Co-Active Summit";
	public static final String _CART_TITLE		  	  = "Coaches Training Institute - Shopping Cart";
	public static final String _PAY_POL_TITLE		  = "Co-Active Summit Payment Policies 2014 Global Co-Active Summit";
	public static final String SUMMIT_TITLE 		  = "2014 Global Co-Active Summit";
	
	public static final String _HEADER_LINK 		  = "_HEADER_LINK";
	public static final String _REG_NOW1		  	  = "_REG_NOW1";
	public static final String _CHECKOUT_BTTN		  = "_CHECKOUT_BTTN";
	public static final String _REG_NOW2		  	  = "_REG_NOW2";
	public static final String _PAY_POLICIES	  	  = "_PAY_POLICIES";
	public static final String _RESERVE				  = "_RESERVE";
	public static final String _RESERVE_TITLE		  = "The Meritage Resort and Spa in Napa | Elegant Napa Valley Hotel and Spa in Wine Country | Reservations";
	public static final String _NUMBERS		 		  = "_NUMBERS";
	public static final String _QUESTIONS		 	  = "_QUESTIONS";
	public static final String _CONTACT				  = "_CONTACT";
	public static final String _TEXT		 	 	  = "_TEXT";
	public static final String _COACTIVE_LINK		  = "_COACTIVE_LINK";
	public static final String _SEARCH_ICON			  = "_SEARCH_ICON";
	public static final String _SEARCHBOX			  = "_SEARCHBOX";
	public static final String _GO					  = "_GO";
	public static final String _RES					  = "_RES";
	public static final String _PAY_POLICIES2         = "_PAY_POLICIES2";
	
	//Constants for Blog website

	public static final String _BLOG_HOME 			  = "_BLOG_HOME";
	public static final String _COACTIVE_NETWORK_LINK_BLOG = "_COACTIVE_NETWORK_LINK";
	public static final String _FIND_COACH_LINK_BLOG		  = "_FIND_COACH_LINK";
	public static final String _ENEWSLETTER_LINK_BLOG  	  = "_ENEWSLETTER_LINK";
	public static final String _BLOG	  		  		  = "_BLOG";
	public static final String _PRESS_ROOM_BLOG			  = "_PRESS_ROOM";
	public static final String _CONTACT_US_LINK_BLOG		  = "_CONTACT_US_LINK";
	public static final String _CTI_INT		 		  = "_CTI_INT";
	public static final String _GUEST_BLOG		 	  = "_GUEST_BLOG";
	public static final String _SUB_EMAIL			  = "_SUB_EMAIL";
	public static final String _SUB_BTTN		 	  = "_SUB_BTTN";
	public static final String _UNSUB_BTTN		 	  = "_UNSUB_BTTN";
	public static final String _REC_ENT			   	  = "_REC_ENT";
	public static final String _REC_POST1			  = "_REC_POST1";
	public static final String _REC_POST2			  = "_REC_POST2";
	public static final String _REC_POST3			  = "_REC_POST3";
	public static final String _REC_POST4         	  = "_REC_POST4";
	public static final String _REC_POST5         	  = "_REC_POST5";
	public static final String _ARC         		  = "_ARC";
	public static final String ACC_TEXT         	  = "ACC_TEXT";
	public static final String PRICING_TEXT           = "PRICING_TEXT";
	
	//Constants for Coactive Marketing website

	public static final String EMAIL_BOX 			  = "EMAIL_TEXTBOX";
	public static final String PASSWORD_BOX 		  = "PASSWORD_TEXTBOX";	
	public static final String MANAGE_AUDIOS		  = "MANAGE_AUDIOS";
	public static final String MANAGE_DOCUMENTS		  = "MANAGE_DOCUMENTS";
	public static final String ADD_NEWGROUP_STARTING  = "ADD_NEWGROUP_STARTING";
	public static final String ADD_NEWGROUP  		  = "ADD_NEWGROUP";
	public static final String VIEW_PARTICIPANT_PAGES = "VIEW_PARTICIPANT_PAGES";
	public static final String TEXTAREA		 		  = "TEXTAREA"; 
	public static final String DOC_TEXTAREA			  = "DOC_TEXTAREA"; 
	public static final String BROWSE_DOC_BUTTON	  = "BROWSE_DOC_BUTTON";
	public static final String UPLOAD_DOC_BUTTON	  = "UPLOAD_DOC_BUTTON";
	public static final String CHECKBOX			   	  = "CHECKBOX";
	public static final String BROWSE_BUTTON		  = "BROWSE_BUTTON";
	public static final String UPLOAD_BUTTON		  = "UPLOAD_BUTTON";
	public static final String AUDIO_1				  = "AUDIO_1";
	public static final String DELETE_BUTTON          = "DELETE_BUTTON";
	public static final String DOWNLOAD_MP3           = "DOWNLOAD_MP3";
	public static final String DATEPICKER         	  = "DATEPICKER";
	public static final String SAVE_NEWDATE_BUTTON    = "SAVE_NEWDATE_BUTTON";
	public static final String LISTEN_TO_AUDIOS_IMAGE = "LISTEN_TO_AUDIOS_IMAGE";
	public static final String LISTEN_TO_AUDIOS_BUTTON   	= "LISTEN_TO_AUDIOS_BUTTON";
	public static final String GET_FORMS_IMAGE          	= "GET_FORMS_IMAGE";
	public static final String GET_FORMS_BUTTON          	= "GET_FORMS_BUTTON";
	public static final String LOGIN_BUTTON_IN_THANKYOU_PAGE= "LOGIN_BUTTON_IN_THANKYOU_PAGE";
	
	/* Common Constants for Coactive Sales */
	
	public static final String VIEW_REPORTS 			   = "VIEW_REPORTS";
	public static final String MANAGE_AUDIOS_SALES 		   = "MANAGE_AUDIOS_SALES";	
	public static final String MANAGE_DOCUMENTS_SALES	   = "MANAGE_DOCUMENTS_SALES";
	public static final String ADD_NEWGROUP_STARTING_SALES = "ADD_NEWGROUP_STARTING_SALES";
	public static final String LOGIN_SALES 		   		   = "LOGIN_SALES";
	public static final String VIEW_PARTICIPANT_PAGES_SALES= "VIEW_PARTICIPANT_PAGES_SALES";
	public static final String NOT_ABLE_TO_LOGIN_LINK_SALES= "NOT_ABLE_TO_LOGIN_LINK_SALES"; 
	public static final String ERROR_XPATH_SALES		   = "ERROR_XPATH_SALES";
	public static final String DROPDOWN_MENU			   = "DROPDOWN_MENU"; 
	public static final String DOWNLOAD_CSV				   = "DOWNLOAD_CSV";
	
	//Constants for Karen-Huffpost Blog website

	public static final String _GUEST_BLOG_KAREN 			  = "_GUEST_BLOG_KAREN";
	public static final String _REC_ENT_KAREN 				  = "_REC_ENT";
	public static final String _REC_COMMT					  = "_REC_COMMT";
	public static final String _ARC_KAREN  					  = "_ARC";
	public static final String _REC_POST1_KAREN	  			  = "_REC_POST1";
	public static final String _WHY_CTI_BLOG				  = "_WHY_CTI_BLOG";
	public static final String _COACH_TRAINING_BLOG			  = "_COACH_TRAINING_BLOG";
	public static final String _LEADERSHIP_BLOG 			  = "_LEADERSHIP_BLOG";
	public static final String _FOR_ORGANIZATIONS_BLOG 		  = "_FOR_ORG_BLOG";
	public static final String _OUR_FAC_BLOG 				  = "_OUR_FAC_BLOG";
	public static final String _RESOURCES_BLOG 				  = "_RESOURCES_BLOG";
		

	//Constants for Leadership Admin website

	public static final String _SIGNIN_BTTN_LEADERSHIP 			  = "_SIGNIN_BTTN_LEADERSHIP";
	public static final String _LEADERSHIP_ADM 				 	  = "_LEADERSHIP_ADM";
	public static final String _LEADERSHIP_MNGT					  = "_LEADERSHIP_MNGT";
	public static final String _MNG_TRIBES  					  = "_MNG_TRIBES";
	public static final String _ADD_TRIBES	  			  		  = "_ADD_TRIBES";
	public static final String _VIEW_LAUNCHED_TRIBES			  = "_VIEW_LAUNCHED_TRIBES";
	public static final String _MNG_PARTS			  			  = "_MNG_PARTS";
	public static final String _MNG_ASSTS 			  			  = "_MNG_ASSTS";
	public static final String _MNG_LEADERS 		  			  = "_MNG_LEADERS";
	public static final String _MNG_LEADERSHIP_ASST 			  = "_MNG_LEADERSHIP_ASST";
	public static final String _SIGNOUT 				  		  = "_SIGNOUT";
	public static final String _SIGNINFORM 				  		  = "_SIGNINFORM";
	public static final String _ADM_HOME 				  		  = "_ADM_HOME";
	public static final String _LEADERSHIP_ADMIN_TRIBE 		  	  = "_LEADERSHIP_ADMIN_TRIBE";
	public static final String _NAME 				  	 		  = "_NAME";
	public static final String _QUESTIONNAIRE 				  	  = "_QUESTIONNAIRE";
	public static final String _MED 				  	  		  = "_MED";
	public static final String _ADD_LEADER 				  	 	  = "_ADD_LEADER";
	public static final String _ADD_PART 				  	  	  = "_ADD_PART";
	public static final String _ADD_ASST 				  	  	  = "_ADD_ASST";
	public static final String _NAME_OF_PART 				  	  = "_NAME_OF_PART";
	public static final String _DIET 				  	  		  = "_DIET";
	public static final String _EX_QUESTIONNAIRE 				  = "_EX_QUESTIONNAIRE";
	public static final String _EX_MED 				  	  		  = "_EX_MED";
	public static final String _EX_DIET 				  	  	  = "_EX_DIET";
	public static final String _EX_INF 				  	  		  = "_EX_INF";
	public static final String _PART_NAME 				  	 	  = "_PART_NAME";
	public static final String _LEAD_NAME 				  	 	  = "_LEAD_NAME";
	public static final String _LEADER_PART 				  	  = "_LEADER_PART";
	public static final String _FIRST_NAME 				  	  	  = "_FIRST_NAME";
	public static final String _LAST_NAME 				  	 	  = "_LAST_NAME";
	public static final String _EMAIL 					  	      = "_EMAIL";
	public static final String _GENDER 					  	  	  = "_GENDER";
	public static final String _AGE 					  	  	  = "_AGE";
	public static final String _SAVE 					  		  = "_SAVE";
	public static final String _MOD_QUESTIONNAIRE 			  	  = "_MOD_QUESTIONNAIRE";
	public static final String _MOD_MED 					  	  = "_MOD_MED";
	public static final String _MOD_DIET 				  		  = "_MOD_DIET";
	public static final String _QUESITONNAIRE_PDF 			  	  = "_QUESITONNAIRE_PDF";
	public static final String _MP_NAME 				  		  = "_MP_NAME";
	public static final String _MP_QUEST 				  		  = "_MP_QUEST";
	public static final String _MP_MED 				  			  = "_MP_MED";
	public static final String _MP_DIET 				  		  = "_MP_DIET";
	public static final String _AGREED 				  			  = "_AGREED";
	public static final String _CURRENT_TRIBES 				  	  = "_CURRENT_TRIBES";
	public static final String _CT_TNAME 				  		  = "_CT_TNAME";
	public static final String _LOCATION 				  		  = "_LOCATION";
	public static final String _RETREAT1_DATE 				  	  = "_RETREAT1_DATE";
	public static final String _FMID 				  		  	  = "_FMID";
	public static final String _DEL 				  			  = "_DEL";
	public static final String _LAUCNHED_TRIBES 		  		  = "_LAUCNHED_TRIBES";
	public static final String _LT_TNAME 		  				  = "_LT_TNAME";
	public static final String _L_LOCATION 		  				  = "_L_LOCATION";
	public static final String _L_RETREAT1_DATE 		  		  = "_L_RETREAT1_DATE";
	public static final String _L_FMID 		  					  = "_L_FMID";
	public static final String _L_DEL 		  					  = "_L_DEL";
	public static final String _ADD_TRIBE 		  				  = "_ADD_TRIBE";
	public static final String _A_TNAME 		  				  = "_A_TNAME";
	public static final String _A_LOCATION 		  				  = "_A_LOCATION";
	public static final String _A_RETREAT1_DATE 		  		  = "_A_RETREAT1_DATE";
	public static final String _A_FMID 		  					  = "_A_FMID";
	public static final String _ADD 		  					  = "_ADD";
	public static final String _LT_EX_QUESTIONNAIRE 			  = "_LT_EX_QUESTIONNAIRE";
	public static final String _LT_EX_MED 		  				  = "_LT_EX_MED";
	public static final String _LT_EX_DIET 		  		  		  = "_LT_EX_DIET";
	public static final String _LT_EX_INF 		  		  		  = "_LT_EX_INF";
	public static final String _LEADER_NAME 		  		  	  = "_LEADER_NAME";
	public static final String _SEARCH_BOX 		  		  		  = "_SEARCH_BOX";
	public static final String _GO_LEADERSHIP 		  		  	  = "_GO";
	public static final String _EXP_ANNUAL_ASST 		  		  = "_EXP_ANNUAL_ASST";
	public static final String _ANDREA 		  		  			  = "_ANDREA";
	public static final String _ALL_PARTS 		  		  		  = "_ALL_PARTS";
	public static final String _VIEW_ALL_PARTS 		  		 	  = "_VIEW_ALL_PARTS";
	public static final String _SIGNOUT_HOME 					  = "_SIGNOUT_HOME";
	public static final String _LEAD_ASST_NAME					  = "_LEAD_ASST_NAME";
	
	//Constants for Leadership Launchpad website

	public static final String _US_WEST_COAST_LINK 				  = "_US_WEST_COAST_LINK";
	public static final String _US_EAST_COAST_LINK 				  = "_US_EAST_COAST_LINK";
	public static final String _SPAIN_LINK						  = "_SPAIN_LINK";
	public static final String _ISREAL_LINK  				  	  = "_ISREAL_LINK";
	public static final String _RETURN_COACTIVE_LEADERSHIP_LINK	  = "_RETURN_COACTIVE_LEADERSHIP_LINK";
	public static final String _RETURN_LEADERSHIP_HOME_LINK		  = "_RETURN_LEADERSHIP_HOME_LINK";
	public static final String _COACTIVE_LEADERSHIP			  	  = "_COACTIVE_LEADERSHIP";
	public static final String _COACTIVE_IMG 			  		  = "_COACTIVE_IMG";
	public static final String _LOGIN 		  					  = "_LOGIN";
	public static final String _GO_LAUNCHPAD 				 	  = "_GO";
	public static final String _LEADERSHIP_JOURNEY 				  = "_LEADERSHIP_JOURNEY";
	public static final String _NORTHERNCAL 			  		  = "_NORTHERNCAL";
	public static final String _STEP1 							  = "_STEP1";
	public static final String _STEP2 							  = "_STEP2";
	public static final String _STEP3 							  = "_STEP3";
	public static final String _MED_FORM_LINK 					  = "_MED_FORM_LINK";
	public static final String _FORM_HEADING 					  = "_FORM_HEADING";
	public static final String _BACKGROUND_FORM_LINK 			  = "_BACKGROUND_FORM_LINK";
	public static final String _PDF_LINK 						  = "_PDF_LINK";
	public static final String _WORD_LINK 						  = "_WORD_LINK";
	public static final String _TRAVEL_LINK 					  = "_TRAVEL_LINK";
	public static final String _DIRECTIONS_LINK 				  = "_DIRECTIONS_LINK";
	public static final String _DIETARY_FORM 					  = "_DIETARY_FORM";
	
	/* Common constants to ALL websites */

	public static final String _HEADER_IMG			      = "_HEADER_IMG";
	public static final String _C_HOME					  = "_C_HOME";
	public static final String _COACTIVE_NETWORK_LINK 	  = "_COACTIVE_NETWORK_LINK";
	public static final String _FIND_COACH_LINK		      = "_FIND_COACH_LINK";
	public static final String _ENEWSLETTER_LINK  	      = "_ENEWSLETTER_LINK";
	public static final String _PRESS_ROOM			      = "_PRESS_ROOM";
	public static final String _CONTACT_US_LINK		      = "_CONTACT_US_LINK";
	public static final String _CTI_INT_LINK 		      = "_CTI_INT_LINK";
	public static final String _BLOG_LINK	  		      = "_BLOG_LINK";
	public static final String EMAIL_TEXTBOX 			  = "EMAIL_TEXTBOX";
	public static final String PASSWORD_TEXTBOX 	 	  = "PASSWORD_TEXTBOX";
	public static final String LOGIN_BUTTON 		 	  = "LOGIN_BUTTON";
	public static final String NOT_ABLE_TO_LOGIN_LINK	  = "NOT_ABLE_TO_LOGIN_LINK";
	public static final String PRIVACY_POLICY_LINK 	 	  = "PRIVACY_POLICY_LINK";
	public static final String DISCLOSURE_LINK 		 	  = "DISCLOSURE_LINK";
	public static final String PORTRAIT_IMAGE 		      = "PORTRAIT_IMAGE";
	public static final String COACTIVE_LOGO 		      = "COACTIVE_LOGO";
	public static final String ICF_LOGO 			      = "ICF_LOGO";
	public static final String _B_HOME_LINK 			  = "_B_HOME_LINK";
	public static final String _B_LINK2 				  = "_B_LINK2";
	public static final String _B_LINK3 ="_B_LINK3";
	public static final String BREADCRUMB_HOME_MAR	  = "BREADCRUMB_HOME_MAR";
	public static final String BREADCRUMB_LOGOUT_MAR  = "BREADCRUMB_LOGOUT_MAR";
	public static final String ERROR_XPATH				  = "ERROR_XPATH";
	public static final String ERROR_MESSAGE  			  = "ERROR_MESSAGE"; 
	public static final String ERROR_MESSAGE_MRKT  	 	  = "ERROR_MESSAGE_MRKT"; 
	
	public static final String HOMEPAGE_TITLE			  = "HOMEPAGE_TITLE"; 
	public static final String COACHTRAINING_TITLE		  = "COACHTRAINING_TITLE"; 
	public static final String E_NEWSLETTER_TITLE 		  = "E_NEWSLETTER_TITLE";
	public static final String CONTACT_US_TITLE 		  = "CONTACT_US_TITLE";
	public static final String _MYCART_TITLE 			  = "_MYCART_TITLE";
	public static final String _CHECKOUT_TITLE 			  = "_CHECKOUT_TITLE";
	public static final String _BLOG_TITLE 				  = "_BLOG_TITLE";
	public static final String _PRESS_TITLE 			  = "_PRESS_TITLE";
	public static final String COACTIVE_TITLE 			  = "COACTIVE_TITLE";
	public static final String FIND_A_COACH_TITLE 		  = "FIND_A_COACH_TITLE";
	public static final String _CTI_INT_TITLE			  = "_CTI_INT_TITLE";
	public static final String _MZINGA_TITLE			  = "_MZINGA_TITLE";
	public static final String _AMBASSADOR_TITLE		  = "_AMBASSADOR_TITLE";
	
	public static final String _ABOUT_CTI_SUBMENU 		  = "_ABOUT_CTI_SUBMENU";
	public static final String _WHAT_IS_COACTIVE_SUBMENU  = "_WHAT_IS_COACTIVE_SUBMENU";
	public static final String _MANAGEMENT_TEAM_SUBMENU   = "_MANAGEMENT_TEAM_SUBMENU";
	public static final String _FACULTY_SUBMENU 		  = "_FACULTY_SUBMENU";
	public static final String _BUY_THEBOOK_SUBMENU 	  = "_BUY_THEBOOK_SUBMENU";
	public static final String _ACCREDITATIONS_SUBMENU 	  = "_ACCREDITATIONS_SUBMENU";
	public static final String _CTI_INTERNATIONAL_SUBMENU = "_CTI_INTERNATIONAL_SUBMENU";
	public static final String _CORE_COURSES_SUBMENU 	  = "_CORE_COURSES_SUBMENU";
	public static final String _CERTIFICATION_SUBMENU 	  = "_CERTIFICATION_SUBMENU";
	public static final String _DATES_LOCATIONS_SUBMENU   = "_DATES_LOCATIONS_SUBMENU";
	public static final String _PRICING_REGISTRATION_SUBMENU  = "_PRICING_REGISTRATION_SUBMENU";
	public static final String _COACHTRAINING_FACULTY_SUBMENU = "_COACHTRAINING_FACULTY_SUBMENU";
	public static final String _FAQS_SUBMENU 				  = "_FAQS_SUBMENU";
	public static final String _COLLEGE_EQUIVALENCE_SUBMENU   = "_COLLEGE_EQUIVALENCE_SUBMENU";
	public static final String _PROFILES_SUBMENU 			  = "_PROFILES_SUBMENU";
	public static final String _RESOURCES_SUBMENU 			  = "_RESOURCES_SUBMENU";
	public static final String _BUSINESS_SUCCESS_TRAINING_SUBMENU   = "_BUSINESS_SUCCESS_TRAINING_SUBMENU";
	public static final String _BUILDING_BUSINESS_SUBMENU 			= "_BUILDING_BUSINESS_SUBMENU";
	public static final String _ASSISTING_SUBMENU 				    = "_ASSISTING_SUBMENU";
	public static final String _ORG_INTERNAL_COACTIVECOACH_SUBMENU  = "_ORG_INTERNAL_COACTIVECOACH_SUBMENU";
	public static final String _ORG_TALENTCHAMPIONS_SUBMENU 		= "_ORG_TALENTCHAMPIONS_SUBMENU";
	public static final String _ORG_LEADERSHIPADVANTAGE_SUBMENU 	= "_ORG_LEADERSHIPADVANTAGE_SUBMENU";
	public static final String _ORG_RELATIONSHIPAGILITY_SUBMENU 	= "_ORG_RELATIONSHIPAGILITY_SUBMENU";
	public static final String _ORG_CLIENTLIST_SUBMENU 				= "_ORG_CLIENTLIST_SUBMENU";
	public static final String _ORG_PROFILES_SUBMENU 				= "_ORG_PROFILES_SUBMENU";
	public static final String _ORG_RESOURCES_SUBMENU 				= "_ORG_RESOURCES_SUBMENU";
	public static final String _ORG_TRAINING_SUBMENU 				= "_ORG_TRAINING_SUBMENU";
	public static final String _LEADERSHIP_PROGRAM_OVERVIEW_SUBMENU = "_LEADERSHIP_PROGRAM_OVERVIEW_SUBMENU";
	public static final String _LEADERSHIP_RETREATS_SUBMENU 		= "_LEADERSHIP_RETREATS_SUBMENU";
	public static final String _LEADERSHIP_DATESLOCATIONS_SUBMENU 	= "_LEADERSHIP_DATESLOCATIONS_SUBMENU";
	public static final String _LEADERSHIP_PROGRAM_FAQS_SUBMENU 	= "_LEADERSHIP_PROGRAM_FAQS_SUBMENU";
	public static final String _LEADERSHIP_FAQS_SUBMENU 			= "_LEADERSHIP_FAQS_SUBMENU";
	public static final String _LEADERSHIP_PRICING_REGISTRATION_SUBMENU  = "_LEADERSHIP_PRICING_REGISTRATION_SUBMENU";
	public static final String _LEADERSHIP_FACULTY_SUBMENU 				 = "_LEADERSHIP_FACULTY_SUBMENU";
	public static final String _LEADERSHIP_COLLEGE_EQUIVALENCE_SUBMENU 	 = "_LEADERSHIP_COLLEGE_EQUIVALENCE_SUBMENU";
	public static final String _LEADERSHIP_ACCREDITATION_SUBMENU 		 = "_LEADERSHIP_ACCREDITATION_SUBMENU";
	public static final String _LEADERSHIP_PROFILES_SUBMENU 			 = "_LEADERSHIP_PROFILES_SUBMENU";
	public static final String _LEADER_CREATINGFROMSELF_SUBMENU 		 = "_LEADER_CREATINGFROMSELF_SUBMENU";
	public static final String _LEADERSHIP_RESOURCES_SUBMENU 			 = "_LEADERSHIP_RESOURCES_SUBMENU";
	public static final String _LEADER_FROMWITHIN_SUBMENU 				 = "_LEADER_FROMWITHIN_SUBMENU";
	public static final String _THELEADERSHIP_WAY_SUBMENU 				 = "_THELEADERSHIP_WAY_SUBMENU";
	public static final String _CONNECT_LOCALLY_SUBMENU 				 = "_CONNECT_LOCALLY_SUBMENU";
	public static final String _EVENTS_CALENDAR_SUBMENU 				 = "_EVENTS_CALENDAR_SUBMENU";
	public static final String _2014_COACTIVE_SUMMIT_SUBMENU 			 = "_2014_COACTIVE_SUMMIT_SUBMENU";
	public static final String _INSTITUTE_OF_COACHING_SUBMENU 			 = "_INSTITUTE_OF_COACHING_SUBMENU";
	public static final String _HENRY_ONTHE_RADIO_SUBMENU 				 = "_HENRY_ONTHE_RADIO_SUBMENU";
	public static final String _DISRUPT_YOURLIFE_GOODWAY_SUBMENU 		 = "_DISRUPT_YOURLIFE_GOODWAY_SUBMENU";
	public static final String _COACTIVE_GLOBAL_NEWSLETTER_SUBMENU 		 = "_COACTIVE_GLOBAL_NEWSLETTER_SUBMENU";
	public static final String _WHY_CTI									 = "_WHY_CTI";
	public static final String _COACH_TRAINING							 = "_COACH_TRAINING";
	public static final String _LEADERSHIP								 = "_LEADERSHIP";
	public static final String _FOR_ORGANIZATIONS						 = "_FOR_ORGANIZATIONS";
	public static final String _COMMUNITY								 = "_COMMUNITY";
	public static final String _RESOURCES								 = "_RESOURCES";
	public static final String _OUR_FAC 								 = "_OUR_FAC";
	public static final String _ABOUT_CTI_TITLE							 = "_ABOUT_CTI_TITLE";
	public static final String _COACTIVE_TITLE							 = "_COACTIVE_TITLE";
	public static final String _MNGT_TITLE								 = "_MNGT_TITLE";
	public static final String _BUY_BOOK_TITLE							 = "_BUY_BOOK_TITLE";
	public static final String _ACC_FAQ_TITLE							 = "_ACC_FAQ_TITLE";
	public static final String _COURSES_TITLE							 = "_COURSES_TITLE";
	public static final String _CERTIFICATION_TITLE						 = "_CERTIFICATION_TITLE";
	public static final String _DATES_TITLE								 = "_DATES_TITLE";
	public static final String _PRICING_TITLE							 = "_PRICING_TITLE";
	public static final String _FACULTY_TITLE							 = "_FACULTY_TITLE";
	public static final String _FAQS_TITLE								 = "_FAQS_TITLE";
	public static final String _PROFILES_TITLE							 = "_PROFILES_TITLE";
	public static final String _RESOURCES_TITLE							 = "_RESOURCES_TITLE";
	public static final String _BUILDING_BUS_TITLE						 = "_BUILDING_BUS_TITLE";
	public static final String _ASSISTING_TITLE							 = "_ASSISTING_TITLE";
	public static final String _PRG_OVR_TITLE							 = "_PRG_OVR_TITLE";
	public static final String _RETREATS_TITLE							 = "_RETREATS_TITLE";
	public static final String _LEADER_DATES_TITLE						 = "_LEADER_DATES_TITLE";
	public static final String _LEADER_FAQS_TITLE						 = "_LEADER_FAQS_TITLE";
	public static final String _LEADER_PRICING_TITLE					 = "_LEADER_PRICING_TITLE";
	public static final String _LEADER_FACULTY_TITLE					 = "_LEADER_FACULTY_TITLE";
	public static final String _LEADER_ACC_TITLE						 = "_LEADER_ACC_TITLE";
	public static final String _LEADER_PROFILES_TITLE					 = "_LEADER_PROFILES_TITLE";
	public static final String _LEADER_CREATING_SELF_TITLE				 = "_LEADER_CREATING_SELF_TITLE";
	public static final String _LEADER_RESOURCES_TITLE					 = "_LEADER_RESOURCES_TITLE";
	public static final String _ORG_INTERNAL_COACTIVECOACH_TITLE		 = "_ORG_INTERNAL_COACTIVECOACH_TITLE";
	public static final String _ORG_TALENTCHAMPIONS_TITLE				 = "_ORG_TALENTCHAMPIONS_TITLE";
	public static final String _ORG_LEADERSHIPADVANTAGE_TITLE			 = "_ORG_LEADERSHIPADVANTAGE_TITLE";
	public static final String _ORG_RELATIONSHIPAGILITY_TITLE			 = "_ORG_RELATIONSHIPAGILITY_TITLE";
	public static final String _ORG_CLIENTLIST_TITLE					 = "_ORG_CLIENTLIST_TITLE";
	public static final String _ORG_PROFILES_TITLE						 = "_ORG_PROFILES_TITLE";
	public static final String _ORG_RESOURCES_TITLE 					 = "_ORG_RESOURCES_TITLE";
	public static final String _CONNECT_LOCALLY_TITLE					 = "_CONNECT_LOCALLY_TITLE";
	public static final String _EVENTS_CALENDAR_TITLE					 = "_EVENTS_CALENDAR_TITLE";
	public static final String _2014_COACTIVE_SUMMIT_TITLE				 = "_2014_COACTIVE_SUMMIT_TITLE";
	public static final String _INSTITUTE_OF_COACHING_TITLE				 = "_INSTITUTE_OF_COACHING_TITLE";
	public static final String _HENRY_ONTHE_RADIO_TITLE					 = "_HENRY_ONTHE_RADIO_TITLE";
	public static final String _DISRUPT_YOURLIFE_GOODWAY_TITLE			 = "_DISRUPT_YOURLIFE_GOODWAY_TITLE";
	public static final String _COACTIVE_GLOBAL_NEWSLETTER_TITLE		 = "_COACTIVE_GLOBAL_NEWSLETTER_TITLE";
	public static final String JOBS_TITLE							 	 = "JOBS_TITLE";
	public static final String _CART_LINK							 	 = "_CART_LINK";
	public static final String _CHECKOUT_LINK							 = "_CHECKOUT_LINK";
	public static final String _HOME_LINK								 = "_HOME_LINK";
	
	/* Constants for Footer Wrapper */
	
	public static final String _FOOTER_SIGNUP_NEWS						 = "_FOOTER_SIGNUP_NEWS";
	public static final String _CTI									 	 = "_CTI";
	public static final String _SPL									 	 = "_SPL";
	public static final String _NEWS									 = "_NEWS";
	public static final String _BLOG_FOOTER									 = "_BLOG_FOOTER";
	public static final String _FOOTER_WEBINAR_LINK					 	 = "_FOOTER_WEBINAR_LINK";
	public static final String _EVENTS_CAL_LINK					 		 = "_EVENTS_CAL_LINK";
}