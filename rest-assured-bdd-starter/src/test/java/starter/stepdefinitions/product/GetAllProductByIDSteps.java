package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.User.product.GetAllProductByID;

public class GetAllProductByIDSteps {
    @Steps
    GetAllProductByID getProductByID;

    @Given("I set API endpoint valid for get a single product data")
    public void setAPIEndpointValidGetProductByID() {
        getProductByID.setAPIEndpointValidGetProductByID();
    }

    @When("I send request to get a single product data")
    public void sendRequestGetProductByID() {
        getProductByID.sendRequestGetProductByID();
    }

    @Then("I received status code 200 OK get product by ID")
    public void receivedStatusCode200OKGetProductByID() {
        getProductByID.receivedStatusCode200OKGetProductByID();
    }

    @And("I received detail single product data response")
    public void receivedDetailSingleProductDataResponse() {
        getProductByID.receivedDetailSingleProductDataResponse();
    }
}
