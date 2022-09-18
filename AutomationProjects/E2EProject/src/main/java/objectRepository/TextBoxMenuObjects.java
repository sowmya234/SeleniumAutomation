package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxMenuObjects {
	
	WebDriver driver;
	
	public TextBoxMenuObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Full Name']")
	WebElement name;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(css="textarea[placeholder='Current Address']")
	WebElement currentAddress;
	
	@FindBy(id="permanentAddress")
	WebElement permanentAddress;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submitBtn;
	
	public WebElement getName() {
		return name;
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getCurrentAddress() {
		return currentAddress;
	}
	
	public WebElement getPermanentAddress() {
		return permanentAddress;
	}
	
	public WebElement SubmitButton() {
		return submitBtn;
	}
	
	
	
	
	
	

}
