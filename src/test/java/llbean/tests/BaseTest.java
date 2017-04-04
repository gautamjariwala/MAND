package llbean.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder;
import llbean.utils.AppiumDriverBuilder;
import llbean.utils.UniversalPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by gjariwala on 4/4/2017.
 */
public class BaseTest {

    private AppiumDriver driver;
    protected UniversalPage app;

    @BeforeSuite
    public void setup() throws  Exception{
        this.driver = new AppiumDriverBuilder().build();

        app = new UniversalPage(driver);

}

    @AfterSuite
    public void teardown(){


            this.driver.quit();
    }
}