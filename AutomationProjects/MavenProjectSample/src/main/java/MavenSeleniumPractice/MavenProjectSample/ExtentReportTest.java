package MavenSeleniumPractice.MavenProjectSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTest {
	ExtentReports extent;
	@BeforeTest
	public void config() {
		String path= System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		
		reporter.config().setReportName("WebApplicationReport");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Sowmya");
		
	}
	@Test
	public void initialDemo() {
		extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.close();
		//test.fail("failed");
		extent.flush();
		
	}

}
