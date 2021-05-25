package seleniumwin;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Big\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement all = driver.findElement(By.xpath("(//a[contains(@class,'_42ft ')])[3]"));
		all.click();
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.id("day"));
		Select sc = new Select(day);	
		sc.selectByValue("2");
		
		
		
}
}