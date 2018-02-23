package pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{

    @FindBy(className = "dropdown-toggle go-text-right")
    private WebElement myAccountLink;

    @FindBy(className = "go-text-right")
    private WebElement loginLink;

    @FindBy(xpath = "//span[contains(text(),'Hotels')]")
    private WebElement hotelsLink;

    @FindBy(xpath = "//span[contains(text(),'Flights')]")
    private WebElement flightsLink;


    public void clickOnMyAccount() {
        myAccountLink.click();
    }

    public void clickOnLoginLink() {
        loginLink.click();
    }

    public void clickOnHotelsLink() {
        hotelsLink.click();
    }

    public void clickOnFlightsLink() {
        flightsLink.click();
    }
}
