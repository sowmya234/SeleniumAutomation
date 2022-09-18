package Academy.E2EProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import objectRepository.RedBusObjects;

public class RedbusCalender {
	
	public WebDriver driver;
	@Test
	public void calenderSample() throws IOException, InterruptedException {
		Properties prop=new Properties();
		FileInputStream FIS=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\E2EProject\\src\\main\\java\\Academy\\E2EProject\\data2.properties");
		prop.load(FIS);
		String RedbusURL=prop.getProperty("RedbusUrl");
		//Initializing the webdriver class
		WebDriverInitilaize webd=new WebDriverInitilaize(driver);
		driver=webd.Webdriver();
		driver.get(RedbusURL);
		RedBusObjects RedbusObj=new RedBusObjects(driver);
		RedbusObj.getOnwardCalendar().click();
		RedbusObj.getReturnDate().click();
		//System.out.println(RedbusObj.getOnwardDate().getText());
		Thread.sleep(2000);
		RedbusObj.getReturnCalendar().click();
		RedbusObj.getReturnDate().click();
		//System.out.println(RedbusObj.getReturnDate().getText());
		
		List<WebElement> ds=RedbusObj.getdates();
		for(WebElement d : ds) {
			System.out.println(d.getText());
			if(d.getText()=="22") {
				System.out.println("sfsf");
				//d.click();
				//RedbusObj.getReturnDate().click();
			}
		}
	
	}
	@AfterTest
	public void driverclose() {
		driver.close();
	}
	
	

}
