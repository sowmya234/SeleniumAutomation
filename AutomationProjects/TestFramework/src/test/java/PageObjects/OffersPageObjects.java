package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OffersPageObjects {
	public WebDriver driver;
	public OffersPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	By topDeals=By.linkText("Top Deals");
	By search=By.xpath("//input[@id='search-field']");
	By productname=By.cssSelector("table tbody td:nth-child(1)");
	
	public WebElement TopDealsBtn() {
		return driver.findElement(topDeals);
	}
	
	public WebElement searchBox() {
		return driver.findElement(search);
	}
	
	public WebElement getProductName() {
		return driver.findElement(productname);
	}

}
