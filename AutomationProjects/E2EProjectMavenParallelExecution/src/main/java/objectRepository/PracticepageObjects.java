package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticepageObjects {
	WebDriver driver;
	
	public PracticepageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="ul[class*='navbar-right'] li:nth-child(5)")
	WebElement practice;
	@FindBy(css="input[value=\"radio2\"]")
	WebElement radiobutton;
	@FindBy(css="input[placeholder*='Select Countries']")
	WebElement selectCountry;
	@FindBy(xpath="//select[@name='dropdown-class-example']")
	WebElement staticDropdown;
	@FindBy(css="#openwindow")
	WebElement openwindow;
	@FindBy(xpath="//a[@id='opentab']")
	WebElement opentab;
	@FindBy(css="fieldset input[name='enter-name']")
	WebElement alertpopup;
	@FindBy(id="alertbtn")
	WebElement alertbutton;
	@FindBy(id="confirmbtn")
	WebElement confirmbutton;
	@FindBy(xpath="//table[@name='courses']/tbody/tr[2]/td[2]")
	WebElement firstcourse;
	@FindBy(id="displayed-text")
	WebElement showhideSample;
	@FindBy(id="hide-textbox")
	WebElement hideButton;
	@FindBy(id="show-textbox")
	WebElement showButton;
	@FindBy(xpath="//div[@class='tableFixHead']/table[@id='product']/tbody/tr[9]/td[1]")
	WebElement FixedHeader;
	@FindBy(xpath="//button[@id='mousehover']")
	WebElement mousehover;
	@FindBy(xpath="//a[contains(text(),'Top')] ")
	WebElement mousehoverElement;
	@FindBy(css="#courses-iframe")
	WebElement iframeSection;
	@FindBy(xpath="//a/span[@class='fa fa-youtube']")
	WebElement iframeYoutube;
	@FindBy(xpath="//a[contains(text(),'REST API')]")
	WebElement bottomPageLink;
	public WebElement getPracticepage() {
		return practice;
	}
	public WebElement RadioButtonSelection() {
		return radiobutton;
	}
	public WebElement getCountry() {
		return selectCountry;
	}
	public WebElement getStaticDropdown() {
		return staticDropdown;
	}
	public WebElement getOpenWindow() {
		return openwindow;
	}
	public WebElement getOpenTab() {
		return opentab;
	}
	public WebElement getAlertpopup() {
		return alertpopup;
	}
	public WebElement alertButton() {
		return alertbutton;
	}
	public WebElement confirmButton() {
		return confirmbutton;
	}
	public WebElement getFirstCourse() {
		return firstcourse;
	}
	public WebElement showHideBox() {
		return showhideSample;
	}
	public WebElement hideButton() {
		return hideButton;
	}
	public WebElement showButton() {
		return showButton;
	}
	public WebElement FixedHeaderTableContent() {
		return FixedHeader;
	}
	public WebElement MouseHoverAction() {
		return mousehover;
	}
	public WebElement MouseHoverElement() {
		return mousehoverElement;
	}
	public WebElement IFrameElement() {
		return iframeSection;
	}
	public WebElement IFrameYoutube() {
		return iframeYoutube;
	}
	public WebElement BottomURL() {
		return bottomPageLink;
	}


}
