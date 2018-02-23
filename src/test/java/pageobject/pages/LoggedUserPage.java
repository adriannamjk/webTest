package pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoggedUserPage{

    @FindBy(xpath = "//div[@class='go-left']")
    private WebElement myProfileButton;

    public boolean isUserLogged() {
       return myProfileButton.isDisplayed();
    }
}
