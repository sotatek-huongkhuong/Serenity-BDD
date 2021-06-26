package Page1;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
public class LoginMethod extends PageObject {

	 public void enterUSN(String user) {
	 $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).sendKeys(user);
	 }
	 public void EnterPSS(String pass) {
	 $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).sendKeys(pass);	
			}
	public void clickLgi() {
	$(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[3]/input[3]")).click();	
}
	   public String getNotifice() {
			return $(By.xpath("//body[1]/div[4]/main[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]")).getText();
			   
		   }
		}
	
