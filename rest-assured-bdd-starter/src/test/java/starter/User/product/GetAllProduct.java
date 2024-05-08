package starter.User.product;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.notNullValue;

public class GetAllProduct {
    protected static String GET_ALL_PRODUCTS_ENDPOINT = "https://altashop-api.fly.dev/api/products";

    @Step("I set API endpoint valid for get all product")
    public void setAPIEndpointValidGetAllProduct() {
//        SerenityRest.given().baseUri(GET_ALL_PRODUCTS_ENDPOINT);
    }

    @Step("I send request to get all product")
    public void sendRequestGetAllProduct() {
        SerenityRest.given().get(GET_ALL_PRODUCTS_ENDPOINT);
    }

    @Step("I received status code 200 OK get all products")
    public void receivedStatusCode200OKGetAllProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received list valid data for all product response")
    public void receivedListValidDataAllProduct() {
        restAssuredThat(response -> response.body("data", notNullValue()));
    }
}
