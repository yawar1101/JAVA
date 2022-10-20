package Geeks;

import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        System.out.println(findUnion(arr1, arr2, 10, 7));
    }

    static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++)
            set.add(arr1[i]);
        for (int i = 0; i < m; i++)
            set.add(arr2[i]);

        for (int i: set)
            ans.add(i);

        return (ans);
    }
}
