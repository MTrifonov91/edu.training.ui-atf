package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CheckoutPage extends Page {

    @FindBy(xpath = "//span[@class='title' and text()='Checkout: Your Information']")
    private WebElement pageTitle;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastnameInput;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCodeInput;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    public CheckoutPage() {
        super();
    }

    public boolean isAt() {
        return pageTitle.isDisplayed();
    }
}
