package seleniumwin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Big\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	WebElement click = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	click.click();
	driver.switchTo().frame(1);
	
	driver.switchTo().frame(0);
	
	
    //driver.switchTo().frame("SingleFrame");
	WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	text.sendKeys("automating Tester");
	
}
}
