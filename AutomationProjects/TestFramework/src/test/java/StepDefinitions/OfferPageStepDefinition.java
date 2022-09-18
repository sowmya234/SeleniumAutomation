package StepDefinitions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.OffersPageObjects;
import PageObjects.PageObjectManager;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OfferPageStepDefinition {
	public String OfferPageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager POM;
	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}



@Then("user searches for same name in offers page to check if product exists")
public void user_searches_for_same_name_in_offers_page_to_check_if_product_exists() {
	//POM=new PageObjectManager(testContextSetup.driver);
	//OffersPageObjects OPO=POM.getOfferPage();
	OffersPageObjects OPO=new OffersPageObjects(testContextSetup.driver);
	OPO.TopDealsBtn().click();
	//testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
	Set<String> windows=testContextSetup.driver.getWindowHandles();
	   Iterator<String> it=windows.iterator();
	   String parentid=it.next();
	   String childid=it.next();
	   testContextSetup.driver.switchTo().window(childid);
	   OPO.searchBox().sendKeys("tom");
	   //testContextSetup.driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("tom");
	   testContextSetup.OfferPageProductName=OPO.getProductName().getText();
	   //testContextSetup.OfferPageProductName=testContextSetup.driver.findElement(By.cssSelector("table tbody td:nth-child(1)")).getText();
    System.out.println(testContextSetup.OfferPageProductName);
}

@Then("Validate the itemName in offersPage matches with HomePage")
public void validate_the_item_name_in_offers_page_matches_with_home_page() {
	 Assert.assertEquals(testContextSetup.HomePageProductName, testContextSetup.OfferPageProductName);
	    System.out.println("And Method");
}

}
