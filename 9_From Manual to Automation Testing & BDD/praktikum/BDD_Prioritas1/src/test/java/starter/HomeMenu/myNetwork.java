package starter.HomeMenu;

import net.thucydides.core.annotations.Step;

public class myNetwork {
    @Step("the user have the linkedin account")
    public void Account() {
        System.out.println("the user have the linkedin account");
    }

    @Step("a user has logged in to the account")
    public void LoginAccount() {
        System.out.println("a user has logged in to the account");
    }

    @Step("a user click My Network button")
    public void ClickMyNetworkButton() {
        System.out.println("a user click My Network button");
    }

    @Step("display the relation all connection and manage my network")
    public void ShowMyNetwork() {
        System.out.println("display the relation all connection and manage my network");
    }
}
