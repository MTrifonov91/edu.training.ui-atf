package steps;

import actions.BrowserActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import pages.CartPage;


@Slf4j
public class CartSteps {

    CartPage cartPage = new CartPage();

    @Given("Your Cart page is displayed")
    public void cartPageIsDisplayed() {
        Assertions.assertTrue(cartPage.isAt());
    }

    @When("User clicks on Checkout button")
    public void userClicksOnCheckoutButton() {
        BrowserActions.clickOnWebElement(cartPage.getCheckoutButton());
    }

}
