package Geeks;

import java.util.ArrayList;

public class CyclicRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3, 4, 5};
        rotate(arr, arr.length);
    }

    static void rotate(int[] arr, int n) {
//        ArrayList<Integer> ans = new ArrayList<Integer>();

        int x = arr[n - 1];
        System.out.print(x + " ");

        for (int i = 0; i < n - 1; i++)
            System.out.print(arr[i] + " ");
    }
}
