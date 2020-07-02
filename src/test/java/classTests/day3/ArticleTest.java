package classTests.day3;

import baseWebTest.BaseWebTest;
import model.Article;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.DelfiHomePage;
import pageObject.day3.DelfiArticlePage;

public class ArticleTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo(){
        navigateTo("https://www.delfi.lv");
    }

    @Test
    public void articleTest(){
        DelfiHomePage homePage = new DelfiHomePage(driver);
        Article articleHome = homePage.getArticleTitleAndComment(4);

        DelfiArticlePage articlePage = new DelfiArticlePage(driver);
        Article articleArticle = articlePage.getArticleTitleAndComment();

        Assertions.assertEquals(articleHome.getTitle(), articleArticle.getTitle(), "Articles are not the same");
        Assertions.assertEquals(articleHome.getCommentNumber(), articleArticle.getCommentNumber(), "Amount of comments is not the same");

    }

}
