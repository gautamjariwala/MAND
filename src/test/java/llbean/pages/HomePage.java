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
    public HomePage (AppiumDriver driver){
        super(driver);
    }

    @AndroidFindBy (uiAutomator = "new UiSelector().text(\"Footwear\")")
        public MobileElement footwearDepartmentTabTitle;



    @AndroidFindBy(accessibility = "Open Navigation Drawer")
    public MobileElement hamburgerIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shop' and @index='1']")
    public MobileElement homePageTitle;

    @AndroidFindBy(accessibility = "Search")
    public MobileElement searchIcon;

    @AndroidFindBy(accessibility = "Shopping Bag")
    public MobileElement shoppingBagIcon;

    @AndroidFindBy(id = "com.llbean:id/appbar")
    public MobileElement homePageHeroImage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shop' and @index='0']")
    public MobileElement shopTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Men's\")")
    public MobileElement mensTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Women's\")")
    public MobileElement womensTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Kids'\")")
    public MobileElement kidsTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Footwear\")")
    public MobileElement footwearTab;

    public void clickOnFootwearDepartmentTab(){
            clickElement(footwearDepartmentTabTitle);
            scrollUpCurrentView();
           scrollUpCurrentView();

    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Shop\")")
    public MobileElement shopTitle;


    public void clickOnmensDepartmentTab(){
        waitTillElementVisible(mensTab);
        explicitWait(10);
        clickElement(mensTab);
        scrollUpCurrentView();
        scrollUpCurrentView();
    }

    @Step
    public boolean HomePageTitleIsVisible(){
        return isVisible(homePageTitle);
    }

    @Step
    public boolean HamburgerIconIsVisible(){return isVisible(hamburgerIcon);}

    @Step
    public boolean SearchIconIsVisible(){return isVisible(searchIcon);}

    @Step
    public boolean ShoppingBagIconIsVisible(){return isVisible(shoppingBagIcon);}

    @Step
    public boolean ShopTabIsVisible(){return isVisible(shopTab);}

    @Step
    public boolean MensTabIsVisible(){return isVisible(mensTab);}

    @Step
    public boolean WomensTabIsVisible(){return isVisible(womensTab);}

    @Step
    public boolean KidsTabIsVisible(){return isVisible(kidsTab);}

    @Step
    public boolean FootwearTabIsVisible(){return isVisible(footwearTab);}
    }



