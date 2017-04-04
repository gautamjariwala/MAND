package llbean.tests;

import org.testng.annotations.Test;

/**
 * Created by gjariwala on 3/15/2017.
 */


public class HappyPath1 extends BaseTest{

    /*helpermethods help = new helpermethods();
    help.setup1();*/



    @Test
    public void guestUserCheckout() {
        app.homepage().clickOnmensDepartmentTab();
        app.homepage().scrollDownCurrentView();

    }}

       /* File appDIR = new File("src");
        File app = new File(appDIR, "L.L.Bean_1.0.7.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
        capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            homepage hp = new homepage(driver);
            departmentpage dp = new departmentpage(driver);
            categorypage cp = new categorypage(driver);

        //TouchAction action = new TouchAction(driver);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(hp.footwear_dept).click();
        //WebElement e = driver.findElementByXPath("//android.widget.TextView[@text='Footwear']");

        //e.click();
        //action.tap(e);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //hp.click().click();
        driver.findElement(dp.category).click();

        //WebElement e1 = driver.findElementByXPath("//android.widget.FrameLayout[contains (@resource-id, 'com.llbean:id/container') and @index='1']");
        //e1.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(cp.product).click();

        //WebElement pdpname = driver.findElementByXPath("//android.widget.TextView[contains (@resource-id, 'com.llbean:id/product_name') and @index='1']");
        //pdpname.click();


        //action.press(0,500).waitAction(200).moveTo(0,200).release().perform();

       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.findElementById("com.llbean:id/image_subcategory").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



        Dimension size = driver.manage().window().getSize();
        System.out.println(size);
        int start_y= (int)(size.height*0.80);
        int end_y=(int)(size.height*0.20);
        int start_x=size.width/2;
        //int end_x =start_y+2000;
        System.out.println("starty = " + start_y + " ,endy = " + end_y + " , startx = " + start_x);
        driver.swipe(start_x,start_y,start_x,end_y,30000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);





        //MobileElement em = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Footwear']");
        //TouchActions tas = new TouchActions(driver);
        //TouchAction ta = new TouchAction(driver);
        try { Thread.sleep(5000);}
        catch (Exception e1) {
            System.out.println("Exception");
        }
        int start_y=0;
        int end_x=1440;
        int end_y =start_y+2000;
        int start_x=0;

        driver.swipe(start_x, start_y,end_x,end_y, 6000);









        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement e3 = (MobileElement)driver.findElementByXPath("//android.widget.TextView[@text='Footwear']");
        e3.swipe(SwipeElementDirection.UP,20000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.closeApp();


        //driver.swipe(0,98,0,1878,2000);

      Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.5;
        int scrollStart = screenHeightStart.intValue();
        System.out.println("s="+scrollStart);
        Double screenHeightEnd = dimensions.getHeight() * 0.2;
        int scrollEnd = screenHeightEnd.intValue();
        driver.swipe(0,scrollStart,0,scrollEnd,2000);
        try {
            sleep(10000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        //WebElement e1 = driver.findElementByXPath("//android.widget.TextView[@text,\"'Men's Footwear\"]");
        //e1.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(e));
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebElement e2 = driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.llbean:id/product_image']");
        //e2.click();




        //driver.findElementByAndroidUIAutomator()

        homepage hp = new homepage(driver);
        hp.waitmethod(10, hp.catname());
        hp.catname().click();




    @Test
    public void atb(){

    driver.findElementByAndroidUIAutomator("text(\"Men's\")").click();
    }


*/