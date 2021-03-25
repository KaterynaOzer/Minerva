package Contributor;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import setUp.ContributorPage;
import setUp.FormManager;
import org.openqa.selenium.chrome.ChromeDriver;
import setUp.HomePage;

import static java.lang.Thread.sleep;


public class CreateContributorTest {
    private static WebDriver driver;
    public FormManager formManager;
    private static ContributorPage contributorPage;



    @BeforeClass

    public static void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://dev.watkins-minerva.com/login");
        FormManager formManager = new FormManager(driver);
        formManager.setField("//*[@id=\"username\"]", "kateryna.ozer@calaton.systems");
        formManager.setField("//*[@id=\"password\"]", "Ks82@vnauhd#a");
        formManager.pressButton("//input[@type='submit']");
        Thread.sleep(60000);

        formManager.pressButton("/html/body/div[1]/div/div/div/form/div/div[1]/div[2]/div[2]/input");
    }


    @Test
    public void myFirstTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("http://dev.watkins-minerva.com/contributor/create");
        contributorPage = new ContributorPage(driver);
        contributorPage.CreateContributor("Lena",
                "Spirina",
                "N",
                "2",
                "12.03.1993",
                "9",
                "test bio");
        contributorPage.ContactInformation("0991193411",
                "1",
                "skype",
                "London", "London",
                "United Kingdom");
        contributorPage.Email("olena@gmail.com");
        contributorPage.SocialNetworks("facebook",
                "inst",
                "twitter",
                "mywebsite");
        contributorPage.PhotoCredit("text");
//        contributorPage.UploadPhoto();
//        Thread.sleep(1000);
        contributorPage.clickSave();

    }

    @AfterClass
    public static void DeleteContributor() throws InterruptedException {
        sleep(5000);
        driver.get("http://dev.watkins-minerva.com/search");
        FormManager formManager = new FormManager(driver);
        formManager.setField("/html/body/div[1]/div/div/div/form/div[1]/div/div/div/div/input", "Lena Spirina");
        formManager.pressButton("/html/body/div[1]/div/div/div/form/div[2]/div/input");
        //formManager.pressButton("//*[@id=\"toggle-contributors\"]/div/div/div[2]/div[2]/p[4]/span/a[4]");
        driver.findElement(By.xpath("//*[@id=\"toggle-contributors\"]/div/div/div[2]/div[2]/p[4]/span/a[4]")).click();
        formManager.pressButton("//*[@id=\"submit-all\"]");

        sleep(5000);
        formManager.setField("/html/body/div[1]/div/div/div/form/div[1]/div/div/div/div/input", "Lena Spirina");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        formManager.pressButton("/html/body/div[1]/div/div/div/form/div[2]/div/input");
        String warning = formManager.getErrorText("/html/body/div[1]/div/div/div/form/div/div/div[2]/div[1]");
        Assert.assertEquals("Nothing found.", warning);

        }

    public void tearDown(){
        driver.quit();
    }

   }