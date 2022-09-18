package Academy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePage extends base{
	
	public WebDriver driver;
	@BeforeTest
	public void diverstart() throws IOException {
		driver=initializeDriver();
		driver.get("https://www.qaclickacademy.com/");
	}
	@Test(dataProvider="getData")
	public void basePageNavigator(String username,String password) throws IOException {
		
		LandingPageObjects Landpage=new LandingPageObjects(driver);
		if(Landpage.Popup().isDisplayed()) {
			Landpage.Popup().click();
		}
		Assert.assertEquals(Landpage.CoursesText().getText(),"FEATURED COURSES" );
		Landpage.NaviagteToLoginPage().click();
		LoginPageObjects LPage=new LoginPageObjects(driver);
		LPage.UserName().sendKeys(username);
		LPage.Password().sendKeys(password);
		LPage.LoginBtn().click();
		if(LPage.InvalidCredentialsMsg().isDisplayed()) {
			System.out.println("Please enter valid credentials..!!!");
			LPage.UserName().clear();
		    LPage.UserName().sendKeys("rahulshetty");
		    LPage.Password().sendKeys("RahulShetty");
		    LPage.LoginBtn().click(); }
		 
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] datas=new Object[3][2];//row-how many iterations,colums-how many values per iteration
		datas[0][0]="restricteduser@qw.com";
		datas[0][1]="45678";
		datas[1][0]="restricteduser@qw.com";
		datas[1][1]="45678";
		datas[2][0]="unrestricteduser@qw.com";
		datas[2][1]="123456";
		return datas;
	}
	
	@AfterTest
	public void driverclose() {
		driver.close();
	}
}
