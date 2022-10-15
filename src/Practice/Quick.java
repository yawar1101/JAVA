package Practice;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {4, 8, 1, 2, 5, 7};
        System.out.println("Array Before Sorting: ");
        printArray(arr);
        System.out.println("Array After Sorting: ");
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
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
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
