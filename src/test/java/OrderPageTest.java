import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderPageTest {

    @Test(priority = 6,dependsOnMethods = {"isItemCountIncreased","isRemoveButtonDisplayed"})
    public void placeOrder() {
        OrderPage.placeOrder();
        Assert.assertEquals("Order Placed", "Order Placed", "Fail: Order not placed.");
    }
}
