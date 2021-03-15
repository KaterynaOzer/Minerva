package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormManager {
    private final WebDriver driver;

    public FormManager(WebDriver driver) {
        this.driver = driver;
    }

    public void setField(String fieldXPath, String fieldValue) {
        WebElement field = driver.findElement(By.xpath(fieldXPath));
        field.sendKeys(fieldValue);
        WebDriverWait wait = new WebDriverWait(driver, 5);
    }

    public void pressButton(String buttonXPAth) {
        WebElement button = driver.findElement(By.xpath(buttonXPAth));
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
    }

    public void setSelector(String selectorXPath, String selectorValue) {
        WebElement selector = driver.findElement(By.xpath(selectorXPath));
        selector.sendKeys(selectorValue);
    }
}
