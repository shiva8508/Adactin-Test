package seleniumwin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowHandle {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Big\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement Best = driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id,'nav_cs_bestsellers')]"));

		Actions ac = new Actions(driver);
		ac.contextClick(Best).perform();
		Thread.sleep(2000);
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		WebElement moblies = driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id,'nav_cs_mobiles')]"));
		ac.contextClick(moblies).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(2000);
		WebElement singin = driver.findElement(By.xpath("//a[contains(@id,'nav-link-accountList')]"));
		ac.contextClick(singin).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String pId = driver.getWindowHandle();
		System.out.println(pId);
		String mainTitle = driver.switchTo().window(pId).getTitle();
		System.out.println(mainTitle);
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		for (String id : allId) {
			String allTitle = driver.switchTo().window(id).getTitle();
			System.out.println(allTitle);
		}
		
	//	String  actualtitle = "Amazon Sign In";
		for (String id : allId) {
			
			if (driver.switchTo().window(id).getTitle().equals("Amazon Sign In")) {
				WebElement login = driver.findElement(By.xpath("//input[@type='email']"));
				login.sendKeys("8508525351");
				break;
				
			}
			
		}

	}
}
