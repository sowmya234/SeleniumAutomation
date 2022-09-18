package ObjectRepository;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageMainTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		RediffLoginPage rlp=new RediffLoginPage(driver);
		rlp.Username().sendKeys("SowmyaBTS");
		//Thread.sleep(1000);
		rlp.Password().sendKeys("Sowmya123");
		//Thread.sleep(1000);
		rlp.SubmitButton().click();
		//Thread.sleep(1000);
		rlp.RegisterLink().click();
		//Thread.sleep(1000);
		driver.navigate().back();
		//Thread.sleep(1000);
		
		/*
		 * Set<String> windows=driver.getWindowHandles(); Iterator<String>
		 * it=windows.iterator(); String parentwindow=it.next(); String
		 * childwindow=it.next(); driver.switchTo().window(parentwindow);
		 */
		RediffHomePage rhp=new RediffHomePage(driver);
		rhp.Rediff().click();
		rhp.Search().sendKeys("bts merchandise");


		if(rhp.InfoMsg().getText().contains("Sorry")) {
			rhp.Search().clear();
			rhp.Search().sendKeys("handbags");
			rhp.SubmitBtn();
		}
	}

	
}
