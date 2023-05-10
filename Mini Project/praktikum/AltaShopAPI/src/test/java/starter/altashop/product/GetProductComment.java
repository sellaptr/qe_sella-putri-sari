package starter.altashop.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductComment {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET endpoints by comment")
    public String iSetGETEndpointsByComment(){
        return url + "products/2/comments/";
    }
    @Step("I send GET HTTP request by comment")
    public void iSendGETHTTPRequestByComment(){
        SerenityRest.given()
                .when()
                .get(iSetGETEndpointsByComment());
    }
    @Step("I receive valid HTTP response code 200 for Get comment data products")
    public void iReceiveValidHTTPResponseCodeForGetCommentDataProducts(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for comment products")
    public void iReceiveValidDataForCommentProducts(){

    }
}
