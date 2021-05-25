package seleniumwin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Big\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		System.out.println("====Only Head====");
		List<WebElement> allData = driver
				.findElements(By.xpath("//table[contains(@class,'w3-table-all')]/tbody/tr/th"));
		for (WebElement th : allData) {
			System.out.println(th.getText());
		}

		System.out.println("==== All Data====");
		List<WebElement> alldata2 = driver
				.findElements(By.xpath("//table[contains(@class,'w3-table-all')]/tbody/tr/td"));
		for (WebElement datas : alldata2) {
			System.out.println(datas.getText());
		}

		System.out.println("====find Data====");
		WebElement data = driver.findElement(By.xpath("//table[contains(@class,'w3-table-all')]/tbody/tr[5]/td[2]"));
		System.out.println(data.getText());
	}

}
