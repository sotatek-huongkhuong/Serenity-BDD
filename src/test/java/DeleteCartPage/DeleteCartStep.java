package DeleteCartPage;
import net.thucydides.core.annotations.Step;
public class DeleteCartStep {
    DeteleCartMethod delete;
    @Step
    public void OpenAppicationCart(){
        delete.open();
        delete.typeUSN();
    }
    @Step
    public  void OpenCartPage(){
        delete.openCartpage();
    }
    @Step
    public  void ClearAllCart(){
        delete.clearcart();
    }
    @Step
    public void ReturnToShop(){
        delete.clickreturnshop();
    }
    @Step
    public void AddnewCart(String Product){
       delete.addnew(Product);
    }
    @Step
    public  void ClickAddNew(){
        delete.ClickAndAddNew();
    }
    @Step
    public  void GetMessage(){
        delete.getNew();
    }


}
