package Stepdefinitions;
import net.thucydides.core.annotations.Steps;
import ChangePassPage.ChangePassStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePassProcedure {
	@Steps
	ChangePassStep Change; 

	@Given("User application hompage")
	public void user_application_hompage() {
	    Change.Open();
	}

	@When("login step done by (.*) and (.*)$")
	public void login_step_done_by_mail_and_pssworld(String mail,String pass) throws Throwable {
		Change.typeMail(mail);
		Change.typePss(pass);
	}

	@When("user click My acc")
	public void user_click_my_acc() {
	   Change.ClickAccount();
	}

	@When("user moving on to information account")
	public void user_moving_on_to_information_account() {
	   Change.ClickInforMation();
	}

	@When("user tying (.*)$")
	public void user_tying_currentpass(String currentpass) throws Throwable {
		Change.typeCurrenpass(currentpass);   
	}

	@When("user typing (.*)$")
	public void user_typing_newpass(String newpass) throws Throwable{
		Change.typeNewpass(newpass);
	}

	@When("user retyping (.*)$")
	public void user_retyping_passconfirm(String passconfirm ) throws Throwable{
		Change.ConfirmNewPss(passconfirm);  
	}

	@When("user click change")
	public void user_click_change() {
		Change.ClickChangePss();
	}

	@Then("passworld user has been changed")
	public void passworld_user_has_been_changed() throws InterruptedException {
	    System.out.print("Your pass world changed");
	    Thread.sleep(5000);
	}
	
}
