package llbean.utils;

import io.appium.java_client.AppiumDriver;
import llbean.pages.HomePage;

/**
 * Created by gjariwala on 4/4/2017.
 */
public class UniversalPage {
    private AppiumDriver driver;
    public HomePage homepage(){
        return new HomePage(driver);
    }

    public UniversalPage (AppiumDriver driver){
            this.driver = driver;
    }

}
