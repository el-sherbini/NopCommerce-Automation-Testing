package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;

public class RegistrationStepDefinition {

    RegistrationPage register = new RegistrationPage(Hooks.driver);

    @Given("user navigates to registration page")
    public void navigateRegistrationPage() {
        register.registerNavigatePF.click();
    }

    @When("user enters valid data")
    public void enterValidData() {
        register.firstNamePF.sendKeys("test2");
        register.lastNamePF.sendKeys("test2");
        register.emailPF.sendKeys("test2@gmail.com");
        register.passwordPF.sendKeys("123456");
        register.confirmPasswordPF.sendKeys("123456");
    }

    @And("user click on register button")
    public void clickRegisterButton() {
        register.registerBtnPF.click();
    }

    @Then("user registered successfully")
    public void registeredSuccessfully() {
        Assert.assertTrue("User registered successfully", register.resultPF.getText().contains("Your registration completed"));
    }

}
