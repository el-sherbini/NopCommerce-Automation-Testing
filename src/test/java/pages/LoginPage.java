package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-login")
    public WebElement loginNavigateBtn;

    @FindBy(id = "Email")
    public WebElement emailTxtFld;

    @FindBy(id = "Password")
    public WebElement passwordTxtFld;

    @FindBy(className = "login-button")
    public WebElement loginBtn;

    @FindBy(className = "ico-logout")
    public WebElement logoutBtn;
}
