import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ChromeWebdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// username and password
		driver.findElement(By.id("inputUsername")).sendKeys("rahulshetty");
		driver.findElement(By.name("inputPassword")).sendKeys("jhfjshf");
		driver.findElement(By.cssSelector("button[class*=signInBtn]")).click();
		String Errormsg = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(Errormsg);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form //input[@placeholder=\"Name\"]")).sendKeys("Rahul");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form //input[@placeholder=\"Email\"]")).sendKeys("Rhaulshetty@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("345334636346");
		// driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();

		// driver.findElement(By.className("infoMsg")).getText();
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
		// Thread.sleep(2000);
		String PasswordNew = getPassword(driver);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		driver.findElement(By.xpath("//form/input[@type=\"password\"]")).sendKeys(PasswordNew);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		String successMsg = driver.findElement(By.cssSelector("div.login-container h2")).getText();
		System.out.println(driver.findElement(By.cssSelector("div.login-container h2")).getText());
		System.out.println(successMsg.contains("rahul"));
		Assert.assertEquals(successMsg, "Hello rahul,");
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		driver.close();
		// driver.switchTo().alert().
	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String PasswordText = driver.findElement(By.xpath("//form/p")).getText();
		// Please use temporary password 'rahulshettyacademy' to Login.
		String[] PasswordArray = PasswordText.split("'");
		String[] PasswordArray2 = PasswordArray[1].split("'");
		return PasswordArray2[0];

	}

}
