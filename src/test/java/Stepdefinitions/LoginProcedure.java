package Stepdefinitions;

import Page1.LoginProcess;
import Page1.LoginTitle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class LoginProcedure {
	@Steps
	LoginProcess login; 
	@Steps
	LoginTitle verify; 
	@Given("user hompage of tocsport website")
	public void user_hompage_of_tocsport_website() {
	    login.openApplication();
	}

	@When("user enters (.*) and (.*)$")
	public void user_enters_username_and_passworld(String username,String passworld) throws Throwable {
		login.EnterUsername(username);
		login.EnterPassworld(passworld);
		login.Click();    
	}

	@Then("I verify the title of hompage")
	public void i_verify_the_title_of_hompage () throws Throwable {
	    login.GetResultLogin(); 
		verify.checklogin();
		
	}
}
