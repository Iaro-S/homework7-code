package ro.fasttrackit.homework7;

public class Product {
    public String name;
    public double price;
    public int quantity;
    public String category;


    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    double getPrice() {
        return price < 0 ? 0 : price;
    }

    int getQuantity() {
        return quantity;
    }

    String getName() {
        return name;
    }

    String getCategory() {
        return category;
    }

    boolean hasStock() {
        return quantity > 0;
    }

    boolean isCategory(String category) {
        return this.category.contains(category);
    }
}