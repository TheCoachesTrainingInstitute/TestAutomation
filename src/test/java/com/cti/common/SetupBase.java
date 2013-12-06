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
	protected String summitURL;
	protected String stakebookURL;

	
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
		
	//	baseURL = "http://" + System.getProperty("summit.url") + "/";
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