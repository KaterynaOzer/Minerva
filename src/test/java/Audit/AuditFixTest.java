package Audit;

import AuditPage.AuditPage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import setUp.ContributorPage;
import setUp.FormManager;

public class AuditFixTest {
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
    public void AuditErrorTest() {
        int[] editionNumbers = new int[]{3, 6, 1444};
        for (int i = 0; i < editionNumbers.length; i++) {
            driver.get("http://dev.watkins-minerva.com/edition/" + editionNumbers[i] + "/audit");
            String status = driver.getPageSource().contains("404") ? " doesn't work" : " works";
            System.out.println("Edition " + editionNumbers[i] + status);
        }
    }
}