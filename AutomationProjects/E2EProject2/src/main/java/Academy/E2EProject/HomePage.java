package Academy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends base {
	
	public WebDriver driver;
	
	public void basePageNavigator() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver=initializeDriver();
		driver.get("https://demoqa.com/elements");
		/*
		 * HomePageObjects HMO=new HomePageObjects(driver); HMO.TextBoxMenu().click();
		 * TextBoxMenuObjects TBMO=new TextBoxMenuObjects(driver);
		 * TBMO.getName().sendKeys("Rahul");
		 * TBMO.getEmail().sendKeys("rahul@gmail.com");
		 * TBMO.getCurrentAddress().sendKeys("DoorNo:11-73\nWalmart Street");
		 * TBMO.getPermanentAddress().sendKeys("DoorNo:11-73\nWalmart Street");
		 * TBMO.SubmitButton().click();
		 */
		
		
	}
		

}
