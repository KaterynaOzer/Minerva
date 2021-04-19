package edition;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CopyNotMandatoryFieldsTest {
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
    public void SetNotMandatoryFields() throws InterruptedException {
        FormManager formManager = new FormManager(driver);
        NotMandatoryFieldsForCopying notmandatoryFieldsForCopying = new NotMandatoryFieldsForCopying(driver);

        notmandatoryFieldsForCopying.NotMandatoryFieldsBasicInformation("100", "QaTest", "08/04/2021");
        Thread.sleep(2000);
    }
    @Test
    public void SetNotMandatoryFieldsOnix() throws InterruptedException{

        NotMandatoryFieldsForCopying notmandatoryFieldsForCopying = new NotMandatoryFieldsForCopying(driver);
        notmandatoryFieldsForCopying.NotMandatoryOnixFields();
        Thread.sleep(2000);
    }


}
