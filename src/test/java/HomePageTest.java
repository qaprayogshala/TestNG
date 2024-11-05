import org.testng.Assert;
import org.testng.annotations.*;

@Test(groups = "homePageTest")
public class HomePageTest {

//    @BeforeMethod(groups = {"homePageTest"}, enabled = false)
//    public void beforeMethod() {
//        System.out.println("--before Method--");
//    }

    @BeforeTest(inheritGroups = false, groups = "setup")
    public void setUpHomePageTest() {
        System.out.println("--BeforeTest--");
        boolean isHomePageLoaded = true;//actualValue;
        Assert.assertTrue(isHomePageLoaded, "Fail: Home Page Not Loaded");
        System.out.println("Home page loaded!");
//        System.out.println("beforeGroups_Method_Check > Cart is Empty");
    }

//    @BeforeClass(inheritGroups = false, groups = "setup")
//    public void isCartEmpty() {
//        System.out.println("--before Test > setUp Method --");
//        boolean isCartEmpty = true;//actual Value
//        boolean expectedValue = true;
//        Assert.assertEquals(isCartEmpty, expectedValue, "Fail: Cart is not empty!");
//        System.out.println("--Cart is Empty--");
//        HomePage.selectItem("Bag");
//        HomePage.addItemToCart();
//    }

    @Test(priority = -1)
//    public void isItemCountIncreased()
    public void B(){
        System.out.println("--B Test begins--");
        HomePage.selectItem("Bag");
        HomePage.addItemToCart();
        boolean itemCountIncreased = true;//actual Value
        boolean expectedValue = true;
        Assert.assertEquals(itemCountIncreased, expectedValue, "Fail: Item count didn't increase!");
        System.out.println("Test1 Pass > Item Count Increased!");
    }

    @Test(priority = 1)
//    public void isRemoveButtonDisplayed()
    public void A(){
        System.out.println("--A Test begins--");
        boolean removeButtonDisplayed = true;//actual Value
        boolean expectedValue = true;
        Assert.assertEquals(removeButtonDisplayed, expectedValue, "Fail: removeButton did not display!");
        System.out.println("Test2 Pass > remove Button Displayed!");
    }

//    @AfterGroups(value = "homePageTest",enabled = false)
//    public void afterGroups() {
//        System.out.println("--after Groups--");
//    }

    @AfterTest(inheritGroups = false, groups = "tearDown")
    public void removeItemsAddedToCart() {
        System.out.println("--AfterTest--");
        HomePage.removeItemFromCart("Bag");
    }

//    @BeforeGroups(value = "cartPageTest", enabled = false)
//    public void goToCartPage() {
//        HomePage.goToCartPage();
//    }
//
//    @AfterClass(groups = {"homePageTest"}, enabled = false)
//    public void afterClass() {
//        System.out.println("--after Class--");
//    }
//
//    @AfterMethod(groups = {"homePageTest"}, enabled = false)
//    public void afterMethod() {
//        System.out.println("--after Method--");
//    }
//    @AfterClass(enabled = false)
//    public void tearDownHomePageTest() {
//        boolean isCartPageLoaded = true;//actualValue;
//        Assert.assertTrue(isCartPageLoaded, "Fail: Cart Page Not Loaded");
//        System.out.println("afterGroups_Method_Check > Cart is Empty");
////        System.out.println("Cart page loaded!");
//    }

}