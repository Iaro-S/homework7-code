package ro.fasttrackit.homework7;

public class MainProduct {
    public static void main(String[] args) {
        Product myProduct = new Product("Product1", 10.50, 17, "categ3");

        System.out.println(myProduct.getName());
        System.out.printf("%,.2f%n", myProduct.getPrice());
        System.out.println(myProduct.getQuantity());
        System.out.println(myProduct.getCategory());
        System.out.println(myProduct.hasStock());
        System.out.println(myProduct.isCategory("categ1"));

        Product first = new Product("Product1", 8.54, 10, "categ1");
        System.out.println("\n" + first.getName() + ", " + first.getPrice() + ", " + first.getQuantity() + ", "
                + first.hasStock() + ", " + first.isCategory("categ3"));
        Product second = new Product("Product2", 23.50, 17, "categ2");
        System.out.println(second.getName() + ", " + second.getPrice() + ", " + second.getQuantity() + ", "
                + second.hasStock() + ", " + second.isCategory("categ1"));
        Product third = new Product("Product3", -10, -15, "categ3");
        System.out.println(third.getName() + ", " + third.getPrice() + ", " + third.getQuantity() + ", "
                + third.hasStock() + ", " + third.isCategory("categ1"));

    }
}
