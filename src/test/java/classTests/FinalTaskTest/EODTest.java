package classTests.FinalTaskTest;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.FinalTask.EODHomePage;
import pageObject.FinalTask.EODPopulateFields;

public class EODTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://tutorialsninja.com/demo/");
    }
    @Test
    public void choosingMonitors(){
        EODHomePage homePage = new EODHomePage(driver);

        homePage.selectMenuItem("Components");
        homePage.clickMenuItemsDD("Monitors");
        homePage.clickProduct("Apple Cinema 30\"");

        EODPopulateFields populateFields = new EODPopulateFields(driver);
        populateFields.selectRadioOption(2);
        populateFields.selectCheckboxOption();
        populateFields.populateTextField();
        populateFields.selectColorFirstLevel();
        populateFields.selectColorSecondLevel(2);
        populateFields.populateTextArea();
        populateFields.uploadImage();
        populateFields.insertDate();
        populateFields.insertTime();
        populateFields.insertDateAndTime();
        populateFields.insertQuantity();
        populateFields.clickAddToCart();

        getClass();

    }
}

