package edition;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AssertMandatoryFields {
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
    public void checkRelatedEdition() {
        MandatoryFieldsForCopying mandatoryFieldsForCopying = new MandatoryFieldsForCopying(driver);
        mandatoryFieldsForCopying.AssertMandatoryFieldsInRelatedEdition();
    }
//    @Test
//    public void checkOnixRelatedEdition(){
//        MandatoryFieldsForCopying mandatoryFieldsForCopying = new MandatoryFieldsForCopying(driver);
//        mandatoryFieldsForCopying.AssertMandatoryOnixFieldsInRelatedEdition();
//    }
//    @Test
//    public void checkEndorsementsRelatedEdition(){
//        MandatoryFieldsForCopying mandatoryFieldsForCopying = new MandatoryFieldsForCopying(driver);
//        mandatoryFieldsForCopying.AssertMandatoryEndorsementFieldsInRelatedEdition();
//    }
//    @Test
//    public void checkContributorsRelatedEdition(){
//        MandatoryFieldsForCopying mandatoryFieldsForCopying = new MandatoryFieldsForCopying(driver);
//        mandatoryFieldsForCopying.AssertMandatoryContributorFieldsInRelatedEdition();
//    }
}
