package ObjectRepository;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	WebDriver driver;
	public  PageObjectManager(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void getLandingPageObjects() {
		LandingPageObjects LPO=new LandingPageObjects(driver);

	}
	
	public void getCartPageObjects() {
		CartPageObjects CartPageobj=new CartPageObjects(driver);
	}
	
	

}
