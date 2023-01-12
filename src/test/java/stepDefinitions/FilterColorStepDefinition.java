package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FilterColorPage;

public class FilterColorStepDefinition {

    FilterColorPage filterColor = new FilterColorPage(Hooks.driver);

    @And("user selects color")
    public void changeColor() {
        filterColor.colorInput.click();
    }

    @Then("user get the result data with the color chosen")
    public void getProducts() {
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("specs=15"));
    }
}
