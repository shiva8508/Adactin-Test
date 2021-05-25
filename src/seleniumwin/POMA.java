package seleniumwin;

import org.openqa.selenium.WebDriver;

public class POMA extends Baseclass {

	public  static WebDriver driver;
	
	public static void main(String[] args) {
		
		 driver = BrowserLunch("chrome");
		 
		 getUrl("https://adactinhotelapp.com/");
		 
		 POM lp = new POM(driver);
		 
		 sendKeys(lp.getusername(),"SowmiyaSri");
		 sendKeys(lp.getpassword(),"Sowmiya05");
		 click(lp.getlogin_btn());
				 
	}
	
}
