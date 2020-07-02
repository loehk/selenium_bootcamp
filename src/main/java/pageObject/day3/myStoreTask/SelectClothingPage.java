package pageObject.day3.myStoreTask;

import core.BaseFunc;
import model.StoreClothing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SelectClothingPage extends BaseFunc {
    private final WebDriver driver;
    public SelectClothingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//ul[@class='product_list grid row']/li")
    private List<WebElement> articleOfClothing;

    public StoreClothing getArticleOfClothing(int i) throws InterruptedException {
        //div[@class='product-count']
        new WebDriverWait(driver, 10).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//ul[@class='product_list grid row']/li"), 0));
        WebElement storeClothing = articleOfClothing.get(i);
        storeClothing.findElement(By.xpath(".//a[@class='product-name']")).click();
        return null;
    }
}
