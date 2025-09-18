package org.skypro.skyshop.product;

public abstract class Product {
    private final String nameProduct;

    public Product() {
        this.nameProduct = " - ";
    }

    public Product(String nameProduct) {
        isCorrectName(nameProduct);
        this.nameProduct = nameProduct;
    }

    public String getName() {
        return nameProduct;
    }

    public abstract int getPrice();

    public abstract boolean isSpecial(Product product);

    public static void isCorrectName(String name) throws IllegalArgumentException {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Строка пустая. Заполните наименование продукта.");
        }
    }

}
