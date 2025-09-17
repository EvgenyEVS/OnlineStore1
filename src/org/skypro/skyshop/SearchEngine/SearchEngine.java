package org.skypro.skyshop.SearchEngine;

public class SearchEngine {
    public static Searchable getSearchTerm(String search, Searchable[] searchableArray) {


        Searchable bestResult = null;
        int bestResultCount = 0;


        for (Searchable searchable : searchableArray) {
            if (searchable == null) {
                continue;
            }

            String str = searchable.getName() + searchable.getManual();
            int count = 0;
            int index = 0;
            int indexSubstring = str.indexOf(search, index);


            while (indexSubstring != -1) {
                count++;
                index = indexSubstring + search.length();
                indexSubstring = str.indexOf(search, index);
            }

            if (count < 1) {
                continue;
            }

            if (count > bestResultCount) {
                bestResult = searchable;
                bestResultCount = count;
            }

        }

        if (bestResult == null) {
            throw new BestResultNotFoundException("Не найдено ни одного объекта с искомым словом");


        }
        System.out.println("В объекте " + '"' + bestResult.getName() + '"'
                + " найдено " + bestResultCount + " совпадений по запросу " + '"' + search + '"');
        return bestResult;
    }
}
