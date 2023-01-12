package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.P05_SwitchCurrencies;

public class SD05_SwitchCurrencies {
    P05_SwitchCurrencies changeCurrencies = new P05_SwitchCurrencies(Hooks.driver);

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
