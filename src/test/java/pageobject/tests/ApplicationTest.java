package pageobject.tests;


import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageobject.pages.*;
import utils.driver.WebDriverCreators;
import utils.driver.WebDriverProvider;
import utils.waits.CustomWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class ApplicationTest {

    private static final String PAGE_URL = "http://demo.nopcommerce.com/";

    private WebDriver driver;
    private CustomWait customWait;

    private HomePage homePage;
    private LoginPage loginPage;
    private LoggedUserPage loggedUserPage;
    private RegistrationPage registrationPage;
    private ItemPage itemPage;
    private ShoppingCartPage shoppingCartPage;


    @Before
    public void setUp() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        customWait = new CustomWait(driver);
        driver.manage().window().maximize();

        homePage = PageFactory.initElements(driver,HomePage.class);
        loginPage = PageFactory.initElements(driver,LoginPage.class);
        registrationPage = PageFactory.initElements(driver,RegistrationPage.class);
        itemPage = PageFactory.initElements(driver,ItemPage.class);
        loggedUserPage = PageFactory.initElements(driver,LoggedUserPage.class);
        shoppingCartPage = PageFactory.initElements(driver,ShoppingCartPage.class);

        driver.get(PAGE_URL);
    }


    @Test
    public void loginTest(){

        String email = "majewska.adrianna@wp.pl";
        String password = "ada1992";

        homePage.clickOnLoginLink();
        loginPage.enterCredentials(email,password);
        loginPage.clickOnLogInButton();

        WebElement myAccount = driver.findElement(By.xpath("//div[@class='header-links']//ul//li//a[@href='/customer/info']"));
        customWait.waitForElementToBeClickable(myAccount);
        assertTrue("Login failed", loggedUserPage.isUserLogged());
    }


    @Test
    public void registrationTest(){

        String firstName = "Adr";
        String lastName = "Mjk";
        String email = "majewska.adrianna@wp.pl";
        String password = "ada1992";
        String confirmationPassword = password;

        homePage.clickOnRegisterLink();
        registrationPage.inputPersonalDetailsForm(firstName,lastName,email);
        registrationPage.inputPassword(password,confirmationPassword);
        registrationPage.clickOnRegisterButton();

        assertTrue("Registration failed",registrationPage.isUserRegistered());
    }


    @Test
    public void searchTest() {

        String item = "Apple";

        homePage.enterValueToSearchStoreField(item);
        homePage.clickOnSearchButton();

        assertThat(itemPage.isItemPageDisplay()).as("Searching is not working").isTrue();
    }


    @Test
    public void tabTest() {

        List<WebElement> listOfMenuElements = driver.findElements(By.className("primary-nav col-lg-7 navbar navbar-default"));
        List<String> listOfTexts = new ArrayList<>();

        boolean doesContain = false;

        for (WebElement e : listOfMenuElements){
            listOfTexts.add(e.getText());
        }

        List<String> elements = Arrays.asList("HOME", "WEB TEST", "O PROJEKCIE", "KONTAKT");
        doesContain = listOfTexts.containsAll(elements);

        assertTrue("Element doesn't exist", doesContain);

    }


    @Test
    public void addToShoppingCartTest() {

        homePage.clickOnBooksTab();
        itemPage.addToCartButton.click();

        shoppingCartPage.getAmountOfShoppingCart();

    }


    @After
    public void tearDown() {
        driver.close();
    }


}
