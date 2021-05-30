package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.Dashboard;
import pages.Home;

public class loginFeature {

	@Steps
	Home home; 
	@Steps
	Dashboard dash; 
	
	@Given("user homepage of tocsport")
	public void user_homepage_of_tocsport() {
	    home.openApplication();
	}

	@When("user enter username and passworld")
	public void user_enter_username_and_passworld() {
	   home.enterUsername();
	   home.enterPassworld();
	   
	}

	@When("user click login button")
	public void user_click_login_button() {
	   home.clickLogin();
	}

	@Then("user can navigated to tocsport homepage")
	public void user_can_navigated_to_tocsport_homepage() {
	    dash.verifyAdmin();
	}
	
}
