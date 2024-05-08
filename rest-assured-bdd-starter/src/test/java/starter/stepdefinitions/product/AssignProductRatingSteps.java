package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.User.product.AssignProductRating;

public class AssignProductRatingSteps {
    @Steps
    AssignProductRating assignProductRating;

    @Given("I set API endpoint valid for assign product rating")
    public void setAPIEndpointValidAssignProductRating() {
        assignProductRating.setAPIEndpointValidAssignProductRating();
    }

    @When("I make a request with the POST method on the endpoint")
    public void setTypeBearerTokenOnAuthorizationTabInAssignProductRating() {
        assignProductRating.setTypeBearerTokenOnAuthorizationTabInAssignProductRating();
    }

    @Then("I received status code of 200 OK for a product rating")
    public void receivedStatusCode200OKProductRating() {
        assignProductRating.receivedStatusCode200OKProductRating();
    }

    @And("I received product rating data that was successfully added")
    public void receivedProductRatingDataSuccessfullyAdded() {
        assignProductRating.receivedProductRatingDataSuccessfullyAdded();
    }
}
