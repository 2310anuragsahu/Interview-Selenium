package _important_concepts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;

public class Cookies {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inasahu\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(System.getProperty("user.dir"));

		// Get All Cookies
		System.out.println(driver.manage().getCookies());

		// Add Cookie
		driver.manage().addCookie(new Cookie("automation", "selenium"));
		System.out.println(driver.manage().getCookies());

		// Get a Cookie value
		Cookie cookie1 = driver.manage().getCookieNamed("automation");
		System.out.println(cookie1);

		// Delete specific cookie
		Cookie cookie2 = new Cookie("test2", "cookie2");
		driver.manage().addCookie(cookie2);
		System.out.println(driver.manage().getCookies());
		driver.manage().deleteCookieNamed("test2");
		System.out.println(driver.manage().getCookies());

		// Delete all cookies
		driver.manage().deleteAllCookies();
		System.out.println(driver.manage().getCookies());

		Thread.sleep(2000);
		driver.quit();
	}
}