import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class OrderSuccessPageTest {

    @Test(priority = 5, groups = {"Regression"})
    public void verifyOrderSuccessMessage() {
        String actualMessage = OrderSuccessPage.getOrderSuccessMessage();
        Assert.assertEquals(actualMessage, "Order Success!", "Fail: Order Success message mismatch!");
    }

    @Test(priority = 6, groups = {"Regression"})
    public void verifyIfHomePageDisplayed() {
        OrderSuccessPage.goToHomePage();
    }

//    @AfterTest
    @AfterGroups("sanity")
    public void verifyIfUserLoggedOut() {
        HomePage.logout();
    }
}
