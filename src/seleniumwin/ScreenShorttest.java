package seleniumwin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShorttest {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Big\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	TakesScreenshot ts = (TakesScreenshot) driver ;
	File sourcefile = ts.getScreenshotAs(OutputType.FILE);
	File destfile = new File("C:\\Users\\Big\\eclipse-workspace\\seleniumpro\\Screenshot\\logo.png");
	FileUtils.copyFile(sourcefile, destfile);
	
}
}
