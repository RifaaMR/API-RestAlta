package starter.stepdefinitions.authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.User.authentication.Login;

public class LoginSteps {

    @Steps
    Login login;

    @Given("I set the login endpoint")
    public void setLoginEndpoint() {
        login.setLoginEndpoint();
    }

    @When("I enter registered email")
    public void enterRegisteredEmail() {
        login.enterEmail("someone@mail.com");
    }

    @When("I enter the correct password")
    public void enterCorrectPassword() {
        login.enterPassword("123123");
    }

    @When("I enter the wrong password")
    public void enterWrongPassword() {
        login.enterPassword("8721272128");
    }

    @When("I enter unregistered email")
    public void enterUnregisteredEmail() {
        login.enterEmail("Ikan@gmail.com");
    }

    @When("I leave the email field empty")
    public void leaveEmailFieldEmpty() {
        login.enterEmail("");
    }

    @When("I leave the password field empty")
    public void leavePasswordFieldEmpty() {
        login.enterPassword("");
    }

    @Then("I should receive status code {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        login.verifyStatusCode(expectedStatusCode);
    }
}
