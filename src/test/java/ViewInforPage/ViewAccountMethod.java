package ViewInforPage;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class ViewAccountMethod extends PageObject {

	public void EnterEmail(String email) {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/p[1]/input[1]")).type(email);
	}
	public void EnterPass(String pass) {
		 $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).type(pass);
		
	}
	public void loginClick() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[3]/input[3]")).click();
	}
 	public void clickMyaccount() {
 		$(By.xpath("//header/div[1]/div[2]/div[1]/div[4]/ul[1]/li[1]/a[1]/span[1]")).click();
 	}
 	public void ClickInforAcc() {
 		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();
 	}
}
