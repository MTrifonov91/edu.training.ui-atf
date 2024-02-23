package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CheckoutCompletePage extends Page {

    @FindBy(xpath = "//span[@class='title' and text()='Checkout: Complete!']")
    private WebElement pageTitle;

    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement backToProductsButton;

    public CheckoutCompletePage() {
        super();
    }

    public boolean isAt() {
        return pageTitle.isDisplayed();
    }
}
