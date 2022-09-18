package Academy.E2EProject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import objectRepository.*;

@Test
public class AlertPraticePage {
	
	
	public WebDriver driver;
	@Test
	public void AlertpageTest() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\E2EProject\\src\\main\\java\\Academy\\E2EProject\\data2.properties");
		prop.load(fis);
		String AlertPageLink=prop.getProperty("url");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(AlertPageLink);
		driver.manage().window().maximize();
		
		AlertPageObjects APO=new AlertPageObjects(driver);
		APO.AlertwithOkBtn().click();
		driver.switchTo().alert().accept(); 
		APO.AlertOkCancel().click();
			
		APO.ConfirmBoxBtn().click(); 
		driver.switchTo().alert().accept();
		System.out.println(APO.ConfirmBoxMsg().getText());
		Assert.assertEquals(APO.ConfirmBoxMsg().getText(),"You pressed Ok");
		APO.ConfirmBoxBtn().click();
		driver.switchTo().alert().dismiss();
		Assert.assertEquals(APO.ConfirmBoxMsg().getText(),"You Pressed Cancel");
		System.out.println(APO.ConfirmBoxMsg().getText());
		APO.AlertWithTextBox().click();
		APO.PromptBoxBtn().click();
		driver.switchTo().alert().sendKeys("Selenium With Java Automation-50%");
		driver.switchTo().alert().accept(); 
		System.out.println(APO.TextboxMsg().getText());
	}
	@AfterTest
	public void Closedriver() {
		driver.close();
	}
	
	

}
