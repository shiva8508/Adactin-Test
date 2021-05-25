package seleniumwin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivertest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Big\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.in/");

		driver.manage().window().maximize();

		driver.navigate().to("https://www.amazon.in/");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

		String url = driver.getCurrentUrl();
		System.out.println(url);

		WebElement sc = driver.findElement(By.xpath("//input[@type='text']"));
		sc.sendKeys("youtube");

		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));

		search.click();

	}
}
