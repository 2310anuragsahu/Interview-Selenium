package _important_concepts;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotClass {

	static WebDriver driver = null;
	static String userDir = System.getProperty("user.dir");

	@Test	
	public static void  execution() throws Exception {
		System.setProperty("webdriver.chrome.driver", userDir + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://demoqa.com/automation-practice-form");

		WebElement element = driver.findElement(By.id("lastName"));
		//Used points class to get x and y coordinates of element.
		Point point = element.getLocation();
		int x = point.getX();
		System.out.println("Position of the webelement from left side is "+x +" pixels");
		int y = point.getY();
		System.out.println("Position of the webelement from top side is "+y +" pixels");
		Thread.sleep(2000);

		Robot robot = new Robot(); 
		// move mouse point to specific location
		robot.mouseMove(880, 268);
		// delay is to make code wait for mentioned milliseconds before executing next step
		robot.delay(1500); 
		// press left click
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		// release left click
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); 
		// press keyboard arrow key to select Save radio button
		robot.delay(1500); robot.keyPress(KeyEvent.VK_DOWN);  
		Thread.sleep(2000);
		// press enter key of keyboard to perform above selected action
		robot.keyPress(KeyEvent.VK_ENTER); 
		
	}	
}
