package pages;


import net.thucydides.core.annotations.Step;

public class StepFound {
FoundOptions found;  

@Step
public void openApplication() {
	found.open();
}
	@Step
	public void enterPro() {
		found.enterNameproduct();
	}	
}
