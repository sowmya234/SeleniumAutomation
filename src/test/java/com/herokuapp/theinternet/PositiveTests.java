package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTests {
	
	@Test
	public void LoginTest() {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Launchig the login page");
		
		sleep(3000);
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		//login name and password
	
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("tomsmith");
		driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();		
		System.out.println("navigating to next Browser");
		String data= driver.findElement(By.xpath("//div[@class=\"flash success\"]")).getText(); 
		String Expected ="You logged into a secure area!"; 
		Assert.assertTrue(data.contains(Expected));
		
		driver.findElement(By.xpath("//a[@class=\"button secondary radius\"]/i")).click();
		
		driver.close();
		
		
		
	}

	private void sleep(long t) {
		try {
			Thread.sleep(t);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
