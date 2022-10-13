package Geeks;

import java.util.HashMap;
import java.util.Locale;

public class CountOcc {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";
//        str.replaceAll("\\s", "");
        System.out.println(countOcc(str.toLowerCase()));

    }

    static HashMap<Character, Integer> countOcc(String str) {
//        str.replaceAll("\\s", "");
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (map.containsKey(str.charAt(i))) {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), ++count);
            }
            else
                map.put(str.charAt(i), 1);
        }
        return map;
    }
}
