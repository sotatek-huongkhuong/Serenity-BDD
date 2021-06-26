package Stepdefinitions;
import net.thucydides.core.annotations.Steps;
import RegisterPage.RegisterCheckOut;
import RegisterPage.RegisterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterProcedure {

	@Steps
	RegisterCheckOut check; 
	@Steps
	RegisterStep register; 
	
	@Given("User in tocsport website")
	public void user_in_tocsport_website() {
		register.OpenApplication();
	    
	}

	@When("User enter (.*) and (.*)$")
	public void user_enter_email_and_passworld(String email, String passworld) throws Throwable {
		register.EnterEmail(email);
		register.EnterPassWrld(passworld);
	}

	@When("User click button register")
	public void user_click_button_register() {
		register.ClickRegister();
	    
	}

	@Then("User verify the resutlt")
	public void user_verify_the_resutlt() {
		 check.verifyRegisterResult();
		
	   
	}

	
}
