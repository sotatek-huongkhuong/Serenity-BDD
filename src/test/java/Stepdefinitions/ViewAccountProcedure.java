package Stepdefinitions;

import ViewInforPage.ViewInforStep;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ViewAccountProcedure {
	@Steps
	ViewInforStep view; 
	@Given("user homepage")
	public void user_homepage() {
	   view.OpenApplication();
	}

	@When("user enter  (.*) and (.*)$")
	public void user_enter_email_and_pass(String email,String pass) throws Throwable {
	   view.EnterEmail(email);
	   view.EnterPass(pass);
	   view.clicklogin();
	}

	@When("user click my account")
	public void user_click_my_account() {
		view.clickMyaccount();
	    
	}

	@When("user click account information")
	public void user_click_account_information() {
		view.clickinfor();
	    
	}

	@Then("user can see result")
	public void user_can_see_result() {
		System.out.println("You can see your information");
	}


}
