public class MealOrder {
    public MealOrder() {
        burger = new Burger();
        drink = new Drink();
        sideItem = new SideItem();
    }

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void addToppings(String type, double price){
        burger.addTopping(type, price);
    }

    public void changeDrinkSize(String size){
        drink.changeSize(size);
    }

    public double calculateTotal(){
        total = 0;

        total += burger.getTotalPrice();
        if(!(burger.getClass().getSimpleName() == "DeluxeBurger")) {
            total += drink.getPrice();
            total += sideItem.getPrice();
        }

        return total;
    }

    @Override
    public String toString() {
        String output = "";

        calculateTotal();

        output += burger.toString();
        output += drink.toString();
        output += sideItem.toString();
        output += String.format("Total: R%.2f%n%n", total);

        return output;
    }

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    private double total;
}
