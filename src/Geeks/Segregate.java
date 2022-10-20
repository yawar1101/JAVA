package Geeks;

import java.util.ArrayList;

public class Segregate {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        segregateNegatives(arr);
        printArray(arr);
    }

    static void segregateNegatives(int[] arr) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                ls.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                ls.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ls.get(i);
        }
    }

    static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
