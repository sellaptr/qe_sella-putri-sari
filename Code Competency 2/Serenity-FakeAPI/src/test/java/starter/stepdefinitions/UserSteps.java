package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import io.restassured.path.json.JsonPath;
import org.json.simple.JSONObject;
import org.hamcrest.Matchers;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static com.google.common.graph.ElementOrder.sorted;
import static java.util.Collections.reverseOrder;
import static org.junit.Assert.*;
import java.util.List;
import io.cucumber.java.en.*;

import static net.serenitybdd.rest.RestRequests.given;
import static org.hamcrest.Matchers.*;

public class UserSteps {

    private RequestSpecification request;
//    private Response response;

    private String baseURI = "https://fakestoreapi.com";
    private Response response;

    private JsonPath jsonPath;

    private String productId;
    private String newProductName;

    private String cartId;
    private String newCartProducts;

    private String usersId;
    private String newUsersUsername;

    private String startDate;
    private String endDate;

    private String date;

    @Before
    public void setUp() {
        RestAssured.baseURI = "https://fakestoreapi.com";
        request = RestAssured.given();
    }

    @Given("I have valid credentials")
    public void validCredentials() {
        request.contentType(ContentType.JSON);
    }

    @When("I submit a POST request to {string} with username {string} and password {string}")
    public void submitUsernamePassword(String endpoint, String username, String password) {
        request.body("{\"username\": \"" + username + "\", \"password\": \"" + password + "\"}");
        response = request.post(endpoint);
    }

    @Then("I should get a {int} response code")
    public void getResponseCode(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    @Then("the response should contain an access token")
    public void responseAccessToken() {
        response.then().body("token", not(emptyOrNullString()));
    }

    @Given("I set GET products endpoint")
    public void getProductEndpoint() {
        response = given().baseUri(baseURI).when().get("/products");
    }

    @When("I send GET HTTP request")
    public void getHttpRequest() {
        response = response.then().extract().response();
    }

    @Then("the response status code should be {int}")
    public void responseCode(Integer statusCode) {
        response.then().statusCode(statusCode);
    }

    @And("the response should contain products")
    public void responseProducts() {
        response.then().body("", not(empty()));
    }

    @Given("I set GET product endpoint with id {int}")
    public void setWithId(Integer id) {
        response = given().baseUri(baseURI).when().get("/products/" + id);
    }

    @And("the response should contain product with id {int}")
    public void responseProductWithId(Integer id) {
        response.then().body("id", equalTo(id));
    }

    @Given("I set GET product endpoint with limit {int}")
    public void setWithLimit(Integer limit) {
        response = given().baseUri(baseURI).when().get("/products?limit=" + limit);
    }

    @And("the response should contain a list of {int} products")
    public void checkProductList(int expectedProductCount) {
        int actualProductCount = response.jsonPath().getList("$").size();
        Assert.assertEquals(expectedProductCount, actualProductCount);
    }

    @Given("User call product list API with sorted parameter")
    public void userCallSortedParameter() {
        response = given().baseUri(baseURI).when().get("/products?sort=desc");
    }

    @Given("I send a GET request to categories")
    public void sendGetRequestCategories() {
        response = given().baseUri(baseURI).when().get("/products/categories");
    }

    @Then("the response should contain categories")
    public void theResponseShouldContainCategories() {
        List<String> categories = response.jsonPath().getList(".");
        assertFalse(categories.isEmpty());
    }

    @Given("I send a GET request to categories jewelery")
    public void sendGetCategoriesIn() {
        response = given().baseUri(baseURI).when().get("/products/category/jewelery");
    }

    @Given("I send a GET request to categories jewelery invalid")
    public void sendGetCategoriesInvalid() {
        response = given().baseUri(baseURI).when().get("/products/category/jewelry");
    }

    @Given("I have a new product with title {string}, price {string}, description {string}, image {string}, and category {string}")
    public void newProduct(String title, String price, String description, String image, String category) {
        String jsonBody = "{\"title\":\"" + title + "\",\"price\":\"" + price + "\",\"description\":\"" + description + "\",\"image\":\"" + image + "\",\"category\":\"" + category + "\"}";
        RestAssured.baseURI = "https://fakestoreapi.com";
        response = given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .post("/products");
    }

    @When("I add the new product")
    public void addNewProduct() {
        response.then().log().all();
    }

    @Then("the response should contain the new product data")
    public void responseNewProductData() {
        response.then().body("id", notNullValue())
                .body("title", notNullValue())
                .body("price", notNullValue())
                .body("description", notNullValue())
                .body("image", notNullValue())
                .body("category", notNullValue())
                .log().all();
    }

    @Given("I have a product with id {int}")
    public void haveProductWithId(Integer id) {
        productId = id.toString();
    }

    @When("I update the product name to {string}")
    public void updateProductName(String productName) {
        newProductName = productName;
        JSONObject requestParams = new JSONObject();
        requestParams.put("title", newProductName);
        response = given()
                .contentType(ContentType.JSON)
                .body(requestParams.toString())
                .when()
                .put(baseURI + "/products/" + productId);
    }

    @And("the response should contain the updated product information")
    public void responseProductInformation() {
        String responseBody = response.getBody().asString();
        assertTrue(responseBody.contains(newProductName));
    }

    @Given("User requests to delete a product with id {int}")
    public void userDeleteWithId(Integer id) {
        // Send DELETE request to delete a product with id 6
        response = request.delete(baseURI + "/products/" + id);
    }

    @When("Product with id is successfully deleted")
    public void productSuccessDelete() {
        // Verify that the product is deleted by checking status code
        response.then().statusCode(200);
//        response.then().assertThat().body("message", equalTo("Product deleted"));
    }

    @Given("I set GET carts endpoint")
    public void getCartsEndpoint() {
        response = given().baseUri(baseURI).when().get("/carts");
    }

    @And("the response should contain carts")
    public void responseCarts() {
        response.then().body("", not(empty()));
    }

    @Given("I set GET carts endpoint with id {int}")
    public void setCartsWithId(Integer id) {
        response = given().baseUri(baseURI).when().get("/carts/" + id);
    }

    @And("the response should contain carts with id {int}")
    public void responseCartsWithId(Integer id) {
        response.then().body("id", equalTo(id));
    }

    @Given("I set GET carts endpoint with limit {int}")
    public void setCartsWithLimit(Integer limit) {
        response = given().baseUri(baseURI).when().get("/carts?limit=" + limit);
    }

    @And("the response should contain a list of {int} carts")
    public void checkCartsList(int expectedCartsCount) {
        int actualCartsCount = response.jsonPath().getList("$").size();
        Assert.assertEquals(expectedCartsCount, actualCartsCount);
    }

    @Given("User call carts list API with sorted parameter")
    public void userCallCartsSortedParameter() {
        response = given().baseUri(baseURI).when().get("/carts?sort=desc");
    }

    @Given("I set start date as {string} and end date as {string}")
    public void setStartDateAndEndDate(String start_date, String end_date) {
        this.startDate = start_date;
        this.endDate = end_date;
    }

    @When("I send GET request to {string}")
    public void sendGetRequest(String endpoint) {
        response = given()
                .param("startdate", startDate)
                .param("enddate", endDate)
                .when()
                .get(endpoint);
    }

    @Given("I set GET user carts endpoint with id {int}")
    public void setUserCartsWithId(Integer id) {
        response = given().baseUri(baseURI).when().get("/carts/user/" + id);
    }

    @Given("I set date as {string}")
    public void setDate(String Date) {
        this.date = Date;
    }

    @When("I send GET date request to {string}")
    public void sendGetDateRequest(String endpoint) {
        response = given()
                .param("date", date)
                .when()
                .get(endpoint);
    }

    @Given("I have a new cart with userId {string}, date {string}, products {string}")
    public void newCart(String userId, String date, String products) {
        String jsonBody = "{\"userId\":\"" + userId + "\",\"date\":\"" + date + "\",\"products\":\"" + products + "\"}";
        RestAssured.baseURI = "https://fakestoreapi.com";
        response = given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .post("/carts");
    }

    @When("I add the new cart")
    public void addNewCart() {
        response.then().log().all();
    }

    @Then("the response should contain the new cart data")
    public void responseNewCartData() {
        response.then().body("id", notNullValue())
                .body("userId", notNullValue())
                .body("date", notNullValue())
                .body("products", notNullValue())
                .log().all();
    }

    @Given("I have a cart with id {int}")
    public void haveCartWithId(Integer id) {
        cartId = id.toString();
    }

    @When("I update the cart products to {string}")
    public void updateCartProducts(String cartProducts) {
        newCartProducts = cartProducts;
        JSONObject requestParams = new JSONObject();
        requestParams.put("products", newCartProducts);
        response = given()
                .contentType(ContentType.JSON)
                .body(requestParams.toString())
                .when()
                .put(baseURI + "/carts/" + cartId);
    }

    @And("the response should contain the updated cart information")
    public void responseCartInformation() {
        String responseBody = response.getBody().asString();
        assertTrue(responseBody.contains(newCartProducts));
    }

    @Given("User requests to delete a cart with id {int}")
    public void userDeleteCartWithId(Integer id) {
        // Send DELETE request to delete a product with id 6
        response = request.delete(baseURI + "/carts/" + id);
    }

    @When("Cart with id is successfully deleted")
    public void cartSuccessDelete() {
        // Verify that the product is deleted by checking status code
        response.then().statusCode(200);
//        response.then().assertThat().body("message", equalTo("Product deleted"));
    }

    @Given("I set GET users endpoint")
    public void getUsersEndpoint() {
        response = given().baseUri(baseURI).when().get("/users");
    }

    @And("the response should contain users")
    public void responseUsers() {
        response.then().body("", not(empty()));
    }

    @Given("I set GET users endpoint with id {int}")
    public void setUsersWithId(Integer id) {
        response = given().baseUri(baseURI).when().get("/users/" + id);
    }

    @And("the response should contain users with id {int}")
    public void responseUsersWithId(Integer id) {
        response.then().body("id", equalTo(id));
    }

    @Given("I set GET users endpoint with limit {int}")
    public void setUsersWithLimit(Integer limit) {
        response = given().baseUri(baseURI).when().get("/users?limit=" + limit);
    }

    @And("the response should contain a list of {int} users")
    public void checkUsersList(int expectedCartsCount) {
        int actualCartsCount = response.jsonPath().getList("$").size();
        Assert.assertEquals(expectedCartsCount, actualCartsCount);
    }

    @Given("User call users list API with sorted parameter")
    public void userCallUsersSortedParameter() {
        response = given().baseUri(baseURI).when().get("/users?sort=desc");
    }

//    @Given("I have a new users with email {string}, username {string}, password {string}, name {string}, address {string}, phone {string}")
//    public void newUsers(String email, String username, String password, String name, String address, String phone) {
//        String jsonBody = "{\"email\":\"" + email + "\",\"username\":\"" + username + "\",\"password\":\"" + password + "\",\"name\":\"" + name + "\",\"address\":\"" + address + "\",\"phone\":\"" + phone + "\"}";
//        RestAssured.baseURI = "https://fakestoreapi.com";
//        response = given()
//                .contentType(ContentType.JSON)
//                .body(jsonBody)
//                .when()
//                .post("/users");
//    }
//
//    @When("I add the new users")
//    public void addNewUsers() {
//        response.then().log().all();
//    }
//
//    @Then("the response should contain the new users data")
//    public void responseNewUsersData() {
//        response.then().body("id", notNullValue())
//                .body("email", notNullValue())
//                .body("username", notNullValue())
//                .body("password", notNullValue())
//                .body("name", notNullValue())
//                .body("address", notNullValue())
//                .body("phone", notNullValue())
//                .log().all();
//    }

    @Given("I have a users with id {int}")
    public void haveUsersWithId(Integer id) {
        usersId = id.toString();
    }

    @When("I update the users username to {string}")
    public void updateUsersUsername(String usersUsername) {
        newUsersUsername = usersUsername;
        JSONObject requestParams = new JSONObject();
        requestParams.put("username", newUsersUsername);
        response = given()
                .contentType(ContentType.JSON)
                .body(requestParams.toString())
                .when()
                .put(baseURI + "/users/" + usersId);
    }

    @And("the response should contain the updated users information")
    public void responseUsersInformation() {
        String responseBody = response.getBody().asString();
        assertTrue(responseBody.contains(newUsersUsername));
    }

    @Given("User requests to delete a users with id {int}")
    public void userDeleteUsersWithId(Integer id) {
        // Send DELETE request to delete a product with id 6
        response = request.delete(baseURI + "/users/" + id);
    }

    @When("Users with id 6 is successfully deleted")
    public void usersSuccessDelete() {
        // Verify that the product is deleted by checking status code
        response.then().statusCode(200);
//        response.then().assertThat().body("message", equalTo("Product deleted"));
    }

}
