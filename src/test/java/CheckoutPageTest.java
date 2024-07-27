import org.testng.annotations.Test;

public class CheckoutPageTest {

    @Test(priority = 3,groups = {"sanity"})
    public void verifyIfDeliveryAddressEntered() {
        CheckoutPage.enterdeliveryAddress("123 Business AB CDEF");
    }
}
