package llbean.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by gautam on 4/10/2017.
 */
public class ShoppingBag extends BasePage {

    public ShoppingBag(AppiumDriver driver){
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Shopping Bag\")")
    public MobileElement shoppingBagTitle;

    @AndroidFindBy(id = "com.llbean:id/menu_checkout")
    public MobileElement checkoutHeaderButton;

    @AndroidFindBy(id ="com.llbean:id/button_checkout")
    public MobileElement checkoutFooterButton;

    @AndroidFindBy(id = "com.llbean:id/text_item_name")
    public MobileElement itemNameShoppingBag;

    @AndroidFindBy(id = "com.llbean:id/text_item_price")
    public MobileElement itemPriceShoppingBag;

    @AndroidFindBy(id = "com.llbean:id/text_item_id")
    public MobileElement itemNumberShoppingBag;

    @AndroidFindBy(id = "com.llbean:id/text_counter_value")
    public MobileElement itemCounterShoppingBag;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Order Summary\")")
    public MobileElement orderSummaryTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"1 items in Bag\")")
    public MobileElement itemsInBagtext;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Est. Shipping & Handling\")")
    public MobileElement estShippingHandlingText;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Est. Subtotal\")")
    public MobileElement estSubtotalText;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Est. Total\")")
    public MobileElement estTotalText;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Est. Balance\")")
    public MobileElement estBalanceText;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Est. Subtotal\")")
    public MobileElement estTaxText;

    @AndroidFindBy(id = "com.llbean:id/button_checkout")
    public MobileElement checkoutInPageFooterButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your order is safe and secure -- and everything we sell is Guaranteed to LastSM\")")
    public MobileElement nortonFooterText;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Checkout As Guest\")")
    public  MobileElement checkoutAsGuestButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
    public  MobileElement checkoutAsRuButton;



    public void scrollToFooter() throws Exception {
        //explicitWait(500);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep(15000);
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Your order is safe and secure -- and everything we sell is Guaranteed to LastSM\"));"));

    }

    @Step public boolean ShoppingBagTitleIsPresent(){return isVisible(shoppingBagTitle);}
    @Step public boolean CheckoutHeaderButtonIsPresent(){return isVisible(checkoutHeaderButton);}
    @Step public boolean CheckoutFooterButtonIsPresent(){return isVisible(checkoutFooterButton);}
    @Step public boolean ItemNameIsPresent(){return isVisible(itemNameShoppingBag);}
    @Step public boolean ItemPriceIsPresent(){return isVisible(itemPriceShoppingBag);}
    @Step public boolean ItemNumberIsPresent(){return isVisible(itemNumberShoppingBag);}
    @Step public boolean ItemCounterIsPresent(){return isVisible(itemCounterShoppingBag);}
    @Step public boolean OrderSummaryTitleIsPresent(){return isVisible(orderSummaryTitle);}
    @Step public boolean ItemsInBagTextIsPresent(){return isVisible(itemsInBagtext);}
    @Step public boolean EstShippingHandlingTextIsPresent(){return isVisible(estShippingHandlingText);}
    @Step public boolean EstSubtotalTextIsPresent(){return isVisible(estSubtotalText);}
    @Step public boolean EstTotalTextIsPresent(){return isVisible(estTotalText);}
    @Step public boolean EstBalanceTextIsPresent(){return isVisible(estBalanceText);}
    @Step public boolean EstTaxTextIsPresent(){return isVisible(estTaxText);}
    @Step public boolean CheckoutInPageFoterButtonIsPresent(){return isVisible(checkoutInPageFooterButton);}
    @Step public boolean CheckoutAsGuestButtonIsPresent() {return isVisible(checkoutAsGuestButton);}
    @Step public boolean CheckoutAsRuButtonIsPresent() {return isVisible(checkoutAsRuButton);}





}
