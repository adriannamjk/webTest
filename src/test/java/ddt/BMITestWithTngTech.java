package ddt;


import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobject.BMIpage.BmiCalculatedPage;
import pageobject.BMIpage.BmiOnlinepage;
import utils.driver.WebDriverCreators;
import utils.driver.WebDriverProvider;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(DataProviderRunner.class)
public class BMITestWithTngTech {

    private static final String PAGE_URL = "http://bmi-online.pl/";

    private WebDriver driver;

    private BmiOnlinepage bmiOnlinepage;
    private BmiCalculatedPage bmiCalculatedPage;


    @DataProvider
    public static Object[][] testDataForBmiCalculating() {
        return new String[][] {
                new String[]{"K","40", "160", "15.63"},
                new String[]{"K","45", "160", "17.58"},
                new String[]{"K","42", "160", "16.41"},
                new String[]{"K","50", "160", "19.53"},
                new String[]{"K","70", "160", "27.34"},
                new String[]{"K","80", "160", "31.25"},
                new String[]{"K","90", "160", "35.16"},
                new String[]{"K","120", "160", "46.88"},

                new String[]{"M","40", "160", "15.63"},
                new String[]{"M","45", "160", "17.58"},
                new String[]{"M","42", "160", "16.41"},
                new String[]{"M","50", "160", "19.53"},
                new String[]{"M","70", "160", "27.34"},
                new String[]{"M","80", "160", "31.25"},
                new String[]{"M","90", "160", "35.16"},
                new String[]{"M","120", "160", "46.88"},
        };
    }

    @Before
    public void setUp() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        driver.manage().window().maximize();

        bmiOnlinepage = PageFactory.initElements(driver, BmiOnlinepage.class);
        bmiCalculatedPage = PageFactory.initElements(driver, BmiCalculatedPage.class);

        driver.get(PAGE_URL);
    }

    @Test
    @UseDataProvider("testDataForBmiCalculating")
    public void bmiCalculatingTest(String gender, String weight, String height, String result) {

        bmiOnlinepage.chooseGender(gender);
        bmiOnlinepage.enterWeight(weight);
        bmiOnlinepage.enterHeight(height);
        bmiOnlinepage.clickOnObliczButton();


        //assertThat(bmiCalculatedPage.wasBmiCalculated()).as("BMI was not calculated").isTrue();
        assertThat(bmiCalculatedPage.getTheResult()).as("Result is wrong").isEqualTo(result);
    }

    @After
    public void tearDown() {
        driver.close();
    }
}

