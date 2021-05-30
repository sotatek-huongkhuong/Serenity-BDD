package pages;

import net.thucydides.core.annotations.Step;

public class Home {

	//cac buoc thuc hien---
	
	HomePage home; 
	DashboardPage page; 

	@Step
	public void openApplication() {
		home.open();
	}
	@Step
	public void enterUsername() {
		home.EnterUSN();
	}
	@Step
	public void enterPassworld() {
		home.EnterPSS();
	}
	@Step
	public void clickLogin() {
		home.clickLgi();
	}
	
	
}
