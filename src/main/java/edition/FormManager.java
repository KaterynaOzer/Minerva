package edition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

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
    public void pressButtonID(String buttonID) {
        WebElement button = driver.findElement(By.xpath(buttonID));
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
    }

    public void setSelector(String selectorXPath, String selectorValue) {
        WebElement selector = driver.findElement(By.xpath(selectorXPath));
        selector.sendKeys(selectorValue);
    }
    public String getErrorText(String errorTextXpath){

        return driver.findElement(By.xpath(errorTextXpath)).getText();
    }


    public void switchToConfirmSavingWindow() throws InterruptedException {
        String main = driver.getWindowHandle();
        int timeCount = 1;

        do {
            driver.getWindowHandles();
            Thread.sleep(200);
            timeCount++;
            if (timeCount > 50) {
                break;
            }
        }
        while (driver.getWindowHandles().size() == 1);
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(main)) {
                driver.switchTo().window(handle);
            }
        }

    }
    public void switchToiFrame (int frameIndex, By webElement, String fieldValue){
        driver.switchTo().frame(frameIndex);
        driver.findElement(webElement).sendKeys(fieldValue);
        driver.switchTo().parentFrame();
    }
    }

