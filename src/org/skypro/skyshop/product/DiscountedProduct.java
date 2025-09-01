package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int price;
    private int discount;

    public DiscountedProduct() {
        super(" - ");
        this.price = 0;
        this.discount = 0;
    }

    public DiscountedProduct(String nameProduct, int price, int discount) {
        super(nameProduct);
        this.price = price;
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        return (int) (price * (1 - discount / 100d));
    }

    @Override
    public boolean isSpecial(Product product) {
        return true;
    }

    @Override
    public String toString() {
        return "<" + getName() + ">: " + "<" + price + ">" + "(" + discount + ")";
    }
}
