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
 * This test covers the Leadership Administration website  - Manage Tribes link
 * @author Preethi
 */

public class ManageTribesTest extends Common{
	
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
	public void manageTribes() {
		try {
			driver.get(URL_LEADERSHIP + CommonConstants.LEADERSHIP_ADMIN_URL);
			waitForElementPresent(hashMap.get(CommonConstants._HOME_LINK));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SIGNINFORM)));
			type(hashMap.get(CommonConstants.EMAIL_TEXTBOX),"ping@me.com");
			type(hashMap.get(CommonConstants.PASSWORD_TEXTBOX),"abc123");
			click(hashMap.get(CommonConstants._SIGNIN_BTTN_LEADERSHIP));
			
			//To click on Manage Tribes link
			click(hashMap.get(CommonConstants._MNG_TRIBES));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LEADERSHIP_ADMIN_TRIBE)));
			Assert.assertEquals(getText(hashMap.get(CommonConstants._LEADERSHIP_ADMIN_TRIBE)), "Launchpad Administration - Tribe");

			// To check if all the four columns appear
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._NAME)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._QUESTIONNAIRE)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._MED)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._DIET)));
			
			//To check if all the download links are displayed
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._EX_QUESTIONNAIRE)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._EX_MED)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._EX_DIET)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._EX_INF)));
			
	     /** FirefoxProfile firefoxProfile = new FirefoxProfile();

	        firefoxProfile.setPreference("browser.download.folderList",2);
	        firefoxProfile.setPreference("browser.download.manager.showWhenStarting",false);
	        firefoxProfile.setPreference("browser.download.dir","c:\\downloads");
	        firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream");
	
	        driver.get("http://ww2.thecoaches.com/launchpad/index.php/");
	       
			click(_MNG_TRIBES);
	        click(_EX_QUESTIONNAIRE);
	       // driver.switchTo().alert().accept();

			//Downloads the Tribe Questionnaire Spreadsheet
			Set<String> openWindowsList = driver.getWindowHandles();
			String winHandleBefore = driver.getWindowHandle();
			for (String windowHandle : openWindowsList) {
				if (!windowHandle.equals(currentWindowHandle))
					popUpWindowHandle = windowHandle;
			}
			Thread.sleep(6000);
			lookupTitle = driver.switchTo().window(popUpWindowHandle).getTitle();
			System.out.println(lookupTitle);
			String _TITLE_SHOWN = driver.getTitle();
			System.out.println(_TITLE_SHOWN);
			Assert.assertEquals(_TITLE_SHOWN,"Program-Questionnaire-Seal-1");
			//driver.close();
			driver.switchTo().window(winHandleBefore);
		
			//Downloads the Tribe Medical Form Spreadsheet
			Set<String> openWindowsList1 = driver.getWindowHandles();
			String winHandleBefore1 = driver.getWindowHandle();
			for (String windowHandle : openWindowsList1) {
				if (!windowHandle.equals(currentWindowHandle))
					popUpWindowHandle = windowHandle;
			}
			Thread.sleep(6000);
			lookupTitle = driver.switchTo().window(popUpWindowHandle).getTitle();
			String _TITLE_SHOWN1 = driver.getTitle();
			Assert.assertEquals(_TITLE_SHOWN1,"Medical-Seal-1");
			driver.close();
			driver.switchTo().window(winHandleBefore1);
			
			//Downloads the Tribe Dietary Form Spreadsheet
			Set<String> openWindowsList2 = driver.getWindowHandles();
			String winHandleBefore2 = driver.getWindowHandle();
			for (String windowHandle : openWindowsList2) {
				if (!windowHandle.equals(currentWindowHandle))
					popUpWindowHandle = windowHandle;
			}
			Thread.sleep(6000);
			lookupTitle = driver.switchTo().window(popUpWindowHandle).getTitle();
			String _TITLE_SHOWN2 = driver.getTitle();
			Assert.assertEquals(_TITLE_SHOWN2,"Dietary-Requirements-Seal-1");
			driver.close();
			driver.switchTo().window(winHandleBefore2);
			
			//Downloads the Tribe Influencer Report Form Spreadsheet
			Set<String> openWindowsList3 = driver.getWindowHandles();
			String winHandleBefore3 = driver.getWindowHandle();
			for (String windowHandle : openWindowsList3) {
				if (!windowHandle.equals(currentWindowHandle))
					popUpWindowHandle = windowHandle;
			}
			Thread.sleep(6000);
			lookupTitle = driver.switchTo().window(popUpWindowHandle).getTitle();
			String _TITLE_SHOWN3 = driver.getTitle();
			Assert.assertEquals(_TITLE_SHOWN3,"Dietary-Requirements-Seal-1");
			driver.close();
			driver.switchTo().window(winHandleBefore3);
			 **/
	     
			click(hashMap.get(CommonConstants._ADM_HOME));
	        Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LEADERSHIP_ADM)));
	    	Assert.assertEquals(getText(hashMap.get(CommonConstants._LEADERSHIP_ADM)),"Leadership Launchpad Administration");
			driver.navigate().back();
	   
			//Editing participant by double clicking on the name 
			click(hashMap.get(CommonConstants._PART_NAME));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._LEADER_PART)));
			Assert.assertEquals(getText(hashMap.get(CommonConstants._LEADER_PART)), "Launchpad Administration - Participant/Assistant");

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
			
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._QUESITONNAIRE_PDF)));
			Assert.assertTrue(verifyTextPresent("Program Questionnaire"));
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
