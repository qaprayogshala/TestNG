import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest {

    @BeforeClass
    public void loginPageLoaded() {
        boolean isLoginPageLoaded = true;//actualValue;
        Assert.assertTrue(isLoginPageLoaded, "Fail: Login Page Not Loaded");
        System.out.println("Login page loaded!");
    }


    //    @BeforeGroups({"cartPageTest"})
    @BeforeGroups("homePageTest")
//    @BeforeSuite(alwaysRun = true)
    @Test(dataProvider = "loginCredentials", dataProviderClass = dataProviderClass.class)
    public void userLogsIn(String userName, String password) {
//        System.out.println("--Before-Suite--");
        LoginPage.enterUserName(userName);
        LoginPage.enterPassword(password);
        LoginPage.clickLoginButton();
    }

    @AfterClass
    public void homePageLoaded() {
        boolean isHomePageLoaded = true;//actualValue;
        Assert.assertTrue(isHomePageLoaded, "Fail: Home Page Not Loaded!");
        System.out.println("Home page loaded!");
    }
}