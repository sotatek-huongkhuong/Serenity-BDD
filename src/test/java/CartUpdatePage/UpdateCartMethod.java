package CartUpdatePage;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class UpdateCartMethod extends PageObject{
public void Login(){
    $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).type("ratlaliko@gmail.com");
    $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).typeAndEnter("phuongnam99");
    }
    public  void ClickCartPage(){
    $(By.xpath("//header/div[1]/div[2]/div[1]/div[4]/ul[1]/li[3]/a[1]/span[1]")).click();
    }
    public  void ClickContinue(){
    $(By.xpath("//a[contains(text(),'← Continue Shopping')]")).click();
    }
    public  void TypingPro(String product){
    $(By.xpath("//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).typeAndEnter(product);
    }
    public  void Choose(){
    $(By.xpath("//a[contains(text(),'Đồng hồ Garmin Venu® Sq')]")).click();
    }
    public  void ClickAddTocart(){
    $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
    }
    public  void ClickUpdate(){
    $(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
    }
    public  void navigatedBill(){
    $(By.xpath("//a[contains(text(),'Tiến hành thanh toán')]")).click();
    }
    public  String GetInforbilling(){
    return $(By.xpath("//h3[contains(text(),'Thông tin thanh toán')]")).getText();
    }

}
