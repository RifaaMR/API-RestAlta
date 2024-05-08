package starter.User.product;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class AssignProductRating {

    protected static String ASSIGN_PRODUCT_RATING_URL = "https://altashop-api.fly.dev/api/products/2/ratings";

    @Step("I set API endpoint valid for assign product rating")
    public void setAPIEndpointValidAssignProductRating() {
        SerenityRest.given().baseUri(ASSIGN_PRODUCT_RATING_URL);
    }

    @Step("I make a request with the POST method on the endpoint")
    public void setTypeBearerTokenOnAuthorizationTabInAssignProductRating() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 4);
        SerenityRest.given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(ASSIGN_PRODUCT_RATING_URL);
    }

    @Step("I received status code of 200 OK for a product rating")
    public void receivedStatusCode200OKProductRating() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received product rating data that was successfully added")
    public void receivedProductRatingDataSuccessfullyAdded() {
        restAssuredThat(response -> response.body("rating", equalTo(5)));
    }
}