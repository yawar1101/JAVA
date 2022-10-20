package Geeks;

import java.util.ArrayList;

public class IntesectionOptimized {
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

        intersection(arr1, arr2, arr1.length, arr2.length);
    }

    static void intersection(int[] arr1, int[] arr2, int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }

        for (int elem: ans)
            System.out.print(elem + " ");
        System.out.println();
    }
}
