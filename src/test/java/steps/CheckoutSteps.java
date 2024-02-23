package steps;

import actions.BrowserActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import pages.CartPage;
import pages.CheckoutPage;


@Slf4j
public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("Checkout page is displayed")
    public void checkoutPageIsDisplayed() {
        Assertions.assertTrue(checkoutPage.isAt());
    }

    @When("User enters {string} as First Name")
    public void userEntersFirstName(String name) {
        BrowserActions.sendKeys(checkoutPage.getFirstNameInput(), name);
    }

    @And("User enters {string} as Last Name")
    public void userEntersLastName(String name) {
        BrowserActions.sendKeys(checkoutPage.getLastnameInput(), name);
    }

    @And("User enters {string} as Postal Code")
    public void userEntersPostalCode(String code) {
        BrowserActions.sendKeys(checkoutPage.getPostalCodeInput(), code);
    }

    @And("User clicks on Continue button")
    public void userClicksOnContinueButton() {
        BrowserActions.clickOnWebElement(checkoutPage.getContinueButton());
    }


}
