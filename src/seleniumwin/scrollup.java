package seleniumwin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Big\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement logodown = driver.findElement(By.xpath("(//div[contains(@class,'nav')])[143]"));
		JavascriptExecutor js= (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView();",logodown);
	
		
		
	}
}