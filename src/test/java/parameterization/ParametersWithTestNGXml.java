package parameterization;

import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersWithTestNGXml {
	String driverPath = "C:\\Users\\inasahu\\Drivers\\chromedriver.exe";
	WebDriver driver;

	@Test(enabled = true)
	@Parameters({ "author", "searchKey" })
	public void testParameterWithXML(@Optional("Abc") String author, String searchKey) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");

		WebElement searchText = driver.findElement(By.name("q"));
		// Searching text in google text box
		searchText.sendKeys(searchKey);

		System.out.println("Welcome ->" + author + " Your search key is->" + searchKey);
		System.out.println("Thread will sleep now");
		Thread.sleep(3000);
		System.out.println("Value in Google Search Box = " + searchText.getAttribute("value")
				+ " ::: Value given by input = " + searchKey);
		// verifying the value in google search box
		AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));
	}
}
