package pageobject.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobject.pages.FlightsPage;
import pageobject.pages.HomePage;
import pageobject.pages.LoggedUserPage;
import pageobject.pages.LoginPage;
import utils.driver.WebDriverCreators;
import utils.driver.WebDriverProvider;
import static org.junit.Assert.assertTrue;

public class LoginTest{

    private static final String PAGE_URL = "https://www.phptravels.net/";
    private static final String EMAIL = "user@phptravels.com";
    private static final String PASSWORD = "demouser";

    private WebDriver driver;

    private HomePage homePage;
    private LoginPage loginPage;
    private LoggedUserPage loggedUserPage;
    private FlightsPage flightsPage;


    @Before
    public void setUp() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        driver.manage().window().maximize();

        homePage = PageFactory.initElements(driver,HomePage.class);
        loginPage = PageFactory.initElements(driver,LoginPage.class);

        driver.get(PAGE_URL);
    }


    @Test
    public void loginTest(){

        homePage.clickOnMyAccount();
        homePage.clickOnLoginLink();
        loginPage.entryEmail(EMAIL);
        loginPage.entryPassword(PASSWORD);
        loginPage.clickOnLogin();

        assertTrue("Login failed", loggedUserPage.isUserLogged());
    }


    @After
    public void tearDown() {
        driver.close();
    }
}
