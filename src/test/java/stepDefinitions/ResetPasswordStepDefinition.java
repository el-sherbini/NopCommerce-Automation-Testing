package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ResetPasswordPage;

public class ResetPasswordStepDefinition {

    ResetPasswordPage resetPassword = new ResetPasswordPage(Hooks.driver);

    @And("user clicks on Forgot password? button")
    public void navigateRegistrationPage() {
        resetPassword.forgotPasswordPF.click();
    }

    @When("user enters valid email")
    public void enterValidEmail() {
        resetPassword.emailPF.sendKeys("test2@gmail.com");
    }

    @And("user click on recover button")
    public void clickRecoverBtn() {
        resetPassword.recoveryBtnPF.click();
    }

    @Then("user confirms that this message is displayed \"Email with instructions has been sent to you.\"")
    public void confirmRecoveryMessage() {
        Assert.assertTrue(resetPassword.messageBodyPF.getText().contains("Email with instructions has been sent to you."));
    }
}
