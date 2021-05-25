package seleniumwin;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testing extends Baseclass {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver = BrowserLunch("chrome");
		getUrl("https://wizzair.com/en-gb#/");
		
		click(driver.findElement(By.xpath("//i[@class='cookie-policy__button__icon icon icon__x']")));
	}
	
	
}
