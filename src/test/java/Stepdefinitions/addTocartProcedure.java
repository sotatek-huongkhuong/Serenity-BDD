package Stepdefinitions;

import AddTocartPage.AddCartStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class addTocartProcedure {
	@Steps
	AddCartStep add;
	@Given("user hompage")
	public void user_hompage() throws Throwable {
	  add.OpenHomePage();
	  Thread.sleep(3000);
	}

	@When("user Enter (.*)$")
	public void user_enter_productname(String productname) throws Throwable {
		add.enterProuctname(productname);
	    add.ClickSearch();
	    Thread.sleep(3000);
	}

	@When("user click product details")
	public void user_click_product_details() throws Throwable {
	   add.ClickDetailsProdcut();
	   Thread.sleep(5000);
	}

	@When("user click add to cart")
	public void user_click_add_to_cart() throws Throwable {
	   add.Clickaddtocart();
	   Thread.sleep(3000);
	}

	@Then("user can view cart")
	public void user_can_view_cart() throws Throwable {
	    add.ClickViewCart();
	    add.GetCartTitle();
	    Thread.sleep(5000);
	}
	
}
