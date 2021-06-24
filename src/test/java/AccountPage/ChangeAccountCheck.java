package AccountPage;
import net.thucydides.core.annotations.Step;
public class ChangeAccountCheck {
	ChangeAccountVerify check; 
	
	@Step
	public void checkAccountHaschange() {
		check.VerifyChange();
		
	}

}
