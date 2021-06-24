package AccountPage;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class ChangeAccountMethod extends PageObject {

	public void EnterUS() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).type("ratlaliko@gmail.com");
	}
	
		public void EnterPS() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).type("phuongnam99");
		}
		
		public void ClickLog() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[3]/input[3]")).click();
	}
		
	public void ClickMyAcc() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[3]/input[3]")).click();
	}
	public void ClickinfoAcc() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();
	}
	public void enterName(String name) {
		$(By.xpath("//input[@id='account_first_name']")).sendKeys(name);		
	}
	public void enterSurname(String surname) {
		$(By.xpath("//input[@id='account_last_name']")).sendKeys(surname);
	}
	public void ClickSave() {
		$(By.xpath("//button[contains(text(),'Lưu thay đổi')]")).click();
	}
}
