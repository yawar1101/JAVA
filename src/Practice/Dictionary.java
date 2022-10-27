package Practice;

import java.util.HashMap;

public class Dictionary {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 2, 3, 4, 5};
        System.out.println(countOcc(arr, arr.length));
    }

    static HashMap<Integer, Integer> countOcc(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], ++count);
            }
            else
                map.put(arr[i], 1);
        }
        return map;
    }
}
