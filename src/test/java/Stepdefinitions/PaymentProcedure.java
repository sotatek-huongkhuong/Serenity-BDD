package Stepdefinitions;

import PaymentPage.PaymentStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
public class PaymentProcedure {

	@Steps
	PaymentStep payment; 
@Given("USER CART PAGE")
public void user_cart_page() {
	payment.OpentApp();
}
@When("USER CLICK BILLING PROCESS")
public void user_click_billing_process() throws Exception {
	payment.LoginEmail();
	payment.LoginPass();
	Thread.sleep(5000);
	payment.ClickBilling();
	Thread.sleep(5000);
}
@When("USER TYPE COMPANY")
public void user_type_company() {
	payment.ClickPaymentProcess();
	payment.TypeGroupCompany();
    
}

@When("USER TYPE ADDRESS")
public void user_type_address() {
	payment.TypeAdd();
  
}

@When("USER TYPE POSTCODE")
public void user_type_postcode() {
	payment.TypePostCode();
   
}

@When("USER TYPE CITY")
public void user_type_city() {
	payment.TypeCityPlace();
   
}

@When("USER TYPE PHONENUMBER")
public void user_type_phonenumber() throws Exception {
	payment.TypePhone();
	Thread.sleep(4000);
  
}

@When("USER CLICK BILLING ORDER")
public void user_click_billing_order() throws InterruptedException {
	payment.ClickOrderDone();
	Thread.sleep(6000);
	
}

@Then("USER CAN CHECK BILL DETAIL (.*)$")
public void user_can_check_bill_detail_notification(String notification) {
	payment.GetMessage();
   
}

}
	
  

