package RegisterPage;

import net.thucydides.core.annotations.Step;

public class RegisterCheckOut {
	RegisterVerify Check; 
	@Step
	public void verifyRegisterResult() {
		Check.checkRegis();
	}
	

}
