package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.SelectPaymentMethod.SelectPayment;
import starter.SelectProduct.SelectProduct;

public class SelectPaymentSteps {
    @Steps
    SelectPayment Payment;

    @Given("After I have added the product then go to the history page")
    public void AddProduct(){Payment.ProductPage();}
    @When("I navigate to the checkout page")
    public void CheckoutPage(){Payment.CheckoutPage();}
    @And("choose a payment method")
    public void PaymentPage(){Payment.PaymentPage();}
    @Then("I have to look at the payment form as well as enter payment details")
    public void PaymentDetailsPage(){Payment.PaymentDetailsPage();}
    @And("click the pay button")
    public void ClickButtonPayment(){Payment.ClickButtonPayment();}
}
