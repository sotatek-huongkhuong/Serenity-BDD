package SearchingPage;
import net.thucydides.core.annotations.Step;

public class SearchCheck {
	SearchResult search; 
	@Step
	public void VerifySearching() {
		search.CheckFind();
	}

}
