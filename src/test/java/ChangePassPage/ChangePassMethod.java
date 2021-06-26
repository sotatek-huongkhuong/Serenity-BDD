package ChangePassPage;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class ChangePassMethod extends PageObject{

	public void typingEmail(String mail) {
     $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).type(mail);
	}
	public void typingPss(String passw) {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).typeAndEnter(passw);
	}
	public void ClickAc() {
		$(By.xpath("//header/div[1]/div[2]/div[1]/div[4]/ul[1]/li[1]/a[1]/span[1]")).click();
	}
	public void clickinF() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();
	}
	public void typeCurrpss(String currpss) {
		$(By.xpath("//input[@id='password_current']")).type(currpss);
	}
	public void typeNewpss(String newpss) {
		$(By.xpath("//input[@id='password_1']")).type(newpss); 
	}
	public void typeConfirmpass(String passconfirm) {
		$(By.xpath("//input[@id='password_2']")).type(passconfirm);
	}
	public void clickchange() {
		$(By.xpath("//button[contains(text(),'Lưu thay đổi')]")).click();
	}
}
