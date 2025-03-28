public class Main {
    public static void main(String[] args) {
        MealOrder mealOrder = new MealOrder();
        System.out.print(mealOrder.toString());

        Burger burger = new Burger("Chicken Burger", 49.99);
        Drink drink = new Drink("Pepsi", "L");
        SideItem sideItem = new SideItem("Baked Potato", 14.99);

        MealOrder customMealOrder = new MealOrder(burger, drink, sideItem);
        System.out.print(customMealOrder.toString());

        customMealOrder.addToppings("Mayo", 2.99);
        customMealOrder.addToppings("Gherkins", 0.99);
        System.out.print(customMealOrder.toString());

        customMealOrder.changeDrinkSize("S");
        System.out.print(customMealOrder.toString());

        Burger deluxeBurger = new DeluxeBurger();
        Drink deluxeDrink = new Drink("Mountain dew", "L");
        SideItem deluxeSideItem = new SideItem("Salad", 6.99);

        MealOrder deluxeMealOrder = new MealOrder(deluxeBurger, deluxeDrink, deluxeSideItem);
        System.out.print(deluxeMealOrder.toString());

        deluxeMealOrder.addToppings("Mayo", 2.99);
        deluxeMealOrder.addToppings("Gherkins", 0.99);
        deluxeMealOrder.addToppings("Tuna", 3.99);
        deluxeMealOrder.addToppings("Ketchup", 2.99);

        System.out.print(deluxeMealOrder.toString());

        deluxeMealOrder.changeDrinkSize("S");
        System.out.print(deluxeMealOrder.toString());
    }
}
