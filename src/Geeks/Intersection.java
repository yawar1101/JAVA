package Geeks;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        int arr1[] = {1,2,2,1};
        int arr2[] = {2, 2};

        intersection(arr1, arr2);
    }

    static void intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int[] visited = new int[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && visited[j] == 0) {
                    ans.add(arr2[j]);
                    visited[j]  = 1;
                    break;
                } else if (arr2[j] > arr1[i]) {
                    break;
                }
            }
        }
        // Printing the result

        for (int i: ans) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
