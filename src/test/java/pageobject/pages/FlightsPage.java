package pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsPage{

    @FindBy(xpath = "")
    private WebElement firstFlight;

    public boolean isFlightVisible(){
        return firstFlight.isDisplayed();
    }

}
