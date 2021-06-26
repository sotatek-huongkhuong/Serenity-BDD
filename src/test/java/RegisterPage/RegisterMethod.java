package RegisterPage;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;


public class RegisterMethod extends PageObject {
	public void  EnterEmail(String email) {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/p[1]/input[1]")).sendKeys(email);
	}

	public void EnterPass(String pass) {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/p[2]/input[1]")).sendKeys(pass);
	}
	public void clickRegis() {
		$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/p[3]/input[3]")).click();
	}

}
