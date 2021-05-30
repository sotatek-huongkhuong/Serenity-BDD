package pages;

import net.thucydides.core.annotations.Step;

public class FindVerify {

	VerifyResultFind result; 
	
	@Step
	public void Title() {
		result.VerifyTileProduct();
	}
}
