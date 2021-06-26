package SearchingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.PageObject;
public class SearchingMethod  extends PageObject {
public void entername(String name) {
	$(By.xpath("//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(name);
}
public void clickSearching() {
	$(By.xpath("/html[1]/body[1]/div[4]/header[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
}
	
}
