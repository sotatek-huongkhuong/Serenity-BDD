package DeleteCartPage;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class DeteleCartMethod extends PageObject {
    public void typeUSN() {
        $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).type("ratlaliko@gmail.com");
        $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).typeAndEnter("phuongnam99");
    }
public  void openCartpage(){
        $(By.xpath("//header/div[1]/div[2]/div[1]/div[4]/ul[1]/li[3]/a[1]/span[1]")).click();
}
public void clearcart(){
        $(By.xpath("//tbody/tr[1]/td[1]/a[1]")).click();
}
public  void clickreturnshop(){
        $(By.xpath("//a[contains(text(),'Return To Shop')]")).click();
}
public  void addnew(String add) {
    $(By.xpath("//header/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).typeAndEnter(add);
}
public  void ClickAndAddNew(){
        $(By.xpath("//a[contains(text(),'QUẦN ĐÙI BÓ CƠ NỮ 2XU MCS RUN COMPRESSION SHORT WA')]")).click();
        $(By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
}
public  String getNew(){
    return $(By.xpath("//body/div[@id='wrapper']/div[1]/div[1]/div[1]")).getText();
}
}


