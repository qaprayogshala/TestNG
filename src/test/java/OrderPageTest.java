import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderPageTest {

    @Test(priority = 4,groups = {"sanity"})
    public void placeOrder() {
        OrderPage.placeOrder();
        Assert.assertEquals("Order Placed", "Order Placed", "Fail: Order not placed.");
    }
}
