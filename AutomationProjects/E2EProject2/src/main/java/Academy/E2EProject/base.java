package Academy.E2EProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	@Test
	public WebDriver initializeDriver() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\E2EProject\\src\\main\\java\\Academy\\E2EProject\\data.properties");
		prop.load(fis);
		String WebBrowser=prop.getProperty("browser");
		if(WebBrowser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(WebBrowser.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(WebBrowser.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			
		}
		else {
			System.out.println("Please initilaize the WebDriver properly..Thanks...!!!!");
		}
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;
	
	}
	

}
