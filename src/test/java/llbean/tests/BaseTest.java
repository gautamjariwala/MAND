package llbean.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder;
import llbean.utils.AppiumDriverBuilder;
import llbean.utils.UniversalPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.text.SimpleDateFormat;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by gjariwala on 4/4/2017.
 */
public class BaseTest {

    private AppiumDriver driver;
    protected UniversalPage app;

    @BeforeSuite
    public void setup() throws  Exception{
        driver = new AppiumDriverBuilder().build();

       app = new UniversalPage(driver);

}
    @AfterMethod
    public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            System.out.println(testResult.getStatus());
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String out = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
            FileUtils.copyFile(scrFile, new File("H:\\screenshots\\"+out+".jpg"));
        }}

        @AfterSuite
    public void teardown(){
            this.driver.quit();
    }
}