package llbean.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by gjariwala on 3/15/2017.
 */


public class HappyPath1 extends BaseTest{

    /*helpermethods help = new helpermethods();
    help.setup1();*/

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void guestUserCheckout() {

        //HomeScreen
        app.homepage().explicitWait(10);
        app.homepage().swipeFunction();
        /*Assert.assertTrue(app.homepage().HomePageTitleIsVisible(), "HomePage Title is Not Displayed");
        Assert.assertTrue(app.homepage().HamburgerIconIsVisible(), "Hamburger Icon is Not Displayed");
        Assert.assertTrue(app.homepage().SearchIconIsVisible(), "Search Icon is Not Displayed");
        Assert.assertTrue(app.homepage().ShoppingBagIconIsVisible(), "Shopping Bag Icon is Not Displayed");
        Assert.assertTrue(app.homepage().ShopTabIsVisible(), "Shop Tab is Not Displayed");
        Assert.assertTrue(app.homepage().MensTabIsVisible(), "Men's Tab is Not Displayed");
        Assert.assertTrue(app.homepage().WomensTabIsVisible(), "Women's Tab is Not Visible");
        Assert.assertTrue(app.homepage().KidsTabIsVisible(), "Kids' Tab is Not Visible");
        Assert.assertTrue(app.homepage().FootwearTabIsVisible(), "Footwear Tab is Not Visible");

        //Department: Men's
        app.homepage().clickOnmensDepartmentTab();
        Assert.assertTrue(app.homepage().HamburgerIconIsVisible(), "Hamburger Icon is Not Displayed");
        Assert.assertTrue(app.homepage().SearchIconIsVisible(), "Search Icon is Not Displayed");
        Assert.assertTrue(app.homepage().ShoppingBagIconIsVisible(), "Shopping Bag Icon is Not Displayed");
        Assert.assertTrue(app.departmentpage().ShopByCategoryTitleIsPresent(), "Shop By Category Title Is Not Displayed");
        Assert.assertTrue(app.departmentpage().FirstCategoryTileIsPresent(), "First Product Tile is Not Displayed");
        Assert.assertTrue(app.departmentpage().SecondCategoryTileIsPresent(), "Second Product Tile is Not Displayed");

        //Category: Outerwear
        app.departmentpage().clickOnOuterwearCategory();
        Assert.assertTrue(app.basecategorypage().BackArrowIconIsPresnet(), "Back Arrow Icon is Not Displayed");
        Assert.assertTrue(app.homepage().SearchIconIsVisible(), "Search Icon is Not Displayed");
        Assert.assertTrue(app.homepage().ShoppingBagIconIsVisible(), "Shopping Bag Icon is Not Displayed");
        Assert.assertTrue(app.basecategorypage().FirstProductTileIsPresent(), "First Product Tile is Not Displayed");
        Assert.assertTrue(app.basecategorypage().SecondProductTileIsPresent(), "Second Product Tile is Not Displayed");

        //SubCategory: Jackets & Coats
        app.basecategorypage().clickOnSubCategory();
        Assert.assertTrue(app.basecategorypage().BackArrowIconIsPresnet(), "Back Arrow Icon is Not Displayed");
        Assert.assertTrue(app.homepage().SearchIconIsVisible(), "Search Icon is Not Displayed");
        Assert.assertTrue(app.homepage().ShoppingBagIconIsVisible(), "Shopping Bag Icon is Not Displayed");


        //Navigate to PDP by clicking on first Product Tile
        app.basecategorypage().clickOnFirstProduct();

        //app.productdisplaypage().scrollUpCurrentView();
        //app.productdisplaypage().scrollUpCurrentView();

        app.productdisplaypage().movetoanelement();
        app.productdisplaypage().clickColorChip();
        app.productdisplaypage().clickSizeChip();
        app.productdisplaypage().addToBagButton.click();*/

    }}

