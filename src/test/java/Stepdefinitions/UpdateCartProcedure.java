package Stepdefinitions;
import CartUpdatePage.UpdateCartStep;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateCartProcedure {
    @Steps
    UpdateCartStep update;

    @Given("User CartPage")
    public void user_cart_page() throws Exception {
        update.OpenApplication();
        update.Navigated();
        Thread.sleep(5000);
        update.OpenCartPage();

    }

    @When("User Click Continue Shopping")
    public void user_click_continue_shopping() throws Exception {
        Thread.sleep(5000);
        update.ClickContinueShop();

    }

    @When("User Typing (.*)$")
    public void user_typing_đồng_hồ(String Product) throws Exception {
        update.EnterProduct(Product);

    }

    @When("User Choose new product")
    public void user_choose_new_product() {
        update.ChoosingProduct();

    }

    @When("User Click Add to cart")
    public void user_click_add_to_cart() {
        update.ClickAddProductTocart();

    }

    @When("User comback to Cart")
    public void user_comback_to_cart()
    {
        update.ComeBackCartPage();
    }

    @Then("User Click Update cart")
    public void user_click_update_cart() {
        update.UpdateCart();

    }

    @Then("User Can navigated To Billing Process")
    public void user_can_navigated_to_billing_process() throws Exception {
        update.NavigatedToBilling();
        update.GetTitileBillingPage();
        Thread.sleep(5000);
    }
}