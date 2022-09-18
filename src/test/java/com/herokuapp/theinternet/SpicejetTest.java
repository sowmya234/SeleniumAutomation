package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpicejetTest {
	@Test
	public void FlightReservation() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//login 
		//driver.findElement(By.xpath("//div[@class=\"css-76zvg2 r-jwli3a r-n6v787 r-majxgm r-q4m81j\"]")).click();
		driver.findElement(By.xpath("//label[@for='fromCity']/input[@data-cy='fromCity']"));
				
	}

}
