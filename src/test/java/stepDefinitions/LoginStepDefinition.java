package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginStepDefinition {

    LoginPage login = new LoginPage(Hooks.driver);

    @Given("user navigates to login page")
    public void navigateLoginPage() {
        login.loginNavigatePF.click();
    }

    @When("^user enters email \"(.*)\" and password \"(.*)\"$")
    public void enterData(String email, String password) {
        login.emailPF.sendKeys(email);
        login.passwordPF.sendKeys(password);
    }

    @And("user click on login button")
    public void clickLoginButton() {
        login.loginBtnPF.click();
    }

    @Then("user log in successfully") @And("user go to home page")
    public void loginSuccessfully() {
        Assert.assertTrue(login.logoutBtnPF.isDisplayed());
    }
}
