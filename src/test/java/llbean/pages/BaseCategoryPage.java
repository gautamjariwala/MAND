package llbean.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.List;

/**
 * Created by gjariwala on 3/28/2017.
 */
public class BaseCategoryPage extends BasePage {

        public BaseCategoryPage(AppiumDriver driver){
            super(driver);
        }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Jackets & Coats\")")
    public MobileElement subCategoryTabName;

    @AndroidFindBy(id = "com.llbean:id/product_name")
    public List<MobileElement> productNameViews;

    @AndroidFindBy(accessibility = "Navigate up")
    public MobileElement backArrowIcon;

    public void clickOnSubCategory(){
        waitTillElementVisible(subCategoryTabName);
        clickElement(subCategoryTabName);

    }

    public void clickOnFirstProduct(){
        waitTillElementVisible(productNameViews.get(0));
        productNameViews.get(0).click();
    }

    @Step
    public boolean FirstProductTileIsPresent(){return isVisible(productNameViews.get(0));}

    @Step
    public boolean SecondProductTileIsPresent(){
        System.out.println("first tile" + productNameViews.get(0));
        return isVisible(productNameViews.get(1));}

    @Step
    public boolean BackArrowIconIsPresnet(){return isVisible(backArrowIcon);}

    //By product = By.xpath("//android.widget.TextView[contains (@resource-id, 'com.llbean:id/product_name') and @index='1']");






}
