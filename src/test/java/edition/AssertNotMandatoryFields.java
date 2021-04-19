package edition;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AssertNotMandatoryFields {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://dev.watkins-minerva.com/login");
        FormManager formManager = new FormManager(driver);
        formManager.setField("//*[@id=\"username\"]", "kateryna.ozer@calaton.systems");
        formManager.setField("//*[@id=\"password\"]", "Ks82@vnauhd#a");
        formManager.pressButton("//input[@type='submit']");
        Thread.sleep(60000);

        formManager.pressButton("/html/body/div[1]/div/div/div/form/div/div[1]/div[2]/div[2]/input");
    }
    @Test
    public void CheckRelatedEdition() {
        NotMandatoryFieldsForCopying notMandatoryFieldsForCopying = new NotMandatoryFieldsForCopying(driver);
        notMandatoryFieldsForCopying.AssertFieldsInRelatedEdition();

    }
    @Test
    public void CheckOnixRelatedEdition() {
        NotMandatoryFieldsForCopying notMandatoryFieldsForCopying = new NotMandatoryFieldsForCopying(driver);
        notMandatoryFieldsForCopying.AssertOnixFieldsInRelatedEdition();
    }
}
