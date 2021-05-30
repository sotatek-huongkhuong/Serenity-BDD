package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.FindVerify;
import pages.StepFound;

public class Found {
	@Steps
     StepFound found;
	@Steps
	FindVerify find; 
	@Given("User list product")
	public void user_list_product() {
	  found.openApplication();
	}

	@When("User enter your product")
	public void user_enter_your_product() {
	    found.enterPro();
	}

	@When("User click to product")
	public void user_click_to_product() throws InterruptedException {
	    Thread.sleep(5000);
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() throws InterruptedException {
	 find.Title();  
	 Thread.sleep(5000);
	}
	
}
