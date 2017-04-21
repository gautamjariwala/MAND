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
        app.productdisplaypage().scrollToSize();
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
        app.shippingInfo().firstNameField.sendKeys(properties.getProperty("user.firstname"));
        String FirstName = app.shippingInfo().firstNameField.getText();
        //app.shippingInfo().hideKeyboard();
        app.shippingInfo().lastNameField.sendKeys(properties.getProperty("user.lastname"));
        String LastName = app.shippingInfo().lastNameField.getText();
        app.shippingInfo().scrollToShippingInfoFooter();
        app.shippingInfo().addressLine1Field.sendKeys(properties.getProperty("user.addressline1"));
        String AddressLine1 = app.shippingInfo().addressLine1Field.getText();
        app.shippingInfo().addressLine2Field.sendKeys(properties.getProperty("user.addressline2"));
        String AddressLine2 = app.shippingInfo().addressLine2Field.getText();
        app.shippingInfo().SelectStateFromDropdown(properties.getProperty("user.state"));
        String State = app.shippingInfo().stateField.getText();
        app.shippingInfo().cityField.sendKeys(properties.getProperty("user.city"));
        String City = app.shippingInfo().cityField.getText();
        app.shippingInfo().zipCodeField.sendKeys(properties.getProperty("user.zipcode"));
        String ZipCode = app.shippingInfo().zipCodeField.getText();
        app.shippingInfo().phoneField.sendKeys(properties.getProperty("user.phonenumber"));
        app.shippingInfo().shippingInfoConinueButton.click();
        app.shippingInfo().addressVerificationhandling();

        //Navigate to Billing Info Screen by clicking continue in the footer
        app.billinginfo().emailAddressField.sendKeys(properties.getProperty("user.email"));
        app.billinginfo().confirmEmailAddressField.sendKeys(properties.getProperty("user.email"));
        app.billinginfo().promotionsCheckbox.click();
        app.billinginfo().billingInfoContinueButton.click();

        //Navigate to Payment Method Screen by clicking Continue in the footer
        app.addPaymentMethod().creditCardField.sendKeys(properties.getProperty("user.creditcard"));
        app.addPaymentMethod().expirationDateField.sendKeys(properties.getProperty("user.expirationdate"));

        //Navigate to Review Screen by clicking Continue in the footer
        app.addPaymentMethod().addPaymentMrthodContinueButton.click();
        //Assert.assertEquals(app.reviewOrderPage().billingAddressReviewScreen.getText(), FirstName);

        app.reviewOrderPage().BillingAddressAssertFunction(app.reviewOrderPage().billingAddressReviewScreen.getText(), properties.getProperty("user.firstname"));
        //Assert.assertTrue(app.reviewOrderPage().billingAddressReviewScreen.getText().contains(properties.getProperty("user.firstname")));
        app.reviewOrderPage().BillingAddressAssertFunction(app.reviewOrderPage().billingAddressReviewScreen.getText(), properties.getProperty("user.lastname"));
        //Assert.assertTrue(app.reviewOrderPage().billingAddressReviewScreen.getText().contains(properties.getProperty("user.lastname")));
        app.reviewOrderPage().BillingAddressAssertFunction(app.reviewOrderPage().billingAddressReviewScreen.getText(), properties.getProperty("user.addressline1"));
        //Assert.assertTrue(app.reviewOrderPage().billingAddressReviewScreen.getText().contains(properties.getProperty("user.addressline1")));
        app.reviewOrderPage().BillingAddressAssertFunction(app.reviewOrderPage().billingAddressReviewScreen.getText(), properties.getProperty("user.addressline2"));
        //Assert.assertTrue(app.reviewOrderPage().billingAddressReviewScreen.getText().contains(properties.getProperty("user.addressline2")));
        app.reviewOrderPage().BillingAddressAssertFunction(app.reviewOrderPage().billingAddressReviewScreen.getText(), properties.getProperty("user.city"));
        //Assert.assertTrue(app.reviewOrderPage().billingAddressReviewScreen.getText().contains(properties.getProperty("user.city")));
        app.reviewOrderPage().BillingAddressAssertFunction(app.reviewOrderPage().billingAddressReviewScreen.getText(), properties.getProperty("user.zipcode"));
        //Assert.assertTrue(app.reviewOrderPage().billingAddressReviewScreen.getText().contains(properties.getProperty("user.zipcode")));
        app.reviewOrderPage().BillingAddressAssertFunction(app.reviewOrderPage().billingAddressReviewScreen.getText(), properties.getProperty("user.country"));
        //Assert.assertTrue(app.reviewOrderPage().billingAddressReviewScreen.getText().contains(properties.getProperty("user.country")));
        app.reviewOrderPage().BillingAddressAssertFunction(app.reviewOrderPage().billingAddressReviewScreen.getText(), properties.getProperty("user.stateabbreviation"));
        //Assert.assertTrue(app.reviewOrderPage().billingAddressReviewScreen.getText().contains(properties.getProperty("user.stateabbreviation")));
        app.reviewOrderPage().BillingAddressAssertFunction(app.reviewOrderPage().billingAddressReviewScreen.getText(), properties.getProperty("user.expirationdatewithslash"));
        //Assert.assertTrue(app.reviewOrderPage().creditCardExpiratDateReviewScreen.getText().contains(properties.getProperty("user.expirationdatewithslash")));
        app.reviewOrderPage().BillingAddressAssertFunction(app.reviewOrderPage().billingAddressReviewScreen.getText(), properties.getProperty("user.cclastfourdigits"));
        //Assert.assertTrue(app.reviewOrderPage().creditCardNumberReviewScreen.getText().contains(properties.getProperty("user.cclastfourdigits")));


        app.reviewOrderPage().scrollToShippingAddress();
        app.reviewOrderPage().ShippingAddressAssertFunction(app.reviewOrderPage().shippingAddressReviewScreen.getText(), properties.getProperty("user.firstname"));
        app.reviewOrderPage().ShippingAddressAssertFunction(app.reviewOrderPage().shippingAddressReviewScreen.getText(), properties.getProperty("user.lastname"));
        app.reviewOrderPage().ShippingAddressAssertFunction(app.reviewOrderPage().shippingAddressReviewScreen.getText(), properties.getProperty("user.addressline1"));
        app.reviewOrderPage().ShippingAddressAssertFunction(app.reviewOrderPage().shippingAddressReviewScreen.getText(), properties.getProperty("user.addressline2"));
        app.reviewOrderPage().ShippingAddressAssertFunction(app.reviewOrderPage().shippingAddressReviewScreen.getText(), properties.getProperty("user.city"));
        app.reviewOrderPage().ShippingAddressAssertFunction(app.reviewOrderPage().shippingAddressReviewScreen.getText(), properties.getProperty("user.zipcode"));
        app.reviewOrderPage().ShippingAddressAssertFunction(app.reviewOrderPage().shippingAddressReviewScreen.getText(), properties.getProperty("user.country"));
        app.reviewOrderPage().ShippingAddressAssertFunction(app.reviewOrderPage().shippingAddressReviewScreen.getText(), properties.getProperty("user.stateabbreviation"));
        Assert.assertEquals(app.reviewOrderPage().freeShippingText.getText(), "FREE Shipping");

        app.reviewOrderPage().scrollToItemName();
        app.reviewOrderPage().ItemDetailsAssertFunction(app.reviewOrderPage().itemName, "Item Name is Displayed");
        //Assert.assertTrue(app.reviewOrderPage().itemName.isDisplayed(), "Item Name is Not Displayed");
        app.reviewOrderPage().scrollToItemPrice();
        app.reviewOrderPage().ItemDetailsAssertFunction(app.reviewOrderPage().itemPrice, "Item Price is Displayed");
        //Assert.assertTrue(app.reviewOrderPage().itemPrice.isDisplayed(), "Item Price is Not Displayed");
        app.reviewOrderPage().scrollToItemAvailability();
        app.reviewOrderPage().ItemDetailsAssertFunction(app.reviewOrderPage().itemAvailability, "Item Availabilty is Displayed");
        //Assert.assertTrue(app.reviewOrderPage().itemAvailability.isDisplayed(), "Item Availability is Not Displayed");


        app.reviewOrderPage().scrollToBottomOfThePage();
        Assert.assertTrue(app.reviewOrderPage().orderSummaryTitle.isDisplayed(), "Order Summary Title is Not Displayed");
        Assert.assertTrue(app.reviewOrderPage().itemInBagValue.isDisplayed(), "Item in Bag Value is Not Displayed");
        String itembagvalue = app.reviewOrderPage().itemInBagValue.getText();
        SaveOrderDetails.saveOrder("Item in Bag Value: " + itembagvalue);
        Assert.assertEquals(app.reviewOrderPage().shippingHandlingFreeValue.getText(), "Free", "Shipping & Handling is not Displayed as FREE");
        Assert.assertTrue(app.reviewOrderPage().subtotalValue.isDisplayed(), "Order Summary Title is Not Displayed");
        Assert.assertTrue(app.reviewOrderPage().taxValue.isDisplayed(), "Tax Value is Not Displayed");
        Assert.assertTrue(app.reviewOrderPage().orderTotalValue.isDisplayed(), "Order Total Value is Not Displayed");
        Assert.assertTrue(app.reviewOrderPage().cardChargeValue.isDisplayed(), "Balance to be Applied to Credit Card Value is Not Displayed");
        Assert.assertEquals(app.reviewOrderPage().bottomBarBalanceValue.getText(), app.reviewOrderPage().cardChargeValue.getText(), "Bottom Bar value doesn't match the amount being charged to credit card");

        app.addPaymentMethod().reviewpPageTopPlaceOrderButton.click();
        String orderNumber = app.addPaymentMethod().confirmationPopupNumber.getText();
        String orderAmount = app.addPaymentMethod().confirmationPopupAmount.getText();
        SaveOrderDetails.saveOrder("Order Number: " +orderNumber + "," + "Order Amount : " + orderAmount);


    }}

