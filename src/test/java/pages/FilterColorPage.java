package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterColorPage {

    WebDriver driver;

    public FilterColorPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class=\"item color-item\"]//input[@id=\"attribute-option-15\"]")
    public WebElement colorInput;
}
