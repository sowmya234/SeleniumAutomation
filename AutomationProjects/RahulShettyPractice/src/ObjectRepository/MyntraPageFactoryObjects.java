package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraPageFactoryObjects {
	
	
	WebDriver driver;
	public MyntraPageFactoryObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='mobileNumberPass']")
	WebElement username;
	@FindBy(css="input[type='password']")
	WebElement password;
	@FindBy(tagName="button")
	WebElement loginbtn;
	
	public WebElement Username() {
		return username;
	}
	public WebElement Password() {
		return password;
	}
	public WebElement LoginButton() {
		return loginbtn;
	}

}
