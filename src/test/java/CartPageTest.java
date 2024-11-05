import org.testng.Assert;
import org.testng.annotations.*;

public class CartPageTest {

    @BeforeGroups("cartPageTest")
//    @BeforeTest()
    public void isCartPageDisplayed(){
        boolean isCartPageDisplayed = true; //actual Value
        boolean expectedValue = true;
        Assert.assertEquals(isCartPageDisplayed, expectedValue, "Fail: Cart Page Not displayed!");
    }

    @Test(priority = 3,groups = {"cartPageTest"})
    public void verifyIfItemAddedToCart() {
        boolean isItemAddedToCart = true; //actual Value
        boolean expectedValue = true;
        Assert.assertEquals(isItemAddedToCart, expectedValue, "Fail: Item is not added to cart!");
        System.out.println("Test1 Pass: Test > To Verify if item got added to cart.");
    }

    @Test(priority = 4,groups = {"cartPageTest"})
    public void verifyItemPrice() {
        float actualItemPrice = 29.99F;
        float expectedItemPrice = 29.99F;
        Assert.assertEquals(actualItemPrice, expectedItemPrice, "Fail: Item Price Mis - Match!");
        System.out.println("Test2 Pass > Item Price Matches!");
    }

    @AfterGroups("cartPageTest")
    public void emptyCart() {
        CartPage.removeItem("Bag");
    }
}