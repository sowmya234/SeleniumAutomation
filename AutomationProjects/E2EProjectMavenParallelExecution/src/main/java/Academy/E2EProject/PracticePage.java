package Academy.E2EProject;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import objectRepository.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.Iterators;

public class PracticePage extends base {
	
	public WebDriver driver;
	@BeforeTest
	public void diverstart() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void RahulPracticepageNavigation() throws IOException, InterruptedException {
		//driver=initializeDriver();
		//driver.get(prop.getProperty("url"));
		LandingPageObjects Lp=new LandingPageObjects(driver);
		if(Lp.Popup().isDisplayed()) {
			Lp.Popup().click();
		}
		PracticepageObjects ppo=new PracticepageObjects(driver);
		ppo.getPracticepage().click();
		
		ppo.RadioButtonSelection().click();
		//Assert.assertTrue(ppo.RadioButtonSelection().isSelected());
		ppo.getCountry().sendKeys("ind");
		List<WebElement> countrieslist=driver.findElements(By.cssSelector("ul[id='ui-id-1'] li div[class='ui-menu-item-wrapper']"));
		for(WebElement country1 : countrieslist ){
			if(country1.getText().equalsIgnoreCase("India")) {
				country1.click();
			}
		}
		Select options=new Select(ppo.getStaticDropdown());
		options.selectByValue("option3");
		List<WebElement> checkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
		for(WebElement checkbox : checkboxes) {
			if(checkbox.getAttribute("value").equalsIgnoreCase("option2")) {
				checkbox.click();
			}
		}
		
		ppo.getOpenWindow().click();
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		System.out.println(childid);
		driver.switchTo().window(childid).close();
		driver.switchTo().window(parentid);
		
		ppo.getOpenTab().click();
		Set<String>Tabs=driver.getWindowHandles();
		Iterator<String> it1=Tabs.iterator();
		String parentTab=it1.next();
		String childTab=it1.next();
		driver.switchTo().window(childTab).close();
		driver.switchTo().window(parentTab);
		
		ppo.getAlertpopup().sendKeys("BTS.....!!!!!!!!!!");
		ppo.alertButton().click();
		Assert.assertEquals(driver.switchTo().alert().getText(),"Hello BTS.....!!!!!!!!!!, share this practice page and share your knowledge");
		driver.switchTo().alert().accept();
		ppo.getAlertpopup().sendKeys("Sowmya");
		ppo.confirmButton().click();
		Assert.assertEquals(driver.switchTo().alert().getText(),"Hello Sowmya, Are you sure you want to confirm?");
		driver.switchTo().alert().dismiss();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
	
		
		System.out.println(ppo.getFirstCourse().getText());
		Assert.assertEquals(ppo.getFirstCourse().getText(),"Selenium Webdriver with Java Basics + Advanced + Interview Guide");
		
		Assert.assertTrue(ppo.showHideBox().isDisplayed());
		ppo.hideButton().click();
		Assert.assertFalse(ppo.showHideBox().isDisplayed());
		ppo.showButton().click(); 
		Assert.assertTrue(ppo.showHideBox().isDisplayed());
		Assert.assertEquals(ppo.FixedHeaderTableContent().getText(),"Smith");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,600)");
		Actions action=new Actions(driver);
		action.moveToElement(ppo.MouseHoverAction());
		action.moveToElement(ppo.MouseHoverElement()).click().build().perform();
		jse.executeScript("window.scrollBy(0,750)");
		driver.switchTo().frame(ppo.IFrameElement());
		ppo.IFrameYoutube().click();
		driver.navigate().back();
		
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		ppo.BottomURL().click();
		System.out.println(driver.getTitle());
		Thread.sleep(500);
		driver.navigate().refresh();
		driver.navigate().back();
		jse.executeScript("window.scrollTo(1000,0)");
		
	}
	@AfterTest
	public void driverclose() {
		driver.close();
	}
	public String getScreenshot(String testcaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String destpath=System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
		FileHandler.copy(src, new File(destpath));
		return destpath;
	}
	

}
