package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import objectRepository.*;

public class RedBusObjects {
	
	WebDriver driver;
	public RedBusObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	By onwardcalendar=By.cssSelector("div[class*=\"gtm-onwardCalendar\"]");
	By returndcalendar=By.cssSelector("div[class*=\"gtm-returnCalendar\"] ");
	By onwarddate=By.xpath("//div[@class=\"rb-calendar\"]/table/tbody/tr/td[@class=\"current day\"]");
	By returndate=By.xpath("//div[@class=\"rb-calendar\"]/table/tbody/tr/td[@class=\"current day\"]");
	By dates=By.xpath("//div[@class=\"rb-calendar\"]/table/tbody/tr/td[@class=\"wd day\"]");
	public WebElement getOnwardCalendar() {
		return driver.findElement(onwardcalendar);
	}
	public WebElement getReturnCalendar() {
		return driver.findElement(returndcalendar);
	}
	public WebElement getOnwardDate() {
		return driver.findElement(onwarddate);
	}
	public WebElement getReturnDate() {
		return driver.findElement(returndate);
	}
	public List<WebElement> getdates() {
		return driver.findElements(dates);
	}
	
	

}
