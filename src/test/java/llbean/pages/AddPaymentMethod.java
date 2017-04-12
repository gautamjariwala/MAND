package llbean.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by gautam on 4/12/2017.
 */
public class AddPaymentMethod extends BasePage{

    public AddPaymentMethod(AppiumDriver driver){
        super(driver);
    }

    @AndroidFindBy(id = "com.llbean:id/edit_cc_number")
    public MobileElement creditCardField;

    @AndroidFindBy(id = "com.llbean:id/edit_cc_expiration")
    public MobileElement expirationDateField;

    @AndroidFindBy(id = "com.llbean:id/button_continue")
    public MobileElement addPaymentMrthodContinueButton;

    @AndroidFindBy(id = "com.llbean:id/menu_checkout")
    public MobileElement reviewpPageTopPlaceOrderButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Balance to be Applied\")")
    public MobileElement reviewageFooterText;

    @AndroidFindBy(id = "com.llbean:id/bottom_bar_cta")
    public MobileElement reviewpPageBottomPlaceOrderButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Thank you for your order\")")
    public MobileElement getConfirmationPopupTitle;

    @AndroidFindBy(id = "com.llbean:id/order_confirmation_number")
    public MobileElement confirmationPopupNumber;

    @AndroidFindBy(id = "com.llbean:id/order_total")
    public MobileElement confirmationPopupAmount;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement confirmationContinueButton;





}



