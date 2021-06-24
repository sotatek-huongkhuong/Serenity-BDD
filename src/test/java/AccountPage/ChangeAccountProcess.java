package AccountPage;
import net.thucydides.core.annotations.Step;


public class ChangeAccountProcess {
	ChangeAccountMethod change; 
	
	@Step
	public void openApplication() {
		change.open();
	}
	@Step
	public void loginTochange() {
		change.EnterUS();
		change.EnterPS();
		change.ClickLog();
	}
	@Step
	public void clickMyAcc() {
		change.ClickMyAcc();
	}
	@Step
	public void clickinfoAcc() {
		change.ClickinfoAcc();
	}
	@Step
	public void Entername(String name) {
		change.enterName(name);
	}
	@Step
	public void EnterSurname(String surname) {
		change.enterSurname(surname);
	}
	@Step
	public void ClickSave() {
		change.ClickSave();
	}
}
