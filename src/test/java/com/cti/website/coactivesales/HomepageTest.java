package test.java.com.cti.website.coactivesales;

import java.util.HashMap;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.w3c.dom.Element;
import test.java.com.cti.common.Common;
import test.java.com.cti.utils.CommonConstants;
import test.java.com.cti.utils.XMLUtils;

/**
 * This test covers the Coactive Sales website
 * @author Preethi
 */

public class HomepageTest extends Common{
	
	private HashMap<String, String> hashMap;		

	@BeforeClass
	public void setup() throws Exception
	{
		super.setup();
		this.hashMap = new HashMap<String,String>();
		HashMap<String,String> hm = new HashMap<String,String>();
		Element root = XMLUtils.getroot(CommonConstants.xmlFilePath_coactivesales);
		hashMap = XMLUtils.getValues(root,CommonConstants.COACTIVE_SALES_HOME_TAG,hm);
		Element root1 = XMLUtils.getroot(CommonConstants.xmlFilePath_common);
		hashMap = XMLUtils.getValues(root1,CommonConstants.COMMON_ELEMENTS_TAG,hm);
	}
	
	
		
	@Test
	public void verifyLinks(){
		try {
			coachesURL = "http://" + System.getProperty("coaches.url") + "/" ;
			driver.get(coachesURL + CommonConstants.COACTIVE_SALES_HOME_URL);
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.EMAIL_TEXTBOX)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.PASSWORD_TEXTBOX)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.LOGIN_SALES)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.NOT_ABLE_TO_LOGIN_LINK_SALES)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.PRIVACY_POLICY_LINK)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.DISCLOSURE_LINK)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._HEADER_IMG)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.PORTRAIT_IMAGE)));
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
			
			type(hashMap.get(CommonConstants.EMAIL_TEXTBOX),"");
			type(hashMap.get(CommonConstants.PASSWORD_TEXTBOX),"");
			click(hashMap.get(CommonConstants.LOGIN_SALES));
			waitForElementPresent(hashMap.get(CommonConstants.ERROR_XPATH_SALES));
			String message = getText(hashMap.get(CommonConstants.ERROR_XPATH_SALES));
			Assert.assertEquals(message, hashMap.get(CommonConstants.ERROR_MESSAGE_MRKT));
			type(hashMap.get(CommonConstants.EMAIL_TEXTBOX),"ping@me.com");
			type(hashMap.get(CommonConstants.PASSWORD_TEXTBOX),"");
			click(hashMap.get(CommonConstants.LOGIN_SALES));
			String message2 = getText(hashMap.get(CommonConstants.ERROR_XPATH_SALES));
			Assert.assertEquals(message2, hashMap.get(CommonConstants.ERROR_MESSAGE_MRKT));
			type(hashMap.get(CommonConstants.EMAIL_TEXTBOX),"");
			type(hashMap.get(CommonConstants.PASSWORD_TEXTBOX),"abc123");
			click(hashMap.get(CommonConstants.LOGIN_SALES));
			String message3 = getText(hashMap.get(CommonConstants.ERROR_XPATH_SALES));
			Assert.assertEquals(message3, hashMap.get(CommonConstants.ERROR_MESSAGE_MRKT));
			}
		catch (Exception e) {
			Assert.assertTrue(false, e.getMessage()+" URL: "+ driver.getCurrentUrl());
		}
	}
	
	@Test (dependsOnMethods = "emptyCredentials") 
	public void adminHomePage(){
		try {
			
			type(hashMap.get(CommonConstants.EMAIL_TEXTBOX),"ping@me.com");
			type(hashMap.get(CommonConstants.PASSWORD_TEXTBOX),"abc123");
			click(hashMap.get(CommonConstants.LOGIN_SALES));
			Assert.assertTrue(	verifyElementPresent(hashMap.get(CommonConstants.BREADCRUMB_HOME_MAR)));
			Assert.assertTrue(	verifyElementPresent(hashMap.get(CommonConstants.BREADCRUMB_LOGOUT_MAR)));
			Assert.assertTrue(	verifyTextPresent("Administration Home Page"));
			Assert.assertTrue(	verifyElementPresent(hashMap.get(CommonConstants.VIEW_REPORTS)));
			Assert.assertTrue(	verifyElementPresent(hashMap.get(CommonConstants.MANAGE_AUDIOS_SALES)));
			Assert.assertTrue(	verifyElementPresent(hashMap.get(CommonConstants.MANAGE_DOCUMENTS_SALES)));
			Assert.assertTrue(	verifyElementPresent(hashMap.get(CommonConstants.ADD_NEWGROUP_STARTING_SALES)));
			Assert.assertTrue(	verifyElementPresent(hashMap.get(CommonConstants.VIEW_PARTICIPANT_PAGES_SALES)));
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

