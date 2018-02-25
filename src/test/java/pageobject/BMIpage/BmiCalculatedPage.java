package pageobject.BMIpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BmiCalculatedPage {

    @FindBy(linkText = "Oblicz ponownie")
    private WebElement obliczPonownieButton;

    @FindBy(xpath = "//div[1]/h5[1]/strong[1]")
    private WebElement resultOfCalculating;



    public boolean wasBmiCalculated(){
        return obliczPonownieButton.isDisplayed();
    }

    public String getTheResult() {
       return resultOfCalculating.getText();
    }
}
