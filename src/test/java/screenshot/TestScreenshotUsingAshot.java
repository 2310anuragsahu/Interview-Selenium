package screenshot;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestScreenshotUsingAshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inasahu\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		// Normal Screenshot
		Screenshot screenshot = new AShot().takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "png", new File("./test-output/Screenshots/NormalScreenshot.jpg"));
		
		// Full Page Screenshot with the help of scrolling
		Screenshot biggerScreenshot = new AShot().
				shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(biggerScreenshot.getImage(), "jpg", new File("./test-output/Screenshots/BiggerScreenshot.jpg"));

		// Screenshot a Particular Element
		WebElement element = driver.findElement(By.xpath("//*[@id='htmlcontent_top']/ul/li[1]/a/img"));
		Screenshot elementScreenshot= new AShot().
				shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver,element);
		ImageIO.write(elementScreenshot.getImage(), "jpg", new File("./test-output/Screenshots/ElementScreenshot.jpg"));
		
		driver.quit();
	}

}
