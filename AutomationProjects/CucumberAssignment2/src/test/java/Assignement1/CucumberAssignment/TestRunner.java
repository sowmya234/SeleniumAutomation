package Assignement1.CucumberAssignment;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
		glue="StepDefinitions",
		plugin= {"html:target/cucumber.html,json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	

}
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",