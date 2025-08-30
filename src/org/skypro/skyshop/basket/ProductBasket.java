package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] products = new Product[5];


    // 1. добавление в корзину
    public void addProduct(Product product) {
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

    // 2. получение общеей стоимости корзины
    public int basketTotalPrice() {
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

    // 3. печать содержиого корзины в определенном виде
    public void printBasket() {
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

    // 4. Проверка по имени продукта, есть ли продукт в корзине
    public boolean isAdded(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && product.getName() == products[i].getName()) {
                return true;
            } else if (products[i] == null && i == (products.length - 1)) {
                System.out.println("В корзине пусто.");
            }
        }
        return false;
    }

    // 5. очистка корзины
    public void clearBasket() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        System.out.println("Корзине очищена.");
    }

}