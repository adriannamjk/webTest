package pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoggedUserPage{

    @FindBy(xpath = "//div[@class='header-links']//ul//li//a[@href='/customer/info']")
    private WebElement myAccountTab;

    public boolean isUserLogged() {
       return myAccountTab.isDisplayed();
    }
}
