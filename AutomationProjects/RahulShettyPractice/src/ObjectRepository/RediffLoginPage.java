package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class RediffLoginPage {
	
	
	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver) {
		
		this.driver=driver;
	}

		By username=By.cssSelector("input[id=\"login1\"]");
		By password=By.xpath("//input[@id=\"password\"]");
		By submit=By.className("signinbtn");
		By registerLink =By.xpath("//div[@class=\"create-new-account\"]/a");
		
		public WebElement Username() {
			return driver.findElement(username);
		}
		public WebElement Password() {
			return driver.findElement(password);
		}
		public WebElement SubmitButton() {
			return driver.findElement(submit);
		}
		public WebElement RegisterLink() {
			return driver.findElement(registerLink);
		}
		
		
	

}
