package pageObject.day1;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChapterOnePage extends BaseFunc {
    public ChapterOnePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "html5div")
    private WebElement textBox;

    @FindBy(how = How.CLASS_NAME, using = "multiplewindow")
    private WebElement windowLink;

    @FindBy(how = How.ID, using = "verifybutton")
    private WebElement verifyButton;

    @FindBy(how = How.CLASS_NAME, using = "mainheading")
    private WebElement mainHeading;


    public void setTextBox(String textToSend) {
        textBox.clear();
        textBox.sendKeys(textToSend);
    }

    public void getTextOfWindowLink(){
        System.out.println(windowLink.getText());
    }

    public void printAttributeOfVerifyButton() {
        System.out.println(verifyButton.getAttribute("value"));
    }

    public void printCSSValueOfMainHeading() {
        System.out.println(mainHeading.getCssValue("color"));
    }
}



