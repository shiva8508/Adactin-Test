package seleniumwin;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testclass extends Baseclass {

	public static WebDriver driver;
	
	public static void main(String[] args ) throws InterruptedException {
		
		driver =BrowserLunch("chrome");
		getUrl("https://adactinhotelapp.com/");
		WebElement name = driver.findElement(By.id("username"));
		sendKeys(name,"SowmiyaSri");
		WebElement pass = driver.findElement(By.id("password"));
		sendKeys(pass, "Sowmiya05");
		WebElement login = driver.findElement(By.id("login"));
		click(login);
		Thread.sleep(3000);
		WebElement location = driver.findElement(By.id("location"));
		dropDown(location, "value", "London");
		WebElement hotles = driver.findElement(By.id("hotels"));
		dropDown(hotles, "index", "2");
		WebElement rooms = driver.findElement(By.id("room_type"));
		dropDown(rooms, "text", "Double");
		WebElement numOfRoom = driver.findElement(By.id("room_nos"));
		dropDown(numOfRoom, "value", "5");
		WebElement datep = driver.findElement(By.id("datepick_in"));
		sendKeys(datep, "20/03/2021");
		WebElement dateo = driver.findElement(By.id("datepick_out"));
		sendKeys(dateo, "24/04/2021");
		WebElement adroom = driver.findElement(By.id("adult_room"));
		dropDown(adroom, "index", "4");
		WebElement chroom = driver.findElement(By.id("child_room"));
		dropDown(chroom, "index", "2");
		WebElement sub = driver.findElement(By.id("Submit"));
		click(sub);
		WebElement rb = driver.findElement(By.id("radiobutton_2"));
		click(rb);
		WebElement conti = driver.findElement(By.id("continue"));
		click(conti);
		WebElement fname = driver.findElement(By.id("first_name"));
		sendKeys(fname, "shiva");
		WebElement lname = driver.findElement(By.id("last_name"));
		sendKeys(lname, "ji");
		WebElement add = driver.findElement(By.id("address"));
		sendKeys(add, "my adrees");
		WebElement cancel = driver.findElement(By.id("cancel"));
		click(cancel);
		quit();
		
		
		
		
		
		
	}
}
