package seleniumwin;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

public class PomChild  extends Baseclass{

	public static WebDriver driver;
	

	public static void main(String[] args) {
		driver = BrowserLunch("chrome");
		
		getUrl("https://www.facebook.com/");
		
		PomClass pc = new  PomClass(driver);
		
		sendKeys(pc.getusername(),"shiva.fb00@gmail.com");
		sendKeys(pc.getpassword(), "shiva369");
		click(pc.clicklogin_btn());
	}
	
	
}
