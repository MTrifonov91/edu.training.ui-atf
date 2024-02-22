package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
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
}
