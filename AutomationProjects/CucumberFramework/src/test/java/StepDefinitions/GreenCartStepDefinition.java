package StepDefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.common.collect.Iterators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenCartStepDefinition {
	
	WebDriver driver;
	String HomePageProductName;
	String OfferPageProductName;
	
	@Given("^User is on Home page$")
	public void user_is_on_home_page() {
	   //driver initialization and page launch
		System.out.println("Driver intitialization");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@When("user searches for {string} and extracted actual name of product")
	public void user_searches_for_and_extracted_actual_name_of_product(String item) {
	   driver.findElement(By.className("search-keyword")).sendKeys(item);
	   HomePageProductName=driver.findElement(By.tagName("h4")).getText().split("-")[0].trim();
	   driver.findElement(By.xpath("//button[contains(text(),\"ADD TO CART\")]")).click();
	   System.out.println("when method");
	}
	@Then("user searches for same name in offers page to check if product exists")
	public void user_searches_for_same_name_in_offers_page_to_check_if_product_exists() {
		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> windows=driver.getWindowHandles();
		   Iterator<String> it=windows.iterator();
		   String parentid=it.next();
		   String childid=it.next();
		   driver.switchTo().window(childid);
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("tom");
	    OfferPageProductName=driver.findElement(By.cssSelector("table tbody td:nth-child(1)")).getText();
	    System.out.println("Then method");
	   
	}
	@Then("Validate the itemName in offersPage matches with HomePage")
	public void validate_the_item_name_in_offers_page_matches_with_home_page() {
	    Assert.assertEquals(HomePageProductName, OfferPageProductName);
	    System.out.println("And Method");
	}

}
