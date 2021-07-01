package AllStepPage;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddToCartMethod extends PageObject {
    public void Login2(){
        $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).type("ratlaliko@gmail.com");
        $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).typeAndEnter("phuongnam99");
    }

    public  void EnterProductname(String product){
        $(By.xpath("//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).typeAndEnter(product);
    }
    public  void AddProductToCart(){
        $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[2]/div[2]/div[4]/div[8]/div[1]/div[2]/div[2]/div[1]/p[2]/a[1]")).click();
        $(By.xpath("//button[contains(text(),'Thêm vào giỏ')]")).click();
    }
    public String GetMessage(){
        return $(By.xpath("//body/div[@id='wrapper']/div[1]/div[1]/div[1]")).getText();
    }
    public  void ClickViewCart(){
        $(By.xpath("//header/div[1]/div[2]/div[1]/div[4]/ul[1]/li[3]/a[1]/span[1]")).click();
    }
    public  String GettViewCart(){
        return $(By.xpath("//a[contains(text(),'Shopping Cart')]")).getText();
    }



}
