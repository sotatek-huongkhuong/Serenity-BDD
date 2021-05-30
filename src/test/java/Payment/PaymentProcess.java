package Payment;

import net.thucydides.core.annotations.Step;

public class PaymentProcess {

	PaymentMethod pro;
	PaymentThat pay; 
	
	@Step
	public void openAppication() {
		pro.open();
	}
	@Step
	public void EnterProduct() {
		pro.EnterPro();
	}
	@Step
	public void ClickProduct() {
		pro.ClickPro();
	}
	@Step
	public void ClickAddCart() {
		pro.ClickAdd();
	}
	@Step
	public void ClickCart() {
		pro.ClickCart();
	}
	
}
