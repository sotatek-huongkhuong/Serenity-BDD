package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;

public class TocSportHome extends PageObject{
	//WebDriver driver=null; 
	
	public void clickLoginForm() {
		$(By.xpath("//body/div[@id='gen-nav-commerce-header-v2']/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]")).click();
	}
	
	public void enterUsername() {
		$(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/form[1]/div[2]/input[1]")).type("phuongnam.uethy@gmail.com");
	}
	public void enterPassworld() {
		$(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/form[1]/div[3]/input[1]")).type("phuongnam99");
	}
	public void clickButtonLogin() {
		$(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/form[1]/div[6]/input[1]")).click();
		
	}
	
}

