package llbean.pages;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;




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

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Regular\")")
    public MobileElement colorsLabel;

    @AndroidFindBy(id = "com.llbean:id/text_review_count")
    public MobileElement reviewCount;

    @AndroidFindBy(id = "com.llbean:id/text_product_name")
    public MobileElement productName;

    @AndroidFindBy(id = "com.llbean:id/image_hero")
    public MobileElement heroImage;

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

    public void movetoanelement(){
        /*waitTillElementVisible(reviewCount);
        explicitWait(500);
        TouchAction action = new TouchAction(driver);
        //action.press(reviewCount).perform().moveTo(colorsLabel).release();
        action.press(reviewCount)
                .waitAction(500)
                .moveTo(colorsLabel)
                .release()
                .perform();
*/
        //heroImage.swipe(SwipeElementDirection.UP, 8000);
        driver.swipe(709, 1396, 709,0, 3000 );
       // TouchAction t = new TouchAction(driver);

        //driver.swipe(int i; int j; int k; int l; int time);

        //t.press(heroImage).perform().moveTo(colorsLabel).perform().release();

        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        scrollObject.put("element", ((RemoteWebElement) reviewCount).getId());
        js.executeScript("mobile: scroll", scrollObject);*/


    }





}






