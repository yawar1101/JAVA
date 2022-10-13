package Geeks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedString {
    public static void main(String[] args) {
        String[] countries = {"India", "Indonesia", "Australia", "Belgium"};

        for (int i = 0; i < countries.length - 1; i++) {
            for (int j = (i + 1); j < countries.length; j++) {
                if (countries[i].compareToIgnoreCase(countries[j]) > 0) {
                    String temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(countries));
    }
}
