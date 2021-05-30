package pages;

import net.thucydides.core.annotations.Step;

public class Dashboard {
	
	DashboardPage dash; 
	@Step
public void verifyAdmin() {
	dash.loginVerify();
}
}
