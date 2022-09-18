package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	WebDriver driver;
	LandingPageObjects lpageObj;
	OffersPageObjects OffpageObj;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public 	LandingPageObjects getLandingPage() {
		 lpageObj=new LandingPageObjects(driver);
		 return lpageObj;
	}
	
	public OffersPageObjects getOfferPage() {
		 OffpageObj=new OffersPageObjects(driver);
		 return OffpageObj;
	}

}
