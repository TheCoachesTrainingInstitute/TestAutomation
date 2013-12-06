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
 * This test covers the Leadership Administration website  - Add/DeleteTribes link
 * @author Preethi
 */

public class AddDeleteTribesTest extends Common{
	
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
	public void addTribes() {
		try {
			leadershipURL = "http://" + System.getProperty("leadership.url") + "/";
			driver.get(leadershipURL + CommonConstants.LEADERSHIP_ADMIN_URL);
			waitForElementPresent(hashMap.get(CommonConstants._HOME_LINK));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SIGNINFORM)));
			type(hashMap.get(CommonConstants.EMAIL_TEXTBOX),"ping@me.com");
			type(hashMap.get(CommonConstants.PASSWORD_TEXTBOX),"abc123");
			click(hashMap.get(CommonConstants._SIGNIN_BTTN_LEADERSHIP));			
			
			//To click on Add Tribes link
			click(hashMap.get(CommonConstants._ADD_TRIBES));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LEADERSHIP_ADMIN_TRIBE)));
			Assert.assertEquals(getText(hashMap.get(CommonConstants._LEADERSHIP_ADMIN_TRIBE)), "Launchpad Administration - Add/Delete Tribe");

			// To check if Current Tribes are displayed with all the four columns along with Delete link
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._CURRENT_TRIBES)));
			Assert.assertEquals(getText(hashMap.get(CommonConstants._CURRENT_TRIBES)), "Current Tribes");
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._CT_TNAME)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LOCATION)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._RETREAT1_DATE)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._FMID)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._DEL)));
						
			// To check if Launched Tribes are displayed with all the four columns along with Delete link
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LAUCNHED_TRIBES)));
			Assert.assertEquals(getText(hashMap.get(CommonConstants._LAUCNHED_TRIBES)), "Launched Tribes");
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LT_TNAME)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._L_LOCATION)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._L_RETREAT1_DATE)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._L_FMID)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._L_DEL)));	
			
			//To check if Add Tribe form and fields are displayed
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._ADD_TRIBE)));
			Assert.assertEquals(getText(hashMap.get(CommonConstants._ADD_TRIBE)),"Add a Tribe");
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._A_TNAME)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._A_LOCATION)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._A_RETREAT1_DATE)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._A_FMID)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._ADD)));
			
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
