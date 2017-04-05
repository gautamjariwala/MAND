package llbean.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by gjariwala on 3/28/2017.
 */
public class BaseCategoryPage extends BasePage {

        public BaseCategoryPage(AppiumDriver driver){
            super(driver);
        }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Jackets & Coats\")")
    public MobileElement categoryTabName;

    @AndroidFindBy(id = "com.llbean:id/product_name")
    public List<MobileElement> productNameViews;

        public void clickOnCategory(){
            waitTillElementVisible(categoryTabName);
            clickElement(categoryTabName);

        }

    public void clickOnFirstProduct(){
            waitTillElementVisible(productNameViews.get(0));
        productNameViews.get(0).click();
    }
    //By product = By.xpath("//android.widget.TextView[contains (@resource-id, 'com.llbean:id/product_name') and @index='1']");


}
