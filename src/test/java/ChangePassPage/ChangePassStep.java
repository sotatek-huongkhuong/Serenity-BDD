package ChangePassPage;
import net.thucydides.core.annotations.Step;
public class ChangePassStep {
	ChangePassMethod change;
	@Step
	public void Open() {
		change.open();
	}
	@Step
	public void typeMail(String eemail) {
		change.typingEmail(eemail);
	}
	@Step
	public void typePss(String psswrd) {
		change.typingPss(psswrd);
	}
	@Step
	public void ClickAccount() {
		change.ClickAc();
	}
	@Step
	public void ClickInforMation() {
		change.clickinF();
	}
	@Step
	public void typeCurrenpass(String curren) {
		change.typeCurrpss(curren);
	}
	@Step
	public void typeNewpass(String newpwr) {
		change.typeNewpss(newpwr);
	}
	@Step
	public void ConfirmNewPss(String confirm) {
		change.typeConfirmpass(confirm);
	}
	@Step
	public void ClickChangePss() {
		change.clickchange();
	}

}
