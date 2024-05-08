package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.User.product.CreateNewProduct;

public class CreateNewProductSteps {
    @Steps
    CreateNewProduct createNewProduct;

    @Given("I set API endpoint valid for create new product")
    public void setAPIEndpointValidCreateNewProduct() {
        createNewProduct.setAPIEndpointValidCreateNewProduct();
    }

    @When("I make a request with the POST method on the endpoint with post data")
    public void fillingValidBodyRequest() {
        createNewProduct.fillingValidBodyRequest();
    }

    @Then("I received responds with the status code 200")
    public void receivedStatusCode200OKNewProduct() {
        createNewProduct.receivedStatusCode200OKNewProduct();
    }

    @And("I received new product that was just created")
    public void receivedNewProductDataSuccessfullyAdded() {
        createNewProduct.receivedNewProductDataSuccessfullyAdded();
    }
}
