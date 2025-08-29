package org.skypro.skyshop;

public class Product {
    private final String nameProduct;
    private final int price;

    public Product() {
        this.nameProduct = " - ";
        this.price = 0;
    }

    public Product(String nameProduct, int price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getName() {
        return nameProduct;
    }

    public int getPrice() {
        return price;
    }

}
