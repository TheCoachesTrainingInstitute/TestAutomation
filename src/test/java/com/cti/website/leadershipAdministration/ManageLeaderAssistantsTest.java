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
 * This test covers the Leadership Administration website  - Manage LeaderAssistants link
 * @author Preethi
 */

public class ManageLeaderAssistantsTest extends Common{
	
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
	public void manageLeaderAssistants(){
	try {
		driver.get(URL_LEADERSHIP + CommonConstants.LEADERSHIP_ADMIN_URL);
		waitForElementPresent(hashMap.get(CommonConstants._HOME_LINK));
		Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SIGNINFORM)));
		type(hashMap.get(CommonConstants.EMAIL_TEXTBOX),"ping@me.com");
		type(hashMap.get(CommonConstants.PASSWORD_TEXTBOX),"abc123");
		click(hashMap.get(CommonConstants._SIGNIN_BTTN_LEADERSHIP));
		
		//To click on Manage Leadership Assistants link
		click(hashMap.get(CommonConstants._MNG_LEADERSHIP_ASST));
		Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LEADERSHIP_ADMIN_TRIBE)));
		Assert.assertEquals(getText(hashMap.get(CommonConstants._LEADERSHIP_ADMIN_TRIBE)), "Launchpad Administration - Leadership Assistants Annual Questionnaire");
		//Validating other links
		Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._EXP_ANNUAL_ASST)));
		
		// To check if name column appear
		Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._MP_NAME)));

		//Validating Search Boxs
		Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SEARCH_BOX)));
		Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._GO)));
		type(hashMap.get(CommonConstants._SEARCH_BOX), "Andrea");
		click(hashMap.get(CommonConstants._GO));
		Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._ANDREA)));
		driver.navigate().back();
		
		//Clicking on View All participants link
		click(hashMap.get(CommonConstants._VIEW_ALL_PARTS));
		Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._ALL_PARTS)));
				
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
