package starter.SelectProduct;

import net.thucydides.core.annotations.Step;

public class SelectProduct {

    @Step("I am logged in")
    public void LoginSepulsa(){
        System.out.println("I am logged in");
    }
    @Step("I navigate to the products page")
    public void ProductPage(){
        System.out.println("I navigate to the products page");
    }
    @Step("select a product")
    public void SelectPage(){
        System.out.println("select a product");
    }
    @Step("I should see the product details")
    public void ProductDetails(){
        System.out.println("I should see the product details");
    }
}
