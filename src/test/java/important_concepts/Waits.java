package important_concepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inasahu\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();

		WebElement element1 = driver.findElement(By.name("tripType"));

		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element1));

		// Fluent Wait after Selenium 3.11
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))	//.withTimeout(30, TimeUnit.SECONDS)  Before Selenium 3.11
				.pollingEvery(Duration.ofSeconds(5))	//.pollingEvery(5, TimeUnit.SECONDS)  Before Selenium 3.11
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.xpath("//*[@id='softwareTestingMaterial']"));
				String getTextOnPage = element.getText();
				if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
					System.out.println(getTextOnPage);
					return element;
				}else{
					System.out.println("FluentWait Failed");
					return null;
				}
			}
		});
	}

}
