package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P09_AddShoppingCart {

    WebDriver driver;

    public P09_AddShoppingCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")
    public WebElement addToCartBtn;

    @FindBy(xpath = "(//h2[@class=\"product-title\"])[2]//a")
    public WebElement productTitle;

    @FindBy(id = "add-to-cart-button-4")
    public WebElement addToCartPageBtn;

    @FindBy(xpath = "//div[@class=\"product\"]//a")
    public WebElement firstCartProduct;

    @FindBy(xpath = "(//div[@class=\"product\"]//a)[2]")
    public WebElement secondCartProduct;
}
