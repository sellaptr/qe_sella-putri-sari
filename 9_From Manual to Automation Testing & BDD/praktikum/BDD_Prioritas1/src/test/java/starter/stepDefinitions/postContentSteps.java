package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.HomeMenu.postContent;

public class postContentSteps {
    @Steps
    postContent Post;

    @Given("the user goes to the main page or home")
    public void GoToHome() { Post.GotoHome(); }

    @When("a user click start create the posting")
    public void StartCreatePost() { Post.StartCreatePost(); }

    @And("a user fills out the content to created")
    public void FilltheContent() { Post.FilltheContent(); }

    @Then("click posting button for upload the new content")
    public void PostContent() { Post.PostContent(); }

}
