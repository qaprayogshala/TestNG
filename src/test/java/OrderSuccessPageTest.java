import org.testng.Assert;
import org.testng.annotations.*;

public class OrderSuccessPageTest {

//    @Test(priority = 5, groups = {"Regression"},enabled = false)
//    public void verifyOrderSuccessMessage() {
//        String actualMessage = OrderSuccessPage.getOrderSuccessMessage();
//        Assert.assertEquals(actualMessage, "Order Success!", "Fail: Order Success message mismatch!");
//    }
//
//    @Test(priority = 6, groups = {"Regression"},enabled = false)
//    public void verifyIfHomePageDisplayed() {
//        OrderSuccessPage.goToHomePage();
//    }

    //    @AfterTest
    @AfterSuite(alwaysRun = true)
//    @AfterGroups({"homePageTest"})
    public void verifyIfUserLoggedOut() {
        System.out.println("--After-Suite--");
        HomePage.logout();
    }
}
