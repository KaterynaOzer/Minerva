package edition;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CopyMandatoryFieldsTest {
    private static WebDriver driver;
    public FormManager formManager;
    private static MandatoryFieldsForCopying mandatoryFieldsForCopying;

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
    public void SetMandatoryFields() throws InterruptedException {
        driver.get("http://dev.watkins-minerva.com/edition/2940/edit");

        Thread.sleep(2000);
        FormManager formManager = new FormManager(driver);
        MandatoryFieldsForCopying mandatoryFieldsForCopying = new MandatoryFieldsForCopying(driver);

        mandatoryFieldsForCopying.MandatoryFieldsSetBasicInformation("QaTest", "100", "08/04/2021");
        Thread.sleep(2000);
    }
    @Test
            public void SetMandatoryFieldsEndorsement() throws InterruptedException {
        MandatoryFieldsForCopying mandatoryFieldsForCopying = new MandatoryFieldsForCopying(driver);
        mandatoryFieldsForCopying.MandatoryFieldsSetEndorsement();
        Thread.sleep(2000);
    }
    @Test
            public void SetMandatoryFieldsContributors() throws InterruptedException {
        MandatoryFieldsForCopying mandatoryFieldsForCopying = new MandatoryFieldsForCopying(driver);
        mandatoryFieldsForCopying.MandatoryFieldsContributors("AutoTestName");
        Thread.sleep(2000);
    }
    @Test
            public void SetMandatoryFieldsOnix() throws InterruptedException{
        MandatoryFieldsForCopying mandatoryFieldsForCopying = new MandatoryFieldsForCopying(driver);
        mandatoryFieldsForCopying.MandatoryFieldsOnix();
        Thread.sleep(2000);
        }


    }


