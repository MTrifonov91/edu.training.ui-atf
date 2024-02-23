package steps;

import actions.BrowserActions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.ProductsPage;

import java.util.List;

public class ProductsSteps {

    ProductsPage productsPage = new ProductsPage();

    @Then("Products page is displayed")
    public void productsPageIsDisplayed() {
        Assertions.assertTrue(productsPage.isAt());
    }

    @Then("Product list contains the following items")
    public void productListContainsTheFollowingItems(DataTable table) {
        List<String> expectedItems = table.asList();

        List<String> actualItems = productsPage.getProducts().stream()
                .map(product -> product.getProductTitle().getText())
                .toList();

        Assertions.assertLinesMatch(expectedItems, actualItems);
    }

    @When("User adds {string} to cart")
    public void userAddsSauceLabsBackpackToCart(String productTitle) {
        BrowserActions.clickOnWebElement(productsPage.getProductCardByTitle(productTitle).getAddToCartButton());
    }

    @Then("Your Cart has {string} label displayed")
    public void yourCartHasLabelDisplayed(String label) {
        Assertions.assertEquals(productsPage.getYourCartLabel().getText(), label);
    }

    @And("User clicks on Cart")
    public void userClicksOnCart() {
        BrowserActions.clickOnWebElement(productsPage.getYourCartLabel());
    }

    @And("Your Cart is empty")
    public void ensureYourCartIsEmpty() {
        Assertions.assertTrue(productsPage.isCartEmpty());
    }
}
