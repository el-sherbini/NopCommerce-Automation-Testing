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
        register.registerNavigateBtn.click();
    }

    @When("user enters valid data")
    public void enterValidData() {
        register.firstNameTxtFld.sendKeys("mohamed");
        register.lastNameTxtFld.sendKeys("emad");
        register.emailTxtFld.sendKeys("mEmad@gmail.com");
        register.passwordTxtFld.sendKeys("123456");
        register.confirmPasswordTxtFld.sendKeys("123456");
    }

    @And("user click on register button")
    public void clickRegisterButton() {
        register.registerBtn.click();
    }

    @Then("user registered successfully")
    public void registeredSuccessfully() {
        Assert.assertTrue("User registered successfully", register.resultTxt.getText().contains("Your registration completed"));
    }

}
