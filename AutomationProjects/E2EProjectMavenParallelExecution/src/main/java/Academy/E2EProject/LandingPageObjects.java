package Academy.E2EProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class LandingPageObjects {
	
	public WebDriver driver;
	public LandingPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div/button[contains(text(),'NO THANKS')]")
	WebElement Nothanks;
	@FindBy(xpath="//nav[@class='pull-right']/ul/li[4]")
	WebElement login;
	@FindBy(css="div[class='text-center'] h2")
	WebElement courses;
	
	public WebElement Popup() {
		return Nothanks;
	}
	
	public WebElement NaviagteToLoginPage() {
		return login;
	}
	public WebElement CoursesText() {
		return courses;
	}
	
	
	

}
