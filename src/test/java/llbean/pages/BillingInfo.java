package llbean.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import llbean.utils.AppiumDriverBuilder;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by gautam on 4/12/2017.
 */
public class BillingInfo extends BasePage {

    public BillingInfo(AppiumDriver driver){
        super(driver);
    }
    @AndroidFindBy(id = "com.llbean:id/edit_email")
    public MobileElement emailAddressField;

    @AndroidFindBy(id = "com.llbean:id/edit_confirm_email")
    public MobileElement confirmEmailAddressField;

    @AndroidFindBy(id = "com.llbean:id/checkbox_promotions")
    public MobileElement promotionsCheckbox;

    @AndroidFindBy(id = "com.llbean:id/button_save")
    public MobileElement billingInfoContinueButton;




}
