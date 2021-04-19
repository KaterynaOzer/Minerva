package edition;

import org.openqa.selenium.support.ui.Select;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class NotMandatoryFieldsForCopying {
    private WebDriver driver;
    public FormManager formManager;

    public NotMandatoryFieldsForCopying(WebDriver driver) {
        this.driver = driver;
    }

    // not mandatory fields for copying to related edition (blue color);

    private By EditionTypeDropDown = By.id("edition-type");
    private By EditionBindDropDown = By.id("edition-bind");
    private By BindingDropdown = By.id("binding-details");
    private By EditionNumber = By.id("edition-number");
    private By PocketEditionCheckBox = By.id("pocket-edition");
    private By MultiPartCheckBox = By.id("multipart");
    private By NumberOfEditions = By.id("number-of-items");
    private By PreviousEditionDropdown = By.id("previous-edition");
    private By AiCoverReadyDate = By.id("aiCoverReadyDate");
    private By AudienceDropdown = By.id("audience");
    private By PublishingStatusDropdown = By.id("publishing-status");
    private By MarketingPointsField = By.id("marketingPoints");
    private By PublicityPointsField = By.id("publicityPoints");
    private By HeightField = By.id("book-format-height");
    private By WidthField = By.id("book-format-width");
    private By DepthField = By.id("book-format-depth");
    private By WeightField = By.id("book-format-weight");
    private By ApproximateWordCount = By.id("book-format-word-count");
    private By SpecialTreatmentsField = By.id("book-format-special-treatment");
    private By MonoColourDropdown = By.id("mono");
    private By IllustratedCheckBox = By.id("illustrated1");
    private By IllustrationDetailsField = By.id("illustration-details");
    private By ReprintNotesField = By.id("reprint-notes");
    //Onix Listing tab
    private By OnixEditionTypeDropdown = By.id("edition-type");
    private By RelatedEditionIsbnDropdown = By.id("related-isbn");
    private By CountryOfManufactureDropdown = By.id("country-of-manufacture-st");
    private By WorldWideDropdown = By.id("worldwide-st");
    private By UnitedKingdomDropdown = By.id("united-kingdom-st");
    private By AustraliaDropdown = By.id("australia-st");
    private By SaveOnixButton = By.xpath("//div/input[@name='buttonAction']");
    private By CopyToRelatedEditionCheckBox = By.id("2941");
    private By SaveButton = By.id("pre-submit-all-bottom");

    public void NotMandatoryFieldsBasicInformation(String testNumber, String testText, String aiCoverReadyDate) throws InterruptedException {
        driver.get("http://dev.watkins-minerva.com/edition/2940/edit");
        FormManager formManager = new FormManager(driver);
        driver.findElement(EditionTypeDropDown).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[1]/div[1]/select/option[2]")).click();
        driver.findElement(EditionBindDropDown).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[2]/div[1]/select/option[3]")).click();
        driver.findElement(BindingDropdown).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[2]/div[2]/select/option[2]")).click();
        driver.findElement(EditionNumber).sendKeys(testNumber);
        driver.findElement(PocketEditionCheckBox).click();
        driver.findElement(MultiPartCheckBox).click();
        driver.findElement(NumberOfEditions).sendKeys(testNumber);
        driver.findElement(PreviousEditionDropdown).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[6]/div/select/option[2]")).click();
        driver.findElement(AiCoverReadyDate).sendKeys(aiCoverReadyDate);
        driver.findElement(AudienceDropdown).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[8]/div[2]/select/option[2]")).click();
        driver.findElement(PublishingStatusDropdown).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[8]/div[3]/select/option[1]")).click();
        driver.findElement(MarketingPointsField).sendKeys(testText);
        driver.findElement(PublicityPointsField).sendKeys(testText);
        driver.findElement(HeightField).sendKeys(testNumber);
        driver.findElement(WeightField).sendKeys(testNumber);
        driver.findElement(WidthField).sendKeys(testNumber);
        driver.findElement(ApproximateWordCount).sendKeys(testNumber);
        driver.findElement(DepthField).sendKeys(testNumber);
        driver.findElement(SpecialTreatmentsField).sendKeys(testText);
        driver.findElement(MonoColourDropdown).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[7]/div[2]/div[1]/div[1]/select/option[2]")).click();
        driver.findElement(IllustratedCheckBox).click();
        driver.findElement(ReprintNotesField).sendKeys(testText);
        driver.findElement(IllustrationDetailsField).sendKeys(testText);


        driver.findElement(SaveButton).click();
        formManager.switchToConfirmSavingWindow();
        driver.findElement(CopyToRelatedEditionCheckBox).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[3]/button[2]")).click();

    }

    public void NotMandatoryOnixFields() throws InterruptedException {
        driver.get("http://dev.watkins-minerva.com/edition/2940/onix-listing");
        FormManager formManager = new FormManager(driver);

        driver.findElement(OnixEditionTypeDropdown).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/select/option[2]")).click();

        driver.findElement(RelatedEditionIsbnDropdown).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/select/option[2]")).click();

        driver.findElement(CountryOfManufactureDropdown).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[6]/div/select/option[3]")).click();

        driver.findElement(WorldWideDropdown).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/select/option[2]")).click();

        driver.findElement(UnitedKingdomDropdown).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div[1]/div[1]/select/option[2]")).click();

        driver.findElement(AustraliaDropdown).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div[1]/div[2]/select/option[2]")).click();
        driver.findElement(SaveOnixButton).click();

        formManager.switchToConfirmSavingWindow();
        driver.findElement(CopyToRelatedEditionCheckBox).click();
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[2]")).click();
    }

    public void AssertFieldsInRelatedEdition() {
        driver.get("http://dev.watkins-minerva.com/edition/2941/edit");

        Select editionTypeDropdown = new Select(driver.findElement(EditionTypeDropDown));
        String selectedOptionEditionTypeDropdown = editionTypeDropdown.getFirstSelectedOption().getText();
        if (selectedOptionEditionTypeDropdown.equals("WEL")) {
            System.out.println("EditionTypeDropDown failed");
        }
        Select editionBindDropdown = new Select(driver.findElement(EditionBindDropDown));
        String selectedOptionEditionBindDropdown = editionBindDropdown.getFirstSelectedOption().getText();
        if (selectedOptionEditionBindDropdown.equals("Paperback")) {
            System.out.println("EditionBindDropDown failed");
        }
        Select bindingDropdown = new Select(driver.findElement(BindingDropdown));
        String selectedOptionBindingDropdown = bindingDropdown.getFirstSelectedOption().getText();
        if (selectedOptionBindingDropdown.equals("PB no flaps")) {
            System.out.println("EditionBindDropDown failed");
        }
        Select previousEditionDropdown = new Select(driver.findElement(PreviousEditionDropdown));
        String selectedOptionPreviousEditionDropdown = previousEditionDropdown.getFirstSelectedOption().getText();
        if (selectedOptionPreviousEditionDropdown != null) {
            System.out.println("PreviousEditionDropdown failed");
        }
        By[] textFieldsElements = new By[]{MarketingPointsField, PublicityPointsField, ReprintNotesField,
                SpecialTreatmentsField, IllustrationDetailsField};
        String compareText = "QaTest";
        for (By textElement : textFieldsElements) {
            Assert.assertNotEquals(compareText, driver.findElement(textElement).getAttribute("value"));
        }

        By[] numberFieldsElements = new By[]{EditionNumber, NumberOfEditions, WeightField, HeightField, WidthField, DepthField, ApproximateWordCount};
        String compareNumber = "100";
        for (By numberElement : numberFieldsElements) {
            Assert.assertNotEquals(compareNumber, driver.findElement(numberElement).getAttribute("value"));
        }

        List<WebElement> checkBoxElements = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (int i = 0; i < checkBoxElements.size() - 1; i++) {
            String str = checkBoxElements.get(i).getAttribute("checked");
            if (str != null) {
                System.out.println(checkBoxElements.get(i) + "failed");
            }
        }
    }
    public void AssertOnixFieldsInRelatedEdition() {
        driver.get("http://dev.watkins-minerva.com/edition/2941/onix-listing");

        Select countryDropdown = new Select(driver.findElement(CountryOfManufactureDropdown));
        String selectedCountry = countryDropdown.getFirstSelectedOption().getText();
        if (selectedCountry.equals("Andorra (AD)")){
            System.out.println("CountryOfManufactureDropdown failed");
        }

        Select australiaDropdown = new Select(driver.findElement(AustraliaDropdown));
        String selectedOptionAustralia = australiaDropdown.getFirstSelectedOption().getText();
        if (selectedOptionAustralia.equals("None")){
            System.out.println("AustraliaDropdown failed");
        }
        Select unitedKingdomDropdown = new Select(driver.findElement(UnitedKingdomDropdown));
        String selectedOptionUnitedKingdom = unitedKingdomDropdown.getFirstSelectedOption().getText();
        if (selectedOptionUnitedKingdom.equals("None")){
            System.out.println("UnitedKingdomDropdown failed");
        }
        Select worldWideDropdown = new Select(driver.findElement(WorldWideDropdown));
        String selectedOptionWorldWide = worldWideDropdown.getFirstSelectedOption().getText();
        if (selectedOptionWorldWide.equals("None")){
            System.out.println("WorldWideDropdown failed");
        }
        Select relatedEditionDropdown = new Select(driver.findElement(RelatedEditionIsbnDropdown));
        String selectedOptionRelatedEdition = relatedEditionDropdown.getFirstSelectedOption().getText();
        if (selectedOptionRelatedEdition.equals("9781786780393")){
            System.out.println("RelatedEditionIsbnDropdown failed");
        }
        Select onixEditionTypeDropdown = new Select(driver.findElement(OnixEditionTypeDropdown));
        String selectedOptionOnixEditionType = onixEditionTypeDropdown.getFirstSelectedOption().getText();
        if (!selectedOptionOnixEditionType.equals("New edition")) {
            System.out.println("OnixEditionTypeDropdown failed");
        }
    }
}