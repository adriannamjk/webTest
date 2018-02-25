package pageobject.BMIpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BmiOnlinepage {


    @FindBy(xpath = "//label[@for='bmi_gender_m']//span[@class='radio-btn']")
    private WebElement femaleRadioButton;

    @FindBy(xpath = "//label[@for='bmi_gender_f']//span[@class='radio-btn']")
    private WebElement maleRadioButton;

    @FindBy(xpath = "//input[@name='weight']")
    private WebElement weightField;

    @FindBy(name = "height")
    private WebElement heightField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement obliczButton;


    public void chooseGender(String gender) {
        if(gender.equals("K")){
            femaleRadioButton.click();}
        else if (gender.equals("M")){
            maleRadioButton.click();
        }
    }

    public void enterWeight(String weight) {
        weightField.sendKeys(weight);
    }

    public void enterHeight(String height) {
        heightField.sendKeys(height);
    }

    public void clickOnObliczButton() {
        obliczButton.click();
    }

}
