package org.skypro.skyshop.basket;

import org.skypro.skyshop.Product;

public class ProductBasket {


    private static Product[] products = new Product[5];


    public static void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                System.out.println("Продукт " + product.getName() + " добавлен в корзину!");
                break;
            } else if (i == products.length - 1) {
                System.out.println("Невозможно добавить продукт. В корзине нет места, " + product.getName() + " не добавлен");
                break;
            }
        }
    }


    public static int basketTotalPrice() {
        int total = 0;
        Product product = new Product();
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                product = products[i];
                total += product.getPrice();
            }
        }
        return total;
    }


    public static void printBasket() {
        Product product = new Product();
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                product = products[i];
                System.out.println("<" + product.getName() + ">" + ": " + "<" + product.getPrice() + ">");
            } else if (products[i] == null && i == (products.length - 1)) {
                System.out.println("В корзине пусто.");
            }
        }
    }


    public static boolean isAdded(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && product.getName() == products[i].getName()) {
                return true;
            } else if (products[i] == null && i == (products.length - 1)) {
                System.out.println("В корзине пусто.");
            }
        }
        return false;
    }


    public static void clearBasket() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        System.out.println("Корзине очищена.");
    }

}