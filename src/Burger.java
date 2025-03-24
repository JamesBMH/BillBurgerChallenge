public class Burger {
    public Burger(){
        this.type = "Cheese Burger";
        this.price = 45;
    }

    public Burger(String type, double price){
        this.type = type;
        this.price = price;
    }

    public void addTopping(String type, double price){
        if (topping1 == null){
            topping1 = new Topping(type, price);
            this.price += price;
        } else if (topping2 == null) {
            topping2 = new Topping(type, price);
            this.price += price;
        } else if (topping3 == null) {
            topping3 = new Topping(type, price);
            this.price += price;
        } else {
            System.out.println("No more toppings allowed.");
        }
    }

    @Override
    public String toString() {
        String output = "";
        output += String.format("Burger: %s%n", type);
        output += String.format(" Price: R%.2f%n", price);

        if (!(topping1 == null)){
            output += topping1.toString();
        }
        if (!(topping2 == null)){
            output += topping2.toString();
        }
        if (!(topping3 == null)){
            output += topping3.toString();
        }
        return output;
    }

    protected String type;
    protected double price;
    protected Topping topping1 = null;
    protected Topping topping2 = null;
    protected Topping topping3 = null;
}

class Topping {
    public Topping(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        String output = "";
        output += String.format("Topping: %s%n", type);
        output += String.format(" Price: %.2f%n", price);
        return output;
    }

    private String type;
    private double price;
}
