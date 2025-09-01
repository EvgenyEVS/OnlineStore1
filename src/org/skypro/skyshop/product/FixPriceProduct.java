package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int FIXPRICE = 999;

    public FixPriceProduct(String nameProduct) {
        super(nameProduct);
    }

    @Override
    public int getPrice() {
        return FIXPRICE;
    }

    @Override
    public boolean isSpecial(Product product) {
        return true;
    }

    @Override
    public String toString() {
        return "<" + getName() + ">:" + "<" + "Фиксированная цена " + FIXPRICE + ">";
    }

}
