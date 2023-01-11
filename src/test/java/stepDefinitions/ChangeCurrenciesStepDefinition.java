package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.ChangeCurrenciesPage;

public class ChangeCurrenciesStepDefinition {
    ChangeCurrenciesPage changeCurrencies = new ChangeCurrenciesPage(Hooks.driver);

    @When("user choose a currency from the dropdown on the top left")
    public void changeCurrency() {
        Select s = new Select(changeCurrencies.currencyDropdown);

        if(changeCurrencies.selectedCurrency.getText().equals("Euro")) s.selectByVisibleText("US Dollar");
        else s.selectByVisibleText("Euro");
    }

    @Then("user change currency and the price of products converts to the new currency symbol")
    public void checkCurrencyChanged() {
        Assert.assertTrue(changeCurrencies.productPrice.getText().contains("€"));
    }
}
