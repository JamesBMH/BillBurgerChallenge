public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger();
        System.out.println(burger.toString());

        Burger CheeseBurger = new Burger("Cheese Burger", 55.45);
        CheeseBurger.addTopping("Cheese", 3.99);
        CheeseBurger.addTopping("Gherkins", 2.99);
        CheeseBurger.addTopping("Onions", 4.37);
        // Should complain about this 4'th topping
        CheeseBurger.addTopping("Mayo", 1.49);

        System.out.println(CheeseBurger.toString());

        Burger deluxeBurger = new DeluxeBurger();

        deluxeBurger.addTopping("Cheese", 3.99);
        deluxeBurger.addTopping("Onions", 2.99);
        deluxeBurger.addTopping("Relish", 2.75);
        deluxeBurger.addTopping("BBQ Sauce", 4.99);
        deluxeBurger.addTopping("Mayo", 1.49);
        // Should complain about 6'th topping
        deluxeBurger.addTopping("Gherkins", 2.99);

        System.out.println(deluxeBurger.toString());

        Drink defaultDrink = new Drink();
        System.out.println(defaultDrink.toString());

        Drink drink = new Drink("Fanta", "l");
        System.out.println(drink.toString());
        drink.changeSize("s");
        System.out.println(drink.toString());

        SideItem sideItem = new SideItem();
        System.out.println(sideItem.toString());

        SideItem customSideItem = new SideItem("Potato", 15.99);
        System.out.println(customSideItem.toString());
    }
}
