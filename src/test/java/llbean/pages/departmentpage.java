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
public class departmentpage extends BasePage{

        public departmentpage (AppiumDriver driver){
             super(driver);

    }

    @AndroidFindBy (uiAutomator = "new UiSelector().text(\"Outerwear\")")
                public MobileElement outerWearDepartment;



        public void clickOnOuterwearDepartment(){
            scrollUpCurrentView();
            explicitWait(5);
            waitTillElementVisible(outerWearDepartment);
            clickElement(outerWearDepartment);

        }



    By category = By.xpath("//android.widget.FrameLayout[contains (@resource-id, 'com.llbean:id/container') and @index='1']");


}
