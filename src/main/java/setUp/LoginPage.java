package setUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {

    private WebDriver driver;
    public LoginPage (WebDriver driver){
        this.driver = driver;
    }
    private By userNameField = By.xpath("//*[@id=\"username\"]");
    private By passwordField = By.xpath("//*[@id=\"password\"]");
    private By submitButton = By.xpath("//input[@type='submit']");

    public LoginPage typeUsername(String userName) {
        driver.findElement(userNameField).sendKeys(userName);
        return this;
    }
    public LoginPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }


    public void register (String userName, String password) {
        this.typeUsername(userName);
        this.typePassword(password);
        driver.findElement(submitButton).click();
    }
}
