package llbean.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by gjariwala on 3/28/2017.
 */
public class BaseCategoryPage {

    WebDriver driver;

    public BaseCategoryPage(WebDriver driver){

        this.driver=driver;
    }

    By product = By.xpath("//android.widget.TextView[contains (@resource-id, 'com.llbean:id/product_name') and @index='1']");


}
