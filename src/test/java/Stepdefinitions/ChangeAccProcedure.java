package Stepdefinitions;
import ChangeAccountPage.ChangeAccStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
public class ChangeAccProcedure {
	@Steps
	ChangeAccStep change;
	@Given("User My Account Page")
	public void user_my_account_page() {
		change.OpenApp();
		change.typeEmail();
		change.typePass();
	}
	@Given("User Click to Address Tab")
	public void user_click_to_address_tab() {
		change.ClickMyAccount();
		change.clickAdressUS();
	}
	@When("User Type fistname")
	public void user_type_fistname() {
		change.typeFistName();
	}
	@When("User Type lastname")
	public void user_type_lastname() {
		change.typeLastName();
	}
	@When("User Type CompanyGroup")
	public void user_type_company_group() throws Exception {
		change.typeCompany();
		Thread.sleep(3000);
	    
	}
	@When("User Choose Countryside")
	public void user_choose_countryside() {
		//change.ChooseCountrySide();
	}
	@When("User Type Address")
	public void user_type_address() {
		change.typeAddress1();
	   
	}
	@When("User Type Address Home")
	public void user_type_address_home() {
		change.typeAddress2();
	}
	@When("User Type Post Code")
	public void user_type_post_code() {
		change.typePostCode();
	    
	}
	@When("User Type City")
	public void user_type_city() {
		change.typecity();
	}
	@When("User click Saving infor")
	public void user_click_saving_infor() throws Throwable {
		change.ClickSaveInfor();
		Thread.sleep(3000);
	}
	@Then("User Can check infor again")
	public void user_can_check_infor_again() throws InterruptedException {
		System.out.print("Your Account Has Been Changed");
		Thread.sleep(5000);
	}
}
