package modularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class LoginTest {

	static WebDriver driver;
	static String userDir = System.getProperty("user.dir");

	@Test(enabled = false)
	public void loginTest() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", userDir + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		BusinessFunctions.login(driver, OR.username, OR.password, OR.submit);
		
		Thread.sleep(2000);
	}
	
	@Test(enabled = true)
	public void DropdownTest() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", userDir + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/books");
		driver.manage().window().maximize();
		
		Library.SelectDropdownValue(driver, OR.dropdown, "100 rows");
		
		Thread.sleep(8000);
	}
	
	@AfterClass
	public void CloseAllBrowsers() {
		driver.quit();
	}
}
