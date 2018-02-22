package pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{

    @FindBy(className = "dropdown-toggle go-text-right")
    private WebElement myAccountLinkElement;

    @FindBy(className = "go-text-right")
    private WebElement loginLinkElement;

    @FindBy(xpath = "//span[contains(text(),'Hotels')]")
    private WebElement hotelsLinkElement;

    @FindBy(xpath = "//span[contains(text(),'Flights')]")
    private WebElement flightsLinkElement;


    public void clickOnMyAccount() {
        myAccountLinkElement.click();
    }

    public void clickOnHotelsLink() {
        hotelsLinkElement.click();
    }

    public void clickOnFlightsLink() {
        flightsLinkElement.click();
    }

// nie wiem jak rozwiązać problem logowania, jeżeli jest tam lista rozwijana
// jak nazwac test sprawdzający wszystkie elementy menu? przycisk button w hotelach?
// jak przetestować wyszukiwanie lotów?

}
