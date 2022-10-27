package Geeks;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int n = arr1.length;
        int m = arr2.length;

        int[] arr3 = new int[n + m];
        System.out.println("Array After Merging");
        merge(arr1, arr2, n, m, arr3);
        for (int elem: arr3)
            System.out.print(elem + " ");
        System.out.println();
    }

    static void merge(int[] arr1, int[] arr2, int n, int m, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < n) {
            arr3[k++] = arr1[i++];
        }

        while (j < m) {
            arr3[k++] = arr2[j++];
        }

        Arrays.sort(arr3);
    }
}
