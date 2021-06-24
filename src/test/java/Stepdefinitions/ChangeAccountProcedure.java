package Stepdefinitions;

import AccountPage.ChangeAccountCheck;
import AccountPage.ChangeAccountProcess;
import Page1.LoginTitle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ChangeAccountProcedure {
	@Steps
	ChangeAccountProcess account; 
	@Steps
	ChangeAccountCheck accountcheck;
	@Steps
	LoginTitle verify; 

	@Given("user login form")
	public void user_login_form() {
		account.openApplication();	
		account.loginTochange();
	}

	@When("after user login done")
	public void after_user_login_done() {
		verify.checklogin();
	}

	@When("user click My account")
	public void user_click_my_account() {
	 account.clickMyAcc();   
	}

	@When("user click on account information")
	public void user_click_on_account_information() {
	    account.clickinfoAcc();
	}

	@Then("user can change account passworld")
	public void user_can_change_account_passworld() {
	    System.out.println("Yoh, You can change your name, decription and passwold");
	}

	@Given("user form account information")
	public void user_form_account_information() {
	   account.openApplication();
	   account.loginTochange();
	   account.clickinfoAcc();
	}

	@When("user enter (.*) and (.*)$")
	
	public void user_enter_name_and_surname(String name,String surname) throws Throwable {
		account.Entername(name);
		account.EnterSurname(surname);
	   
	}

	@When("user click change and save")
	public void user_click_change_and_save() {
	 account.ClickSave();
	}

	@Then("user can verify resutlt")
	public void user_can_verify_resutlt() {
	   accountcheck.checkAccountHaschange();
	}
	
}
