package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsDemoTest1 {

	public void Action1Test() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ChromeWebdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//span[@class=\"a-button-inner\"]/input[@data-action-type=\"DISMISS\"]")).click();
	}

}
