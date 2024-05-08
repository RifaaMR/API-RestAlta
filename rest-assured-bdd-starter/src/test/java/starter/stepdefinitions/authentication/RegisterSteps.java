package starter.stepdefinitions.authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.User.authentication.Register;

public class RegisterSteps {

    @Steps
    Register register;

    @Given("I am on the register page endpoint")
    public void onRegisterPageEndpoint() {
        register.setRegisterPageEndpoint();
    }

    @When("I request the valid register endpoint")
    public void requestValidRegisterEndpoint() {
        register.sendValidRegisterRequest();
    }

    @Then("I receive success register status code response 200 ok")
    public void verifySuccessRegisterStatusCode() {
        register.verifyStatusCode(200);
    }

    @When("I blank the password and email")
    public void blankPasswordAndEmail() {
        register.sendEmptyPasswordAndEmailRequest();
    }

    @Then("I receive bad request HTTP response code \"400\"")
    public void verifyBadRequestStatusCode() {
        register.verifyStatusCode(400);
    }

    @When("I registered with already registered account")
    public void registeredWithAlreadyRegisteredAccount() {
        register.sendRequestWithAlreadyRegisteredAccount();
    }
}
