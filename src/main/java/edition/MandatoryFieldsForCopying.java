package edition;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MandatoryFieldsForCopying {
    private WebDriver driver;
    public FormManager formManager;

    public MandatoryFieldsForCopying(WebDriver driver) {
        this.driver = driver;
    }

    //mandatory fields for copying to related edition (green color)
    private By ImprintDropDown = By.id("imprint");
    private By TitleField = By.id("title");
    private By SubTitleField = By.xpath("/html/body");
    private By UKpubDateField = By.id("pubDate");
    private By USpubDateField = By.id("pubDateUs");
    private By LanguageDropdown = By.id("language");
    private By PositioningStatementField = By.xpath("/html/body");
    private By SalesPointsField = By.xpath("/html/body");
    private By SynopsisField = By.xpath("/html/body");
    private By BICSubjects1Dropdown = By.id("firstBICSubject");
    private By BICSubjects2Dropdown = By.id("secondBICSubject");
    private By BICSubjects3Dropdown = By.id("thirdBICSubject");
    private By BISACSubjects1Dropdown = By.id("firstBISACSubject");
    private By BISACSubjects2Dropdown = By.id("secondBISACSubject");
    private By BISACSubjects3Dropdown = By.id("thirdBISACSubject");
    private By DiversityDiscoverabilityExperiencesCategoriesDropdown = By.id("experience-categories");
    private By DiversityDiscoverabilityDiversityCategoriesDropdown = By.id("diversity-categories");
    private By KeywordsField = By.xpath("/html/body/div/div[1]/div[2]/form/div[5]/div[2]/div[1]/div/div/input");
    private By ExtentField = By.id("book-format-extent");
    private By DropFilesHereToUpload = By.id("clickable-zone");
    private By BioField = By.xpath("/html/body");
    private By LocationField = By.id("location");
    private By SaveButton = By.id("pre-submit-all-bottom");
    //Endorsement tab
    private By EndorsementField = By.xpath("/html/body");
    private By SourceField = By.xpath("/html/body");
    private By PullQuoteField = By.xpath("/html/body");
    private By AddEndorsementButton = By.xpath("/html/body/div[1]/div/div[2]/fieldset/form/div[1]/div[2]/input");
    //Contributors tab
    private By NameField = By.xpath("//*[@id=\"command\"]/div[2]/input");
    private By SearchButton = By.xpath("//*[@id=\"command\"]/div[3]/button");
    private By ContributorDropdown = By.id("contributor-id");
    private By ContributorTypeDropdown = By.xpath("//*[@id=\"add-contributor\"]/div[1]/div[2]/select");
    private By IncludeAiCheckBox = By.id("includeInAI1");
    private By AddContributorButton = By.id("submit-all");
    //Onix Listing tab
    private By OnlineLongDescriptionField = By.xpath("/html/body");
    private By OnlineShortDescriptionField = By.xpath("/html/body");
    private By SaveOnixButton = By.xpath("//div/input[@name='buttonAction']");
    private By CopyToRelatedEditionCheckBox = By.id("2941");


    public void MandatoryFieldsSetBasicInformation(String testText, String testNumber,
                                                   String testDate) throws InterruptedException {

        FormManager formManager = new FormManager(driver);

        driver.findElement(TitleField).sendKeys(testText);
        driver.findElement(UKpubDateField).sendKeys(testDate);
        driver.findElement(USpubDateField).sendKeys(testDate);
        driver.findElement(KeywordsField).sendKeys(testText);
        driver.findElement(ExtentField).sendKeys(testNumber);
        driver.findElement(LocationField).sendKeys(testText);

        driver.findElement(ImprintDropDown).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[3]/div[2]/div[1]/div/select/option[4]")).click();
        driver.findElement(LanguageDropdown).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[8]/div[1]/select/option[2]")).click();

        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(BICSubjects1Dropdown)).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[13]/div/div/div[1]/div/select/option[8]")).click();
        actions.moveToElement(driver.findElement(BICSubjects2Dropdown)).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[13]/div/div/div[2]/div/select/option[8]")).click();
        actions.moveToElement(driver.findElement(BICSubjects3Dropdown)).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[13]/div/div/div[3]/div/select/option[8]")).click();

        actions.moveToElement(driver.findElement(BISACSubjects1Dropdown)).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[14]/div/div/div[1]/div/select/option[2]")).click();
        actions.moveToElement(driver.findElement(BISACSubjects2Dropdown)).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[14]/div/div/div[2]/div/select/option[2]")).click();
        actions.moveToElement(driver.findElement(BISACSubjects3Dropdown)).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[14]/div/div/div[3]/div/select/option[2]")).click();

        actions.moveToElement(driver.findElement(DiversityDiscoverabilityExperiencesCategoriesDropdown)).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[17]/div/div[2]/div/div/select/option[1]")).click();

        actions.moveToElement(driver.findElement(DiversityDiscoverabilityDiversityCategoriesDropdown)).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[4]/div[2]/div[18]/div/div[2]/div/div/select/option[1]")).click();

        formManager.switchToiFrame(0, SubTitleField, "QaTest");
        formManager.switchToiFrame(1, PositioningStatementField, "QaTest");
        formManager.switchToiFrame(2, SalesPointsField, "QaTest");
        formManager.switchToiFrame(3, SynopsisField, "QaTest");
        formManager.switchToiFrame(4, BioField, "QaTest");


        driver.findElement(SaveButton).click();
        formManager.switchToConfirmSavingWindow();
        driver.findElement(CopyToRelatedEditionCheckBox).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[3]/button[2]")).click();
    }

    public void MandatoryFieldsSetEndorsement() throws InterruptedException {
        driver.get("http://dev.watkins-minerva.com/edition/2940/endorsement/list");
        FormManager formManager = new FormManager(driver);

        formManager.switchToiFrame(0, EndorsementField, "QaTest");
        formManager.switchToiFrame(1, SourceField, "QaTest");
        formManager.switchToiFrame(2, PullQuoteField, "QaTest");
        Thread.sleep(5000);

        driver.findElement(AddEndorsementButton).click();

        formManager.switchToConfirmSavingWindow();
        driver.findElement(CopyToRelatedEditionCheckBox).click();
        driver.findElement(By.xpath("//*[@id=\"modalCopyToRelated\"]/div/div/div[3]/button[2]")).click();

    }

    public void MandatoryFieldsContributors(String contributorName) throws InterruptedException {
        driver.get("http://dev.watkins-minerva.com/edition/2940/contributor/list");

        driver.findElement(NameField).sendKeys(contributorName); //AutoTestName AutoTestLastName
        driver.findElement(SearchButton).click();
        driver.findElement(ContributorDropdown).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[5]/div[2]/form/div[1]/div[1]/select/option[2]")).click();

        driver.findElement(ContributorTypeDropdown).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[5]/div[2]/form/div[1]/div[2]/select/option[2]")).click();
        driver.findElement(IncludeAiCheckBox).click();
        driver.findElement(AddContributorButton).click();

        FormManager formManager = new FormManager(driver);
        formManager.switchToConfirmSavingWindow();
        driver.findElement(CopyToRelatedEditionCheckBox).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/button[2]")).click();
        Thread.sleep(2000);
    }

    public void MandatoryFieldsOnix() throws InterruptedException {
        FormManager formManager = new FormManager(driver);
        driver.get("http://dev.watkins-minerva.com/edition/2940/onix-listing");
        Thread.sleep(2000);

        formManager.switchToiFrame(0, OnlineShortDescriptionField, "QaTest");
        formManager.switchToiFrame(1, OnlineLongDescriptionField, "QaTest");

        Thread.sleep(5000);

        driver.findElement(SaveOnixButton).click();

        formManager.switchToConfirmSavingWindow();
        driver.findElement(CopyToRelatedEditionCheckBox).click();
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[2]")).click();
    }

    public void AssertMandatoryFieldsInRelatedEdition() {
        driver.get("http://dev.watkins-minerva.com/edition/2941/edit");

        String compareText = "QaTest";
        Assert.assertEquals(compareText, driver.findElement(LocationField).getAttribute("value"));
        Assert.assertEquals("nullQaTest", driver.findElement(TitleField).getAttribute("value"));
        Assert.assertEquals("100", driver.findElement(ExtentField).getAttribute("value"));
        Assert.assertEquals(compareText, driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[5]/div[2]/div[1]/div/div/span")).getText());

        driver.switchTo().frame(0);
        Assert.assertEquals(compareText, driver.findElement(SubTitleField).getText());
        driver.switchTo().parentFrame();

        driver.switchTo().frame(1);
        Assert.assertEquals(compareText, driver.findElement(PositioningStatementField).getText());
        driver.switchTo().parentFrame();

        driver.switchTo().frame(2);
        Assert.assertEquals(compareText, driver.findElement(SalesPointsField).getText());
        driver.switchTo().parentFrame();

        driver.switchTo().frame(3);
        Assert.assertEquals(compareText, driver.findElement(SynopsisField).getText());
        driver.switchTo().parentFrame();

        driver.switchTo().frame(4);
        Assert.assertEquals(compareText, driver.findElement(BioField).getText());
        driver.switchTo().parentFrame();


        Select imprintDropdown = new Select(driver.findElement(ImprintDropDown));
        String selectedOptionImprint = imprintDropdown.getFirstSelectedOption().getText();
        if (!selectedOptionImprint.equals("Repeater")) {
            System.out.println("Imprint failed");

        }
        Select languageDropdown = new Select(driver.findElement(LanguageDropdown));
        String selectedOptionLanguage = languageDropdown.getFirstSelectedOption().getText();
        if (!selectedOptionLanguage.equals("German")) {
            System.out.println("Language failed");
        }
        Select bicSubject1Dropdown = new Select(driver.findElement(BICSubjects1Dropdown));
        String selectedOptionBicSubject1 = bicSubject1Dropdown.getFirstSelectedOption().getText();
        if (!selectedOptionBicSubject1.equals("African history")) {
            System.out.println("BICSubjects1Dropdown failed");
        }
        Select bicSubject2Dropdown = new Select(driver.findElement(BICSubjects2Dropdown));
        String selectedOptionBicSubject2 = bicSubject2Dropdown.getFirstSelectedOption().getText();
        if (!selectedOptionBicSubject2.equals("African history")) {
            System.out.println("BICSubjects2Dropdown failed");
        }
        Select bicSubject3Dropdown = new Select(driver.findElement(BICSubjects3Dropdown));
        String selectedOptionBicSubject3 = bicSubject3Dropdown.getFirstSelectedOption().getText();
        if (!selectedOptionBicSubject3.equals("African history")) {
            System.out.println("BICSubjects3Dropdown failed");
        }

        Select bisacSubject1Dropdown = new Select(driver.findElement(BISACSubjects1Dropdown));
        String selectedOptionBisacSubject1 = bisacSubject1Dropdown.getFirstSelectedOption().getText();
        if (!selectedOptionBisacSubject1.equals("ARCHITECTURE / Buildings / Religious")) {
            System.out.println("BISACSubjects1Dropdown failed");
        }
        Select bisacSubject2Dropdown = new Select(driver.findElement(BISACSubjects2Dropdown));
        String selectedOptionBisacSubject2 = bisacSubject2Dropdown.getFirstSelectedOption().getText();
        if (!selectedOptionBisacSubject2.equals("ARCHITECTURE / Buildings / Religious")) {
            System.out.println("BISACSubjects2Dropdown failed");
        }
        Select bisacSubject3Dropdown = new Select(driver.findElement(BISACSubjects3Dropdown));
        String selectedOptionBisacSubject3 = bisacSubject3Dropdown.getFirstSelectedOption().getText();
        if (!selectedOptionBisacSubject3.equals("ARCHITECTURE / Buildings / Religious")) {
            System.out.println("BISACSubjects3Dropdown failed");
        }
        Select diversityDiversityDropdown = new Select(driver.findElement(DiversityDiscoverabilityDiversityCategoriesDropdown));
        String selectedOptiondiversityDiversity = diversityDiversityDropdown.getFirstSelectedOption().getText();
        if (!selectedOptiondiversityDiversity.equals("Disability, Impairment, and Difference - Addiction - Alcohol Addiction")) {
            System.out.println("DiversityDiscoverabilityDiversityCategoriesDropdown failed");
        }
        Select diversityExperienceDropdown = new Select(driver.findElement(DiversityDiscoverabilityExperiencesCategoriesDropdown));
        String selectedOptiondiversityExperience = diversityExperienceDropdown.getFirstSelectedOption().getText();
        if (!selectedOptiondiversityExperience.equals("Family Structure - Adopted")) {
            System.out.println("DiversityDiscoverabilityExperiencesCategoriesDropdown failed");
        }
    }
    public void AssertMandatoryEndorsementFieldsInRelatedEdition() {
       driver.get("http://dev.watkins-minerva.com/edition/2941/endorsement/list");
        String compareText = "QaTest";

       driver.switchTo().frame(0);
       Assert.assertEquals(compareText, driver.findElement(EndorsementField).getText());
       driver.switchTo().parentFrame();

        driver.switchTo().frame(1);
        Assert.assertEquals(compareText, driver.findElement(SourceField).getText());
        driver.switchTo().parentFrame();

        driver.switchTo().frame(2);
        Assert.assertEquals(compareText, driver.findElement(PullQuoteField).getText());
        driver.switchTo().parentFrame();

    }
    public void AssertMandatoryContributorFieldsInRelatedEdition() {
        driver.get("http://dev.watkins-minerva.com/edition/2941/contributor/list");

        Assert.assertEquals("Yes", driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div/div/table/tbody/tr/td[4]")).getText());
        Assert.assertEquals("AutoTestLastName", driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div/div/table/tbody/tr/td[2]")).getText());
        Assert.assertEquals("By (author)", driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div/div/table/tbody/tr/td[3]")).getText());
    }
    public void AssertMandatoryOnixFieldsInRelatedEdition(){
        driver.get("http://dev.watkins-minerva.com/edition/2941/onix-listing");

        String compareText = "QaTest";
        driver.switchTo().frame(0);
        Assert.assertEquals(compareText, driver.findElement(OnlineLongDescriptionField).getText());
        driver.switchTo().parentFrame();

        driver.switchTo().frame(1);
        Assert.assertEquals(compareText, driver.findElement(OnlineShortDescriptionField).getText());
        driver.switchTo().parentFrame();
    }
}
