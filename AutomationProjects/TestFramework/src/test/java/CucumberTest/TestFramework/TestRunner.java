package CucumberTest.TestFramework;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
		glue="StepDefinitions")
public class TestRunner extends AbstractTestNGCucumberTests{
	
	//interview question: how to runs the tests parallely in cucumber using testng runner
	// Below code is used to run the tests parallely 
	//scenarios method is present in the AbstractTestNGCucumberTests class and we used this here to run the scenarios parallel
	//setting the parallel to true
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
	


}
