package stepDefiniations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@SmokeTest")
	public void beforeValidation() {
		System.out.println("Before validation steps");
	}
	@After("@SmokeTest")
	public void afterValidation() {
		System.out.println("After validation steps");
	}

}
