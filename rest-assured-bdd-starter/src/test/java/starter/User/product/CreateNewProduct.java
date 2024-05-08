package starter.User.product;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CreateNewProduct {
    protected static String CREATE_PRODUCT_URL = "https://altashop-api.fly.dev/api/products";
    private JSONObject requestBody;

    @Step("Set API endpoint valid for create new product")
    public void setAPIEndpointValidCreateNewProduct() {
        SerenityRest.given().baseUri(CREATE_PRODUCT_URL);
    }

    @Step("Prepare body request for creating a new product")
    public void fillingValidBodyRequest() {
        requestBody = new JSONObject();
        requestBody.put("name", "Sony PS5");
        requestBody.put("description", "play has no limits");
        requestBody.put("price", 299);
        requestBody.put("category", "Gadgets");
    }

    @Step("Make a request with the POST method to create a new product")
    public void sendCreateNewProductRequest() {
        SerenityRest.given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(CREATE_PRODUCT_URL);
    }

    @Step("I received responds with the status code 200")
    public void receivedStatusCode200OKNewProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received new product data that was just created")
    public void receivedNewProductDataSuccessfullyAdded() {
        restAssuredThat(response -> response.body("name", equalTo("Sony PS5")));
        restAssuredThat(response -> response.body("description", equalTo("play has no limits")));
        restAssuredThat(response -> response.body("price", equalTo(299)));
        restAssuredThat(response -> response.body("category", equalTo("Gadgets")));
    }
}
