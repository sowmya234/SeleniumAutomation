

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/ChromeWebdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//login 
		//driver.findElement(By.xpath("//div[@class=\"css-76zvg2 r-jwli3a r-n6v787 r-majxgm r-q4m81j\"]")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		driver.findElement(By.xpath("//div[@id=\"content\"]")).getText();
	
	}

}
