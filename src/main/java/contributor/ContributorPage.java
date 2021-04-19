package contributor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContributorPage {

    private WebDriver driver;

    public ContributorPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstNameField = By.xpath("//*[@id=\"first-name\"]");
    private By lastNameField = By.xpath("//*[@id=\"last-name\"]");
    private By middleNameField = By.xpath("//*[@id=\"middle-name\"]");
    private By academicQualificationField = By.xpath("//*[@id=\"academic-qualification\"]");
    private By dateOfBirthField = By.xpath("//*[@id=\"birth-date\"]");
    private By royaltySystemIdField = By.xpath("//*[@id=\"royalty-system-id\"]");
    private By bioField = By.xpath("//*[@id=\"dropzone-form\"]/div[1]/div[2]/div[4]/div/iframe");
    private By mobileNumberField = By.xpath("//*[@id=\"mobile-number\"]");
    private By landlineField = By.xpath("//*[@id=\"land-line\"]");
    private By skypeField = By.xpath("//*[@id=\"skype\"]");
    private By fullAddressField = By.xpath("//*[@id=\"full-address\"]");
    private By cityField = By.xpath("//*[@id=\"city\"]");
    private By countryField = By.xpath("//*[@id=\"country\"]");
    private By addButton = By.xpath("//*[@id=\"dropzone-form\"]/div[3]/div[2]/div[4]/div/button");
    private By emailField = By.xpath("//*[@id=\"email-0\"]/div[1]/input");
    private By facebookField = By.xpath("//*[@id=\"facebook\"]");
    private By instagramField = By.xpath("//*[@id=\"instagram\"]");
    private By twitterField = By.xpath("//*[@id=\"twitter\"]");
    private By websiteField = By.xpath("//*[@id=\"website\"]");
    private By photoCreditField = By.xpath("//*[@id=\"photo-credit\"]");
    private By saveButton = By.xpath("//*[@id=\"dropzone-form\"]/input");
    private By uploadFilesLink = By.id("clickable-zone");

    public void setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);

    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);

    }

    public void setMiddleName(String middleName) {
        driver.findElement(middleNameField).sendKeys(middleName);

    }

    public void setAcademicQualification(String academicQualification) {
        driver.findElement(academicQualificationField).sendKeys(academicQualification);

    }

    public void setDateOfBirth(String dateOfBirth) {
        driver.findElement(dateOfBirthField).sendKeys(dateOfBirth);

    }

    public void setRoyaltySystemId(String royaltySystemId) {
        driver.findElement(royaltySystemIdField).sendKeys(royaltySystemId);

    }

    public void setBio(String bio) {
        driver.findElement(bioField).sendKeys(bio);

    }

    public void setMobileNumber(String mobileNumber) {
        driver.findElement(mobileNumberField).sendKeys(mobileNumber);

    }

    public void setLandline(String landline) {
        driver.findElement(landlineField).sendKeys(landline);

    }

    public void setSkype(String skype) {
        driver.findElement(skypeField).sendKeys(skype);

    }

    public void setFullAddress(String fullAddress) {
        driver.findElement(fullAddressField).sendKeys(fullAddress);

    }

    public void setCity(String city) {
        driver.findElement(cityField).sendKeys(city);

    }

    public void setCountry(String country) {
        driver.findElement(countryField).sendKeys(country);

    }

    public void clickAdd() {
        driver.findElement(addButton).click();

    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);

    }

    public void setFacebook(String facebook) {
        driver.findElement(facebookField).sendKeys(facebook);

    }

    public void setInstagram(String instagram) {
        driver.findElement(instagramField).sendKeys(instagram);

    }

    public void setTwitter(String twitter) {
        driver.findElement(twitterField).sendKeys(twitter);
        //return this;
    }

    public void setWebsite(String website) {
        driver.findElement(websiteField).sendKeys(website);

    }

    public void setPhotoCredit(String photoCredit) {
        driver.findElement(photoCreditField).sendKeys(photoCredit);

    }

    public void clickSave() {
        driver.findElement(saveButton).click();

    }

    public void clickUploadFiles() {
        driver.findElement(uploadFilesLink).sendKeys("src/main/resources/profileAvatar.jpg");

    }

    public void CreateContributor(String firstName,
                                  String lastName,
                                  String middleName,
                                  String academicQualification,
                                  String dateOfBirth,
                                  String royaltySystemId,
                                  String bio) {

        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setMiddleName(middleName);
        this.setAcademicQualification(academicQualification);
        this.setDateOfBirth(dateOfBirth);
        this.setRoyaltySystemId(royaltySystemId);
        this.setBio(bio);
    }

    public void ContactInformation(String mobileNumber,
                                   String landLine,
                                   String skype,
                                   String fullAddress,
                                   String city,
                                   String country) {
        this.setMobileNumber(mobileNumber);
        this.setLandline(landLine);
        this.setSkype(skype);
        this.setFullAddress(fullAddress);
        this.setCity(city);
        this.setCountry(country);

    }

    public void Email(String email) {
        this.clickAdd();
        this.setEmail(email);

    }

    public void SocialNetworks(String facebook,
                               String instagram,
                               String twitter,
                               String website) {
        this.setFacebook(facebook);
        this.setInstagram(instagram);
        this.setTwitter(twitter);
        this.setWebsite(website);
        //return this;
    }

    public void PhotoCredit(String photoCredit) {
        this.setPhotoCredit(photoCredit);
    }
    public void UploadPhoto () {
        driver.findElement(uploadFilesLink).sendKeys("C:\\Users\\kateryna\\Desktop\\calaton\\profileAvatar.jpg");

    }
}
