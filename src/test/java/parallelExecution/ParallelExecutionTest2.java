package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelExecutionTest2 {

	static WebDriver driver;
	static String userDir = System.getProperty("user.dir");

	@Test
	public void TC_004() throws Exception {
		System.setProperty("webdriver.chrome.driver", userDir + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.google.com");
		System.out.println("Running TC_004");
		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void TC_005() throws Exception {
		System.setProperty("webdriver.chrome.driver", userDir + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.google.com");

		System.out.println("Running TC_005");
		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void TC_006() throws Exception {
		System.setProperty("webdriver.chrome.driver", userDir + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.google.com");

		System.out.println("Running TC_006");
		Thread.sleep(5000);
		driver.close();
	}
}