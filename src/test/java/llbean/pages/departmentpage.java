package llbean.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.aspectj.lang.annotation.AdviceName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by gjariwala on 3/28/2017.
 */
public class DepartmentPage extends BasePage{

        public DepartmentPage(AppiumDriver driver){
             super(driver);

    }

    @AndroidFindBy (uiAutomator = "new UiSelector().text(\"Outerwear\")")
    public MobileElement outerWearDepartment;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Shop by Category\")")
    public MobileElement shopByCategoryTitle;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[contains (@resource-id, 'com.llbean:id/container') and @index='1']")
    public MobileElement firstProductTile;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[contains (@resource-id, 'com.llbean:id/container') and @index='2']")
    public MobileElement secondProductTile;



    public void clickOnOuterwearCategory(){
            scrollUpCurrentView();
            explicitWait(5);
            waitTillElementVisible(outerWearDepartment);
            clickElement(outerWearDepartment);
    }



    public boolean ShopByCategoryTitleIsPresent(){return isVisible(shopByCategoryTitle);}

    public boolean FirstCategoryTileIsPresent(){return isVisible(firstProductTile);}

    public boolean SecondCategoryTileIsPresent(){return isVisible(secondProductTile);}




}
