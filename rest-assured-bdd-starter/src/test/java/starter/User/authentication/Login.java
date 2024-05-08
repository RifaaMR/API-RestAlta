package starter.User.authentication;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {

    protected static String LOGIN_URL = "https://altashop-api.fly.dev/api/auth/login";
    private String email;
    private String password;

    @Step("Set the login endpoint")
    public void setLoginEndpoint() {
        SerenityRest.given().baseUri(LOGIN_URL);
    }

    @Step("Enter email")
    public void enterEmail(String email) {
        this.email = email;
    }

    @Step("Enter password")
    public void enterPassword(String password) {
        this.password = password;
    }

    @Step("Send login request")
    public void sendLoginRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", email);
        requestBody.put("password", password);

        SerenityRest.given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(LOGIN_URL);
    }

    @Step("Verify status code {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        restAssuredThat(response -> response.statusCode(expectedStatusCode));
    }
}
