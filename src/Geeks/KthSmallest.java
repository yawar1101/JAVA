package Geeks;

import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {4, 21, 5, 10, 15, 20};
        System.out.println(kthSmallest(arr, 0, arr.length - 1, 3));

        // Sorting Approach

//        Arrays.sort(arr);
//        int k = 4;
//        System.out.println(arr[k - 1]);
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int index = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                index++;
                swap(arr, index, j);
            }
        }

        swap(arr, index + 1, high);
        return (index + 1);
    }

    static int kthSmallest(int[] arr, int low, int high, int k) {
        if (low < high) {
            int index = partition(arr, low, high);
            int count = index - low + 1;
            if (count == k)
                return (arr[index]);
            else if (count > k) {
                return kthSmallest(arr, low, index - 1, k);
            }
            else {
                return kthSmallest(arr, index + 1, high, k - 1);
            }
        }
        return -1;
    }
}
