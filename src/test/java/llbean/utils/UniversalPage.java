package llbean.utils;

import io.appium.java_client.AppiumDriver;
import llbean.pages.*;

/**
 * Created by gjariwala on 4/4/2017.
 */
public class UniversalPage {
    private AppiumDriver driver;
    public HomePage homepage(){return new HomePage(driver);}
    public DepartmentPage departmentpage(){return new DepartmentPage(driver);}
    public BaseCategoryPage basecategorypage() {return new BaseCategoryPage(driver);}
    public UniversalPage (AppiumDriver driver){
            this.driver = driver;
    }
    public ProductDisplayPage productdisplaypage(){return new ProductDisplayPage(driver);}
    public ShoppingBag shoppingBag(){return new ShoppingBag(driver);}
    public ShippingInfo shippingInfo(){return new ShippingInfo(driver);}
    public BillingInfo billinginfo(){return new BillingInfo(driver);}
    public AddPaymentMethod addPaymentMethod(){return new AddPaymentMethod(driver);}
}
