package _important_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor {

	@Test
	public void Login() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inasahu\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Creating the JavascriptExecutor interface object by Type casting
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Navigate to Page
		js.executeScript("window.location = 'http://demo.guru99.com/V4/'");

		// Fetch the Title name of the site
		String TitleName = js.executeScript("return document.title;").toString();
		System.out.println("Title of the page = " + TitleName);

		//Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");
		
		// Login to Guru99
		driver.findElement(By.name("uid")).sendKeys("mngr34926");
		driver.findElement(By.name("password")).sendKeys("amUpenu");

		// Perform Click on LOGIN button using JavascriptExecutor
		WebElement button = driver.findElement(By.name("btnLogin"));
		js.executeScript("arguments[0].click();", button);
		
		// To generate Alert window using JavascriptExecutor. Display the alert message
		js.executeScript("alert('Welcome to Guru99');");
		Thread.sleep(5000);

		driver.quit();
	}
}
