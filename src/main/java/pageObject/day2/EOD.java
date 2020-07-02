package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class EOD extends BaseFunc {

    public EOD(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using="//a[@class='dropdown-toggle']")
    private List<WebElement> menuItems;

    @FindBy(how = How.XPATH, using="/html/body/div[1]/nav/div[2]/ul/li[3]/div/div/ul/li[2]/a")
    private List<WebElement> menuItemsDD;

    @FindBy(how = How.XPATH, using="/html/body/div[2]/div/div/div[3]/div[1]/div/div[2]/div[1]/h4/a")
    private List<WebElement> productApple30;

    @FindBy(how = How.XPATH, using="")
    private List<WebElement> checkBox;

    public void selectMenuItem(String menuName) {
        for (WebElement element : menuItems) {
            String itemName = element.getText();
            if (menuName.equals(itemName)) {
                element.click();
                break;
            }
        }
    }

    public void clickMenuItemsDD(String menuNameDD) {
        for (WebElement element : menuItemsDD){
            String itemnameDD = element.getText();
            if (menuNameDD.equals(itemnameDD)) {
                element.click();
            }
        }
    }

    public void clickProduct(String productName) {
        for (WebElement element : productApple30) {
            String productName30 = element.getText();
            if (productName.equals(productName30)) {
                element.click();
            }
        }
    }


}
