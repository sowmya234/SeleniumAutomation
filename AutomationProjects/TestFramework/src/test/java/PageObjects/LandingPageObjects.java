package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPageObjects {
	WebDriver driver;
	public LandingPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	By search=By.className("search-keyword");
	By Product=By.tagName("h4");
	//By addToCart=By.xpath("//button[contains(text(),\\\"ADD TO CART\\");
	
	public WebElement SearchBoxx() {
		return driver.findElement(search);
	}
	
	public WebElement ProductName() {
		return driver.findElement(Product);
	}
	
	

}
