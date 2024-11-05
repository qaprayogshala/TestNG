import org.testng.annotations.Test;

public class CheckoutPageTest {

    @Test(priority = 7)
    public void verifyIfDeliveryAddressEntered() {
        CheckoutPage.enterdeliveryAddress("123 Business AB CDEF");
    }
}
