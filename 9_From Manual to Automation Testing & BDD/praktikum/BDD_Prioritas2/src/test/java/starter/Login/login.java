package starter.login;

import net.thucydides.core.annotations.Step;

public class Login {

    @Step("I am on the login page")
    public void onTheLoginPage(){
        System.out.println("I am on the login page");
    }
    @Step("I enter my valid email and password")
    public void enterUsernameAndPasswordValid(){
        System.out.println("I enter my valid email and password");
    }
    @Step("I enter my invalid email and password")
    public void enterUsernameAndPasswordInvalid(){
        System.out.println("I enter my invalid email and password");
    }
    @Step("click on the login button")
    public void clickLoginButton(){
        System.out.println("click on the login button");
    }
    @Step("I should be redirected to the home page")
    public void SepulsaHomePage(){
        System.out.println("I should be redirected to the home page");
    }
    @Step("I will see an error message")
    public void InvalidLogin(){
        System.out.println("I will see an error message");
    }

}
