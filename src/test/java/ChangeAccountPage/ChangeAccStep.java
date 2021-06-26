package ChangeAccountPage;
import net.thucydides.core.annotations.Step;

public class ChangeAccStep {
	ChangeAccMethod change; 
	@Step
	public void OpenApp() {
		change.open();
	}
	@Step
	public void typeEmail() {
		change.typeEmail();
	}
	@Step
	public void typePass() {
		change.typePass();
	}
	@Step
	public void ClickMyAccount() {
		change.clickAccount();
	}
	@Step
	public void clickAdressUS() {
		change.clickAddress();
	}
	@Step
	public void typeFistName() {
		change.typeFstname();
	}
	@Step
	public void typeLastName() {
		change.typeLstname();
	}
	@Step
	public void typeCompany() {
		change.typeCompany();
	}
	@Step
	public void ChooseCountrySide() {
		change.choosecountry();
	}
	@Step
	public void typeAddress1() {
		change.typeAddress();
	}
	@Step
	public void typeAddress2() {
		change.typeAddress2();
	}
	@Step
	public void typePostCode() {
		change.typePost();
	}
	@Step
	public void typecity() {
		change.typecity();
	}
	@Step
	public void ClickSaveInfor() {
		change.ClickSave();
	}

}
