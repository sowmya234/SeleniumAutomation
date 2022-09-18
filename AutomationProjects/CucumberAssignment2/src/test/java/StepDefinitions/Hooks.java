package StepDefinitions;

import Utils.textContextSetup;
import io.cucumber.java.After;

public class Hooks {
	textContextSetup tcs;
	public Hooks(textContextSetup tcs) {
		this.tcs=tcs;
	}
	@After
	public void quitDriver() {
		tcs.driver.quit();
	}

}
