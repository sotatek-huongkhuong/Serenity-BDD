package AddTocartPage;
import net.thucydides.core.annotations.Step;
public class AddCartStep {
	AddCartMethod add; 
	@Step
	public void OpenHomePage() {
		add.open();
		add.Login();
	}
	
	@Step
	public void enterProuctname(String product) {
		add.enterProduct(product);
	}
	@Step
	public void ClickSearch() {
		add.clickSearching();
	}
	@Step
	public void ClickDetailsProdcut() {
		add.clickdetail();
	}
	@Step 
	public void Clickaddtocart() {
		add.clickAddtocart();
	}
	@Step
	public void ClickViewCart() {
		add.viewcart();
	}
	@Step
	public  void GetCartTitle(){
		add.getText();
	}
}
