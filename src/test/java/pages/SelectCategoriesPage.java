package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCategoriesPage {

    WebDriver driver;

    public SelectCategoriesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href=\"/apparel\"]")
    public WebElement mainCategory;

    @FindBy(xpath = "//a[@href=\"/shoes\"]")
    public WebElement subCategory;

    @FindBy(xpath = "//div[@class=\"page-title\"]//h1")
    public WebElement pageTitle;
}
