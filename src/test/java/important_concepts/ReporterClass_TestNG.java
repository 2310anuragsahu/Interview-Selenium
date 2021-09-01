package important_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClass_TestNG {
	WebDriver driver = null;
	
	@Test
	public void test1 () throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inasahu\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://demo.guru99.com/test/newtours/");
		Reporter.log("Mecury Website is successfully opened.");
		WebElement ele = driver.findElement(By.name("userName"));
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.sendKeys("mercury");
		Reporter.log("Username entered.");
		driver.findElement(By.name("password")).sendKeys("mercury");
		Reporter.log("Password entered.");
		driver.findElement(By.name("submit")).click();
		Reporter.log("Login Successful.");
		Thread.sleep(5000);
		driver.close();
	}

}
