package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CheckoutOveriewPage extends Page {

    @FindBy(xpath = "//span[@class='title' and text()='Checkout: Overview']")
    private WebElement pageTitle;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    public CheckoutOveriewPage() {
        super();
    }

    public boolean isAt() {
        return pageTitle.isDisplayed();
    }
}
