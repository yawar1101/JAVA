package Geeks;

import com.sun.source.tree.BreakTree;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println("Largest Sum = " + maxSubArr3(arr, arr.length));
    }

    // Approach 1

    static int maxSubArr1(int[] arr, int n) {
        int max = 0;

        for (int i = 0; i <= n - 1; i++) {
            for (int j = i; j <= n - 1; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                max = Math.max(sum, max);
            }
        }
        return max;
    }

    // Approach 2

    static int maxSubArr2(int[] arr, int n) {
        int maxSum = 0;
        for (int i = 0; i < n - 1; i++) {
            int sum = 0;
            for (int j = i; j < n; j++)
                sum += arr[j];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    // Approach 3

    static int maxSubArr3(int[] arr, int n) {
        int sum = 0;
        int maxSum = arr[0];
        for (int i = 0; i < n; i++) {
            if (sum < 0)
                sum = 0;
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

}
