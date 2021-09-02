package important_concepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {

	WebDriver driver;

	@Test(enabled=false)
	public void newWindow() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inasahu\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/browser-windows");
		
		String mainWindow = driver.getWindowHandle();
		
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000);
		
		//To Handle all newly opened windows
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		
		while(it.hasNext()) {
			String childWindow = it.next().toString();
			if(!mainWindow.equalsIgnoreCase(childWindow)) {    		
				driver.switchTo().window(childWindow);
				//perform some tasks
				Thread.sleep(3000);
				driver.close();	
            }
		}
		driver.switchTo().window(mainWindow);
		Thread.sleep(3000);
		driver.close();
	}
	
	
	@Test(enabled=true)
	public void newTab() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inasahu\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/browser-windows");
		
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		
		//To Handle all newly opened windows
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		
		while(it.hasNext()) {
			String childWindow = it.next().toString();
			
			if(!mainWindow.equalsIgnoreCase(childWindow))			
            {    		
				System.out.println(childWindow);
				driver.switchTo().window(childWindow);
				
				//perform some tasks
				Thread.sleep(3000);
				
				driver.close();	
            }
		}
		
		driver.switchTo().window(mainWindow);
		Thread.sleep(3000);
		
		driver.close();
	}
	
}
