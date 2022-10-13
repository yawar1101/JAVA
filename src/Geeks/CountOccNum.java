package Geeks;

import java.util.HashMap;

public class CountOccNum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 4, 5, 6};
        System.out.println(countOcc(arr));

    }

    static HashMap<Integer, Integer> countOcc(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], ++count);
            }
            else
                map.put(arr[i], 1);
        }
        return (map);
    }
}

