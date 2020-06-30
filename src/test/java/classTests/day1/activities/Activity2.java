package classTests.day1.activities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.day1.HomePage;

public class Activity2 {
    WebDriver driver;

    @Before
    public void setDriver() {
        String userdirLib =  System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", userdirLib + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://book.theautomatedtester.co.uk/");
    }


    @Test
    public void practiceWithWebElement() {
        WebElement chapter1 = driver.findElement(By.xpath("//a[@href=\"/chapter1\"]"));
        chapter1.click();

        WebElement textBox = driver.findElement(By.xpath("//div[@id=\"html5div\"]"));
        textBox.clear();
        textBox.sendKeys("Did it work yet?");

        System.out.println(driver.findElement(By.xpath("//div[@class=\"multiplewindow\"]")).getText());

        System.out.println(driver.findElement(By.xpath("//input[@id=\"verifybutton\"]")).getAttribute("value"));

        System.out.println(driver.findElement(By.xpath("//div[@class=\"mainheading\"]")).getCssValue("color"));
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
