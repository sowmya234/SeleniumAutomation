package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class CartPageObjects {
	
	WebDriver driver;
	
	public CartPageObjects(WebDriver driver) {
		this.driver=driver;
	}

	By itemName=By.cssSelector("tbody td:nth-child(2) p");
	By promocodeBox=By.xpath("//div[@class='promoWrapper']/input[@class='promoCode']");
	By promoBtn=By.className("promoBtn");
	By promovalidation=By.cssSelector("span.promoInfo:nth-child(4)");
	By placeorder=By.cssSelector("button:nth-child(14)");
	By checkboxx=By.cssSelector("input.chkAgree");
	By proceedBtn=By.tagName("button");
			
	public WebElement TableItemName() {
		return driver.findElement(itemName);
	}
	
	public WebElement PromocodeBox() {
		return driver.findElement(promocodeBox);
	}
	
	public WebElement PromoBtn() {
		return driver.findElement(promoBtn);
	}
	
	public WebElement PromocodeValidation() {
		return driver.findElement(promovalidation);
	}
	
	public WebElement PlaceOrderBtn() {
		return driver.findElement(placeorder);		
	}
	
	public WebElement CheckBoxBtn() {
		return driver.findElement(checkboxx);		
	}
	
	public WebElement ProccedBtn() {
		return driver.findElement(proceedBtn);		
	}
	
}
