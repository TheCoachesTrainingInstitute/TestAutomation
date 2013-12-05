package test.java.com.cti.website.coactivesummit;

import java.util.HashMap;
import java.util.Set;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.w3c.dom.Element;
import test.java.com.cti.common.Common;
import test.java.com.cti.utils.CommonConstants;
import test.java.com.cti.utils.XMLUtils;

/**
 * This test covers the Coactive Summit website
 * @author Preethi
 */

public class CoactiveSummitTest extends Common{
	
	private HashMap<String, String> hashMap;

	String currentWindowHandle = null;
	String popUpWindowHandle = null;
	String lookupTitle = null;
	@BeforeClass
	public void setup() throws Exception
	{
		super.setup();

		this.hashMap = new HashMap<String,String>();
		HashMap<String,String> hm = new HashMap<String,String>();
		Element root = XMLUtils.getroot(CommonConstants.xmlFilePath_summit);
		hashMap = XMLUtils.getValues(root,CommonConstants.SUMMIT_HOME_TAG,hm);
		Element root1 = XMLUtils.getroot(CommonConstants.xmlFilePath_common);
		hashMap = XMLUtils.getValues(root1,CommonConstants.COMMON_ELEMENTS_TAG,hm);
	}
	
	 // Verifying the functionality of Header links
	@Test
	public void headerLinks(){	
		try {
			driver.get(URL_SUMMIT);
			System.out.println("Launched Summit page");
			//Verifying Title
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SUMMIT_LOGO)));
			waitForElementPresent(hashMap.get(CommonConstants._HEADER_LINK));
			//System.out.println(SUMMIT_TITLE);
			Assert.assertTrue(driver.getTitle().equals(CommonConstants.SUMMIT_TITLE), "The Actual Page Title is: "+ driver.getTitle() +" Did Not Match With Expected Title: "+ CommonConstants.SUMMIT_TITLE);
			click(hashMap.get(CommonConstants._SUMMIT_LOGO));
			waitForElementPresent(hashMap.get(CommonConstants._HEADER_LINK));
			//System.out.println(SUMMIT_TITLE);
			Assert.assertTrue(driver.getTitle().equals(CommonConstants.SUMMIT_TITLE), "The Actual Page Title is: "+ driver.getTitle() +" Did Not Match With Expected Title: "+ CommonConstants.SUMMIT_TITLE);
						
			// Header links 
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants.SUMMIT_HOME)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._KEYNOTES_LINK)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._PRESENTERS_LINK)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._OUR_SPONSORS_LINK)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._FAC_ATTD_LINK)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._BE_A_SPONSOR_LINK)));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._ARC_LINK)));
			
			
			click(hashMap.get(CommonConstants.SUMMIT_HOME));
			waitForElementPresent(hashMap.get(CommonConstants._SUMMIT_LOGO));
			Assert.assertTrue(driver.getTitle().equals(CommonConstants.SUMMIT_TITLE), "The Actual Page Title is: "+ driver.getTitle() +" Did Not Match With Expected Title: "+ CommonConstants.SUMMIT_TITLE);
		
			click(hashMap.get(CommonConstants._KEYNOTES_LINK));
			Thread.sleep(2000);
			waitForElementPresent(hashMap.get(CommonConstants.SUMMIT_HOME));
			String _TITLE_SHOWN = driver.getTitle();
			//System.out.println(_TITLE_SHOWN);
			Assert.assertEquals(_TITLE_SHOWN, CommonConstants._KEYNOTES_TITLE);
			Assert.assertTrue(verifyTextPresent("Keynote Speakers"));
			driver.navigate().back();
			
			click(hashMap.get(CommonConstants._PRESENTERS_LINK));
			waitForElementPresent(hashMap.get(CommonConstants.SUMMIT_HOME));
			String _TITLE_SHOWN2 = driver.getTitle();
			//System.out.println(_TITLE_SHOWN2);
			Assert.assertEquals(_TITLE_SHOWN2, CommonConstants._PRESENTERS_TITLE);
			Assert.assertTrue(verifyTextPresent("Session Presenters"));
			driver.navigate().back();

			click(hashMap.get(CommonConstants._OUR_SPONSORS_LINK));
			waitForElementPresent(hashMap.get(CommonConstants.SUMMIT_HOME));
			//System.out.println(_TITLE_SHOWN3);
			Assert.assertEquals(driver.getTitle(),CommonConstants._OUR_SPONSORS_TITLE);
			Assert.assertTrue(verifyTextPresent("Our Sponsors"));
			driver.navigate().back();

			click(hashMap.get(CommonConstants._FAC_ATTD_LINK));
			waitForElementPresent(hashMap.get(CommonConstants.SUMMIT_HOME));
			//System.out.println(_TITLE_SHOWN4);
			Assert.assertEquals(driver.getTitle(), CommonConstants._FAC_ATTD_TITLE); 
			Assert.assertTrue(verifyTextPresent("Faculty Attendees"));
			driver.navigate().back();
			
			click(hashMap.get(CommonConstants._BE_A_SPONSOR_LINK));
			waitForElementPresent(hashMap.get(CommonConstants.SUMMIT_HOME));
			//System.out.println(_TITLE_SHOWN5);
			Assert.assertEquals(driver.getTitle(), CommonConstants._BE_A_SPONSOR_TITLE);
			driver.navigate().back();

			click(hashMap.get(CommonConstants._ARC_LINK));
			waitForElementPresent(hashMap.get(CommonConstants.SUMMIT_HOME));
			//System.out.println(_TITLE_SHOWN6);
			Assert.assertEquals(driver.getTitle(), CommonConstants._ARC_TITLE);
			driver.navigate().back();
					}
				catch (Exception e) {
		
					Assert.assertTrue(false, e.getMessage()+" URL: "+ driver.getCurrentUrl());
				}
			}
	
	@Test (dependsOnMethods = "headerLinks", alwaysRun =true) 
	public void otherLinks(){
		try {
			driver.get(URL_SUMMIT);
			click(hashMap.get(CommonConstants.SUMMIT_HOME));
			waitForElementPresent(hashMap.get(CommonConstants._SUMMIT_LOGO));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._HEADER_LINK)));
			Assert.assertEquals(getText(hashMap.get(CommonConstants._HEADER_LINK)),"2014 Global Co-Active Summit");
		
			//Clicking the Register Now button that is present in the middle
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._REG_NOW1)));
			click(hashMap.get(CommonConstants._REG_NOW1));
			Thread.sleep(3000);
			waitForElementPresent(hashMap.get(CommonConstants._CHECKOUT_BTTN));
			Assert.assertEquals(driver.getTitle(), CommonConstants._CART_TITLE);
			driver.navigate().back();
			
			//Clicking the Payment Policies button
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._PAY_POLICIES)));
			click(hashMap.get(CommonConstants._PAY_POLICIES));
			waitForElementPresent(hashMap.get(CommonConstants.SUMMIT_HOME));
			Assert.assertEquals(driver.getTitle(), CommonConstants._PAY_POL_TITLE);
			Assert.assertTrue(verifyTextPresent("Co-Active Summit Payment Policies"));
			driver.navigate().back();
			
			//Clicking the Register Now button that is present in the lower left bottom of the page
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._REG_NOW2)));
			click(hashMap.get(CommonConstants._REG_NOW2));
			Thread.sleep(3000);
			waitForElementPresent(hashMap.get(CommonConstants._CHECKOUT_BTTN));
			Assert.assertEquals(driver.getTitle(), CommonConstants._CART_TITLE);
			driver.navigate().back();
			
			//Clicking the Payment Policies button
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._PAY_POLICIES2)));
			click(hashMap.get(CommonConstants._PAY_POLICIES2));
			waitForElementPresent(hashMap.get(CommonConstants.SUMMIT_HOME));
			Assert.assertEquals(driver.getTitle(), CommonConstants._PAY_POL_TITLE);
			Assert.assertTrue(verifyTextPresent("Co-Active Summit Payment Policies"));
			driver.navigate().back();
			
			//Clicking the Reserve Now button that is present in the lower right bottom of the page
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._RESERVE)));
			click(hashMap.get(CommonConstants._RESERVE));
			Thread.sleep(4000);
			Assert.assertEquals(driver.getTitle(), CommonConstants._RESERVE_TITLE);
			driver.navigate().back();
			
			//Searcbox funtionality
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SEARCH_ICON)));
			click(hashMap.get(CommonConstants._SEARCH_ICON));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SEARCHBOX)));
			type(hashMap.get(CommonConstants._SEARCHBOX), "David");
			click(hashMap.get(CommonConstants._GO));
			waitForElementPresent(hashMap.get(CommonConstants._RES));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._RES)));
			Assert.assertEquals(getText(hashMap.get(CommonConstants._RES)), "Search Results");
			Assert.assertTrue(verifyTextPresent("David"));
			Assert.assertTrue(verifyTextPresent("Faculty Attendees"));
			Assert.assertTrue(verifyTextPresent("Keynote Speakers"));
			driver.navigate().back();
			
		}
			catch (Exception e) {

				Assert.assertTrue(false, e.getMessage()+" URL: "+ driver.getCurrentUrl());
			}
		}	



			@Test (dependsOnMethods = "otherLinks", alwaysRun =true) 
				public void footer(){
				try {
						driver.get(URL_SUMMIT);
						Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SUMMIT_LOGO)));

						//Checking the Footer links 
						Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._QUESTIONS)));
						Assert.assertEquals(getText(hashMap.get(CommonConstants._QUESTIONS)), "QUESTIONS?");
						Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._NUMBERS)));
						//System.out.println(getText(_NUMBERS));
						Assert.assertEquals(getText(hashMap.get(CommonConstants._NUMBERS)), "1-800-691-6008 (option 1)" + "\n" + "or (415) 451-6000 (option 1)" + "\n" + "coactivesummit@coactive.com");
						
						Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._CONTACT)));
						Assert.assertEquals(getText(hashMap.get(CommonConstants._CONTACT)), "CONTACT");
						Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._TEXT)));
						//System.out.println(getText(_TEXT));
						Assert.assertEquals(getText(hashMap.get(CommonConstants._TEXT)), "Coaches Training Institute"+ "\n" + "4000 Civic Center Drive, Suite 500" +"\n" + "San Rafael, CA 94903" + "\n" + "www.coactive.com");
						
						//Clicking on www.coactive.com link
						Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._COACTIVE_LINK)));
						click(hashMap.get(CommonConstants._COACTIVE_LINK));
						

						Set<String> openWindowsList = driver.getWindowHandles();
						String winHandleBefore = driver.getWindowHandle();
						for (String windowHandle : openWindowsList) {
							if (!windowHandle.equals(currentWindowHandle))
								popUpWindowHandle = windowHandle;
						}
						Thread.sleep(6000);
						lookupTitle = driver.switchTo().window(popUpWindowHandle).getTitle();
					//	waitForElementPresent(hashMap.get(CommonConstants._C_HOME));
						String _TITLE_SHOWN = driver.getTitle();
						//System.out.println(_TITLE_SHOWN);
						Assert.assertEquals(_TITLE_SHOWN, hashMap.get(CommonConstants.HOMEPAGE_TITLE));
						driver.close();
						driver.switchTo().window(winHandleBefore);
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