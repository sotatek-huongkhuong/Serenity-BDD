package ChangeAccountPage;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
public class ChangeAccMethod extends PageObject{
	
	public void typeEmail() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).type("ratlaliko@gmail.com");
	}
	public void typePass() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).typeAndEnter("phuongnam99");
	}
	public void clickAccount() {
		$(By.xpath("//header/div[1]/div[2]/div[1]/div[4]/ul[1]/li[1]/a[1]/span[1]")).click();
	}
	public void clickAddress() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
	}
	public void typeFstname() {
		$(By.xpath("//input[@id='20_first_name']")).type("John");
	}
	public void typeLstname() {
		$(By.xpath("//input[@id='20_last_name']")).type("Wick");
	}
	public void typeCompany() {
		$(By.xpath("//input[@id='20_company']")).type("Mavel"); 
	}
	public void choosecountry() {
		$(By.xpath("/html[1]/body[1]/div[4]/main[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/p[4]/span[1]/span[1]/span[1]/span[1]/span[2]/b[1]")).click();
		$(By.xpath("//body/span[1]/span[1]/span[1]/input[1]")).typeAndEnter("Mỹ");
	}
	public void typeAddress() {
		$(By.xpath("//input[@id='20_address_1']")).type("USA"); 
	}
	public void typeAddress2() {
		$(By.xpath("//input[@id='20_address_2']")).type("New York");
	}
	public void typePost() {
		$(By.xpath("//input[@id='20_postcode']")).type("100");
	}
	public void typecity() {
		$(By.xpath("//input[@id='20_city']")).type("OhiOh");
	}
	public void ClickSave() {
		$(By.xpath("//input[@id='20_city']")).click();
	}
}
