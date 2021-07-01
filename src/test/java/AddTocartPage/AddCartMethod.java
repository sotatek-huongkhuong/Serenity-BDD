package AddTocartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.PageObject;

public class AddCartMethod  extends PageObject{
	public void Login(){
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).type("ratlaliko@gmail.com");
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).typeAndEnter("phuongnam99");
	}
	public void enterProduct(String productname) {
		$(By.xpath("//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).type(productname);
	}
	public void clickSearching() {
		$(By.xpath("/html[1]/body[1]/div[4]/header[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
	}
	public void clickdetail() {
        $(By.xpath("//a[contains(text(),'Đồng hồ Garmin fēnix 6 Pro Solar')]")).click();    		
	}
	public void clickAddtocart() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
	}
	public void viewcart() {
		$(By.xpath("//header/div[1]/div[2]/div[1]/div[4]/ul[1]/li[3]/a[1]/span[1]")).click();
	}
	public String getText(){
         return $(By.xpath("//th[contains(text(),'Sản phẩm')]")).getText();
	}

}
