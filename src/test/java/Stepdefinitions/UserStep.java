package Stepdefinitions;
import AllStepPage.AllStepProcess;
import AllStepPage.BillingStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
public class UserStep {
    @Steps
    AllStepProcess Login;
    @Steps
    BillingStep bill;

    @Given("user Local page")
    public void user_local_page() {
        Login.OpenApp();
    }

    @When("user Type (.*) and (.*)$")
    public void user_type_email1_and_pass1(String email, String Passworld) throws Throwable {
        Login.EnterEmail(email);
        Login.EnterPassWrd(Passworld);
        Thread.sleep(3000);
    }

    @Then("user can navigated to hompage")
    public void user_can_navigated_to_hompage() throws Throwable {
        Login.GetTitleHomePage();
        Thread.sleep(2000);

    }

    @Given("User hompage after login")
    public void user_hompage_after_login() throws Throwable {
        Login.OpenApp();
        Login.Login2();
        Thread.sleep(3000);
    }

    @When("User Type (.*)$")
    public void user_type_productname1(String product) throws Throwable {
        Login.TypeProductName(product);
    }

    @When("user add product To cart")
    public void user_add_product_to_cart() throws Throwable {
        Login.AddToCart();
        Thread.sleep(3000);
    }

    @Then("user click view cart")
    public void user_click_view_cart() throws Throwable {
        Login.GetMessageAdd();
        Login.ClickCart();
        Login.GetTitleCart();
        Thread.sleep(3000);
    }
    @Given("User Cart")
    public void user_cart() throws Throwable {
        Login.OpenApp();
        bill.Login3();
        Thread.sleep(3000);
        bill.ClickOpenCart();
        Thread.sleep(3000);
    }
    @When("User Click Payment Processing")
    public void user_click_payment_processing() {
        bill.ClickBillingProcess();
    }
    @When("User Typed Company")
    public void user_typed_company() throws Throwable {
      bill.TypeCompany();
        Thread.sleep(1000);
    }
    @When("User Typed Address")
    public void user_typed_address() throws Throwable {
       bill.TypeAddress();
        Thread.sleep(1000);
    }
    @When("user Typed PostCode")
    public void user_typed_post_code() throws Throwable {
       bill.TypePostcode();
        Thread.sleep(1000);
    }
    @When("user Typed City")
    public void user_typed_city() throws Throwable {
        bill.TypeCity();
        Thread.sleep(1000);
    }
    @When("user Typed NumberPhone")
    public void user_typed_number_phone() throws Throwable {
        bill.TypePhonenumber();
        Thread.sleep(1000);
        bill.TypeNote();
        Thread.sleep(2000);
    }
    @When("user Click Order")
    public void user_click_order() throws Throwable {
        bill.ClickOrderBilling();
        Thread.sleep(2000);
    }
    @Then("user Can see result")
    public void user_can_see_result() throws Throwable {
        bill.GetResultOrder();
        Thread.sleep(3000);
    }
    @Then("user Can Check details off bill")
    public void user_can_check_details_off_bill() throws Throwable {
        Thread.sleep(7000);

    }
}
