package test.java.com.cti.website.coactivemarketing;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.w3c.dom.Element;

import test.java.com.cti.common.Common;
import test.java.com.cti.utils.CommonConstants;
import test.java.com.cti.utils.XMLUtils;


public class HomepageTest extends Common{

	private HashMap<String, String> hashMap;		

	/*private String EMAIL_TEXTBOX = "xpath=//*[@id='signin_username']";
	private String PASSWORD_TEXTBOX = "xpath=//*[@id='signin_password']";
	private String LOGIN_BUTTON = "xpath=//*[@id='main']/div[3]/form/table/tbody/tr[3]/td[2]/input";
	private String NOT_ABLE_TO_LOGIN_LINK = "xpath=//*[@id='main']/div[3]/form/table/tbody/tr[4]/td[2]/a";
	
	private String PRIVACY_POLICY_LINK = "xpath=//*[@id='privacy-link']";
	private String DISCLOSURE_LINK = "xpath=//*[@id='footer-legal']/a[2]";
	private String SURVEY_IMAGE = "xpath=//*[@id='broadcast']/img";
	private String COACTIVE_LOGO = "xpath=//*[@id='cti-logo-tagged']";
	private String ICF_LOGO = "xpath=//*[@id='icf-logo']";
	
	private String ERROR_XPATH = "xpath=//*[@id='main']/div[3]/p";
	private String ERROR_MESSAGE = "The email address or password did not match our records. Please try again.";
	private String BREADCRUMB_HOME = "xpath=//*[@id='main']/div[2]/a[1]";
	private String BREADCRUMB_LOGOUT = "xpath=//*[@id='main']/div[2]/a[2]";
	private String MANAGE_AUDIOS = "xpath=//*[@id='main']/div[4]/p[2]/a";
	private String MANAGE_DOCUMENTS = "xpath=//*[@id='main']/div[4]/p[2]/a[2]";
	private String ADD_NEWGROUP_STARTING = "xpath=//*[@id='main']/div[4]/p[2]/a[3]";
	private String VIEW_PARTICIPANT_PAGES = "xpath=//*[@id='main']/div[4]/p[2]/a[4]";*/
	
	@BeforeClass
	public void setup() throws Exception
	{
		super.setup();

		this.hashMap = new HashMap<String,String>();
		HashMap<String,String> hm = new HashMap<String,String>();
		Element root = XMLUtils.getroot(CommonConstants.xmlFilePath_coactivemrkt);
		hashMap = XMLUtils.getValues(root,CommonConstants.COACTIVE_MARK_HOME_TAG,hm);
		Element root1 = XMLUtils.getroot(CommonConstants.xmlFilePath_common);
		hashMap = XMLUtils.getValues(root1,CommonConstants.COMMON_ELEMENTS_TAG,hm);
	}
	
	@Test
	public void verifyLinks(){
		try {
			driver.get(baseURL + CommonConstants.COACTIVE_MARK_HOME_URL);
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.EMAIL_TEXTBOX)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.PASSWORD_TEXTBOX)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.LOGIN_BUTTON)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.NOT_ABLE_TO_LOGIN_LINK)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.PRIVACY_POLICY_LINK)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.DISCLOSURE_LINK)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._HEADER_IMG)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.COACTIVE_LOGO)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.ICF_LOGO)));

			}
		catch (Exception e) {

			Assert.assertTrue(false, e.getMessage()+" URL: "+ driver.getCurrentUrl());

		}
	}
	
	@Test (dependsOnMethods = "verifyLinks") 
	public void emptyCredentials(){
		try {
			
			type((hashMap.get(CommonConstants.EMAIL_TEXTBOX)),"");
			type((hashMap.get(CommonConstants.PASSWORD_TEXTBOX)),"");
			click(hashMap.get(CommonConstants.LOGIN_BUTTON));
			String message = getText(hashMap.get(CommonConstants.ERROR_XPATH));
			Assert.assertEquals(message, hashMap.get(CommonConstants.ERROR_MESSAGE_MRKT));
			type(hashMap.get(CommonConstants.EMAIL_TEXTBOX),"ping@me.com");
			type(hashMap.get(CommonConstants.PASSWORD_TEXTBOX),"");
			click(hashMap.get(CommonConstants.LOGIN_BUTTON));
			String message2 = getText(hashMap.get(CommonConstants.ERROR_XPATH));
			Assert.assertEquals(message2, hashMap.get(CommonConstants.ERROR_MESSAGE_MRKT));
			type(hashMap.get(CommonConstants.EMAIL_TEXTBOX),"");
			type(hashMap.get(CommonConstants.PASSWORD_TEXTBOX),"abc123");
			click(hashMap.get(CommonConstants.LOGIN_BUTTON));
			String message3 = getText(hashMap.get(CommonConstants.ERROR_XPATH));
			Assert.assertEquals(message3, hashMap.get(CommonConstants.ERROR_MESSAGE_MRKT));
			}
		catch (Exception e) {

			Assert.assertTrue(false, e.getMessage()+" URL: "+ driver.getCurrentUrl());
		}
	}
	
	@Test (dependsOnMethods = "emptyCredentials") 
	public void adminHomePage(){
		try {
			driver.get(baseURL + CommonConstants.COACTIVE_MARK_HOME_URL);		
			type(hashMap.get(CommonConstants.EMAIL_TEXTBOX),"ping@me.com");
			type(hashMap.get(CommonConstants.PASSWORD_TEXTBOX),"abc123");
			click(hashMap.get(CommonConstants.LOGIN_BUTTON));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.BREADCRUMB_HOME_MAR)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.BREADCRUMB_LOGOUT_MAR)));
			//Assert.assertTrue(verifyTextPresent("Administration Home Page"));
			Assert.assertTrue(verifyTextPresent("Pages"));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.MANAGE_AUDIOS)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.MANAGE_DOCUMENTS)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.ADD_NEWGROUP_STARTING)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.VIEW_PARTICIPANT_PAGES)));
			}
		catch (Exception e) {

			Assert.assertTrue(false, e.getMessage()+" URL: "+ driver.getCurrentUrl());
		}
	}
	@AfterClass
	public void quit()
	{
		tearDown();
	} 
	
}
