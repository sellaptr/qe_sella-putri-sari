package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "http://reqres.in/api/";
    @Step("I set GET endpoints")
    public String setGetEndpoints(){
        return url + "users/2";

    }
    @Step("I send GET HTTP request")
    public void getHTTPrequest(){
        SerenityRest.given()
                .when()
                .get(setGetEndpoints());

    }
    @Step("I receive valid data for detail user")
    public void HTTPresponse200(){
        restAssuredThat(response ->response.statusCode(200));


    }

    @Step("I receive valid HTTP response code 200")
    public void valiData(){
        restAssuredThat(response -> response.statusCode(200));
    }


}
