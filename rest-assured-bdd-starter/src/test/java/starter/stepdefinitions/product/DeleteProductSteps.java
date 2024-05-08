package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.User.product.DeleteProduct;

public class DeleteProductSteps {
    @Steps
    DeleteProduct deleteProduct;

    @Given("I set API endpoint valid for delete product")
    public void setAPIEndpointValidDeleteProduct() {
        deleteProduct.setAPIEndpointValidDeleteProduct();
    }

    @When("I send request to delete product")
    public void sendRequestDeleteProduct() {
        deleteProduct.sendRequestDeleteProduct();
    }

    @Then("I received status code of 200 OK for a delete product")
    public void receivedStatusCode200OKDeleteProduct() {
        deleteProduct.receivedStatusCode200OKDeleteProduct();
    }

    @And("I received data message \"null\" delete product")
    public void receivedDataMessageNullDeleteProduct() {
        deleteProduct.receivedDataMessageNullDeleteProduct();
    }
}
