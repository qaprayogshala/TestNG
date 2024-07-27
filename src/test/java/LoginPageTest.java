import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

//    @BeforeTest
    @BeforeGroups("sanity")
    public void userLogsIn() {
        LoginPage.enterUserName();
        LoginPage.enterPassword();
        LoginPage.clickLoginButton();
    }

}
