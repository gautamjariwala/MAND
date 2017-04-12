package llbean.tests;


import llbean.utils.SaveOrderDetails;
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
    public void guestUserCheckout() throws Exception{

        //HomeScreen
        Thread.sleep(15000);

        Assert.assertTrue(app.homepage().HomePageTitleIsVisible(), "HomePage Title is Not Displayed");
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
        app.productdisplaypage().ProductTabIsPresent();
        String itemnumberpdp = app.productdisplaypage().productId.getText();
        app.productdisplaypage().AboutTabIsPresent();
        app.productdisplaypage().ReviewsTabIsPresent();
        app.productdisplaypage().SimilarProductsTabIsPresent();
        app.productdisplaypage().scrollToProductName();
        app.productdisplaypage().ProductNameIsPresent();
        app.productdisplaypage().ProductIdIsPresent();
        app.productdisplaypage().ReviewCountIsPresent();
        app.productdisplaypage().SellingDescriptionIsPresent();
        app.productdisplaypage().scrollToColors();

        //app.productdisplaypage().scrollUpCurrentView();
        //app.productdisplaypage().scrollUpCurrentView();

        //app.productdisplaypage().movetoanelement();
        app.productdisplaypage().clickColorChip();
        app.productdisplaypage().clickSizeChip();
        app.productdisplaypage().ProductPriceIsPresent();
        app.productdisplaypage().AddToBagButtonIsPresent();
        app.productdisplaypage().addToBagButton.click();
        app.productdisplaypage().CheckoutButtonIsVisible();
        app.productdisplaypage().AddedSuccessfullyTextIsVisible();

        //Navigate to SB by clicking CHECKOUT in the footer
        app.productdisplaypage().checkoutButton.click();
        app.shoppingBag().ShoppingBagTitleIsPresent();
        String itemnumbersb = app.shoppingBag().itemNumberShoppingBag.getText();
        app.shoppingBag().CheckoutHeaderButtonIsPresent();
        //app.shoppingBag().CheckoutFooterButtonIsPresent();
        app.shoppingBag().ItemCounterIsPresent();
        app.shoppingBag().ItemNameIsPresent();
        app.shoppingBag().ItemNumberIsPresent();
        Assert.assertEquals(itemnumbersb, itemnumbersb, "Item Number Doesn't Match");
        app.shoppingBag().ItemPriceIsPresent();
        app.shoppingBag().scrollToFooter();
        app.shoppingBag().OrderSummaryTitleIsPresent();
        app.shoppingBag().ItemsInBagTextIsPresent();
        app.shoppingBag().EstShippingHandlingTextIsPresent();
        app.shoppingBag().EstSubtotalTextIsPresent();
        app.shoppingBag().EstTotalTextIsPresent();
        app.shoppingBag().EstBalanceTextIsPresent();
        app.shoppingBag().EstTaxTextIsPresent();
        app.shoppingBag().CheckoutInPageFoterButtonIsPresent();
        app.shoppingBag().checkoutInPageFooterButton.click();

        //Navigate to Shipping Info Screen by clicking CHECKOUT in the footer
        Assert.assertTrue(app.shoppingBag().CheckoutAsGuestButtonIsPresent(), "Checkout As Guest User Button is not present");
        Assert.assertTrue(app.shoppingBag().CheckoutAsRuButtonIsPresent(), "Checkout As RU Button is not present");
        app.shoppingBag().checkoutAsGuestButton.click();
        Thread.sleep(5000);
        app.shippingInfo().firstNameField.sendKeys("Gautam");
        //app.shippingInfo().hideKeyboard();
        app.shippingInfo().lastNameField.sendKeys("Jariwala");
        app.shippingInfo().scrollToShippingInfoFooter();
        app.shippingInfo().addressLine1Field.sendKeys("xyz");
        app.shippingInfo().addressLine2Field.sendKeys("abc");
        app.shippingInfo().SelectStateFromDropdown("MAINE");
        app.shippingInfo().cityField.sendKeys("Westbrook");
        app.shippingInfo().zipCodeField.sendKeys("04092");
        app.shippingInfo().phoneField.sendKeys("1234567890");
        app.shippingInfo().shippingInfoConinueButton.click();
        app.shippingInfo().addressVerificationhandling();

        //Navigate to Billing Info Screen by clicking continue in the footer
        app.billinginfo().emailAddressField.sendKeys("g@g.com");
        app.billinginfo().confirmEmailAddressField.sendKeys("g@g.com");
        app.billinginfo().promotionsCheckbox.click();
        app.billinginfo().billingInfoContinueButton.click();

        //Navigate to Payment Method Screen by clicking Continue in the footer
        app.addPaymentMethod().creditCardField.sendKeys("4111111111111111");
        app.addPaymentMethod().expirationDateField.sendKeys("1225");
        app.addPaymentMethod().addPaymentMrthodContinueButton.click();

        //Navigate to Review Screen by clicking Continue in the footer
        app.addPaymentMethod().reviewpPageTopPlaceOrderButton.click();
        String orderNumber = app.addPaymentMethod().confirmationPopupNumber.getText();
        String orderAmount = app.addPaymentMethod().confirmationPopupAmount.getText();
        SaveOrderDetails.saveOrder("Order Number: " +orderNumber + "," + "Order Amount : " + orderAmount);


    }}

