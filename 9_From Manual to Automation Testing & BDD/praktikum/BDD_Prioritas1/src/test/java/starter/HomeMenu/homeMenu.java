package starter.HomeMenu;

import net.thucydides.core.annotations.Step;

public class homeMenu {

    @Step("the user open the linkedin app")
    public void OpenLinkedinApp() {
        System.out.println("the user open the linkedin app");
    }

    @Step("a user fill the form to login account")
    public void FillLoginForm() {
        System.out.println("a user fill the form to login account");
    }

    @Step("a user has successfully logged in to the account")
    public void SuccessLoginAccount() {
        System.out.println("a user has successfully logged in to the account");
    }

    @Step("display the linkedin home menu")
    public void ShowTheHomeMenu() {
        System.out.println("display the linkedin home menu");
    }
}
