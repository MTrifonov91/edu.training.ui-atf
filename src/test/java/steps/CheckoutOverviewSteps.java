package steps;

import actions.BrowserActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import pages.CheckoutOveriewPage;


@Slf4j
public class CheckoutOverviewSteps {

    CheckoutOveriewPage checkoutOveriewPage = new CheckoutOveriewPage();

    @Then("Checkout overview page is displayed")
    public void checkoutOverviewPageIsDisplayed() {
        Assertions.assertTrue(checkoutOveriewPage.isAt());
    }

    @When("User clicks on Finish button")
    public void userClicksOnFinishButton() {
        BrowserActions.clickOnWebElement(checkoutOveriewPage.getFinishButton());
    }


}
