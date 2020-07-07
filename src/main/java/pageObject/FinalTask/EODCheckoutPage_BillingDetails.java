package pageObject.FinalTask;

import core.BaseFunc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EODCheckoutPage_BillingDetails extends BaseFunc {
    private final WebDriver driver;
    private static final Logger logger = LogManager.getLogger(EODProductPage.class.getName());

    public EODCheckoutPage_BillingDetails(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "input-payment-firstname")
    private WebElement firstNameField;

    @FindBy(how = How.ID, using = "input-payment-lastname")
    private WebElement lastNameField;

    @FindBy(how = How.ID, using = "input-payment-email")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "input-payment-telephone")
    private WebElement telephoneField;

    @FindBy(how = How.ID, using = "input-payment-company")
    private WebElement companyName;

    @FindBy(how = How.ID, using = "input-payment-address-1")
    private WebElement addressOneInput;

    @FindBy(how = How.ID, using = "input-payment-address-2")
    private WebElement addressTwoInput;

    @FindBy(how = How.ID, using = "input-payment-city")
    private WebElement cityNameInput;

    @FindBy(how = How.ID, using = "input-payment-postcode")
    private WebElement postCodeInput;

    @FindBy(how = How.NAME, using = "country_id")
    private WebElement clickSelectCountry;

    @FindBy(how = How.NAME, using = "zone_id")
    private WebElement clickSelectZone;

    @FindBy(how = How.ID, using = "button-guest")
    private WebElement clickContinueButton;


    public void inputFirstName() {
        new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement firstName = firstNameField;
        firstName.sendKeys("FirstName");
    }

    public void inputLastName() {
        WebElement lastName = lastNameField;
        lastName.sendKeys("LastName");
    }

    public void inputEmail() {
        WebElement email = emailField;
        email.sendKeys("email@server.com");
    }

    public void inputPhoneNumber() {
        WebElement telephone = telephoneField;
        telephone.sendKeys("12345668");
    }

    public void inputCompanyName() {
        WebElement company = companyName;
        company.sendKeys("Company A");
    }

    public void inputAddressOne() {
        WebElement addressOne = addressOneInput;
        addressOne.sendKeys("Address 1");
    }

    public void inputAddressTwo() {
        WebElement addressTwo = addressTwoInput;
        addressTwo.sendKeys("Address 2");
    }

    public void inputCityName() {
        WebElement cityName = cityNameInput;
        cityName.sendKeys("Riga");
    }

    public void inputPostCode() {
        WebElement postCode = postCodeInput;
        postCode.sendKeys("City");
    }

    public void clickOnSelectCountryMenu() {
        WebElement selectCountryMenu = clickSelectCountry;
        selectCountryMenu.click();
    }

    public void selectDDCountry(int countryID) {
        WebElement countrySelector = driver.findElement(By.xpath("//*[@id='input-payment-country']/option[" + countryID + "]"));
        countrySelector.click();
    }

    public void clickOnSelectZoneMenu() {
        WebElement selectZoneMenu = clickSelectZone;
        selectZoneMenu.click();
    }

    public void selectDDZone(int zoneID) {
        WebElement zoneSelector = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.refreshed(
                        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='input-payment-zone']/option[" + zoneID + "]"))));
        zoneSelector.click();
//                ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//*[@id='input-payment-zone']/option"), 0));


//        for(int errorCounter =0; errorCounter<=3; errorCounter++){
//            try {
//
//            }catch (StaleElementReferenceException e){
//                if (errorCounter==3){
//                    throw e;
//                }else {
//                    errorCounter++;
//                }
//            }
//        }



    }

    public void clickOnContinueButton() {
        WebElement clickContinue = clickContinueButton;
        clickContinue.click();
    }

}
