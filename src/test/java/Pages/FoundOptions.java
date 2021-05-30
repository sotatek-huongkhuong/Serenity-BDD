package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.PageObject;

public class FoundOptions extends PageObject {

	public void enterNameproduct() {
		
		$(By.xpath("//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).type("Giay The Thao").sendKeys(Keys.ENTER);
	}
}
