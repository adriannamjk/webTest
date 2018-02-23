package pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{

    private static final String USER_NAME = "DVhbCERv";


    @FindBy(xpath = "//div[@class='form-group']//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit'][contains(text(),'Login')]")
    private WebElement loginButton;


    public void entryEmail(String email){
        emailField.sendKeys(email);
    }

    public void entryPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickOnLogin() {
        loginButton.click();
    }
}
