package pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {


    @FindBy(id = "gender-male")
    private WebElement genderRadioButton;

    @FindBy(id = "FirstName")
    private WebElement firstNameField;

    @FindBy(id = "LastName")
    private WebElement lastNameField;

    @FindBy(id = "Email")
    private WebElement emailField;

    @FindBy(id = "Password")
    private WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    private WebElement confirmPasswordField;

    @FindBy(id = "register-button")
    private WebElement registerButton;

    @FindBy(linkText = "Your registration completed")
    private WebElement textAfterRegistration;


    public void inputPersonalDetailsForm(String firstName, String lastName, String email) {
        genderRadioButton.click();
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
    }

    public void inputPassword(String password, String confirmationPassword) {
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(confirmationPassword);
    }


    public void clickOnRegisterButton() {
        registerButton.click();
    }

    public boolean isUserRegistered() {
        return textAfterRegistration.isDisplayed();
    }

}















    /*public void enterFirstName() {
        firstNameField.sendKeys();
    }

    public void enterLastName() {
        lastNameField.sendKeys();
    }

    public void enterEmail() {
        emailField.sendKeys();
    }

    public void enterPassword() {
        passwordField.sendKeys();
    }

    public void enterConfirmationPassword() {
        confirmPasswordField.sendKeys();
    }*/