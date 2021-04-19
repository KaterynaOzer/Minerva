package audit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuditPage {

    private WebDriver driver;
    private static AuditPage auditPage;

    public AuditPage(WebDriver driver){
        this.driver = driver;
    }

        private By heading = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]");

        public String getHeadingText(){
        return driver.findElement(heading).getText();
    }






}
