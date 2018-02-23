package pageobject.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ElementsOfMenuTest{

    private WebDriver driver;

    @Test
    public void checkElementOfMenu() {
        List listOfMenuElements = driver.findElements(By.className("loader"));
    }
}
