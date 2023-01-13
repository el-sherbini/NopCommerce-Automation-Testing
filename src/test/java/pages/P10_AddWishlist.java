package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P10_AddWishlist {

    WebDriver driver;

    public P10_AddWishlist(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[@class=\"button-2 add-to-wishlist-button\"])[2]")
    public WebElement addToWishlistBtn;

    @FindBy(xpath = "(//h2[@class=\"product-title\"])[2]//a")
    public WebElement productTitle;

    @FindBy(id = "add-to-wishlist-button-4")
    public WebElement addToWishlistPageBtn;

    @FindBy(className = "wishlist-label")
    public WebElement wishlistBtn;

    @FindBy(xpath = "//div[@class=\"product\"]//a")
    public WebElement firstCartProduct;

    @FindBy(xpath = "(//div[@class=\"product\"]//a)[2]")
    public WebElement secondCartProduct;
}
