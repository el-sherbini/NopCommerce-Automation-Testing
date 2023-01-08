package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SearchProductPage;

public class SearchProductStepDefinition {

    SearchProductPage searchProduct = new SearchProductPage(Hooks.driver);

    @When("user search for a product {string}")
    public void searchProduct(String product) {
        System.out.println(product);
        searchProduct.searchTxtFld.sendKeys(product);
        searchProduct.searchBtn.click();
    }

    @Then("user got relative result of product searched for {string}")
    public void searchSuccessfully(String product) {
        Assert.assertEquals(product, searchProduct.productTitleTxt);
    }
}
