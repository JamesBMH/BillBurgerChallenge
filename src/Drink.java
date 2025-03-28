public class Drink {
    public Drink(){
        this.type = "Coke";
        changeSize("M");
    }

    public Drink(String type, String size){
        this.type = type;
        changeSize(size);
    }

    public void changeSize(String size){
        this.size = size;

        if ("sS".contains(size)){
            price = 9.99;
        } else if ("mM".contains(size)){
            price = 12.99;
        } else if ("lL".contains(size)){
            price = 15.99;
        }
    }

    @Override
    public String toString() {
        String output = "";

        output += String.format("Drink: %s%n", type);

        if ("sS".contains(size)){
            output += String.format(" Size: Small%n");
        } else if ("mM".contains(size)){
            output += String.format(" Size: Medium%n");
        } else if ("lL".contains(size)){
            output += String.format(" Size: Large%n");
        }

        output += String.format("  Price: R%.2f%n", price);

        return output;
    }

    public double getPrice() {
        return price;
    }

    private String type;
    private String size;
    private double price;
}
