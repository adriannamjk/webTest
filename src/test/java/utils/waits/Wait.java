package utils.waits;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Wait{

    public void ExplicitWait(WebDriver driver, String text) {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.linkText(text)));
    }

    public void ImplicitWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

//ExplicitWait(driver, "...");
//ImplicitWait(driver);