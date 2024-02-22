package steps;

import actions.BrowserActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;

import static config.PropertiesManager.getProperty;


@Slf4j
public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("Login page is displayed")
    public void loginPageIsDisplayed() {
        Assertions.assertTrue(loginPage.isAt());
    }

    @When("User Logs in with credentials for standard user")
    public void userLogsInWithCredentialsForStandardUser() {
        BrowserActions.sendKeys(loginPage.getUserNameInput(), getProperty("STANDARD_USER"));
        BrowserActions.sendKeys(loginPage.getPasswordInput(), getProperty("PASSWORD"));
        BrowserActions.clickOnWebElement(loginPage.getLoginButton());
    }

    @And("User is logged in")
    public void userIsLoggedIn() {
        loginPageIsDisplayed();
        userLogsInWithCredentialsForStandardUser();
    }
}
