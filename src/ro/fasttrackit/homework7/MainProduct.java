package ro.fasttrackit.homework7;

import java.text.DecimalFormat;

public class MainProduct {
    public static void main(String[] args) {
        Product myProduct = new Product("Product1", 10.50, 17, "categ1");

        System.out.println(myProduct.getName());
        System.out.printf("%,.2f%n",myProduct.getPrice());
        System.out.println(myProduct.getQuantity());
        System.out.println(myProduct.getCategory());
        System.out.println(myProduct.hasStock());

    }
}
