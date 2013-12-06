package test.java.com.cti.website.stakebook;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.w3c.dom.Element;
import test.java.com.cti.common.Common;
import test.java.com.cti.utils.CommonConstants;
import test.java.com.cti.utils.XMLUtils;

/**
 * This test covers the The Stakebook website
 * @author Preethi
 */

public class ThestakeBookTest extends Common{

	
	private HashMap<String, String> hashMap;
	
	@BeforeClass
	public void setup() throws Exception
	{
		super.setup();
		
		this.hashMap = new HashMap<String,String>();
		HashMap<String,String> hm = new HashMap<String,String>();
		Element root = XMLUtils.getroot(CommonConstants.xmlFilePath_stakebook);
		hashMap = XMLUtils.getValues(root,CommonConstants.STAKE_HOME_TAG,hm);
		hashMap = XMLUtils.getValues(root,CommonConstants.COMMON_ELEMENTS_TAG,hm);
	}
	
		
	@Test
	public void headerLinks(){
		try {
			driver.get(URL_STAKEBOOK);			
			//Verifying Title
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._HEADER_IMG)));
			Assert.assertEquals(driver.getTitle(),(CommonConstants._STAKEBOOK_TITLE)); 
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._HEADER1)));
			//System.out.println(getText(hashMap.get(CommonConstants._HEADER1)));
			Assert.assertEquals(getText(hashMap.get(CommonConstants._HEADER1)),hashMap.get(CommonConstants._HEADER1_TEXT)); 
		
			// Header links 
			click(hashMap.get(CommonConstants.STAKE_HOME));
			waitForElementPresent(hashMap.get(CommonConstants._HEADER_IMG));
			String TITLE = driver.getTitle();
			Assert.assertEquals(TITLE, (CommonConstants._STAKEBOOK_TITLE));	
			
			
			click(hashMap.get(CommonConstants._ABT_AUTHORS_LINK));
			waitForElementPresent(hashMap.get(CommonConstants._HEADER_IMG));
			Assert.assertEquals(driver.getTitle(), hashMap.get(CommonConstants._ABT_AUTHORS_TITLE));
			Assert.assertTrue(verifyTextPresent("About the Authors"));
			
			click(hashMap.get(CommonConstants._PRAISE_LINK));
			waitForElementPresent(hashMap.get(CommonConstants._HEADER_IMG));
			Assert.assertEquals(driver.getTitle(), hashMap.get(CommonConstants._PRAISE_TITLE));
			Assert.assertTrue(verifyTextPresent("Praise for The Stake: The Making of Leaders"));
			
			click(hashMap.get(CommonConstants._MORE_LINK));
			waitForElementPresent(hashMap.get(CommonConstants._HEADER_IMG));
			Assert.assertEquals(driver.getTitle(), hashMap.get(CommonConstants._MORE_TITLE));
		//	Assert.assertTrue(verifyTextPresent("Outtakes ? The Stake: The Making of Leaders"));
			
			//Checking the Search box on the top right corner 
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._SEARCH)));
			Assert.assertEquals(driver.findElement(By.id("s")).getAttribute("placeholder"),"Search");	
			type(hashMap.get(CommonConstants._SEARCH), "Henry Kimsey-House");
			driver.findElement(By.id("s")).sendKeys(Keys.ENTER);
			
			waitForElementPresent(hashMap.get(CommonConstants._HEADER_IMG));
			Assert.assertEquals(driver.getTitle(), hashMap.get(CommonConstants._RESULTS_TITLE));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._RES_HEADER)));
			Assert.assertEquals(getText(hashMap.get(CommonConstants._RES_HEADER)), "SEARCH RESULTS FOR: HENRY KIMSEY-HOUSE");
			
			//Clicking on Order now from Amazon image
			click(hashMap.get(CommonConstants.STAKE_HOME));
			waitForElementPresent(hashMap.get(CommonConstants._AMAZON_IMG));
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._AMAZON_IMG)));
			click(hashMap.get(CommonConstants._AMAZON_IMG));
			Assert.assertEquals(driver.getTitle(), hashMap.get(CommonConstants._AMAZON_TITLE));
			driver.navigate().back();
			//Validating the Footer text 
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._FOOTER_COACTIVE_PRESS)));
			Assert.assertEquals(getText(hashMap.get(CommonConstants._FOOTER_COACTIVE_PRESS)), "Co-Active Press" + "\n" + "4000 Civic Center Drive, Suite 500" +"\n" + "San Rafael, CA 94903");
			Assert.assertTrue(verifyElementPresent(hashMap.get(CommonConstants._FOOTER_COACTIVE_PRESS_INFO)));
			Assert.assertEquals(getText(hashMap.get(CommonConstants._FOOTER_COACTIVE_PRESS_INFO)), "Phone: 415-451-6000" + "\n" + "Toll Free: 1-800-691-6008" +"\n" + "Email: CoactivePress@coactive.com");
								
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
