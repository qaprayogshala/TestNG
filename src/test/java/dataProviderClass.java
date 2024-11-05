import org.testng.annotations.DataProvider;

public class dataProviderClass {

    @DataProvider(name = "dataFromClass")
    public static Object[][] createData(){
        return new Object[][]{
                {"Ajay","Married",true},
                {"Bob","Married",false}
        };
    }

    @DataProvider(name = "loginCredentials")
    public static Object[][] loginData(){
        return new Object[][]{
                {"standard_user","secret_sauce"},
                {"locked_out_user","secret_sauce"},
                {"problem_user","secret_sauce"},
                {"performance_glitch_user","secret_sauce"}
        };
    }
}
