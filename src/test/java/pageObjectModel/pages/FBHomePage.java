package pageObjectModel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBHomePage {
	WebDriver driver;

	public FBHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements
	// Way 1 to define FindBy
	@FindBy(how = How.XPATH, using = "//div[text()='Account Settings']")
	WebElement profileDropdown;
	
	// Way 2 to define FindBy
	@FindBy(xpath="//text()[.='Log Out']/ancestor::span[1]")
	WebElement logoutLink;

	// Defining all the user actions (Methods) that can be performed in the Facebook home page
	// This method to click on Profile Dropdown
	public void clickOnProfileDropdown() {
		profileDropdown.click();
	}

	// This method to click on Logout link
	public void clickOnLogoutLink() {
		logoutLink.click();
	}
}