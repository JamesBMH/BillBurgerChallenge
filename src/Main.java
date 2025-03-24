public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger();
        System.out.println(burger.toString());

        Burger CheeseBurger = new Burger("Cheese Burger", 55.45);
        CheeseBurger.addTopping("Cheese", 3.99);
        CheeseBurger.addTopping("Gherkins", 2.99);
        CheeseBurger.addTopping("Onions", 4.37);
        // Should complain about this 4'th topping
        CheeseBurger.addTopping("Mayo", 1.50);

        System.out.println(CheeseBurger.toString());
    }
}
