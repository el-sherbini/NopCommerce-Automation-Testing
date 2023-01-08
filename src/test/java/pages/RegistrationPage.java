package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerNavigatePF;

    @FindBy(id = "FirstName")
    public WebElement firstNamePF;

    @FindBy(id = "LastName")
    public WebElement lastNamePF;

    @FindBy(id = "Email")
    public WebElement emailPF;

    @FindBy(id = "Password")
    public WebElement passwordPF;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPasswordPF;

    @FindBy(id = "register-button")
    public WebElement registerBtnPF;

    @FindBy(className = "result")
    public WebElement resultPF;
}
