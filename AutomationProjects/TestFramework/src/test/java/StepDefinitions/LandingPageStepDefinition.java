package StepDefinitions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPageObjects;
import PageObjects.PageObjectManager;
import Utils.DriverBase;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefinition {
	public WebDriver driver;
	public String HomePageProductName;
	TestContextSetup testContextSetup;
	//PageObjectManager POM;
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}

@Given("User is on Home page")
public void user_is_on_home_page() {
	System.out.println("Driver intitialization");
	//DriverBase Driver=new DriverBase();
	//Driver.driverInitialization();
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	testContextSetup.driver=new ChromeDriver();
	testContextSetup.driver.manage().window().maximize();
	testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	testContextSetup.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

@When("user searches for {string} and extracted actual name of product")
public void user_searches_for_and_extracted_actual_name_of_product(String item) throws InterruptedException {
	
	LandingPageObjects LPO=new LandingPageObjects(testContextSetup.driver);
	LPO.SearchBoxx().sendKeys(item);
	//testContextSetup.driver.findElement(By.className("search-keyword")).sendKeys(item);
	Thread.sleep(1000);
	testContextSetup.HomePageProductName=LPO.ProductName().getText().split("-")[0].trim();
	
	
	   System.out.println(testContextSetup.HomePageProductName);
}



}
