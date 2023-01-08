package pages;

import org.openqa.selenium.By;
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
    public WebElement loginNavigatePF;

    @FindBy(id = "Email")
    public WebElement emailPF;

    @FindBy(id = "Password")
    public WebElement passwordPF;

    @FindBy(className = "login-button")
    public WebElement loginBtnPF;

    @FindBy(className = "ico-logout")
    public WebElement logoutBtnPF;
}
