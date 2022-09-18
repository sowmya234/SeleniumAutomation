package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTests {
	private WebDriver driver;
	
	
	
	
	@BeforeMethod(alwaysRun=true)
	private void setup() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Launchig the login page");
		sleep(3000);
		driver.manage().window().maximize();
	}
	
	
	@Test(priority=1,groups = { "positiveTestsgrp" })
	public void PositiveLoginTest() {
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
	}
	
	@Parameters({ "username","password","ErrorMessage" })
	@Test(priority=2,groups = { "negativeTestsgrp" })
	public void InvalidLoginTests(String UserName, String Password,String ErrorMessage) {		
		driver.get("https://the-internet.herokuapp.com/login");
		
		System.out.println("Executing the Negative testcase for Incorrect username");
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.cssSelector("button[class=\"radius\"] i")).click();
		String ErrorMsg = driver.findElement(By.cssSelector("div[class=\"flash error\"] ")).getText();
		String ExpectedErrMsg = ErrorMessage;
		Assert.assertTrue(ErrorMsg.contains(ExpectedErrMsg), "Expected and Actual result doesnot matches!!!:(");
		System.out.println("!!!! Negative Validation for Login Credentials for the Login Page using Parameters concept !!!!");
		System.out.println("Negative Test has executed successfully :)");
	}

    @AfterMethod(alwaysRun=true)
	private void closeBroswer() {
		driver.quit();
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
