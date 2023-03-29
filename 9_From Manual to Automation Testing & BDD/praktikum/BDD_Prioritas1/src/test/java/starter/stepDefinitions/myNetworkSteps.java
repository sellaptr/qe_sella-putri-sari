package starter.stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.HomeMenu.homeMenu;
import starter.HomeMenu.myNetwork;
import sun.nio.ch.Net;

public class myNetworkSteps {
    @Steps
    myNetwork Network;

    @Given("the user have the linkedin account")
    public void Account() { Network.Account(); }

    @When("a user has logged in to the account")
    public void LoginAccount() { Network.LoginAccount(); }

    @And("a user click My Network button")
    public void ClickMyNetworkButton() { Network.ClickMyNetworkButton(); }

    @Then("display the relation all connection and manage my network")
    public void ShowMyNetwork() { Network.ShowMyNetwork(); }

}
