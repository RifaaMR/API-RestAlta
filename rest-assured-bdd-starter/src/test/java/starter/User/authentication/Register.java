package starter.User.authentication;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;



public class Register {

    protected static String REGISTER_URL = "https://altashop-api.fly.dev/api/auth/register";

    @Step("Set the register page endpoint")
    public void setRegisterPageEndpoint() {
        // Code to set up endpoint for registration
        SerenityRest.given().baseUri(REGISTER_URL);
    }

    @Step("Send valid register request")
    public void sendValidRegisterRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "testuser@example.com");
        requestBody.put("password", "ValidPassword123");
        requestBody.put("fullname", "Test User");

        SerenityRest.given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(REGISTER_URL);
    }

    @Step("Verify status code {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        SerenityRest.restAssuredThat(response -> response.statusCode(expectedStatusCode));
    }

    @Step("Send request with empty password and email")
    public void sendEmptyPasswordAndEmailRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "");

        SerenityRest.given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(REGISTER_URL);
    }

    @Step("Send request with already registered account")
    public void sendRequestWithAlreadyRegisteredAccount() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "existinguser@example.com");
        requestBody.put("password", "password123");

        SerenityRest.given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(REGISTER_URL);
    }
}
