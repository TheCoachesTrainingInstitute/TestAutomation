package test.java.com.cti.common;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 
 * @author KrishnaPitla
 *
 */
public class SetupBase {

	protected WebDriver driver = null;

	protected String baseURL;
	
	private final int _TIMEOUT = 30; 
	/**
	 * Command to wait for page to load
	 */
	public SetupBase() {
		//FirefoxBinary ffBinary = new FirefoxBinary(new File("/usr/lib/firefox/firefox"));
		driver = new FirefoxDriver();//  new FirefoxDriver(ffBinary, new FirefoxProfile());
		driver.manage().timeouts().implicitlyWait(_TIMEOUT, TimeUnit.SECONDS);	
	}

	protected void setup() throws Exception{
		System.getProperty("summit.url", "coaches.url");
		baseURL = "https://" + System.getProperty("summit.url", "coaches.url") + "/";
  		//baseURL = "http://www.coactivesummit.com";
  		driver.get(baseURL);	
  		
	}
	
	public String getBaseURL() {
		return baseURL;
	}
	
	public void tearDown() {

		driver.quit();
	}
}