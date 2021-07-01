package AllStepPage;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginMethod extends PageObject {

    public void EnterEmail(String Email) {
        //$(By.xpath("//body[1]/div[4]/header[1]/div[1]/div[2]/div[1]/div[4]/ul[1]/li[1]/a[1]/span[1]")).click();
        $(By.xpath("//input[@id='username']")).type(Email);
    }
    public  void EnterPass(String Pass){
        $(By.xpath("//input[@id='password']")).typeAndEnter(Pass);
    }
    public String GetTitleHomePage(){
        return $(By.xpath("//body[1]/div[4]/main[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]")).getText();
    }
}
