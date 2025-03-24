public class Burger {
    Burger(){
        this.type = "Cheese Burger";
        this.price = 45;
    }

    Burger(String type, double price){
        this.type = type;
        this.price = price;
    }

    private String type;
    private double price;
//    private Topping topping1;
//    private Topping topping2;
//    private Topping topping3;
}
