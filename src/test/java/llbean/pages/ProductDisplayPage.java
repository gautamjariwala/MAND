package llbean.pages;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import ru.yandex.qatools.allure.annotations.Step;


import java.util.HashMap;
import java.util.List;

/**
 * Created by gjariwala on 4/7/2017.
 */
public class ProductDisplayPage extends BasePage {

    public ProductDisplayPage(AppiumDriver driver){
       super(driver);
    }

    @AndroidFindBy(id = "com.llbean:id/layout_container")
    public List<MobileElement> colorChip;

    @AndroidFindBy(id = "com.llbean:id/recycler_attribute_values")
    public List<MobileElement> sizeChip;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add to Bag\")")
    public MobileElement addToBagButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Colors\")")
    public MobileElement colorsLabel;

    @AndroidFindBy(id = "com.llbean:id/image_hero")
    public MobileElement heroImage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Product' and @index='0']")
    public MobileElement productTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='About' and @index='0']")
    public MobileElement aboutTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Reviews' and @index='0']")
    public MobileElement reviewsTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Similar Products' and @index='0']")
    public MobileElement similarProductsTab;

    @AndroidFindBy(id = "com.llbean:id/text_product_name")
    public MobileElement productName;

    @AndroidFindBy(id = "com.llbean:id/text_item_id")
    public MobileElement productId;

    @AndroidFindBy(id = "com.llbean:id/text_review_count")
    public MobileElement reviewCount;

    @AndroidFindBy(id = "com.llbean:id/text_selling_desc")
    public MobileElement sellingDescription;

    @AndroidFindBy(id = "com.llbean:id/text_product_price")
    public MobileElement productPrice;



    //xpath = "//android.widget.TextView[@text='Shop' and @index='0']"

    public void clickColorChip() {

        for(int i=0; i<colorChip.size();i++){
            if (colorChip.get(i).isEnabled()){
                colorChip.get(i).click();
                break;

        }else System.out.println(colorChip.get(i)+" is not enabled");
        }
    }

    public void clickSizeChip(){
        for(int i = 0; i<sizeChip.size();i++){
            if (sizeChip.get(i).isEnabled()){
                sizeChip.get(i).click();
                break;
            }
            else {
                System.out.println(sizeChip.get(i)+" Size is disabled");
            }
        }
    }

    public void scrollToProductName() throws Exception {
        //explicitWait(500);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep(15000);
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.llbean:id/text_product_name\"));"));
        //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Colors\"));"));

    }

    @Step
    public boolean ProductTabIsPresent(){return isVisible(productTab);}

    @Step
    public boolean AboutTabIsPresent(){return isVisible(aboutTab);}

    @Step
    public boolean ReviewsTabIsPresent(){return isVisible(reviewsTab);}

    @Step
    public boolean SimilarProductsTabIsPresent(){return isVisible(similarProductsTab);}

    @Step
    public boolean ProductNameIsPresent(){return isVisible(productName);}

    @Step
    public boolean ProductIdIsPresent(){return isVisible(productId);}

    @Step
    public boolean ReviewCountIsPresent(){return isVisible(reviewCount);}

    @Step
    public boolean SellingDescriptionIsPresent(){return isVisible(sellingDescription);}

    @Step
    public boolean ProductPriceIsPresent(){return isVisible(productPrice);}

    @Step
    public boolean AddToBagButtonIsPresent(){return isVisible(addToBagButton);}

    @AndroidFindBy(id = "com.llbean:id/snackbar_action")
    public MobileElement checkoutButton;

    @AndroidFindBy(id = "com.llbean:id/snackbar_text")
    public MobileElement addedSuccessfullyText;

    /*@AndroidFindBy(id = "com.llbean:id/snackbar_text")
    public MobileElement addedSuccessfullyText;*/



    @Step
    public boolean CheckoutButtonIsVisible(){
        waitTillElementVisible(checkoutButton);

        return isVisible(checkoutButton);}

    @Step
    public boolean AddedSuccessfullyTextIsVisible(){

        waitTillElementVisible(addedSuccessfullyText);
        return isVisible(addedSuccessfullyText);}

    public void scrollToColors() throws Exception {
        //explicitWait(500);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep(15000);
        //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Colors\"));"));
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Colors\"));"));



    }

    public void scrollToSize() throws Exception {
        //explicitWait(500);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep(15000);
        //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Colors\"));"));
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Size\"));"));



    }

    public void movetoanelement(){

        driver.swipe(709, 1396, 709,0, 3000 );



    }





}






