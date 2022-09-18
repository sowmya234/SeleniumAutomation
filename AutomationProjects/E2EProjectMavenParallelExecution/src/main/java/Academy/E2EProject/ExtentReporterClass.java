package Academy.E2EProject;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporterClass {
	static ExtentReports extent;
	
	@Test
	public static ExtentReports getReporterObjects() {
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentHtmlReporter Reporter=new ExtentHtmlReporter(path);
		Reporter.config().setReportName("End To End Project Report");
		Reporter.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(Reporter);
		extent.setSystemInfo("Test Automation Engineer", "Sowmya");
		return extent;
	}

}
