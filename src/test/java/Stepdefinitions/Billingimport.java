package Stepdefinitions;

import Payment.PaymentProcess;
import Payment.PaymentThis;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Billingimport {

	@Steps
	PaymentProcess pay; 
	@Steps
	PaymentThis bill; 
	
	@Given("Product list")
	public void product_list() {	    
		pay.openAppication();
	}

	@Given("Click details")
	public void click_details() {
	   pay.EnterProduct();
	   pay.ClickProduct();
		
	}

	@When("On the details of product")
	public void on_the_details_of_product() {
	 System.out.print("Ban Co muon tien hanh thanh toan?");
	}

	@When("Click Add to cart")
	public void click_add_to_cart() {
	pay.ClickAddCart();   
	}

	@When("View Cart")
	public void view_cart() {
	   pay.ClickCart();
	}

	@Then("I validate the outcome and preparing to payment process")
	public void i_validate_the_outcome_and_preparing_to_payment_process() throws InterruptedException {
	   bill.verifyTitle();
	   Thread.sleep(10000);
	}

	
}
