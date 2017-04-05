package llbean.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by gjariwala on 3/27/2017.
 */
public class HomePage extends BasePage {

    @AndroidFindBy (uiAutomator = "new UiSelector().text(\"Footwear\")")
        public MobileElement footwearDepartmentTabTitle;

    public HomePage (AppiumDriver driver){
        super(driver);
    }

       public void clickOnFootwearDepartmentTab(){
            clickElement(footwearDepartmentTabTitle);
            scrollUpCurrentView();
           scrollUpCurrentView();

       }

        @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Men's\")")
            public MobileElement mensDepartmentPageTitle;


    public void clickOnmensDepartmentTab(){
        waitTillElementVisible(mensDepartmentPageTitle);
        clickElement(mensDepartmentPageTitle);
        scrollUpCurrentView();
        scrollUpCurrentView();
    }

    protected boolean isVisible(MobileElement mobileElement) {

        boolean status = false;
        try {
            mobileElement = waitTillElementVisible(mobileElement);
            status = true;
        } catch (Exception e) {

        }
        return status;
    }

    @AndroidFindBy(accessibility = "Open Navigation Drawer")
    public MobileElement humburgerIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Shop\")")
    public MobileElement homePageTitle;

    @AndroidFindBy(accessibility = "Search")
    public MobileElement searchIcon;

    @AndroidFindBy(accessibility = "Shopping Bag")
    public MobileElement shoppingBagIcon;

    @Step
    public boolean HomePageTitleIsVisible(){
        return isVisible(homePageTitle);
    }

}



