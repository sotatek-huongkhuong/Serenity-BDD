package PaymentPage;
import net.thucydides.core.annotations.Step;
public class PaymentStep {
	PaymentMethod bill; 
	@Step
	public void OpentApp() {
		bill.open();
	}
	@Step
	public void LoginEmail() {
		bill.enterEmil();
	}
	@Step
	public void LoginPass() {
		bill.enterPssWrld();
	}
	@Step
	public void ClickBilling() {
		bill.clickPayment();
	}
	@Step
	public void ClickPaymentProcess() {
		bill.clickAddbill();
	}
	@Step
	public void TypeGroupCompany() {
		bill.typingCom();
	}
	@Step
	public void TypeAdd() {
		bill.typingAddss();
	}
	@Step
	public void TypePostCode() {
		bill.typingPost();
	}
	@Step
	public void TypeCityPlace() {
		bill.typingCity();
	}
	@Step
	public void TypePhone() {
		bill.typingPhone();
	}
	@Step
	public void ClickOrderDone() {
		bill.clickorder();
		
	}
	@Step
	public void GetMessage() {
		bill.getNotifice();
	}

}
