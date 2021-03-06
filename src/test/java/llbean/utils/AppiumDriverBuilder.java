package llbean.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.Properties;


public class AppiumDriverBuilder {


    public AppiumDriver build() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 6");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/gautam/IdeaProjects/mand/src/L.L.Bean_1.1-development-312-g8acd13b.apk");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, true);
        capabilities.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD, true);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.llbean");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".ui.home.HomeActivity");
        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities);
    }
}
