package pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{


    @FindBy(xpath = "//a[@href='/register']")
    private WebElement registerLink;

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement loginLink;

    @FindBy(xpath = "//span[@class='cart-label']")
    private WebElement shoppingCartLink;

    @FindBy(xpath = "//input[@id='small-searchterms']")
    private WebElement searchStoreField;

    @FindBy(className = "button-1 search-box-button")
    private WebElement searchButton;

    @FindBy(xpath = "//ul[@class='top-menu']//li//a[@href='/computers']")
    private WebElement computersTab;

    @FindBy(xpath = "//ul[@class='top-menu']//li//a[@href='/electronics']")
    private WebElement electronicsTab;

    @FindBy(xpath = "//ul[@class='top-menu']//li//a[@href='/apparel']")
    private WebElement apparelTab;

    @FindBy(xpath = "//ul[@class='top-menu']//li//a[@href='/digital-downloads']")
    private WebElement digitalDownloadsTab;

    @FindBy(xpath = "//ul[@class='top-menu']//li//a[@href='/books']")
    private WebElement booksTab;

    @FindBy(xpath = "//ul[@class='top-menu']//li//a[@href='/jewelry']")
    private WebElement jewelryTab;

    @FindBy(xpath = "//ul[@class='top-menu']//li//a[@href='/gift-cards']")
    private WebElement giftCardsTab;


    public void clickOnRegisterLink() {
        registerLink.click();
    }

    public void clickOnLoginLink() {
        loginLink.click();
    }

    public void clickOnShoppingCartLink() {
        shoppingCartLink.click();
    }

    public void enterValueToSearchStoreField(String item) {
        searchStoreField.sendKeys(item);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void clickOnComputersTab() {
        computersTab.click();
    }

    public void clickOnElectronicsTab() {
        electronicsTab.click();
    }

    public void clickOnApparelTab() {
        apparelTab.click();
    }

    public void clickOnDigitalDownloadTab() {
        digitalDownloadsTab.click();
    }

    public void clickOnBooksTab() {
        booksTab.click();
    }

    public void clickOnJewelryTab() {
        jewelryTab.click();
    }

    public void clickOnGiftCardsTab() {
        giftCardsTab.click();
    }

}

