package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest {
	@Test
	public void Test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[value='option1'] ")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option1'] ")).isSelected());
		Thread.sleep(2000);
		System.out.println("checkbox is going to be unchecked now");
		driver.findElement(By.cssSelector("input[value='option1'] ")).click();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox'] ")).size());
		
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox'] ")).size(), 3);
		
		driver.close();
		
	}

}
