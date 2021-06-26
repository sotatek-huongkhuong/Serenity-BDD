package SearchingPage;

import net.thucydides.core.annotations.Step;
public class SearchingStep {
	SearchingMethod search; 
	@Step
	public void OpenApplication() {
		search.open();
	}
	@Step
	public void enterProduct(String name) {
		search.entername(name);
	}
	@Step
	public void ClickSearch()
	{
		search.clickSearching();
	}
	

	
}

