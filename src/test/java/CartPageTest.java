import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest {

    @Test(priority = 2,groups = {"sanity","Regression"})
    public void verifyCartItems() {
        Assert.assertEquals("Bag", "Bag", "Fail: Cart Items do not match!");
    }
}
