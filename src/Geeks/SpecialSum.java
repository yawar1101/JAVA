package Geeks;

public class SpecialSum {
    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 9};
        System.out.println("Sum = " + specialSum(arr, arr.length));
    }

    static int specialSum(int[] arr, int n) {
        int sum = 0;
        for (int i: arr) {
            sum += i;
            if (sum > 9) {
                int newSum = 0;
                newSum += sum % 10;
                sum /= 10;
                newSum += sum;
                sum = newSum;
            }
        }
        return sum;
    }
}
