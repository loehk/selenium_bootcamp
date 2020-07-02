package classTests.day2;

import baseWebTest.BaseWebTest;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.DelfiHomePage;

import java.security.PublicKey;

public class DelfiTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("https://www.delfi.lv");
    }
    @Test
    public void checkingDelfi() {
        DelfiHomePage homePage = new DelfiHomePage(driver);

//      homePage.selectMenuItem("Ārzemēs");
        homePage.clickArticle(5);

    }
}
