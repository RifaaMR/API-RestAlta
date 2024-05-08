package starter.User.product;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.nullValue;

public class DeleteProduct {

    protected static String DELETE_PRODUCT_URL = "https://altashop-api.fly.dev/api/products/1";

    @Step("I set API endpoint valid for delete product")
    public void setAPIEndpointValidDeleteProduct() {
        SerenityRest.given().baseUri(DELETE_PRODUCT_URL);
    }

    @Step("I send request to delete product")
    public void sendRequestDeleteProduct() {
        SerenityRest.given().delete(DELETE_PRODUCT_URL);
    }

    @Step("I received status code of 200 OK for a delete product")
    public void receivedStatusCode200OKDeleteProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received data message \\\"null\\\" delete product\"")
    public void receivedDataMessageNullDeleteProduct() {
        restAssuredThat(response -> response.body("message", nullValue()));
    }
}