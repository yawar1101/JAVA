package Geeks;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        printArray(arr);
        dutchFlag(arr);
        printArray(arr);
    }

    static void dutchFlag(int[] arr) {
        int zeros = 0, ones = 0, twos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zeros++;
            if (arr[i] == 1)
                ones++;
            if (arr[i] == 2)
                twos++;
        }

        int index = 0;
        while (zeros > 0) {
            arr[index++] = 0;
            zeros--;
        }

        while (ones > 0) {
            arr[index++] = 1;
            ones--;
        }

        while (twos > 0) {
            arr[index++] = 2;
            twos--;
        }
    }

    static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
