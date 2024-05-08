package starter.User.product;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllProductByID{

    private static final String GET_PRODUCT_BY_ID_URL = "https://altashop-api.fly.dev/api/products/1";

    @Step("Set API endpoint valid for get a single product data")
    public void setAPIEndpointValidGetProductByID() {
        SerenityRest.given().baseUri(GET_PRODUCT_BY_ID_URL);
    }

    @Step("Send request to get a single product data")
    public void sendRequestGetProductByID() {
        SerenityRest.given().get(GET_PRODUCT_BY_ID_URL);
    }

    @Step("Received status code 200 OK get product by ID")
    public void receivedStatusCode200OKGetProductByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Received detail single product data response")
    public void receivedDetailSingleProductDataResponse() {
        restAssuredThat(response -> response.body("name", notNullValue()));
        restAssuredThat(response -> response.body("price", notNullValue()));
        restAssuredThat(response -> response.body("category", notNullValue()));
    }
}
