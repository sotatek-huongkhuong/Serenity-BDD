package Stepdefinitions;
import DeleteCartPage.DeleteCartStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
public class DeleteCartProcedure {
    @Steps
    DeleteCartStep delete;
    @Given("User cart page")
    public void user_cart_page() throws Throwable {
        delete.OpenAppicationCart();
        Thread.sleep(3000);
        delete.OpenCartPage();
    }
    @When("User Clear all product in cart")
    public void user_clear_all_product_in_cart() {
        delete.ClearAllCart();
    }
    @When("User Click Return to shop")
    public void user_click_return_to_shop() {
       delete.ReturnToShop();
    }
    @When("User Add new (.*)$")
    public void user_add_new_product(String Product) throws Throwable {
        delete.AddnewCart(Product);
        Thread.sleep(3000);
        delete.ClickAddNew();
        Thread.sleep(3000);
    }
    @Then("User Can See new list product after add new")
    public void user_can_see_new_list_product_after_add_new() throws Throwable {
        delete.GetMessage();
        Thread.sleep(5000);
    }

}
