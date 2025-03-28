public class SideItem {
    public SideItem(){
        type = "Fries";
        price = 9.99;
    }

    public SideItem(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        String output = "";

        output += String.format("Side item: %s%n", type);
        output += String.format("  Price: R%.2f%n", price);

        return output;
    }

    public double getPrice() {
        return price;
    }

    public String type;
    public double price;
}
