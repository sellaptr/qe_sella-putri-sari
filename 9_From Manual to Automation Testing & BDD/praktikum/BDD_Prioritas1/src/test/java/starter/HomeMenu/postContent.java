package starter.HomeMenu;

import net.thucydides.core.annotations.Step;

public class postContent {
    @Step("the user goes to the main page or home")
    public void GotoHome() {
        System.out.println("the user goes to the main page or home");
    }

    @Step("a user click start create the posting")
    public void StartCreatePost() {
        System.out.println("a user click start create the posting");
    }

    @Step("a user fills out the content to created")
    public void FilltheContent() {
        System.out.println("a user fills out the form about what content to created");
    }

    @Step("click posting button for upload the new content")
    public void PostContent() {
        System.out.println("click posting button for upload the new content");
    }
}
