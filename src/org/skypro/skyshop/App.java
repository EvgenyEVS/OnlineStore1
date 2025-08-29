package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {

        Product notebook = new Product("Notebook", 40000);
        Product table = new Product("Table", 15000);
        Product monitor = new Product("Monitor", 15000);
        Product keyboard = new Product("Keyboard", 2000);
        Product mouse = new Product("NMouse", 2000);
        Product board = new Product("Board", 1000);

        ProductBasket.addProduct(notebook);
        ProductBasket.addProduct(table);
        ProductBasket.addProduct(monitor);
        ProductBasket.addProduct(keyboard);
        ProductBasket.addProduct(mouse);
        ProductBasket.addProduct(board);

        System.out.println("Общая стоимость корзины = " + ProductBasket.basketTotalPrice());

        ProductBasket.printBasket();

        System.out.println("ProductBasket.isAdded(notebook) = " + ProductBasket.isAdded(notebook));

        ProductBasket.clearBasket();
        ProductBasket.printBasket();
        System.out.println("Общая стоимость корзины = " + ProductBasket.basketTotalPrice());
        System.out.println("ProductBasket.isAdded(notebook) = " + ProductBasket.isAdded(notebook));
    }
}
