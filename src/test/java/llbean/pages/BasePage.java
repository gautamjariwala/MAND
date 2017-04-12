package llbean.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import llbean.utils.UniversalPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by gjariwala on 4/4/2017.
 */
public class BasePage {

    protected final AppiumDriver driver;

    private WebDriverWait wait;

    public BasePage (AppiumDriver driver){


        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
        PageFactory.initElements(new AppiumFieldDecorator(driver,15, TimeUnit.SECONDS), this);
    }

    protected MobileElement waitTillElementVisible(MobileElement mobileElement){
        return (MobileElement) wait.until(ExpectedConditions.visibilityOf(mobileElement));
    }

    protected void clickElement(MobileElement mobileElement){
        mobileElement = waitTillElementVisible(mobileElement);
        mobileElement.click();


    }


    public void scrollUpCurrentView() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TouchAction action = new TouchAction(driver);
        action.press(0, 500)
                .waitAction(200)
                .moveTo(0, 200)
                .release()
                .perform();
    }

    public void scrollDownCurrentView() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TouchAction action = new TouchAction(driver);
        action.press(500, 0)
                .waitAction(200)
                .moveTo(200, 0)
                .release()
                .perform();
    }
    public void explicitWait(int sec) {
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

    public void inputString(MobileElement mobileElement, String stringToBeEntered){
        mobileElement = waitTillElementVisible(mobileElement);
        mobileElement.sendKeys(stringToBeEntered);

    }

    public void hideKeyboard(){
        driver.hideKeyboard();
    }



}
