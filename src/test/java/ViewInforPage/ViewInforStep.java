package ViewInforPage;
import net.thucydides.core.annotations.Step;
public class ViewInforStep {
ViewAccountMethod view; 
@Step
public void OpenApplication() {
view.open();
	
}
@Step
public void EnterEmail(String email) {
	view.EnterEmail(email);
}
@Step
public void EnterPass(String pass) {
	view.EnterPass(pass);
}
@Step
public void clicklogin() {
	view.loginClick();
}
@Step
public void clickMyaccount() {
	view.clickMyaccount();
}
@Step
public void clickinfor() {
	view.ClickInforAcc();
}
}
