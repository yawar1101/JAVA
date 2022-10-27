package Practice;

public class MaxSub {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum Sum = " + maxSubArray(arr, arr.length));
    }

    static int maxSubArray(int[] arr, int n) {
        int currSum = 0, maxSum = arr[0];
        for (int i = 0; i < n; i++) {
            if (currSum < 0)
                currSum = 0;
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
