package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelExecutionTest {

	static WebDriver driver;
	static String userDir = System.getProperty("user.dir");

	@Test
	public void TC_001() throws Exception {
		System.setProperty("webdriver.chrome.driver", userDir + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.google.com");
		System.out.println("Running TC_001");
		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void TC_002() throws Exception {
		System.setProperty("webdriver.chrome.driver", userDir + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.google.com");

		System.out.println("Running TC_002");
		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void TC_003() throws Exception {
		System.setProperty("webdriver.chrome.driver", userDir + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.google.com");

		System.out.println("Running TC_003");
		Thread.sleep(5000);
		driver.close();
	}
}