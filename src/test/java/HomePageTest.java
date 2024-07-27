import org.testng.annotations.Test;

public class HomePageTest {

    @Test(priority = 1,groups = {"sanity"})
    public void verifyIfItemAddedToCart() {
        HomePage.selectItem("Bag");
        HomePage.addItemToCart();
    }
}
