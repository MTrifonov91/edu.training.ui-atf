package elements.blocks;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import pages.Page;

@Getter
public class ProductCardBlock extends Page {

    @FindBy(xpath = ".//div[@class='inventory_item_img']")
    private WebElement productImage;

    @FindBy(xpath = ".//div[@class='inventory_item_name ']")
    private WebElement productTitle;

    @FindBy(xpath = ".//div[@class='inventory_item_desc']")
    private WebElement productDescription;

    @FindBy(xpath = ".//div[@class='inventory_item_price']")
    private WebElement productPrice;

    @FindBy(xpath = ".//button[contains(@data-test,'add-to-cart')]")
    private WebElement addToCartButton;

    public ProductCardBlock(WebElement productElement) {
        PageFactory.initElements(new DefaultElementLocatorFactory(productElement), this);
    }

}
