package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPageObjects {
	WebDriver driver;
	
	public AlertPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="button[onclick='alertbox()']")
	WebElement alertwithOK;
	@FindBy(xpath="//a[@href='#CancelTab']")
	WebElement alertWithOkAndCancel;
	@FindBy(xpath="//div[@id='CancelTab']/button")
	WebElement confirmBox;
	@FindBy(css="div p")
	WebElement paramsg;
	@FindBy(xpath="//div[@class='tabpane pullleft']/ul/li[3]/a")
	WebElement alertWithTextbox;
	@FindBy(xpath="//div[@id='Textbox']/button")
	WebElement promptBox;
	@FindBy(id="demo1")
	WebElement textboxMsg;
	public WebElement AlertwithOkBtn() {
		return alertwithOK;
	}
	public WebElement AlertOkCancel() {
		return alertWithOkAndCancel;
	}
	public WebElement ConfirmBoxBtn() {
		return confirmBox;
	}
	public WebElement ConfirmBoxMsg() {
		return paramsg;
	}
	public WebElement AlertWithTextBox() {
		return alertWithTextbox;
	}
	public WebElement PromptBoxBtn() {
		return promptBox;
	}
	public WebElement TextboxMsg() {
		return textboxMsg;
	}
	
	
	
	
	
	
	
	

}
