package modularFramework;

import org.openqa.selenium.WebDriver;

public class BusinessFunctions extends Library{
	
	public static void login(WebDriver driver, String username, String password, String submit) {
		
		Library.SendKeys(driver, username, "mercury");
		Library.SendKeys(driver, password, "mercury");
		Library.Click(driver, submit);
	}
}
