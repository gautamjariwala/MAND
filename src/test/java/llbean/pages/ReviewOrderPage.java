package llbean.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.aspectj.lang.annotation.AdviceName;
import org.junit.internal.runners.statements.Fail;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by gjariwala on 4/17/2017.
 */
public class ReviewOrderPage extends BasePage{

    public ReviewOrderPage (AppiumDriver driver){
        super(driver);

    }

    @AndroidFindBy(id = "com.llbean:id/checkout_payment_obscured_card_number")
    public MobileElement creditCardNumberReviewScreen;

    @AndroidFindBy(id = "com.llbean:id/checkout_payment_expiration")
    public MobileElement creditCardExpiratDateReviewScreen;

    @AndroidFindBy(id = "com.llbean:id/text_billing_address")
    public MobileElement billingAddressReviewScreen;

    @AndroidFindBy(id = "com.llbean:id/checkout_shipping_address")
    public MobileElement shippingAddressReviewScreen;

    @AndroidFindBy(id = "com.llbean:id/checkout_shipping_description")
    public MobileElement freeShippingText;

    @AndroidFindBy(id = "com.llbean:id/checkout_item_name")
    public MobileElement itemName;

    @AndroidFindBy(id = "com.llbean:id/checkout_item_price")
    public MobileElement itemPrice;

    @AndroidFindBy(id = "com.llbean:id/checkout_item_availability")
    public MobileElement itemAvailability;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Order Summary\")")
    public MobileElement orderSummaryTitle;

    @AndroidFindBy(id = "com.llbean:id/checkout_items_in_bag_value")
    public MobileElement itemInBagValue;

    @AndroidFindBy(id = "com.llbean:id/checkout_shipping_handling_free")
    public MobileElement shippingHandlingFreeValue;

    @AndroidFindBy(id = "com.llbean:id/checkout_subtotal_value")
    public MobileElement subtotalValue;

    @AndroidFindBy(id = "com.llbean:id/checkout_tax_value")
    public MobileElement taxValue;

    @AndroidFindBy(id = "com.llbean:id/checkout_order_total_value")
    public MobileElement orderTotalValue;

    @AndroidFindBy(id = "com.llbean:id/checkout_card_charge_value")
    public MobileElement cardChargeValue;

    @AndroidFindBy(id = "com.llbean:id/bottom_bar_info")
    public MobileElement bottomBarBalanceValue;



    public void scrollToShippingAddress() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.llbean:id/checkout_shipping_address\"));"));
    }

    public void scrollToItemName() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.llbean:id/checkout_item_name\"));"));
            }

    public void scrollToItemPrice() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.llbean:id/checkout_item_price\"));"));
    }

    public void scrollToItemAvailability() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.llbean:id/checkout_item_availability\"));"));
    }

    public void scrollToBottomOfThePage() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.llbean:id/checkout_credit_card_balance_layout\"));"));
    }

    @Step("Billing Address, Expected {1} AND Actual {0}")
    public static void BillingAddressAssertFunction(String actualresult, String expectedresult){
        if (actualresult.contains(expectedresult)){
            System.out.println("Assertion passed for " + expectedresult);
        }
        else {
            System.out.println("Actual result does not contain expected string");
        }
    }

    @Step("Shipping Address, EXPECTED {1} AND ACTUAL {0}")
    public static void ShippingAddressAssertFunction(String actualresult, String expectedresult){
        if (actualresult.contains(expectedresult)){
            System.out.println("Assertion passed for " + expectedresult);
        }
        else {
            System.out.println("Actual result does not contain expected string");
        }
    }

    @Step("{1}")
    public static void ItemDetailsAssertFunction(MobileElement elementname, String success){
        if (elementname.isDisplayed()){
           System.out.println(elementname + " is displayed");
        }
        else {
            System.out.println(elementname + " is not displayed");
        }
    }

}
