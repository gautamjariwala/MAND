package llbean.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;


public class AppiumDriverBuilder {

        public AppiumDriver build() throws Exception {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 6");
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/gjariwala/Project 2/L.L.Bean_1.0-beta-356-g946bc53.apk");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.llbean");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".ui.home.HomeActivity");

            return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities);
        }


}
