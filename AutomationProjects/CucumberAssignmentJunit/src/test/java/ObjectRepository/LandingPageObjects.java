package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageObjects {
	WebDriver driver;
	public LandingPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By search=By.xpath("//input[@type=\"search\"]");
	By increment=By.xpath("//a[@class=\"increment\"]");
	By addtocart=By.xpath("//div[@class='product-action']/button[contains(text(),'ADD TO CART')]");
	By carticon=By.cssSelector("a[class='cart-icon'] img");
	By checkout=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
			
	
	public WebElement searchTextBox() {
		return driver.findElement(search);
	}
	
	public WebElement quantityIncrement() {
		return driver.findElement(increment);
	}
	
	public WebElement AddToCart() {
		return driver.findElement(addtocart);
	}
	
	public WebElement CartIcon() {
		return driver.findElement(carticon);
	}
	
	public WebElement CheckoutBtn() {
		return driver.findElement(checkout);
				
	}
	
	
	
	
			 

}
