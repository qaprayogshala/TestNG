public class HomePage {

    public static void selectItem(String itemName) {
        System.out.println(itemName + " selected.");
    }

    public static void addItemToCart() {
        System.out.println("Item Added To Cart.");
    }

    public static void goToCartPage() {
        System.out.println("Navigated to Cart Page!");
    }

    public static void removeItemFromCart(String... itemNames) {
        for (String itemName : itemNames)
            System.out.println(itemName + " removed from cart!");
    }

    public static void logout() {
        System.out.println("Logged out of application!");
    }
}
