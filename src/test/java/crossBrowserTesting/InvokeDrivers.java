package crossBrowserTesting;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InvokeDrivers {

	static WebDriver driver = null;
	static String userDir = System.getProperty("user.dir");

	public static WebDriver selectDriver(String browser) {
		
		// Chrome Driver settings
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", userDir + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		// Firefox/Gecko Driver settings
		else if(browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", userDir + "\\drivers\\geckodriver.exe");

			// Path to Firefox.exe
			File pathBinary = new File("C:\\Users\\inasahu\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
			DesiredCapabilities desired = DesiredCapabilities.firefox();
			FirefoxOptions options = new FirefoxOptions();
			desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));

			driver = new FirefoxDriver(options);
		} 
		
		// Edge Driver settings
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", userDir + "\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} 
		
		// Internet Explorer Driver settings
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", userDir + "\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} 
		
		else {
			System.out.println("Incorrect browser");
		}

		return driver;

	}



}
