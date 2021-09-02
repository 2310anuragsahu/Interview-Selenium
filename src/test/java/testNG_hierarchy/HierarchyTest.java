package testNG_hierarchy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HierarchyTest{
	
	WebDriver driver = null;
	
	@Test(groups = {"account"}, invocationCount = 1)
	public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inasahu\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		System.out.println("**********  Test Case 1  ********");
		driver.quit();
	}

	@Test(enabled = false)
	public void b() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inasahu\\Drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.google.coms");
		Thread.sleep(5000);
		System.out.println("**********  Test Case 2  ********");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
		driver.quit();
	}

}