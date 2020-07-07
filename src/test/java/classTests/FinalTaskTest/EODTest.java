package classTests.FinalTaskTest;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.Configurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.FinalTask.*;

public class EODTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo(){
        navigateTo("http://tutorialsninja.com/demo/");
        Configurator.setAllLevels(LogManager.getRootLogger().getName(), Level.ALL);
    }
    @AfterClass
    public static void tearDown(){
        Configurator.setAllLevels(LogManager.getRootLogger().getName(), Level.ERROR);
    }

    @Test
    public void choosingMonitors(){

        EODHomePage homePage = new EODHomePage(driver);
        homePage.selectMenuItem("Components");
        homePage.clickMenuItemsDD("Monitors");
        homePage.clickProduct("Apple Cinema 30\"");

        EODProductPage productPage = new EODProductPage(driver);
        productPage.selectRadioOption(1);
        productPage.selectCheckboxOption();
        productPage.populateTextField();
        productPage.selectColorFirstLevel();
        productPage.selectColorSecondLevel(2);
        productPage.populateTextArea();
        productPage.uploadImage();
        productPage.insertDate();
        productPage.insertTime();
        productPage.insertDateAndTime();
        productPage.insertQuantity();
        productPage.clickAddToCart();
        productPage.checkoutItems();

        EODCheckoutPage_CheckoutOptions checkoutOptions = new EODCheckoutPage_CheckoutOptions(driver);
        checkoutOptions.selectGuestCheckout();
        checkoutOptions.pressContinueButton();

        EODCheckoutPage_BillingDetails billingDetails = new EODCheckoutPage_BillingDetails(driver);
        billingDetails.inputFirstName();
        billingDetails.inputLastName();
        billingDetails.inputEmail();
        billingDetails.inputPhoneNumber();
        billingDetails.inputCompanyName();
        billingDetails.inputAddressOne();
        billingDetails.inputAddressTwo();
        billingDetails.inputCityName();
        billingDetails.inputPostCode();
        billingDetails.clickOnSelectCountryMenu();
        billingDetails.selectDDCountry(12);
        billingDetails.clickOnSelectZoneMenu();
        billingDetails.selectDDZone(2);
        billingDetails.clickOnContinueButton();

        EODCheckoutPage_DeliveryMethod deliveryMethod = new EODCheckoutPage_DeliveryMethod(driver);
        deliveryMethod.populateCommentBox();
        deliveryMethod.clickContinueButton();

        EODCheckoutPage_PaymentMethod paymentMethod = new EODCheckoutPage_PaymentMethod(driver);
        paymentMethod.populateCommentBox();
        paymentMethod.acceptTermsAndConditions();
        paymentMethod.clickContinueButton();

        EODCheckoutPage_ConfirmOrder confirmOrder = new EODCheckoutPage_ConfirmOrder(driver);
        confirmOrder.confirmOrderButton();

        getClass();

    }
}

