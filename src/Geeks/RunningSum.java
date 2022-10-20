package Geeks;

public class RunningSum {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 1};
        running(arr, arr.length);
    }

    static void running(int[] arr, int n) {
        int i = 1;
        while (i < n) {
            arr[i] += arr[i - 1];
            i++;
        }

        for (int elem: arr)
            System.out.print(elem + " ");
        System.out.println();
    }
}
