package screenshot;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inasahu\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.edureka.co/");
		
		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; 
		 * File source = ts.getScreenshotAs(OutputType.FILE);
		 * 
		 * FileUtils.copyFile(source, new File("./test-output/Screenshots/Screen.png"));
		 * System.out.println("the Screenshot is taken");
		 */
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./test-output/Screenshots/Screen1.png"));
		
		driver.quit();
	}

}
