package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefiniations",stepNotifications=true,tags="@SmokeTest",dryRun=true,monochrome=true,
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumber.xml"})
	//pretty--is used to get the colors (green- for passed ,red-for failed)in reports.
	//dry run is used to checkc if mapping btwn stepdefinition and feature file is done properly or not , if not it will show only that errors, it wont execute technical code
	//monochrome is used so that all the output will be displayed in neat format without ?? etc.
//glue="stepDefiniations",stepNotifications=true,tags="not @SmokeTest")//this is used to execute tcs expect smoke test
//glue="stepDefiniations",stepNotifications=true,tags="@SmokeTest and @SanityTest") // used to execcute both sanity and smoke
//glue="stepDefiniations",stepNotifications=true,tags="@SmokeTest or RegTest")//used to execute smoke or Regression tests
public class TestRunner {

}
