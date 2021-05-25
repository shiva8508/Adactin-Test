package seleniumwin;

import org.openqa.selenium.WebDriver;

public class PomproA extends Baseclass {

	public static  WebDriver driver;

	public void Browserlunch() {

		driver = BrowserLunch("chrome");
		
		getUrl("https://adactinhotelapp.com/");
	}
	
	
	public static void main(String[] args) {
		
		PomPro po  = new PomPro(driver);
		po.getUsername();
		po.getPassword();
		po.getLogin();
		
		
	}
}
