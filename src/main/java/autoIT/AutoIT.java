package autoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inasahu\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=contact");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.id("uniform-fileUpload")).click();
		Thread.sleep(3000);

		// To run AutiIT script
		Runtime.getRuntime().exec("C:\\Users\\inasahu\\git\\Interview-Selenium\\src\\main\\java\\autoIT\\FileUpload.exe");
		Thread.sleep(3000);

		String text = driver.findElement(By.xpath("//*[@id='uniform-fileUpload']/span[1]")).getText();
		System.out.println(text);

		driver.quit();
	}
}
