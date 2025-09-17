package org.skypro.skyshop;

import org.skypro.skyshop.SearchEngine.BestResultNotFoundException;
import org.skypro.skyshop.SearchEngine.SearchEngine;
import org.skypro.skyshop.SearchEngine.Searchable;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {


        ProductBasket productBasket1 = new ProductBasket();

        Product notebook = null;
        Product table = null;
        Product monitor = null;
        Product keyboard = null;


        try {
            notebook = new SimpleProduct("Notebook", 0);
            productBasket1.addProduct(notebook);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Ошибка!" + e.getMessage());
        }

        try {
            table = new SimpleProduct("   ", 15000);
            productBasket1.addProduct(table);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("Ошибка!" + e.getMessage());
        }

        try {
            monitor = new DiscountedProduct("Monitor", 1000, 30);
            productBasket1.addProduct(monitor);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Ошибка!" + e.getMessage());
        }

        try {
            keyboard = new FixPriceProduct("Keyboard");
            productBasket1.addProduct(keyboard);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Ошибка!" + e.getMessage());
        }


        productBasket1.printBasket();


        Searchable book = new Searchable("Книга изобретений 20 века",
                "В этом справочнике собраны самые " +
                        "интересные изобретения за 20 век с коротким описанием. " +
                        "Хронологический порядок и поиск по стране, автору " +
                        "реализован в соответствующих таблицах");
        Searchable hondaVFR = new Searchable("Мотоцикл Honda VFR",
                "Мотоцикл Honda VFR (Хонда ВФР), " +
                        "он же Выфер - замечательный представитель класса Спорт-турист, " +
                        "подарит Вам настоящую свободу перемещений, как будто у Вас выросли крылья! ");
        Searchable birds = new Searchable("Птицы Австралии", "Всякие разные птицы там летают. " +
                "крылья у одной такие, крылья у другой сякие, и как раз крылья уже 3 раза упоминаются)))");

        Searchable[] searchableArray = new Searchable[10];
        searchableArray[1] = book;
        searchableArray[2] = hondaVFR;
        searchableArray[3] = birds;


        try {
            SearchEngine.getSearchTerm("изобррррретение", searchableArray);
        } catch (BestResultNotFoundException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        try {
            SearchEngine.getSearchTerm("изобрет", searchableArray);
        } catch (BestResultNotFoundException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        try {
            SearchEngine.getSearchTerm("крылья", searchableArray);
        } catch (BestResultNotFoundException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

    }
}

