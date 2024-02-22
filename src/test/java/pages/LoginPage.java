package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends Page {

    @FindBy(xpath = "//div[@class='login_logo']")
    private WebElement pageTitle;

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userNameInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    public LoginPage() {
        super();
    }

    public boolean isAt() {
        return pageTitle.isDisplayed();
    }
}
