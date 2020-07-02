package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlertPage extends BaseFunc {
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//button[@onclick='jsAlert()']")
    private WebElement simpleAlert;


    @FindBy(how = How.XPATH, using = "//button[@onclick='jsConfirm()']")
    private WebElement simpleConfirm;


    @FindBy(how = How.XPATH, using = "//button[@onclick='jsPrompt()']")
    private WebElement simplePrompt;


    public void clickOnAlert() {
        simpleAlert.click();
    }

    public void clickOnConfirm() {
        simpleConfirm.click();
    }

    public void clickOnPrompt() {
        simplePrompt.click();
    }
}