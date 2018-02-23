package pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelPage{

    @FindBy(className = "btn btn-action loader loader btn-block")
    private WebElement detailsButton;


    private void clickDetailsButton() {
        detailsButton.click();
    }
}


