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
 * This test covers the Leadership Administration website  - home page
 * @author Preethi
 */

public class LeadershipAdminTest extends Common{
	
	private HashMap<String, String> hashMap;	
		
	@BeforeClass
	public void setup() throws Exception
	{
		super.setup();
		this.hashMap = new HashMap<String,String>();
		HashMap<String,String> hm = new HashMap<String,String>();
		Element root = XMLUtils.getroot(CommonConstants.xmlFilePath_leadershipAdmin);
		hashMap = XMLUtils.getValues(root,CommonConstants.LEADERSHIP_ADMIN_HOME_TAG,hm);
		Element root1 = XMLUtils.getroot(CommonConstants.xmlFilePath_common);
		hashMap = XMLUtils.getValues(root1,CommonConstants.COMMON_ELEMENTS_TAG,hm);
	}
	
	 // Verifying the functionality of Header links
	@Test
	public void headerLinks(){	
		try {
			driver.get(URL_LEADERSHIP + CommonConstants.LEADERSHIP_ADMIN_URL);
			click(hashMap.get(CommonConstants._HOME_LINK));
			waitForElementPresent(hashMap.get(CommonConstants._C_HOME));
			Assert.assertTrue(driver.getTitle().equals(hashMap.get(CommonConstants.HOMEPAGE_TITLE)), "The Actual Page Title is: "+ driver.getTitle() +" Did Not Match With Expected Title: "+ hashMap.get(CommonConstants.HOMEPAGE_TITLE));
			driver.navigate().back();
			click(hashMap.get(CommonConstants._COACTIVE_NETWORK_LINK));
			Assert.assertEquals(driver.getTitle(), hashMap.get(CommonConstants.COACTIVE_TITLE));
			driver.navigate().back();
			click(hashMap.get(CommonConstants._FIND_COACH_LINK));
			Assert.assertEquals(driver.getTitle(), hashMap.get(CommonConstants.FIND_A_COACH_TITLE));
			driver.navigate().back();
			click(hashMap.get(CommonConstants._CART_LINK));
			Assert.assertEquals(driver.getTitle(), hashMap.get(CommonConstants._MYCART_TITLE));
			driver.navigate().back();
			click(hashMap.get(CommonConstants._CHECKOUT_LINK));
			Thread.sleep(2000);
			Assert.assertEquals(driver.getTitle(), hashMap.get(CommonConstants._CHECKOUT_TITLE));
			driver.navigate().back();
			//The above program throws error for eNewsletter, Contact Us and Privacy Policy links
		}
		catch (Exception e) {

			Assert.assertTrue(false, e.getMessage()+" URL: "+ driver.getCurrentUrl());
		}
		}

	// To check for the Breadcrumb links
	
		@Test (dependsOnMethods = "headerLinks", alwaysRun =true)
		public void breadcrumbs(){
			try {
				driver.get(URL_LEADERSHIP + CommonConstants.LEADERSHIP_ADMIN_URL);
				click(hashMap.get(CommonConstants._B_HOME_LINK));
				//waitForElementPresent(_HOME_LINK);
				Assert.assertTrue(driver.getTitle().equals(hashMap.get(CommonConstants.HOMEPAGE_TITLE)), "The Actual Page Title is: "+ driver.getTitle() +" Did Not Match With Expected Title: "+ hashMap.get(CommonConstants.HOMEPAGE_TITLE));
				driver.navigate().back();
				click(hashMap.get(CommonConstants._B_LINK2));
				waitForElementPresent(hashMap.get(CommonConstants._C_HOME));
				Assert.assertEquals(driver.getTitle(), hashMap.get(CommonConstants.COACHTRAINING_TITLE));
				driver.navigate().back();
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._B_LINK3)));
				Assert.assertTrue(verifyTextPresent("Sign In Page for Administration"));
				}
			catch (Exception e) {

				Assert.assertTrue(false, e.getMessage()+" URL: "+ driver.getCurrentUrl());

			}
		}	
		// To check for the Home page - leadership launchpad administration page
		
			@Test (dependsOnMethods = "breadcrumbs", alwaysRun =true) 
			public void home(){
				try {
					driver.get(URL_LEADERSHIP + CommonConstants.LEADERSHIP_ADMIN_URL);
					waitForElementPresent(hashMap.get(CommonConstants._HOME_LINK));
					Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SIGNINFORM)));
					Assert.assertEquals(getText(hashMap.get(CommonConstants._SIGNINFORM)),"Sign In Page for Administration");
			
					type(_USERNAME,"ping@me.com");
					type(_PASSWORD,"abc123");
					click(hashMap.get(CommonConstants._SIGNIN_BTTN_LEADERSHIP));
					//To check for Leadership Administration title
					Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LEADERSHIP_ADM)));
					Assert.assertEquals(getText(hashMap.get(CommonConstants._LEADERSHIP_ADM)),"Leadership Launchpad Administration");
					
					// To check for Leadership Management title
					Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LEADERSHIP_MNGT)));
					Assert.assertEquals(getText(hashMap.get(CommonConstants._LEADERSHIP_MNGT)),"Leadership Launchpad Management");
				
					//To check for the links displayed
					Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._MNG_TRIBES)));
					Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._ADD_TRIBES)));
					Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._VIEW_LAUNCHED_TRIBES)));
					Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._MNG_PARTS)));
					Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._MNG_ASSTS)));
					Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._MNG_LEADERS)));
					Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._MNG_LEADERSHIP_ASST)));
					Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SIGNOUT)));
					click(hashMap.get(CommonConstants._SIGNOUT));
					Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SIGNINFORM)));
					
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

