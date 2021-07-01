package CartUpdatePage;
import net.thucydides.core.annotations.Step;

 public class UpdateCartStep {
  UpdateCartMethod update;
@Step
public  void OpenApplication(){
  update.open();
}
@Step
public  void Navigated(){
 update.Login();
}
@Step
  public  void OpenCartPage(){
 update.ClickCartPage();
}
@Step
  public  void ClickContinueShopping(){
 update.ClickContinue();
}
@Step
  public  void EnterProduct(String Product){
 update.TypingPro(Product);
}
@Step
  public void ChoosingProduct(){
 update.Choose();
}
@Step
  public void ClickAddProductTocart(){
 update.ClickAddTocart();
}
@Step
public  void ComeBackCartPage(){

    update.ClickCartPage();
}
@Step
  public  void UpdateCart(){

    update.ClickUpdate();
}
@Step
  public void NavigatedToBilling(){
 update.navigatedBill();
}
@Step
  public  void GetTitileBillingPage(){
 update.GetInforbilling();
}
}
