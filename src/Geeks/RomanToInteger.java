package Geeks;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String str = "MCMIV";
        System.out.println(romToInt(str));
    }

    static int romToInt(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = str.length();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i != n && map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                sum += map.get(str.charAt(i + 1)) - map.get(str.charAt(i));
                i++;
            }

            else
                sum += map.get(str.charAt(i));
        }
        return sum;
    }
}
