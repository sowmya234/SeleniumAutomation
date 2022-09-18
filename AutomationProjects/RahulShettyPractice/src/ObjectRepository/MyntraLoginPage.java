package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraLoginPage {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/login/password");
		MyntraPageFactoryObjects MPFO=new MyntraPageFactoryObjects(driver);
		MPFO.Username().sendKeys("BTS");
		MPFO.Username().clear();
		MPFO.Username().sendKeys("8500846055");
		MPFO.Password().sendKeys("Myntra@123");
		MPFO.LoginButton().click();
		
		
	}

}
