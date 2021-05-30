package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class FindAndFound extends PageObject {
	
	public void clicktxt() {
		$(By.xpath("//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).click();
	}
	public void enterPD() {
		
    $(By.xpath("//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).type("Giay The Thao");
		
	}
public void clickFound() {
	$(By.xpath("//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[2]/button[1]/i[1]")).click();
	
}
	public void clickPD() {
		$(By.xpath("//a[contains(text(),'Giày chạy bộ Do-win MR9666')]")).click();
	}
	public void clickAdd() {
		$(By.xpath("//*[@class='single_add_to_cart_button button alt']//..//*[text()='Thêm vào giỏ']")).click();
	}
	public void clickViewCart() {
		$(By.xpath("//*[@class='header-cart-title']")).click();
	}
	public void continuepay() {
		$(By.xpath("//a[contains(text(),'Tiến hành thanh toán')]")).click();
	}
}
