package Geeks;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        int low = 0;
        int high = arr.length - 1;
        System.out.println("Intial Array: ");
        printArray(arr);
        System.out.println("Sorted Array: ");
        quickSort(arr, low, high);
        printArray(arr);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int index = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                index++;
                swap(arr, index, j);
            }
        }
        swap(arr, index + 1, high);
        return (index + 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
