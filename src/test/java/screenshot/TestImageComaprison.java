package screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class TestImageComaprison {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inasahu\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");

		// Find the element and take a screenshot

		WebElement logoElement = driver.findElement(By.xpath("//*[@id=\"site-name\"]/a[1]/img"));
		Screenshot logoElementScreenshot = new AShot().takeScreenshot(driver, logoElement);

		// read the image to compare
		BufferedImage expectedImage = ImageIO.read(new File("C:\\Guru99logo.png"));
		BufferedImage actualImage = logoElementScreenshot.getImage();

		// Create ImageDiffer object and call method makeDiff()
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);

		if (diff.hasDiff() == true) {
			System.out.println("Images are same");

		} else {
			System.out.println("Images are different");
		}
		driver.quit();
	}
}