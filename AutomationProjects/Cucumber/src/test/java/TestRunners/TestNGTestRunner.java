package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="stepDefiniations"
)
public class TestNGTestRunner  extends AbstractTestNGCucumberTests{
	
	
	

}
