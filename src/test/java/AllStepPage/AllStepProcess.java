package AllStepPage;
import net.thucydides.core.annotations.Step;

public class AllStepProcess {
    LoginMethod login;
    AddToCartMethod add;
    @Step
    public void OpenApp(){
        login.open();
    }
    @Step
    public  void EnterEmail(String Email){
        login.EnterEmail(Email);
    }
    @Step
    public  void EnterPassWrd(String Pass){
        login.EnterPass(Pass);
    }
    @Step
    public void GetTitleHomePage(){
        login.GetTitleHomePage();
    }
    @Step
    public void Login2(){
        add.Login2();
    }
    @Step
    public  void TypeProductName(String product){
        add.EnterProductname(product);
    }
    @Step
    public  void AddToCart(){
        add.AddProductToCart();
    }
    @Step
    public  void GetMessageAdd(){
        add.GetMessage();
    }
    @Step
    public void ClickCart(){
        add.ClickViewCart();
    }
    @Step
    public  void GetTitleCart(){
        add.GettViewCart();
    }
}
