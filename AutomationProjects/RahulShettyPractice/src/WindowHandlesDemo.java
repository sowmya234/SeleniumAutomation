

import java.util.Set;
import java.util.concurrent.TimeUnit;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WindowHandlesDemo {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		/*
		 * driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		 * driver.findElement(By.id("password")).sendKeys("learning"); Select options =
		 * new Select(driver.findElement(By.
		 * cssSelector("div[class=\"form-group\"]:nth-child(5) select")));
		 * options.selectByValue("teach");
		 * //driver.findElement(By.id("checkbox")).click();
		 * driver.findElement(By.id("signInBtn")).click();
		 */
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText());
		String Text= driver.findElement(By.cssSelector("p[class=\"im-para red\"]")).getText();
		String[] t=Text.split("at");
		System.out.println(t[1].trim().split(" ")[0]);
		driver.switchTo().window(parentid);
		driver.findElement(By.name("username")).sendKeys(t[1].trim().split(" ")[0]);
		driver.findElement(By.id("password")).sendKeys("learning"); 
		Select options = new Select(driver.findElement(By.
		cssSelector("div[class=\"form-group\"]:nth-child(5) select")));
		options.selectByValue("teach");
	//driver.findElement(By.id("checkbox")).click();
	    driver.findElement(By.id("signInBtn")).click();
	    //driver.findElement(By.className("*alert-danger"));
	    driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
	    
		
	}

}
