package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.P09_AddShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class SD09_AddShoppingCart {

    P09_AddShoppingCart addShoppingCart = new P09_AddShoppingCart(Hooks.driver);
    List<String> titles = new ArrayList<String>();

    @And("user add a product to shopping cart")
    public void addProduct() throws InterruptedException {
        titles.add(addShoppingCart.productTitle.getText());
        addShoppingCart.addToCartBtn.click();
        Thread.sleep(2000);
        addShoppingCart.addToCartPageBtn.click();
    }

    @And("user add another product to shopping cart")
    public void addAnotherProduct() {
        titles.add(addShoppingCart.productTitle.getText());
        addShoppingCart.addToCartBtn.click();
    }

    @Then("user get the added products on the shopping cart")
    public void getAddedProducts() {
        Assert.assertEquals(addShoppingCart.firstCartProduct, titles.get(1));
        Assert.assertEquals(addShoppingCart.secondCartProduct, titles.get(2));
    }
}
