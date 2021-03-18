package Contributor;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import setUp.ContributorPage;
import setUp.FormManager;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.lang.Thread.sleep;


public class CreateContributorTest {
    private WebDriver driver;
    static FormManager formManager;
    private ContributorPage contributorPage;


    @Before

    public static void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://dev.watkins-minerva.com/login");
        FormManager formManager = new FormManager(driver);
        formManager.setField("//*[@id=\"username\"]", "kateryna.ozer@calaton.systems");
        formManager.setField("//*[@id=\"password\"]", "Ks82@vnauhd#a");
        formManager.pressButton("//input[@type='submit']");
        Thread.sleep(60000);

        formManager.pressButton("/html/body/div[1]/div/div/div/form/div/div[1]/div[2]/div[2]/input");
    }



    @After

    public static void tearDown() {
            if (driver != null) {
                driver.quit();

            }
    }



    @Test
    public void myFirstTest() throws InterruptedException {
        Thread.sleep(10000);
        driver.get("http://dev.watkins-minerva.com/contributor/create");
        contributorPage.CreateAContributor("Kateryna",
                "Ozer","",
                "", "03.10.1992",
                "", "test");
        contributorPage.clickSave();
    }
}
