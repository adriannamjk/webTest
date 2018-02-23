package pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsPage{

    @FindBy(id = "departure-link-e6045a48-21b6-4f17-8ca0-b91ec63ac28a")
    private WebElement departureCityField;

    @FindBy (linkText = "London")
    private WebElement departureCityFromDropdownList;

    @FindBy(id = "arrival-link-e6045a48-21b6-4f17-8ca0-b91ec63ac28a")
    private WebElement arrivalCityField;

    @FindBy (linkText = "Dubai")
    private WebElement arrivalCityFromDropdownList;

    @FindBy(id = "depart-date-link-e6045a48-21b6-4f17-8ca0-b91ec63ac28a")
    private WebElement departDateField;

    @FindBy(linkText = "26")
    private WebElement departDate;

    @FindBy(id = "return-date-link-e6045a48-21b6-4f17-8ca0-b91ec63ac28a")
    private WebElement returnDateField;

    @FindBy(linkText = "28")
    private WebElement returnDate;

    @FindBy(linkText = "More options")
    private WebElement moreOptionsButton;

    @FindBy(id = "preferred-cabin")
    private WebElement preferredCabinDropdown;

    @FindBy(linkText = "Premium")
    private WebElement preferredCabin;

    @FindBy(id = "search-for-flights-button")
    private WebElement searchButton;



    public void chooseDepartureCityFromList() {
        departDateField.click();
        departureCityFromDropdownList.click();
    }


    public void chooseArrivalCityFromList() {
        arrivalCityField.click();
        arrivalCityFromDropdownList.click();
    }

    public void chooseDepartureDate() {
        departDateField.click();
        departDate.click();
    }

    public void chooseReturnDate() {
        returnDateField.click();
        returnDate.click();
    }

    public void clickOnMoreOptions() {
        moreOptionsButton.click();
    }

    public void choosePreferredCabins() {
        preferredCabinDropdown.click();
        preferredCabin.click();
    }

    public void searchFlight() {
        searchButton.click();
    }




    /*@FindBy(xpath = "")
    private WebElement firstFlight;

    public boolean isFlightVisible(){
        return firstFlight.isDisplayed();
    }*/

}
