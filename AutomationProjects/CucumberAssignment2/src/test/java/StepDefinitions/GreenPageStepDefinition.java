package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.CartPageObjects;
import ObjectRepository.LandingPageObjects;
import Utils.textContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class GreenPageStepDefinition {
	public WebDriver driver;
	public LandingPageObjects GreenLPO;
	public CartPageObjects CartPO;
	public textContextSetup tcs;
	public GreenPageStepDefinition(textContextSetup tcs) {
		this.tcs=tcs;
	}
	@Given("user is on Home Page")
	public void user_is_on_home_page() {
		
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\chromedriver_win32\\chromedriver.exe"); tcs.driver=new ChromeDriver();
		  tcs.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		  tcs.driver.manage().window().maximize();
		  tcs.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		
		System.out.println("Greenkart application got launched successfully!!!");
	    
	}
	
	@When("user searches for {string} and select quantity")
	public void user_searches_for_and_select_quantity(String item) throws InterruptedException {
		GreenLPO=new LandingPageObjects(tcs.driver);
		Thread.sleep(1000);
		GreenLPO.searchTextBox().sendKeys(item);
		 // driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(item);
		  Thread.sleep(1000);
		  int i=0;
		  while(i<=3) {
			  GreenLPO.quantityIncrement().click();
		  //driver.findElement(By.xpath("//a[@class=\"increment\"]")).click();
		  i++;
	}
		  GreenLPO.AddToCart().click();
		  //driver.findElement(By.xpath("//div[@class='product-action']/button[contains(text(),'ADD TO CART')]")).click(); 
	}
	
	@When("user procceds for checkout")
	public void user_procceds_for_checkout() {
	    GreenLPO.CartIcon().click();
		//driver.findElement(By.cssSelector("a[class='cart-icon'] img")).click();
	}
	
	@When("user is on Cart page")
	public void user_is_on_cart_page() {
		GreenLPO.CheckoutBtn().click();
		 //driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	   
	}
	
	

}
