package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;


public class App {
    public static void main(String[] args) {

        // создание корзины №1, зааполнение до отказа, демонстрция методов
        ProductBasket productBasket1 = new ProductBasket();

        // создал продукты
        Product notebook = new SimpleProduct("Notebook", 40000);
        Product table = new SimpleProduct("Table", 15000);
        Product monitor = new DiscountedProduct("Monitor", 15000, 30);
        Product keyboard = new FixPriceProduct("Keyboard");
        Product mouse = new FixPriceProduct("Mouse");
        Product board = new DiscountedProduct("Board", 1000, 50);

        // 1. добавил в корзину
        productBasket1.addProduct(notebook);
        productBasket1.addProduct(table);
        productBasket1.addProduct(monitor);
        productBasket1.addProduct(keyboard);
        productBasket1.addProduct(mouse);
        productBasket1.addProduct(board); // 2. не помещается

        // проверка: 3. печать заполненной корзины
        productBasket1.printBasket();

        // 4. общая стоимость корзины с товарами
        System.out.println("Общая стоимость корзины = " + productBasket1.basketTotalPrice());


        // 5. поиск в корзине продукта по имени
        System.out.println("ProductBasket.isAdded(notebook) = " + productBasket1.isAdded(notebook));

        // 6. поиск в корзине продукта по имени (нет продукта)
        System.out.println("ProductBasket.isAdded(mouse) = " + productBasket1.isAdded(mouse));

        // 7. очистить корзину
        productBasket1.clearBasket();

        // 8. печать пустой корзины
        productBasket1.printBasket();

        // 9. печать общей стоимости пустой корзины
        System.out.println("Общая стоимость корзины = " + productBasket1.basketTotalPrice());

        // 10. поиск продукта по имени в путой корзине
        System.out.println("ProductBasket.isAdded(notebook) = " + productBasket1.isAdded(notebook));


        //
        // создание  корзины №2, добавление 2 товаров, демонстрация
        System.out.println("\n создание  корзины №2, добавление 2 товаров, демонстрация");
        ProductBasket productBasket2 = new ProductBasket();

        productBasket2.addProduct(monitor);
        productBasket2.addProduct(keyboard);

        // проверка: 3. печать заполненной корзины
        productBasket2.printBasket();

        // 4. общая стоимость корзины с товарами
        System.out.println("Общая стоимость корзины = " + productBasket2.basketTotalPrice());


        // 5. поиск в корзине продукта по имени
        System.out.println("ProductBasket.isAdded(notebook) = " + productBasket2.isAdded(notebook));

        // 6. поиск в корзине продукта по имени (нет продукта)
        System.out.println("ProductBasket.isAdded(monitor) = " + productBasket2.isAdded(monitor));

        // 7. очистить корзину
        productBasket2.clearBasket();

        // 8. печать пустой корзины
        productBasket2.printBasket();

        // 9. печать общей стоимости пустой корзины
        System.out.println("Общая стоимость корзины = " + productBasket2.basketTotalPrice());

        // 10. поиск продукта по имени в путой корзине
        System.out.println("ProductBasket.isAdded(notebook) = " + productBasket2.isAdded(notebook));

    }
}
