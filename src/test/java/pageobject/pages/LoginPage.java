package pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{
    //https://www.phptravels.net/flightst
    //user@phptravels.com
    //demouser
    // findBy - email- wprowadzic , password- wprowadzic , przycisk login

    @FindBy(id = "email")
    private WebElement emailTextbox;

    public void insertEmailTextbox(String email){
        emailTextbox.sendKeys(email);
        emailTextbox.
    }


}
