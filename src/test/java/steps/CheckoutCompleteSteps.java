package steps;

import actions.BrowserActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import pages.CheckoutCompletePage;


@Slf4j
public class CheckoutCompleteSteps {

    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    @Then("Checkout Complete page is displayed")
    public void checkoutCompletePageIsDisplayed() {
        Assertions.assertTrue(checkoutCompletePage.isAt());
    }

    @When("User clicks on Back Home button")
    public void userClicksOnBackHomeButton() {
        BrowserActions.clickOnWebElement(checkoutCompletePage.getBackToProductsButton());
    }
}
