package test.java.com.cti.common;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 
 * @author Preethi
 *
 */
public class SetupBase {

	protected WebDriver driver = null;

	protected String baseURL;
	
	private final int _TIMEOUT = 30; 
	
	// urls
	protected final String URL_SUMMIT = "https://" + System.getProperty("summit.url") + "/";
	protected final String URL_COACHES = "https://" + System.getProperty("coaches.url") + "/";
	protected final String URL_LEADERSHIP = "https://" + System.getProperty("leadership.url") + "/";
	protected final String URL_STAKEBOOK = "https://" + System.getProperty("stakebook.url") + "/";
	
	/**
	 * Command to wait for page to load
	 */
	public SetupBase() {
		//FirefoxBinary ffBinary = new FirefoxBinary(new File("/usr/lib/firefox/firefox"));
		driver = new FirefoxDriver();//  new FirefoxDriver(ffBinary, new FirefoxProfile());
		driver.manage().timeouts().implicitlyWait(_TIMEOUT, TimeUnit.SECONDS);	
	}

	protected void setup() throws Exception{
		
		//baseURL = "https://" + System.getProperty("summit.url", "coaches.url") + "/";
		//baseURL = "http://www.coactivesummit.com";
  		//driver.get(baseURL);	
  		
	}
	
	public String getBaseURL() {
		return baseURL;
	}
	
	public void tearDown() {

		driver.quit();
	}
}