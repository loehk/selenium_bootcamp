package classTests.day3;

import baseWebTest.BaseWebTest;
import model.StoreClothing;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day3.myStoreTask.SelectClothingPage;
import pageObject.day3.myStoreTask.StoreHomePage;

public class StoreTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void testStorePage() throws InterruptedException {
        StoreHomePage homePage = new StoreHomePage(driver);
        homePage.clickOnButtonWomen();

        SelectClothingPage clothingPage = new SelectClothingPage(driver);
        StoreClothing storeClothingPage = clothingPage.getArticleOfClothing(1);
        homePage.clickOnButtonWomen();

        StoreClothing storeClothingPage2 = clothingPage.getArticleOfClothing(2);



    }

}
