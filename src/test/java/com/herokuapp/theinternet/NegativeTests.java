package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


public class NegativeTests {
	
	@Test(priority=1,enabled= false,groups = { "negativeTestsgrp" })
	public void InvalidUsernameTest() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		System.out.println("Executing the Negative testcase for Incorrect username");
		
		driver.findElement(By.id("username")).sendKeys("kimtaehyung@gmail.com");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		
		driver.findElement(By.cssSelector("button[class=\"radius\"] i")).click();
		
		String ErrorMsg = driver.findElement(By.cssSelector("div[class=\"flash error\"] ")).getText();
		String ExpectedErrMsg = "Your username is invalid!";
		
		Assert.assertTrue(ErrorMsg.contains(ExpectedErrMsg), "Expected and Actual Username doesnot matches!!!:(");
		
		System.out.println("!!!! Negative Validation for UserName for the Login Page !!!!");
		driver.close();
		
		System.out.println("Negative Test has executed successfully :)");
	}
	
	@Test(priority=2,groups = { "negativeTestsgrp", "SmokeTest" })
	public void InvalidPasswordTest() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		System.out.println("Executing the Negative testcase for Incorrect username");
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SeoulKoreaBTS");
		
		driver.findElement(By.cssSelector("button[class=\"radius\"] i")).click();
		
		String ErrorMsg = driver.findElement(By.cssSelector("div[class=\"flash error\"] ")).getText();
		String ExpectedErrMsg = "Your password is invalid!";
		
		Assert.assertTrue(ErrorMsg.contains(ExpectedErrMsg), "Expected and Actual Password doesnot matches!!!:(");
		
		System.out.println("!!!! Negative Validation for Password for the Login Page !!!!");
		driver.close();
		
		System.out.println("Negative Test has executed successfully :)");
	}

}
