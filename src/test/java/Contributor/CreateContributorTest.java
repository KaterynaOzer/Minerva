package Contributor;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import setUp.ContributorPage;
import setUp.FormManager;
import org.openqa.selenium.chrome.ChromeDriver;
import setUp.HomePage;

import static java.lang.Thread.sleep;


public class CreateContributorTest {
    static WebDriver driver;

    @BeforeClass

    public static void setUp(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://dev.watkins-minerva.com/login");


        FormManager loginPage = new FormManager(driver);
        loginPage.setField("//*[@id=\"username\"]", "kateryna.ozer@calaton.systems");
        loginPage.setField("//*[@id=\"password\"]", "Ks82@vnauhd#a");
        loginPage.pressButton("//input[@type='submit']");
        Thread.sleep(60000);

        loginPage.pressButton("/html/body/div[1]/div/div/div/form/div/div[1]/div[2]/div[2]/input");
    }

    @Test
    public void myFirstTest(){

    }
    @Test









    @AfterClass

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


