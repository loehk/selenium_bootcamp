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

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EODProductPage extends BaseFunc {

    private final WebDriver driver;
    private static  final Logger logger = LogManager.getLogger(EODProductPage.class.getName());

    public EODProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    private String path = System.getProperty("user.dir") + "\\src\\resources\\imagefortask.jpg";

    @FindBy(how = How.XPATH, using = "//input[@name='option[218]']")
    private List<WebElement> selectRadio;

    @FindBy(how = How.XPATH, using = "//input[@name = 'option[223][]']")
    private List<WebElement> checkbox;

    @FindBy(how = How.XPATH, using = "//input[@id = 'input-option208']")
    private WebElement textField;

    @FindBy(how = How.XPATH, using = "//select[@id = 'input-option217']")
    private WebElement selectColor;

    @FindBy(how = How.XPATH, using = "//option[@value]")
    private List<WebElement> selectColorDD;

    @FindBy(how = How.XPATH, using = "//textarea[@id='input-option209']")
    private WebElement textArea;

    @FindBy(how = How.XPATH, using = "//input[@id='input-option219']")
    private WebElement date;

    @FindBy(how = How.XPATH, using = "//input[@id='input-option221']")
    private WebElement time;

    @FindBy(how = How.XPATH, using = "//input[@id='input-option220']")
    private WebElement dateAndTime;

    @FindBy(how = How.XPATH, using = "//input[@id='input-quantity']")
    private WebElement quantity;

    @FindBy(how = How.XPATH, using = "//button[@id='button-cart']")
    private WebElement addToCart;

    @FindBy(how = How.XPATH, using = "//a[@title='Checkout']")
    private WebElement checkout;

    public void selectRadioOption(int i) {
        WebElement radioSelector = selectRadio.get(i);
        radioSelector.click();
    }

    public void selectCheckboxOption() {
        List<WebElement> checkboxSelector = checkbox;
        checkboxSelector.forEach(WebElement::click);
    }

    public void populateTextField() {
        WebElement textBox = textField;
        textBox.clear();
        textBox.sendKeys("your ad here");
    }

    public void selectColorFirstLevel() {
        selectColor.click();
    }

    public void selectColorSecondLevel(int i) {
        WebElement colorSelector = selectColorDD.get(i);
        colorSelector.click();
    }

    public void populateTextArea() {
        logger.info("populating text area");
        WebElement textBox = textArea;
        textBox.clear();
        String enteredValue = "your second ad here";
        textBox.sendKeys(enteredValue);
        String actualValue = textArea.getAttribute("value");
        logger.info(String.format("Expected: %s, result: %s, Objects equal?: %s", enteredValue, actualValue, enteredValue.equals(actualValue)));
        assertEquals(enteredValue, actualValue);
    }

    public void uploadImage() {

        driver.findElement(By.id("button-upload222")).click();
        setClipboardData(path);
        Robot robot;
        try {
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }

        new WebDriverWait(driver, 3).until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void insertDate() {
        String now = LocalDate.now().toString();
        WebElement dateInsertion = date;
        dateInsertion.clear();
        dateInsertion.sendKeys(now);
        assertEquals(now, date.getAttribute("value"));
    }

    public void insertTime() {
        WebElement timeInsertion = time;
        timeInsertion.clear();
        timeInsertion.sendKeys(LocalTime.now().toString());
    }

    public void insertDateAndTime() {
        WebElement dateAndTimeInsertion = dateAndTime;
        dateAndTimeInsertion.clear();
        dateAndTimeInsertion.sendKeys(LocalDateTime.now().toString());
    }

    public void insertQuantity() {
        WebElement quantityInsertion = quantity;
        quantityInsertion.clear();
        quantityInsertion.sendKeys("10");
    }

    public void clickAddToCart() {
        WebElement addToCartButton = addToCart;
        addToCartButton.click();
    }

    public void checkoutItems(){
        WebElement checkoutButton = checkout;
        checkoutButton.click();
    }

    private static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }
}
