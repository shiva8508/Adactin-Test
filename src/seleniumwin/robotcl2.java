package seleniumwin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotcl2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", 
				 "C:\\Users\\Big\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		 
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.google.com/search?q=flipkart&oq=&aqs=chrome.1.69i59i450l8.38077123j0j15&sourceid=chrome&ie=UTF-8#scso=_mLwyYIKVNoCO4-EPpceLyAw103:1100");
		 
		 WebElement menu = driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		 Actions ac= new Actions(driver);
		 ac.contextClick(menu).perform();
		 
		 
		 Thread.sleep(2000);
		 
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		 Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		 Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		 Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
