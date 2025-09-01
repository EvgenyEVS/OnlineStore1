package org.skypro.skyshop.product;

public abstract class Product {
    private final String nameProduct;

    public Product() {
        this.nameProduct = " - ";
    }

    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getName() {
        return nameProduct;
    }

    public abstract int getPrice();

    public abstract boolean isSpecial(Product product);

}
