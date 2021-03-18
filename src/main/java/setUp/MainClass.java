package setUp;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://dev.watkins-minerva.com/login");
        FormManager loginPage = new FormManager(driver);
        loginPage.setField("//*[@id=\"username\"]", "kateryna.ozer@calaton.systems");
        loginPage.setField("//*[@id=\"password\"]", "Ks82@vnauhd#a");
        loginPage.pressButton("//input[@type='submit']");
        Thread.sleep(60000L);
        loginPage.pressButton("/html/body/div[1]/div/div/div/form/div/div[1]/div[2]/div[2]/input");
    }
}