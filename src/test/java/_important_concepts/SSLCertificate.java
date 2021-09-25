package _important_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificate {
	WebDriver driver = null;

	public void browserSettings(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {
			DesiredCapabilities dc = DesiredCapabilities.firefox();
			dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			FirefoxProfile profile = new FirefoxProfile();
			profile.setAcceptUntrustedCertificates(true);

			dc.setCapability(FirefoxDriver.PROFILE, profile);

			// this is the important line - i.e. don't use Marionette
			dc.setCapability(FirefoxDriver.MARIONETTE, false);

			driver = new FirefoxDriver(dc);

		} else if (browser.equalsIgnoreCase("chrome")) {
			DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();
			handlSSLErr.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			driver = new ChromeDriver(handlSSLErr);
		} else if (browser.equalsIgnoreCase("ie")) {
			try {
				driver.navigate().to("javascript:document.getElementById('overridelink').click()");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
				driver = new InternetExplorerDriver(capabilities);
			}
		}
	}
}
