package pageobject.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobject.pages.FlightsPage;
import pageobject.pages.LoginPage;

public class LoginTest{

    private LoginPage loginPage;
    private FlightsPage flightsPage;
    private final static String email = "mail.com";

    public LoginTest(WebDriver driver){
        super();
    }

    @Test
    public void loginTest(){
        loginPage.insertEmailTextbox(email);

        assertThat(flightsPage.isFlightVisible()).as("Flight is not visible").isTrue();

    }

}
