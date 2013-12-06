package test.java.com.cti.website.leadershipAdministration;

import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.w3c.dom.Element;
import test.java.com.cti.common.Common;
import test.java.com.cti.utils.CommonConstants;
import test.java.com.cti.utils.XMLUtils;

/**
 * This test covers the Leadership Administration website  - View Launched Tribes link
 * @author Preethi
 */

public class ViewLaunchedTribesTest extends Common{
	
	private HashMap<String, String> hashMap;	
	
	@BeforeClass
	public void setup() throws Exception
	{
		super.setup();
		this.hashMap = new HashMap<String,String>();
		HashMap<String,String> hm = new HashMap<String,String>();
		Element root = XMLUtils.getroot(CommonConstants.xmlFilePath_leadershipAdmin);
		hashMap = XMLUtils.getValues(root,CommonConstants.LEADERSHIP_ADMIN_HOME_TAG,hm);
		Element root2 = XMLUtils.getroot(CommonConstants.xmlFilePath_leadershipAdmin);
		hashMap = XMLUtils.getValues(root2,CommonConstants.LEADERSHIP_ADMIN_CHILD_TAG,hm);
		Element root1 = XMLUtils.getroot(CommonConstants.xmlFilePath_common);
		hashMap = XMLUtils.getValues(root1,CommonConstants.COMMON_ELEMENTS_TAG,hm);
	}
	

	@Test 
	public void viewLaunchedTribes(){
			try {
				driver.get(URL_LEADERSHIP + CommonConstants.LEADERSHIP_ADMIN_URL);
				waitForElementPresent(hashMap.get(CommonConstants._HOME_LINK));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SIGNINFORM)));
				type(hashMap.get(CommonConstants.EMAIL_TEXTBOX),"ping@me.com");
				type(hashMap.get(CommonConstants.PASSWORD_TEXTBOX),"abc123");
				click(hashMap.get(CommonConstants._SIGNIN_BTTN_LEADERSHIP));
				
				//To click on View Launched Tribes link
				click(hashMap.get(CommonConstants._VIEW_LAUNCHED_TRIBES));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LEADERSHIP_ADMIN_TRIBE)));
				Assert.assertEquals(getText(hashMap.get(CommonConstants._LEADERSHIP_ADMIN_TRIBE)), "Launchpad Administration - Tribe");

				// To check if all the four columns appear
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._NAME)));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._QUESTIONNAIRE)));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._MED)));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._DIET)));
				
				//To check if all the download links are displayed
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LT_EX_QUESTIONNAIRE)));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LT_EX_MED)));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LT_EX_DIET)));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LT_EX_INF)));
		
				//Editing participant by double clicking on the name 
				click(hashMap.get(CommonConstants._LEAD_NAME));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LEADER_PART)));
				Assert.assertEquals(getText(hashMap.get(CommonConstants._LEADER_PART)), "Launchpad Administration - Leader");

				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._FIRST_NAME)));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LAST_NAME)));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._EMAIL)));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._GENDER)));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._AGE)));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SAVE)));
			
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._MOD_QUESTIONNAIRE)));
				click(hashMap.get(CommonConstants._MOD_QUESTIONNAIRE));
				Assert.assertTrue(verifyTextPresent("Program Questionnaire"));
				driver.navigate().back();
				
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._MOD_MED)));
				click(hashMap.get(CommonConstants._MOD_MED));
				Assert.assertTrue(verifyTextPresent("Medical Information"));
				driver.navigate().back();
				
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._MOD_DIET)));
				click(hashMap.get(CommonConstants._MOD_DIET));
				Assert.assertTrue(verifyTextPresent("Dietary Requirements"));
				driver.navigate().back();
				
				click(hashMap.get(CommonConstants._ADM_HOME));
			    Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LEADERSHIP_ADM)));
			    Assert.assertEquals(getText(hashMap.get(CommonConstants._LEADERSHIP_ADM)),"Leadership Launchpad Administration");
				driver.navigate().back();
			   
				click(hashMap.get(CommonConstants._SIGNOUT_HOME));
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SIGNINFORM)));
				Assert.assertEquals(getText(hashMap.get(CommonConstants._SIGNINFORM)),"Sign In Page for Administration");
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
