

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemoTest1 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		driver.findElement(By.xpath("//span[@class=\"a-button-inner\"]/input[@data-action-type=\"DISMISS\"]")).click();
		
		Actions action1 = new Actions(driver);
		//entering hellp intext feild in capitals --which can done only by action elements.
		WebElement txt=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		action1.moveToElement(txt).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		WebElement data1=driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_ya_signin\"]"));
		action1.moveToElement(data1).build().perform();
		action1.click(driver.findElement(By.cssSelector("a[id=\"nav_prefetch_yourorders\"] span.nav-text"))).build().perform();
		
	
	
	
	}
	

}
