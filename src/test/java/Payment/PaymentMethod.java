package Payment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.PageObject;

public class PaymentMethod extends PageObject {

	public void EnterPro() {
		$(By.xpath("//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).type("Giay The Thao").sendKeys(Keys.ENTER);
		
	}
	public void ClickPro() {
	$(By.xpath("//a[contains(text(),'Giày chạy bộ Do-win MR9666')]")).click();
		
	}
	public void ClickAdd() {
	$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();	
	}
	public void ClickCart () {
	$(By.xpath("//header/div[1]/div[2]/div[1]/div[4]/ul[1]/li[3]/a[1]/span[1]")).click();	
	}
	
}
