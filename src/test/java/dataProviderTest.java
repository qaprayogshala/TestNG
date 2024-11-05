import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataProviderTest {

    // This method will provide the required data.
    @DataProvider(name = "test1")
    public Object[][] createData() {
        return new Object[][]{

                {"Cedric", 21},
                {"Rohan", 32}

        };
    }

    //This method will consume the data.
    @Test(dataProvider = "test1")
    public void dataProviderTest1(String name,Integer age) {
        System.out.println(name + " "+age);
    }

    // This method will consume data from a seperate class.
    @Test(dataProvider = "dataFromClass", dataProviderClass = dataProviderClass.class)
    public void dataProviderTest2(String name, String maritalStatus, boolean flag) {
        System.out.println(name + " " + maritalStatus + " " + flag);
    }

//    @Parameters({"dataSource"})
//    @Test
//    public void testParameter(String dataProvider) {
//        System.out.println("data Source:" + dataProvider);
//    }

}
