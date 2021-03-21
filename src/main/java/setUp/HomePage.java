package setUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public void CreateContributor(WebDriver driver) {
        this.driver = driver;
    }

    private By CreateContributorButton = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/ul/li[3]/a");
    private By SearchField = By.xpath("/html/body/div[1]/div/div/div/form/div[1]/div/div/div/div/input");



    public setUp.ContributorPage clickCreateContributorButton() {

        driver.findElement(CreateContributorButton).click();
        return new setUp.ContributorPage(driver);
    }
}