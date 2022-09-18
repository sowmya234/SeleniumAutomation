package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


public class ParameterTests {
	
	@Parameters({ "username","password","ErrorMessage" })
	@Test
	public void InvalidLoginTests(String UserName, String Password,String ErrorMessage) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		System.out.println("Executing the Negative testcase for Incorrect username");
		
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		
		driver.findElement(By.cssSelector("button[class=\"radius\"] i")).click();
		
		String ErrorMsg = driver.findElement(By.cssSelector("div[class=\"flash error\"] ")).getText();
		String ExpectedErrMsg = ErrorMessage;
		
		Assert.assertTrue(ErrorMsg.contains(ExpectedErrMsg), "Expected and Actual result doesnot matches!!!:(");
		
		System.out.println("!!!! Negative Validation for Login Credentials for the Login Page using Parameters concept !!!!");
		driver.close();
		
		System.out.println("Negative Test has executed successfully :)");
	}
	
	

}
