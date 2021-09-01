package crossBrowserTesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class CrossBrowserTesting extends InvokeDrivers{

	static WebDriver driver;
	
	@Test
	public void f() throws Exception {
		
		driver.get("http://www.google.com");
		Thread.sleep(3000);
	}
	
	
	/**
	 * TestNG Annotations are below
	 */
	
	@BeforeSuite
	@Parameters({"browser"})
	public void driverInitialization(String browser) throws Exception {
		driver = InvokeDrivers.selectDriver(browser);	
	}
	
	@AfterSuite
	public void closeAllBrowsers() {
		driver.quit();
	}
}
