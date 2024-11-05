public class Database {

    public void openDatabaseConnection() {
        System.out.println("DB Connection Open!");
    }

    public boolean itemPresentInDB(String dbTableName, String itemName) {
        return true;
    }

    public void closeDatabaseConnection() {
        System.out.println("DB Connection Closed!");
    }
}
