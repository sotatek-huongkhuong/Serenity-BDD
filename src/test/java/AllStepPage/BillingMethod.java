package AllStepPage;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BillingMethod extends PageObject{
        public  void Login3(){
            $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).type("ratlaliko@gmail.com");
            $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).typeAndEnter("phuongnam99");
        }
        public  void ClickCart(){
            $(By.xpath("//header/div[1]/div[2]/div[1]/div[4]/ul[1]/li[3]/a[1]/span[1]")).click();
        }
        public void ClickBilling(){
            $(By.xpath("//a[contains(text(),'Tiến hành thanh toán')]")).click();
        }
        public  void TypingCompany(){
            $(By.xpath("//input[@id='billing_company']")).type("DC");
        }
        public  void TypingAddress(){
            $(By.xpath("//input[@id='billing_address_1']")).type("USA");
        }
        public  void TypingPoseCode(){
            $(By.xpath("//input[@id='billing_postcode']")).type("SpiderMan");
        }
        public void TypingCity(){
            $(By.xpath("//input[@id='billing_city']")).type("NewYork");
        }
        public  void  TypingPhone(){
            $(By.xpath("//input[@id='billing_phone']")).type("01111222");
        }
        public  void TypingNote(){
            $(By.xpath("//textarea[@id='order_comments']")).type("AutoMation Testing, Sorry Because I'm complicating");
        }
        public void ClickOrder(){
            $(By.xpath("//button[@id='place_order']")).click();
        }
    public String getNotification() {
        return $(By.xpath("//p[contains(text(),'Cảm ơn bạn. Đơn hàng của bạn đã được nhận.')]")).getText();
    }
}
