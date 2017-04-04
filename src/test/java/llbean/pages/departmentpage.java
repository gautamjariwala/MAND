package llbean.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by gjariwala on 3/28/2017.
 */
public class departmentpage {

    WebDriver driver;

    public departmentpage(WebDriver driver){

       this.driver=driver;

    }

    By category = By.xpath("//android.widget.FrameLayout[contains (@resource-id, 'com.llbean:id/container') and @index='1']");


}
