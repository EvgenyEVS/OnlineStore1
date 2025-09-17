package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class ProductBasket {
    private Product[] products = new Product[5];


    // 1. добавление в корзину
    public void addProduct(Product product) {
        if (product == null) {
            throw new NullPointerException("Невозможно добавить объект null");
        }

        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                System.out.println("Продукт " + product.getName() + " добавлен в корзину!");
                break;
            } else if (i == products.length - 1) {
                System.out.println("Невозможно добавить продукт. В корзине нет места, " + product.getName() + " не добавлен");
                return;
            }
        }
    }

    // 2. получение общеей стоимости корзины
    public int basketTotalPrice() {
        int total = 0;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (products[i] != null) {
                total += product.getPrice();
            }
        }
        return total;
    }

    // 3. печать содержиого корзины в определенном виде
    public void printBasket() {
        int total = 0;
        int counterSpecial = 0;
        boolean isBasketEmpty = true;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                Product product = products[i];
                System.out.println(product.toString());
                total += product.getPrice();
                isBasketEmpty = false;
                if (product.isSpecial(product)) {
                    counterSpecial += 1;
                }
            }
        }
        if (isBasketEmpty == true) {
            System.out.println("В корзине пусто.");
        }
        System.out.println("Итого: " + total);
        System.out.println("Специальных товаров: " + counterSpecial);
    }


    // 4. Проверка по имени продукта, есть ли продукт в корзине
    public boolean isAdded(Product product) {
        if (product == null) {
            return false;
        }

        boolean isEmpty = true;

        for (Product value : products) {
            if (value != null) {
                isEmpty = false;
                if (product.getName().equals(value.getName())) {
                    return true;
                }
            }
        }
        if (isEmpty) {
            System.out.println("В корзине пусто.");
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