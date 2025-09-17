package org.skypro.skyshop.SearchEngine;

public class Searchable {
    private String name;
    static int numbers = 0;
    private String manual;

    public Searchable(String name, String manual) {
        this.name = name;
        this.manual = manual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManual() {
        return manual;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    public static int getNumbers() {
        return numbers;
    }

    public static void setNumbers(int numbers) {
        Searchable.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Searchable{" +
                "name='" + name + '\'' +
                '}';
    }
}
