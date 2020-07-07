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

public class EODCheckoutPage_PaymentMethod extends BaseFunc {
    private final WebDriver driver;
    private static final Logger logger = LogManager.getLogger(EODProductPage.class.getName());

    public EODCheckoutPage_PaymentMethod(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(how = How.NAME, using = "comment")
    private WebElement commentBox;

    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
    private WebElement termsCheckbox;

    @FindBy(how = How.ID, using = "button-payment-method")
    private WebElement continueButton;

    public void populateCommentBox() {
        new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(By.name("comment")));
        WebElement comment = commentBox;
        comment.sendKeys("This is a comment");
    }

    public void acceptTermsAndConditions(){
        WebElement termsAndConditions = termsCheckbox;
        termsAndConditions.click();
    }

    public void clickContinueButton(){
        WebElement clickContinue = continueButton;
        clickContinue.click();
    }
}

