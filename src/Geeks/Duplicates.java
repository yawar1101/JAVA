package Geeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3, 4};
        System.out.println(findDuplicates(arr, arr.length));
    }

    static ArrayList<Integer> findDuplicates(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int count  = map.get(arr[i]);
                map.put(arr[i], ++count);
            }
            else
                map.put(arr[i], 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > 1) {
                ans.add(entry.getKey());
            }
        }

        return ans;

//        return map;
    }
}
