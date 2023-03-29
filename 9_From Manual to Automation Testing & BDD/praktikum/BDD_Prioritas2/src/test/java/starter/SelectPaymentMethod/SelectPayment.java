package starter.SelectPaymentMethod;

import net.thucydides.core.annotations.Step;

public class SelectPayment {

    @Step("After I have added the product then go to the history page")
    public void ProductPage(){
        System.out.println("After I have added the product then go to the history page");
    }
    @Step(" I navigate to the checkout page")
    public void CheckoutPage(){
        System.out.println(" I navigate to the checkout page");
    }
    @Step("choose a payment method")
    public void PaymentPage(){
        System.out.println("choose a payment method");
    }
    @Step("I have to look at the payment form as well as enter payment details")
    public void PaymentDetailsPage(){
        System.out.println("I have to look at the payment form as well as enter payment details");
    }

    @Step("click the pay button")
    public void ClickButtonPayment(){
        System.out.println("click the pay button");
    }
}
