package pageObjectModel.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModel.pages.FBHomePage;
import pageObjectModel.pages.FBLoginPage;

public class FBLoginTest extends TestBase {

	@Test
	public void init() throws Exception {

		// driver.get("https://www.facebook.com");
		FBLoginPage loginpage = PageFactory.initElements(driver, FBLoginPage.class);
		loginpage.setEmail("2310strygwyr@gmail.com");
		loginpage.setPassword("strygwyr");
		loginpage.clickOnLoginButton();

		FBHomePage homepage = PageFactory.initElements(driver, FBHomePage.class);
		homepage.clickOnProfileDropdown();
		homepage.clickOnLogoutLink();
	}
}
