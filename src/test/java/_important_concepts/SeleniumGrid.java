package _important_concepts;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumGrid {

	WebDriver driver;
	String baseURL, nodeURL;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		
		baseURL = "http://demo.guru99.com/test/guru99home/";
		nodeURL = "http://192.168.43.223:4444/wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL(nodeURL), capability);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void sampleTest() {
		driver.get(baseURL);

		if (driver.getPageSource().contains("MOBILE TESTING")) {
			Assert.assertTrue(true, "Mobile Testing Link Found");
		} else {
			Assert.assertTrue(false, "Failed: Link not found");
		}

	}

}
