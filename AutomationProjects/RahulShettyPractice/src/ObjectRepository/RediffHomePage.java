package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class RediffHomePage {
	
	
	WebDriver driver;
	
	public RediffHomePage(WebDriver driver) {
		
		this.driver=driver;
	}	
	By rediffHome=By.linkText("rediff.com");
	By searchfeild=By.cssSelector("input[id=\"srchword\"]");
	By Submitbtn=By.xpath("//input[@type='submit']");
	//By infoMsg=By.xpath("//div[@class=\"bgwhite\"]/div[contains(text(),\"Sorry!\")]");
	By infoMsg=By.xpath("//div[@class=\"bgwhite\"]/div[@class='grey1 f16 bold']");
	
	public WebElement Rediff() {
		return driver.findElement(rediffHome);
	}
	public WebElement Search() {
		return driver.findElement(searchfeild);
	}
	public WebElement SubmitBtn() {
		return driver.findElement(Submitbtn);
	}
	public WebElement InfoMsg() {
		return driver.findElement(infoMsg);
	}
	
	
	

}
