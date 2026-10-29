public class CoffeeShop {
    public static void main(String[] args) {
        orderCoffee();
        orderCoffee("Espresso");

        String orderCookie1 = orderCookie();
        System.out.println(orderCookie1);

        String orderCookie2 = orderCookie("Chocolate Chip");
        System.out.println(orderCookie2);
    }
    public static void orderCoffee() {
        System.out.println("Order a default coffee");
    }
    public static void orderCoffee(String type) {
        System.out.println("Order a " + type + " coffee.");
    }
    public static String orderCookie() {
        return "Order a default cookie.";
    }
    public static String orderCookie(String type) {
        return "Order a " + type + " cookie.";
    }
}
