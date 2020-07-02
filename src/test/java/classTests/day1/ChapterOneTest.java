package classTests.day1;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day1.ChapterOnePage;
import pageObject.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("http://book.theautomatedtester.co.uk/");
    }

    @Test
    public void chapterOneTest(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.chapter1.isDisplayed(), "Chapter link not displayed");
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hello World!!");

        Assert.assertEquals("Hello World!!", chapterPage.getTextofTextBox(), "Text is not the same");
        chapterPage.getTextofTextBox();

        String windowLink = chapterPage.getTextOfWindowLink();
        Assert.assertNotNull(windowLink);

        chapterPage.printAttributeOfVerifyButton();

        Assert.assertNotEquals("yellow", chapterPage.printCSSValueOfMainHeading());
        Assert.assertFalse(chapterPage.printCSSValueOfMainHeading().equals("yellow"), "some message");
        Assert.assertTrue(!chapterPage.printCSSValueOfMainHeading().equals("yellow"), "some message");

        chapterPage.selectFromSelectTypeDD("Selenium RC");
    }
}
