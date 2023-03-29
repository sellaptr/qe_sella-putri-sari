package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.HomeMenu.homeMenu;
import net.thucydides.core.annotations.Steps;

public class homeMenuSteps {
    @Steps
    homeMenu Home;

    @Given("the user open the linkedin app")
    public void OpenLinkedinApp() { Home.OpenLinkedinApp(); }

    @When("a user fill the form to login account")
    public void FillLoginForm() { Home.FillLoginForm(); }

    @And("a user has successfully logged in to the account")
    public void SuccessLoginAccount() { Home.SuccessLoginAccount(); }

    @Then("display the linkedin home menu")
    public void ShowTheHomeMenu() { Home.ShowTheHomeMenu(); }

}
