package llbean.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by gautam on 4/12/2017.
 */
public class ShippingInfo extends BasePage {

    public ShippingInfo(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.llbean:id/edit_first_name")
    public MobileElement firstNameField;

    @AndroidFindBy(id = "com.llbean:id/edit_last_name")
    public MobileElement lastNameField;

    @AndroidFindBy(id = "com.llbean:id/edit_address_line_1")
    public MobileElement addressLine1Field;

    @AndroidFindBy(id = "com.llbean:id/edit_address_line_2")
    public MobileElement addressLine2Field;

    @AndroidFindBy(id = "com.llbean:id/edit_city")
    public MobileElement cityField;

    @AndroidFindBy(id = "com.llbean:id/spinner_usa_state")
    public MobileElement stateField;

    @AndroidFindBy(id = "com.llbean:id/edit_usa_zip_code")
    public MobileElement zipCodeField;

    @AndroidFindBy(id = "com.llbean:id/edit_phone_daytime")
    public MobileElement phoneField;

    @AndroidFindBy(id = "com.llbean:id/button_save")
    public MobileElement shippingInfoConinueButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Verify Address\")")
    public MobileElement addressVerificationPopUp;

    @AndroidFindBy(id = "com.llbean:id/av_street_address")
    public MobileElement enteredAVAddress;

    public void scrollToShippingInfoFooter() throws Exception {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Continue\"));"));

    }

    @Step
    public String SelectStateFromDropdown(String state) {

        explicitWait(500);
        clickElement(stateField);
        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"

                + ".className(\"android.widget.ListView\")).scrollIntoView("

                + "new UiSelector().text(\"" + state + "\"));"));
        element.click();
        return state;

    }

    @Step
    public void addressVerificationhandling(){
        explicitWait(500);
        if (addressVerificationPopUp.isDisplayed()){
            clickElement(enteredAVAddress);
        }
        else {
            System.out.println("AV pop up was not displayed");
        }
    }

}