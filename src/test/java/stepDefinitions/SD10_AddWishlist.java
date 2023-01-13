package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.P10_AddWishlist;

import java.util.ArrayList;
import java.util.List;

public class SD10_AddWishlist {

    P10_AddWishlist addWishlist = new P10_AddWishlist(Hooks.driver);
    List<String> titles = new ArrayList<String>();

    @And("user add a product to wishlist")
    public void addProduct() throws InterruptedException {
        titles.add(addWishlist.productTitle.getText());
        addWishlist.addToWishlistBtn.click();
        Thread.sleep(2000);
        addWishlist.addToWishlistPageBtn.click();
    }

    @And("user add another product to wishlist")
    public void addAnotherProduct() {
        titles.add(addWishlist.productTitle.getText());
        addWishlist.addToWishlistBtn.click();
    }

    @And("user navigate to wishlist page")
    public void navigateWishlistPage() {
        addWishlist.wishlistBtn.click();
    }

    @Then("user get the added products on the wishlist")
    public void getAddedProducts() {
        Assert.assertEquals(addWishlist.firstCartProduct, titles.get(1));
        Assert.assertEquals(addWishlist.secondCartProduct, titles.get(2));
    }
}
