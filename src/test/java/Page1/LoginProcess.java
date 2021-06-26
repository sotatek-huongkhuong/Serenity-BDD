package Page1;
import net.thucydides.core.annotations.Step;

public class LoginProcess {
	LoginMethod login; 
	
	@Step
	public void openApplication() {
		login.open();
		
	}
	@Step
	public void EnterUsername(String user) {
		login.enterUSN(user);
	}
	@Step
	public void EnterPassworld(String pass) {
		login.EnterPSS(pass);
	}
	@Step
	public void Click() {
		login.clickLgi();	
}
	@Step
	public void GetResultLogin() {
		login.getNotifice();
	}
}
