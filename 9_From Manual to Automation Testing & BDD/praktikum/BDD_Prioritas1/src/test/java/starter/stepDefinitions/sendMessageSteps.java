package starter.stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.HomeMenu.postContent;
import starter.HomeMenu.sendMessage;
public class sendMessageSteps {
    @Steps
    sendMessage Send;

    @Given("the user click the Message button")
    public void ClickMessageButton() { Send.ClickMessageButton(); }

    @When("a user click add new message and add receiver")
    public void AddNewMessage() { Send.AddNewMessage(); }

    @And("a user write the message")
    public void WriteMessage() { Send.WriteMessage(); }

    @Then("click the send button to sending message")
    public void SendMessage() { Send.SendMessage(); }


}
