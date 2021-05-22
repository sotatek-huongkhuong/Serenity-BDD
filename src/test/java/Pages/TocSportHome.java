package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;

public class TocSportHome extends PageObject{
	//WebDriver driver=null; 
	
//	public void clickLoginForm() {
//		$(By.xpath("//body/div[@id='gen-nav-commerce-header-v2']/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]")).click();
	//}
	
	public void enterUsername() {
		$(By.id("//input[@id='email']")).type("phuongnam.uethy@gmail.com");
	}
	public void enterPassworld() {
		$(By.id("//input[@id='pass']")).type("phuongnam99");
	}
	public void clickButtonLogin() {
		$(By.id("//button[@id='u_0_h_W2']")).click();
		
	}
	
}

