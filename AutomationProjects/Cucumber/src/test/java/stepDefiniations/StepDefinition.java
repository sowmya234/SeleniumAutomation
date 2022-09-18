package stepDefiniations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	@Given("^User is on Myntra login page$")
	public void User_is_on_Myntra_login_page(){
		System.out.println("test myntra login");
		
	}
	
	@Given("validate the browser")
	public void validate_the_browser() {
		System.out.println("validating browser");
	}

	@When("Browser is triggered")
	public void browser_is_triggered() {
		System.out.println("Browser is triggered");
	}

	@Then("check if browser is started")
	public void check_if_browser_is_started() {
		System.out.println("Browser is started");
	}
	
	@When("^User login to application with username and password$")
	public void User_login_to_application_with_username_and_password() {
		System.out.println("user passwd");
	}
	
	@When("User login to application with {string} and {string}")
	public void user_login_to_application_with_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string+" and "+string2);
	}
	
	 @When("^User login to application using (.+) and (.+)$")
	    public void user_login_to_application_using_and(String username, String password) throws Throwable {
	       System.out.println(username);
	       System.out.println(password);
	    }
	 @When("^User login to application with following values$")
	    public void user_login_to_application_with_following_values(DataTable data) throws Throwable {
	       List<List<String>> row=data.asLists();
	       System.out.println(row.get(0).get(0));
	       System.out.println(row.get(0).get(1));
	       System.out.println(row.get(0).get(2));
	       System.out.println(row.get(0).get(3));
	    }
	
	@Then("^Home page is populated$")
	public void Home_page_is_populated() {
		System.out.println("home page");
	}
	
	@Then("Items displayed is {string}")
	public void items_displayed_is(String string) {
		System.out.println(string);  
	}

	
}
