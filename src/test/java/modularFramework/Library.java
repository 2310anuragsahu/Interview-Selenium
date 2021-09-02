package modularFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class Library {

	public static By getObjectLocator(String locatorName)
	{
		
		String locatorType = locatorName.split("~")[0];
		String locatorValue = locatorName.split("~")[1];
		
		By locator = null;
		
		switch(locatorType.toLowerCase()) {
			case "id":
				locator = By.id(locatorValue);
				break;
			case "name":
				locator = By.name(locatorValue);
				break;
			case "cssSelector":
				locator = By.cssSelector(locatorValue);
				break;
			case "linkText":
				locator = By.linkText(locatorValue);
				break;
			case "partialLinkText":
				locator = By.partialLinkText(locatorValue);
				break;
			case "tagName":
				locator = By.tagName(locatorValue);
				break;
			case "xpath":
				locator = By.xpath(locatorValue);
				break;
			}
		
		return locator;
	}

	public static void SendKeys(WebDriver driver, String locator, String Text) {
		driver.findElement(Library.getObjectLocator(locator)).sendKeys(Text);
	}

	public static void Click(WebDriver driver, String locator) {
		driver.findElement(Library.getObjectLocator(locator)).click();
	}
	
	public static void SelectDropdownValue(WebDriver driver, String locator, String Text) {
		Select dropdown = new Select(driver.findElement(Library.getObjectLocator(locator)));
		dropdown.selectByVisibleText(Text);
	}
}
