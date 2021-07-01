package AllStepPage;
import net.thucydides.core.annotations.Step;

public class BillingStep {
    BillingMethod bill;
    @Step
    public void Login3(){
        bill.Login3();
    }
    @Step
    public  void ClickOpenCart(){
        bill.ClickCart();
    }
    @Step
    public  void ClickBillingProcess(){
        bill.ClickBilling();
    }
    @Step
    public void TypeCompany(){
        bill.TypingCompany();
    }
    @Step
    public void TypeAddress(){
        bill.TypingAddress();
    }
    @Step
    public void TypePostcode(){
        bill.TypingPoseCode();
    }
    @Step
    public  void TypeCity(){
        bill.TypingCity();
    }
    @Step
    public  void TypePhonenumber(){
        bill.TypingPhone();
    }
    @Step
    public void TypeNote(){
        bill.TypingNote();
    }
    @Step
    public  void ClickOrderBilling(){
        bill.ClickOrder();
    }
    @Step
    public void GetResultOrder(){
        bill.getNotification();
    }
    }

