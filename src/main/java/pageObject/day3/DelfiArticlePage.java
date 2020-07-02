package pageObject.day3;


import core.BaseFunc;
import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DelfiArticlePage extends BaseFunc {

    public DelfiArticlePage(WebDriver driver) {
        super(driver);
    }

    Article article;
    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'article-title mb-3')]")
    private WebElement TitleandComment;


    public Article getArticleTitleAndComment(){
        waitElementAppeared(TitleandComment);
        article = new Article();
        Article commentCount = new Article();
        article.setTitle(TitleandComment.findElement(By.xpath(".//h1")).getText());
        List<WebElement> commentsArticle = TitleandComment.findElements(By.xpath(".//a[contains(@class, 'text-red-ribbon d-print-none')]"));
        if (commentsArticle.isEmpty()) {
            article.setCommentNumber(0);
        } else {
            article.setCommentNumber(commentsArticle.get(0).getText());
        }
        return article;
    }
}



