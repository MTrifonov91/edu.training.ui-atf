package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CartPage extends Page {

    @FindBy(xpath = "//span[@class='title' and text()='Your Cart']")
    private WebElement pageTitle;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    public CartPage() {
        super();
    }

    public boolean isAt() {
        return pageTitle.isDisplayed();
    }
}
