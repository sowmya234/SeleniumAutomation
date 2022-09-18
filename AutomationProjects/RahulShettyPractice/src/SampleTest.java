

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		int rowsize= driver.findElements(By.xpath("//table[@name=\"courses\"]/tbody/tr")).size();
		System.out.println("No.of Rows ina table"+rowsize);
		
		int columnSize= driver.findElements(By.xpath("//table[@name=\"courses\"]/tbody/tr[1]/th")).size();
		System.out.println("No.of Rows ina table"+columnSize);
		
		System.out.println("Second Row Each column values");
		List<WebElement> columns=driver.findElements(By.xpath("//table[@name=\"courses\"]/tbody/tr[3]/td"));
		for(WebElement coulumn : columns ) {
		
			System.out.println(coulumn.getText());
		}
		//dropdown
		js.executeScript("window.scrollTo(0,0)");
		driver.findElement(By.cssSelector("input[placeholder=\"Type to Select Countries\"]")).sendKeys("ind");
		int count=driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]/li")).size();
		Thread.sleep(2000);
		String one=driver.findElement(By.xpath("//ul[@id=\"ui-id-1\"]/li/div[@class=\"ui-menu-item-wrapper\"]")).getText();
		for(int i=0;i<count;i++) {
			if(one == "India") {
				driver.findElement(By.xpath("//ul[@id=\"ui-id-1\"]/li/div[@class=\"ui-menu-item-wrapper\"]")).click();
				break;
				
			}
		}
		driver.findElement(By.xpath("//ul[@id=\"ui-id-1\"]/li/div[@class=\"ui-menu-item-wrapper\"]")).getAttribute("");
		
		
		
		
	
	}

}
