package ddt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobject.BMIpage.BmiCalculatedPage;
import pageobject.BMIpage.BmiOnlinepage;
import utils.driver.WebDriverCreators;
import utils.driver.WebDriverProvider;
import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(value = Parameterized.class)
public class BMITestWithJUnit {

    private static final String PAGE_URL = "http://bmi-online.pl/";

    private WebDriver driver;

    private BmiOnlinepage bmiOnlinepage;
    private BmiCalculatedPage bmiCalculatedPage;

    private String gender;
    private String weight;
    private String height;
    private String result;



@Parameterized.Parameters
    public static Collection testDataForBmiCalculating() {
        return Arrays.asList(
             new String[] {"jan12345", "pass12345", "Jan", "Nowak", "505505505", "jannowak@gmail.com", "ul. Grunwaldzka 452",
                            "Mieszkanie nr 12", "Gdansk", "Pomorskie", "12345", "POLAND"},
             new String[] {"John33", "fdser", "John", "Snow", "111222333", "john@gmail.com", "ul. Pomorska 222",
                            "Mieszkanie nr 33", "Gdansk", "Pomorskie", "12345", "POLAND"},
             new String[] {"mich2", "wert555", "Michal", "Wozniak", "303987345", "mich3@gmail.com", "ul. Piastowska 3",
                            "Mieszkanie nr 132", "Gdansk", "Pomorskie", "12345", "POLAND"});
        }

        public BMITestWithJUnit(String gender, String weight, String height, String result) {
            this.gender = gender;
            this.weight = weight;
            this.height = height;
            this.result = result;

        }

        @Before
        public void setUp() {
            driver = new WebDriverProvider(WebDriverCreators.FIREFOX_GECKO).getDriver();
            driver.manage().window().maximize();

            bmiCalculatedPage = PageFactory.initElements(driver, BmiCalculatedPage.class);
            bmiOnlinepage = PageFactory.initElements(driver, BmiOnlinepage.class);

            driver.get(PAGE_URL);
        }

        @Test
        public void bmiCalculatingTest() {

            bmiOnlinepage.chooseGender(gender);
            bmiOnlinepage.enterWeight(weight);
            bmiOnlinepage.enterHeight(height);
            bmiOnlinepage.clickOnObliczButton();


            assertThat(bmiCalculatedPage.getTheResult()).as("Result is wrong").isEqualTo(result);
        }

        @After
        public void tearDown() {
            driver.close();
        }
    }

