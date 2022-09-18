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

public class OfferPageStepDefinition {
	//public WebDriver driver;
	CartPageObjects CartPO;
	textContextSetup tcs;
	public OfferPageStepDefinition(textContextSetup tcs) {
		this.tcs=tcs;
	}
	
	
	@Then("Validate the added items with items in the cart page")
	public void validate_the_added_items_with_items_in_the_cart_page() {
		CartPO=new CartPageObjects(tcs.driver);
		System.out.println(CartPO.TableItemName().getText());
		CartPO.PromocodeBox().sendKeys("rahulshettyacademy");
		CartPO.PromoBtn().click();
		String info=CartPO.PromocodeValidation().getText();
		System.out.println(info);
		Assert.assertEquals("Code applied ..!", info);
		CartPO.PlaceOrderBtn().click();
		CartPO.CheckBoxBtn().click();
		CartPO.ProccedBtn().click();
	}

}
