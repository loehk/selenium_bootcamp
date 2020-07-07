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

import java.util.List;

public class EODCheckoutPage_CheckoutOptions extends BaseFunc {

    private final WebDriver driver;
    private static final Logger logger = LogManager.getLogger(EODProductPage.class.getName());

    public EODCheckoutPage_CheckoutOptions(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//input[@value='guest']")
    private WebElement guestCheckoutButton;

    @FindBy(how = How.XPATH, using = "//input[@value='Continue']")
    private WebElement continueButton;


    public void selectGuestCheckout() {
        new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='guest']")));
        WebElement guestCheckout = guestCheckoutButton;
        guestCheckout.click();
    }

    public void pressContinueButton() {
        WebElement buttonContinue = continueButton;
        buttonContinue.click();
    }
}

