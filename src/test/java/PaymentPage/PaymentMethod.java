package PaymentPage;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
public class PaymentMethod extends PageObject {
	public void Opencart() {
		$(By.xpath("//header/div[1]/div[2]/div[1]/div[4]/ul[1]/li[3]/a[1]/span[1]")).click();
	}
	public void enterEmil() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).type("ratlaliko@gmail.com");
	}
	public void enterPssWrld()
	{
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).typeAndEnter("phuongnam99");
	}
	public void clickPayment() {
		$(By.xpath("//header/div[1]/div[2]/div[1]/div[4]/ul[1]/li[3]/a[1]/span[1]")).click();
	}
	public void clickAddbill() {
		$(By.xpath("//a[contains(text(),'Tiến hành thanh toán')]")).click();
	}
	public void typingCom() {
		$(By.xpath("//input[@id='billing_company']")).type("Opscrop");
	}
	public void typingAddss() {
		$(By.xpath("//input[@id='billing_address_1']")).type("USA");
	}
	public void typingPost() {
		$(By.xpath("//input[@id='billing_postcode']")).type("100*"); 
	}
	public void typingCity() {
		$(By.xpath("//input[@id='billing_city']")).type("New York");
	}
	public void typingPhone() {
		$(By.xpath("//input[@id='billing_phone']")).type("84+");
	}
	public void clickorder() {
		$(By.xpath("//button[@id='place_order']")).click();
	}
   public String getNotifice() {
	return $(By.xpath("//p[contains(text(),'Cảm ơn bạn. Đơn hàng của bạn đã được nhận.')]")).getText();
	   
   }
}
	


