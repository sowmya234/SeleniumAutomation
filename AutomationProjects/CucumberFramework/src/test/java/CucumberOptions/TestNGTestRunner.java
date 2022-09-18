package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="StepDefinitions",monochrome=true,dryRun=true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
	//abstractTestngCucumber test is used so that all tests are executing using testng
	//if it should be wit cucumber , then @Runwith is used at the top

}
