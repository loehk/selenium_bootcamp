package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UploadPage extends BaseFunc {

    public UploadPage(WebDriver driver, WebElement fileInput) {
        super(driver);
        this.fileInput = fileInput;
    }

    String path = System.getProperty("user.dir") +  "\\src\\resources\\test_document_uploading.docx";

    @FindBy(how = How.CSS, using="[type='file']")
    public WebElement fileInput;

    public UploadPage(WebDriver driver) {
        super(driver);
    }

    public void sendFile(){
        fileInput.sendKeys(path);
    }
}
