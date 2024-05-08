package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.User.product.GetAllProduct;

public class GetAllProductSteps {
    @Steps
    GetAllProduct getAllProduct;

    @Given("I set API endpoint valid for get all product")
    public void setAPIEndpointValidGetAllProduct() {
        getAllProduct.setAPIEndpointValidGetAllProduct();
    }

    @When("I send request to get all product")
    public void sendRequestGetAllProduct() {
        getAllProduct.sendRequestGetAllProduct();
    }

    @Then("I received status code 200 OK get all products")
    public void receivedStatusCode200OKGetAllProduct() {
        getAllProduct.receivedStatusCode200OKGetAllProduct();
    }

    @And("I received list valid data for all product response")
    public void receivedListValidDataAllProduct() {
        getAllProduct.receivedListValidDataAllProduct();
    }

}
