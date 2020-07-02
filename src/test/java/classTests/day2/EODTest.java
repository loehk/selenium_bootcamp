package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.EOD;

public class EODTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://tutorialsninja.com/demo/");
    }
    @Test
    public void choosingMonitors(){
        EOD homePage = new EOD(driver);

        homePage.selectMenuItem("Components");
        homePage.clickMenuItemsDD("Monitors");
        homePage.clickProduct("Apple Cinema 30\"");

    }
}

