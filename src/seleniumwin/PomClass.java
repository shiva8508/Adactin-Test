package seleniumwin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	public static WebDriver driver;

    @FindBy(id="email")
	private WebElement username;


    @FindBy(id="pass")
	private WebElement password;

    @FindBy(name="login")
	private WebElement login_btn;

	public PomClass(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	
	
	}
	
	

	public WebElement getusername() {
		return username;
		
	}
	
	public WebElement getpassword() {
		return password;
		
	}
	
	public WebElement clicklogin_btn() {
		return login_btn;
		
	}
}
