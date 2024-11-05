import org.testng.Assert;
import org.testng.annotations.*;

public class DatabaseTest {
    Database database = new Database();

    @BeforeGroups("dbTest")
//    @BeforeTest(alwaysRun = true)
    public void openDB() {
        database.openDatabaseConnection();
    }

    //    @Test(groups = "db Test",dependsOnMethods = {"isItemCountIncreased","isRemoveButtonDisplayed"})
//    @Test(groups = "homePageTest")
    @Test(dependsOnMethods = {"isItemCountIncreased", "isRemoveButtonDisplayed"})
//    @Test(dependsOnGroups = {"homePageTest"}, groups = {"dbTest"})
    public void verifyIfRecordInserted() {
        System.out.println("--DB Test--");
        String dbTableName = "cart";
        String itemName = "Bag";
        boolean actualValue = database.itemPresentInDB(dbTableName, itemName);
        boolean expectedValue = true;
        Assert.assertEquals(actualValue, expectedValue, "Fail: " + itemName + " Not present in " + dbTableName);
        System.out.println("Pass > Cart Item present in DB!");
    }

    @AfterGroups("dbTest")
//    @AfterTest(alwaysRun = true)
    public void closeDB() {
        database.closeDatabaseConnection();
    }
}