package Academy.E2EProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class LoginPageObjects {
	
	public WebDriver driver;
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_email")
	WebElement email;
	@FindBy(xpath="//input[@name=' password']")
	WebElement password;
	@FindBy(xpath="//div/input[@type='submit']")
	WebElement loginbtn;
	@FindBy(xpath="//div[@class='main-hero']/div")
	WebElement InvalidCreds;
	
	
	public WebElement UserName() {
		return email;
	}
	public WebElement Password() {
		return password;
	}
	public WebElement LoginBtn() {
		return loginbtn;
	}
	public WebElement InvalidCredentialsMsg() {
		return InvalidCreds;
	}
	
	

}
