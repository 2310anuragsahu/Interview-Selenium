package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Excercise1 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inasahu\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

		// Robot class throws AWT Exception
		Robot robot = new Robot();
		Thread.sleep(2000);

		// sleep has only been used to showcase each event separately
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		// press enter key of keyboard to perform above selected action
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.quit();
	}
}
