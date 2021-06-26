package Stepdefinitions;

import SearchingPage.SearchCheck;
import SearchingPage.SearchingStep;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchingProcedure {
	@Steps
	SearchCheck check; 
	@Steps
	SearchingStep search; 
	
	@Given("User hompage")
	public void user_hompage() {
	    search.OpenApplication();
	}

	@When("user enter (.*)$")
	public void user_enter_name_of_product(String name) throws Throwable {
		search.enterProduct(name);
		
	   
	}

	@When("user click button searching")
	public void user_click_button_searching() throws Throwable {
		search.ClickSearch();
		Thread.sleep(5000);
	    
	}

	@Then("user can see product list")
	public void user_can_see_product_list() {
	    check.VerifySearching();
	}
}
