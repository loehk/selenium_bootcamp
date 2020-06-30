package classTests.day1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ElementTest {

    WebDriver driver;
    private String url = "https://kristinek.github.io/site/examples/actions";

    @BeforeClass
    public void setDriver() {
        String userdirLib =  System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", userdirLib + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test
    public void findElements() {
        WebElement inputText = driver.findElement(By.id("text"));
        inputText.clear();
        inputText.sendKeys("Hello All!");

        WebElement resultButton = driver.findElement(By.id("result_button_text"));
        resultButton.click();

        WebElement checkBox1 = driver.findElement(By.cssSelector("[id='vfb-6-0']"));
        checkBox1.click();
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }


}
