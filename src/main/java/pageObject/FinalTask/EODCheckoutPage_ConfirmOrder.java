package pageObject.FinalTask;

import core.BaseFunc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EODCheckoutPage_ConfirmOrder extends BaseFunc {

    private final WebDriver driver;
    private static final Logger logger = LogManager.getLogger(EODProductPage.class.getName());

    public EODCheckoutPage_ConfirmOrder(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "button-confirm")
    private WebElement confirmButton;

    public void confirmOrderButton() {
        new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='table-responsive']")));
        WebElement confirm = confirmButton;
        confirm.click();

    }

}
