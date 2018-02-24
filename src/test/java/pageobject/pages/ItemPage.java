package pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage {

    @FindBy(xpath = "//html//div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")
    public WebElement addToCartButton;


    public boolean isItemPageDisplay() {
        return addToCartButton.isDisplayed();
    }
}
