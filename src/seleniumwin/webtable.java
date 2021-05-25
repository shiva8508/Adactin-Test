package seleniumwin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Big\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		System.out.println("==========All Data==========");
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (WebElement data : allData) {
			System.out.println(data.getText());
		}
		System.out.println("==========Par Data==========");
	WebElement data1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[2]"));
		System.out.println(data1.getText());
		
		System.out.println("==========3rd Row Data==========");
	 List<WebElement> allData1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td"));
		for (WebElement  rows: allData1) {
			System.out.println(rows.getText());
		
		}
		System.out.println("==========head Data==========");
		List<WebElement> allData2 = driver.findElements(By.xpath("//table[@id='customers']/tbody//tr[1]/th"));
		for (WebElement headdata : allData2) {
			System.out.println(headdata.getText());
		}
	}
}
