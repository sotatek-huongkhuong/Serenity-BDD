package Pages;

import net.thucydides.core.annotations.Step;

public class Home {

	TocSportHome homepage; 
	
	
	@Step
public void openApplication() {
	homepage.open();
}
	@Step
	public void clickLoginForm() {
		homepage.clickLoginForm();
	}
	@Step
	public void enterUsername() {
		homepage.enterUsername();
		
	}
	@Step
	public void enterPassworld() {
		homepage.enterPassworld();
	}
	@Step
	public void cickButtonLogin() {
		homepage.clickButtonLogin();
	}
}
