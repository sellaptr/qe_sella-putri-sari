package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.SelectProduct.SelectProduct;

public class SelectProductSteps {

    @Steps
    SelectProduct Home;

    @Given("I am logged in")
    public void LoginSepulsa(){Home.LoginSepulsa();}
    @When("I navigate to the products page")
    public void ProductPage(){Home.ProductPage();}
    @And("select a product")
    public void SelectPage(){Home.SelectPage();}
    @Then("I should see the product details")
    public void ProductDetails(){Home.ProductDetails();}

}
