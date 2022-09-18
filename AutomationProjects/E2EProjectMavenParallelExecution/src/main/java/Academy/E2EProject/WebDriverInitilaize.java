package Academy.E2EProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverInitilaize {
	
	public WebDriver driver;
	public WebDriverInitilaize(WebDriver driver) {
		this.driver=driver;
	}

	@Test
	public WebDriver Webdriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
