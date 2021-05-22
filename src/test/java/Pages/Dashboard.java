package Pages;
import net.thucydides.core.annotations.Step;

public class Dashboard {

	TocSportDash dashboard; 

@Step
public void verifyAdmin() {
	dashboard.loginVerify();
	
}
}
