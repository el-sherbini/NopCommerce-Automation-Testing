package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage {

    WebDriver driver;

    public ResetPasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "forgot-password")
    public WebElement forgotPasswordPF;

    @FindBy(id = "Email")
    public WebElement emailPF;

    @FindBy(className = "password-recovery-button")
    public WebElement recoveryBtnPF;

    @FindBy(className = "content")
    public WebElement messageBodyPF;
}
