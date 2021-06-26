package RegisterPage;
import net.thucydides.core.annotations.Step;
public class RegisterStep {
	
RegisterMethod regis; 

@Step 
public void OpenApplication() {
	regis.open();
}
@Step
public void EnterEmail(String email) {
	regis.EnterEmail(email);
}
@Step
public void EnterPassWrld(String pass) {
	regis.EnterPass(pass);
}
@Step
public void ClickRegister() {
	regis.clickRegis();
}

}
