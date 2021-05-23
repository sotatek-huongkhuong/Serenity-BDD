package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.Dashboard;
import Pages.Home;
import Pages.TocSportHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


public class LoginScenario {
	
    @Steps
 	Home home;
    @Steps
	Dashboard dash; 
	
   
@Given("User Hompage and login form")
public void user_hompage_and_login_form() {

	home.openApplication();
}

@When("User click login form")
public void user_click_login_form() {
home.clickLoginForm();
	
    
}

@When("User enter user name and passworld")
public void user_enter_user_name_and_passworld() {
	home.enterUsername();
	home.enterPassworld();
	
    
}
@When("User click button login")
public void User_click_button_login() throws InterruptedException {
	 home.cickButtonLogin();
}



@Then("User can verify result")
public void user_can_verify_result() throws InterruptedException {
	dash.verifyAdmin();  
  //Thread.sleep(3000);
}

	
}