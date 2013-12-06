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

public class ReportsTest extends Common{
	
	int i=2;
	private HashMap<String, String> hashMap;		
			
	@BeforeClass
	public void setup() throws Exception
	{
		super.setup();
		this.hashMap = new HashMap<String,String>();
		HashMap<String,String> hm = new HashMap<String,String>();
		Element root = XMLUtils.getroot(CommonConstants.xmlFilePath_coactivemrkt);
		hashMap = XMLUtils.getValues(root,CommonConstants.COACTIVE_MARK_REPORTS_TAG,hm);
		Element root2 = XMLUtils.getroot(CommonConstants.xmlFilePath_coactivesales);
		hashMap = XMLUtils.getValues(root2,CommonConstants.COACTIVE_SALES_HOME_TAG,hm);
		Element root1 = XMLUtils.getroot(CommonConstants.xmlFilePath_common);
		hashMap = XMLUtils.getValues(root1,CommonConstants.COMMON_ELEMENTS_TAG,hm);
	}
			
	@Test
	public void viewReports(){
		try {
			coachesURL = "http://" + System.getProperty("coaches.url") + "/" ;
			driver.get(coachesURL + CommonConstants.COACTIVE_SALES_HOME_URL);
			type(hashMap.get(CommonConstants.EMAIL_TEXTBOX),"ping@me.com");
			type(hashMap.get(CommonConstants.PASSWORD_TEXTBOX),"abc123");
			click(hashMap.get(CommonConstants.LOGIN_SALES));
			click(hashMap.get(CommonConstants.VIEW_REPORTS));
			Assert.assertTrue(verifyTextPresent("Administration Reports"));
			Assert.assertTrue(verifyTextPresent("Homework Report"));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.BREADCRUMB_HOME_MAR)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.BREADCRUMB_LOGOUT_MAR)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.DOWNLOAD_CSV)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.DROPDOWN_MENU)));
			click(hashMap.get(CommonConstants.BREADCRUMB_HOME_MAR));
			}
		catch (Exception e) {

			Assert.assertTrue(false, e.getMessage()+" URL: "+ driver.getCurrentUrl());

		}
	}
	
	@Test(dependsOnMethods = "viewReports") 
	public void manageAudios(){
		try {
			driver.get(coachesURL + CommonConstants.COACTIVE_SALES_HOME_URL);
			type(hashMap.get(CommonConstants.EMAIL_TEXTBOX),"ping@me.com");
			type(hashMap.get(CommonConstants.PASSWORD_TEXTBOX),"abc123");
			click(hashMap.get(CommonConstants.LOGIN_SALES));
			click(hashMap.get(CommonConstants.MANAGE_AUDIOS_SALES));
			Assert.assertTrue(verifyTextPresent("Administration: Manage Audios"));
		
			for(int i=2;i<=4;i++)
			{
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.DELETE_BUTTON)));
			
			}
			for(int i=2;i<=4;i++)
			{
				Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.DOWNLOAD_MP3)));
			}
		
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.TEXTAREA)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.CHECKBOX)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.BROWSE_BUTTON)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.UPLOAD_BUTTON)));
			//Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.AUDIO_1));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.BREADCRUMB_HOME_MAR)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.BREADCRUMB_LOGOUT_MAR)));
			}
		catch (Exception e) {

			Assert.assertTrue(false, e.getMessage()+" URL: "+ driver.getCurrentUrl());

		}
	}
	
	@Test(dependsOnMethods = "manageAudios")
	public void manageDocuments(){
		try {
			click(hashMap.get(CommonConstants.BREADCRUMB_HOME_MAR));
			click(hashMap.get(CommonConstants.MANAGE_DOCUMENTS_SALES));
			Assert.assertTrue(verifyTextPresent("Administration: Manage Coaching Sales Program Forms"));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.DOC_TEXTAREA)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.BROWSE_DOC_BUTTON)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.UPLOAD_DOC_BUTTON)));
			for(int i=2;i<=11;i++)
				{
				Assert.assertTrue(verifyElementPresent("xpath=//*[@id='main']/div[4]/table/tbody/tr[" +i+ "]/td[3]/a"));

				}
			for(int i=2;i<=11;i++)
			{
				Assert.assertTrue(verifyElementPresent("xpath=//*[@id='main']/div[4]/table/tbody/tr[" +i+ "]/td[2]/a"));

			}
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.BREADCRUMB_HOME_MAR)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.BREADCRUMB_LOGOUT_MAR)));
			}
		catch (Exception e) {

			Assert.assertTrue(false, e.getMessage()+" URL: "+ driver.getCurrentUrl());

		}
	}
	
	@Test(dependsOnMethods = "manageDocuments")
	public void addNewGroup(){
		try {
			click(hashMap.get(CommonConstants.BREADCRUMB_HOME_MAR));
			click(hashMap.get(CommonConstants.ADD_NEWGROUP_STARTING_SALES));
			Assert.assertTrue(verifyTextPresent("Administration: Add New Group Starting Date"));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.DATEPICKER)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.SAVE_NEWDATE_BUTTON)));
						
			}
		catch (Exception e) {

			Assert.assertTrue(false, e.getMessage()+" URL: "+ driver.getCurrentUrl());

		}
	}
	
	@Test(dependsOnMethods = "manageDocuments")
	public void viewParticipantPages(){
		try {
			click(hashMap.get(CommonConstants.BREADCRUMB_HOME_MAR));
			click(hashMap.get(CommonConstants.VIEW_PARTICIPANT_PAGES_SALES));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.LISTEN_TO_AUDIOS_BUTTON)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.LISTEN_TO_AUDIOS_IMAGE)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.GET_FORMS_IMAGE)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.GET_FORMS_BUTTON)));			
			}
		catch (Exception e) {

			Assert.assertTrue(false, e.getMessage()+" URL: "+ driver.getCurrentUrl());

		}
	}
	
	@Test(dependsOnMethods = "viewParticipantPages")
	public void logout(){
		try {
			click(hashMap.get(CommonConstants.BREADCRUMB_LOGOUT_MAR));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.LOGIN_BUTTON_IN_THANKYOU_PAGE)));
			Assert.assertTrue(verifyTextPresent("Thank you!"));
		
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


