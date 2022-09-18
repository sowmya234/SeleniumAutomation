package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class DriverBase {
	public WebDriver driver;
	public WebDriver driverInitialization() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
	}
}
