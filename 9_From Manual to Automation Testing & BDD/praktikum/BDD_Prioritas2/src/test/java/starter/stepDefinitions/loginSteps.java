package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I am on the login page")
    public void onTheLoginPage(){login.onTheLoginPage();}
    @When("I enter my valid email and password")
    public void enterUsernameAndPasswordValid(){login.enterUsernameAndPasswordValid();}
    @When("I enter my invalid email and password")
    public void enterUsernameAndPasswordInvalid(){login.enterUsernameAndPasswordInvalid();}
    @And("click on the login button")
    public void clickLoginButton(){login.clickLoginButton();}
    @Then("I should be redirected to the home page")
    public void SepulsaHomePage(){login.SepulsaHomePage();}
    @Then("I will see an error message")
    public void InvalidLogin(){login.InvalidLogin();}

}
