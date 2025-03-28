public class Burger {
    public Burger(){
        this.type = "Cheese Burger";
        this.price = 44.99;
        this.totalPrice = this.price;
    }

    public Burger(String type, double price){
        this.type = type;
        this.price = price;
        this.totalPrice = price;
    }

    public void addTopping(String type, double price){
        if (topping1 == null){
            topping1 = new Topping(type, price);
            System.out.println(topping1.getType() + " added!");
            this.totalPrice += price;
        } else if (topping2 == null) {
            topping2 = new Topping(type, price);
            System.out.println(topping2.getType() + " added!");
            this.totalPrice += price;
        } else if (topping3 == null) {
            topping3 = new Topping(type, price);
            System.out.println(topping3.getType() + " added!");
            this.totalPrice += price;
        } else {
            System.out.println("No more toppings allowed.");
        }
    }

    @Override
    public String toString() {
        String output = "";
        output += String.format("Burger: %s%n", type);
        output += String.format("  Price: R%.2f%n", price);

        if (!(topping1 == null)){
            output += topping1.toString();
        }
        if (!(topping2 == null)){
            output += topping2.toString();
        }
        if (!(topping3 == null)){
            output += topping3.toString();
        }

        if (totalPrice != price) {
            output += String.format("Burger total with toppings: R%.2f%n", totalPrice);
        }

        return output;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    protected String type;
    protected double price;
    private double totalPrice;
    protected Topping topping1 = null;
    protected Topping topping2 = null;
    protected Topping topping3 = null;
}

// If a burger already has a topping and it is added it will count as a double topping
// Ex. a cheese burger with cheese added will have 2 slices of cheese
class Topping {
    public Topping(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        String output = "";
        output += String.format(" Topping: %s%n", type);
        output += String.format("  Price: R%.2f%n", price);
        return output;
    }

// Deluxe burger extra toppings do not affect price, requires own toString
    public String toStringDeluxe(){
        String output = "";
        output += String.format(" Topping: %s%n", type);
        return output;
    }

    private String type;
    private double price;
}


class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        type = "Deluxe Burger";
        price = 89.99;
    }

    @Override
    public void addTopping(String type, double price) {
        if (topping1 == null){
            topping1 = new Topping(type, price);
            System.out.println(topping1.getType() + " added!");
        } else if (topping2 == null) {
            topping2 = new Topping(type, price);
            System.out.println(topping2.getType() + " added!");
        } else if (topping3 == null) {
            topping3 = new Topping(type, price);
            System.out.println(topping3.getType() + " added!");
        } else if (topping4 == null) {
            topping4 = new Topping(type, price);
            System.out.println(topping4.getType() + " added!");
        } else if (topping5 == null) {
            topping5 = new Topping(type, price);
            System.out.println(topping5.getType() + " added!");
        } else {
            System.out.println("No more toppings allowed.");
        }
    }

    @Override
    public String toString() {
        String output = "";

        output += String.format("Burger: %s%n", type);

        if (!(topping1 == null)){
            output += topping1.toStringDeluxe();
        }
        if (!(topping2 == null)){
            output += topping2.toStringDeluxe();
        }
        if (!(topping3 == null)){
            output += topping3.toStringDeluxe();
        }
        if (!(topping4 == null)){
            output += topping4.toStringDeluxe();
        }
        if (!(topping5 == null)){
            output += topping5.toStringDeluxe();
        }

        output += String.format("Burger total: R%.2f%n", price);

        return output;
    }

    @Override
    public double getTotalPrice() {
        return price;
    }

    private Topping topping4 = null;
    private Topping topping5 = null;
}