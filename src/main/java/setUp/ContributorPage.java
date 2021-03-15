package setUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ContributorPage {
    private WebDriver driver;
    public ContributorPage(WebDriver driver){
        this.driver = driver;
    }
    private By firstNameField = By.xpath("//*[@id=\"first-name\"]");
    private By lastNameField = By.xpath("//*[@id=\"last-name\"]");
    private By middleNameField = By.xpath("//*[@id=\"middle-name\"]");
    private By academicQualificationField = By.xpath("//*[@id=\"academic-qualification\"]");
    private By dateOfBirthField = By.xpath("//*[@id=\"birth-date\"]");
    private By royaltySystemIdField = By.xpath("//*[@id=\"royalty-system-id\"]");
    private By bioField = By.xpath("/html/body");
    private By mobileNumberField = By.xpath("//*[@id=\"mobile-number\"]");
    private By landlineField = By.xpath("//*[@id=\"land-line\"]");
    private By skypeField = By.xpath("://*[@id=\"skype\"]");
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
    private By saveButton = By.xpath ("//*[@id=\"dropzone-form\"]/input");
    private By uploadFilesLink = By.xpath("//*[@id=\"clickable-zone\"]");

    public ContributorPage setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
        return this;
    }
    public ContributorPage setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
        return this;
    }
    public ContributorPage setMiddleName(String middleName) {
        driver.findElement(middleNameField).sendKeys(middleName);
        return this;
    }
    public ContributorPage setAcademicQualification(String academicQualification) {
        driver.findElement(academicQualificationField).sendKeys(academicQualification);
        return this;
    }
    public ContributorPage setDateOfBirth(String dateOfBirth) {
        driver.findElement(dateOfBirthField).sendKeys(dateOfBirth);
        return this;
    }
    public ContributorPage setRoyaltySystemId(String royaltySystemId) {
        driver.findElement(royaltySystemIdField).sendKeys(royaltySystemId);
        return this;
    }
    public ContributorPage setBio(String bio) {
        driver.findElement(bioField).sendKeys(bio);
        return this;
    }
    public ContributorPage setMobileNumber(String mobileNumber) {
        driver.findElement(mobileNumberField).sendKeys(mobileNumber);
        return this;
    }
    public ContributorPage setLandline(String landline) {
        driver.findElement(landlineField).sendKeys(landline);
        return this;
    }
    public ContributorPage setSkype(String skype) {
        driver.findElement(skypeField).sendKeys(skype);
        return this;
    }
    public ContributorPage setFullAddress(String fullAddress) {
        driver.findElement(fullAddressField).sendKeys(fullAddress);
        return this;
    }
    public ContributorPage setCity(String city) {
        driver.findElement(cityField).sendKeys(city);
        return this;
    }
    public ContributorPage setCountry(String country) {
        driver.findElement(countryField).sendKeys(country);
        return this;
    }
    public ContributorPage clickAdd() {
        driver.findElement(addButton).click();
        return this;
    }
    public ContributorPage setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }
    public ContributorPage setFacebook(String facebook) {
        driver.findElement(facebookField).sendKeys(facebook);
        return this;
    }
    public ContributorPage setInstagram(String instagram) {
        driver.findElement(instagramField).sendKeys(instagram);
        return this;
    }
    public ContributorPage setTwitter(String twitter) {
        driver.findElement(twitterField).sendKeys(twitter);
        return this;
    }
    public ContributorPage setWebsite(String website) {
        driver.findElement(websiteField).sendKeys(website);
        return this;
    }
    public ContributorPage setPhotoCredit(String photoCredit) {
        driver.findElement(photoCreditField).sendKeys(photoCredit);
        return this;
    }
    public ContributorPage clickSave() {
        driver.findElement(saveButton).click();
        return this;
    }
    public ContributorPage clickUploadFiles() {
        driver.findElement(uploadFilesLink).sendKeys("src/main/resources/profileAvatar.jpg");
        return this;
    }

    public ContributorPage CreateAContributor (String firstName,
                                               String lastName,
                                               String middleName,
                                               String academicQualification,
                                               String dateOfBirth,
                                               String royaltySystemId,
                                               String bio){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setMiddleName(middleName);
        this.setAcademicQualification(academicQualification);
        this.setDateOfBirth(dateOfBirth);
        this.setRoyaltySystemId(royaltySystemId);
        this.setBio(bio);
        return this;
        }
    public ContributorPage ContactInformation (String mobileNumber,
                                               String landLine,
                                               String skype,
                                               String fullAddress,
                                               String city,
                                               String country){
        this.setMobileNumber(mobileNumber);
        this.setLandline(landLine);
        this.setSkype(skype);
        this.setFullAddress(fullAddress);
        this.setCity(city);
        this.setCountry(country);
        return this;
    }
    public ContributorPage Email (String email){
        this.clickAdd();
        this.setEmail(email);
        return this;
    }
    public ContributorPage SocialNetworks(String facebook,
                                          String instagram,
                                          String twitter,
                                          String website){
        this.setFacebook(facebook);
        this.setInstagram(instagram);
        this.setTwitter(twitter);
        this.setWebsite(website);
        return this;
    }
    public ContributorPage AddPhoto (String photoCredit,
                                     String fileWay){
        this.setPhotoCredit(photoCredit);
        this.clickUploadFiles();
        return this;
    }

}
