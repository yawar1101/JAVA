package Geeks;

import java.util.Arrays;

public class CommonPrefix {

//    static String commonPrefixUtil(String s1, String s2) {
//        String res = "";
//
//        int n1 = s1.length();
//        int n2 = s2.length();
//
//        for (int i = 0, j = 0; i < n1 - 1 && j < n2; i++, j++) {
//            if (s1.charAt(i) != s2.charAt(i))
//                break;
//            res += s1.charAt(i);
//        }
//        return (res);
//    }
//
//    static String commonPrefix(String arr[], int low, int high) {
//        if (low == high)
//            return (arr[low]);
//
//        if (high > low) {
//            int mid;
//            mid = low + (high - low) / 2;
//            String s1 = commonPrefix(arr, low, mid);
//            String s2 = commonPrefix(arr, mid + 1, high);
//
//            return (commonPrefixUtil(s1, s2));
//        }
//        return (null);


    static String longestCommonPrefix(String[] arr, int n) {
        if (n == 0)
            return "";
        if (n == 1)
            return (arr[0]);
        Arrays.sort(arr);

        int end = Math.min(arr[0].length(), arr[n - 1].length());
        int i = 0;
        while (i < end && arr[0].charAt(i) == arr[n - 1].charAt(i))
            i++;
        String pre = arr[0].substring(0, i);
        return pre;


    }

    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};
        System.out.println("The longest common prefix is " + longestCommonPrefix(arr, arr.length));
//        int n = arr.length;
//
//        String ans = commonPrefix(arr, 0, n - 1);
//
//        if (ans.length() != 0) {
//            System.out.println("The longest common prefix is " + ans);
//        }else {
//            System.out.println("There is no common prefix");
//        }
    }
}
