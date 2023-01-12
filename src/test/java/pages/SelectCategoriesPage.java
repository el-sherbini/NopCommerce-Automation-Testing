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

    @FindBy(xpath = "//ul[@class=\"top-menu notmobile\"]//li")
    public WebElement mainCategory;

    @FindBy(xpath = "//ul[@class=\"sublist first-level\"]//li[2]//a")
    public WebElement subCategory;

    @FindBy(xpath = "//div[@class=\"page-title\"]//h1")
    public WebElement pageTitle;
}
