package llbean.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by gjariwala on 3/27/2017.
 */
public class HomePage extends BasePage {

    @AndroidFindBy (uiAutomator = "new UiSelector().text(\"Footwear\")")
        public MobileElement footwearDepartmentTabTitle;

    public HomePage (AppiumDriver driver){
        super(driver);
    }

       public void clickOnFootwearDepartmentTab(){
            clickElement(footwearDepartmentTabTitle);
       }

        @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Men's\")")
            public MobileElement mensDepartmentPageTitle;

    protected void clickOnmensDepartmentTab(MobileElement mobileElement){

        mobileElement = waitTillElementVisible(mobileElement);
        clickElement(mensDepartmentPageTitle);
    }
       /* @FindBy(xpath = "\"//android.widget.TextView[@text='Footwear']\"")
    private WebElement footwear_dept;*/



    //WebElement e = driver.findElement(By.xpath("//android.widget.TextView[@text='Footwear']"));
    //By footwear_dept = By.xpath("//android.widget.TextView[@text='Footwear']");

    /*public WebElement click(){
        return driver.findElement(footwear_dept);

    }*/



   /* WebDriver driver;

    public homepage(WebDriver driver)
    {
        this.driver=driver;
    }


    By cat_name = By.("Men's");

    public WebElement catname(){

        return driver.findElement(cat_name);
    }

    public void waitmethod(int waittime, WebElement elementname){
        WebDriverWait wait = new WebDriverWait(driver, waittime);
        wait.until(ExpectedConditions.visibilityOf(elementname));

    }*/

}



