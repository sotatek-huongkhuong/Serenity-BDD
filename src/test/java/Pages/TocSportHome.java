package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Before;
import net.serenitybdd.core.pages.PageObject;
//import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("https://duckduckgo.com")
public class TocSportHome extends PageObject{

	public void clickLoginForm() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).click();
	}
	
	public void enterUsername() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).type("phuongnam.uethy@gmail.com");
	}
	public void enterPassworld() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).type("phuongnam99");
	}
	public void clickButtonLogin() {
		$(By.xpath("/html[1]/body[1]/div[4]/main[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[3]/input[3]")).click();
		
	}
}