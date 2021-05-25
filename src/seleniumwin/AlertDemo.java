package seleniumwin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Big\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement click = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
	    click.click();
		Thread.sleep(2000);
		WebElement ok = driver.findElement(By.xpath("(//button[contains(@class,'btn')])[2]"));
		ok.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement cancel = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		cancel.click();
		Thread.sleep(2000);
		WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		confirm.click();
		driver.switchTo().alert().dismiss();
		
		WebElement text = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		text.click();
		
		Thread.sleep(2000);
		WebElement textEnter = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		textEnter.click();
		driver.switchTo().alert().sendKeys("shiva");
		driver.switchTo().alert().accept();
		
		
	}
}
