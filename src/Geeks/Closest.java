package Geeks;

import java.util.ArrayList;

public class Closest {
    public static void main(String[] args) {
//        String s = "the quick brown fox quick";
        ArrayList<String> str = new ArrayList<String>();
//        str = {"the", "quick", "brown", "fox", "quick"};
        str.add("the");
        str.add("quick");
        str.add("brown");
        str.add("fox");
        str.add("quick");
        String w1 = "the";
        String w2 = "fox";

        System.out.println(closestStr(str, w1, w2));
    }

    static int closestStr(ArrayList<String> str, String w1, String w2) {

        if (w1.equals(w2))
            return 0;
        String[] words = str.toString().split(" ");
        int min_dist = words.length + 1;
        for (int index = 0; index < words.length; index++) {
            if (words[index].equals(w1)) {
                for (int search = 0; search < words.length; search++) {
                    if (words[search].equals(w2)) {
                        int curr = Math.abs(index - search);
                        if (curr < min_dist)
                            min_dist = curr;
                    }
                }
            }
        }

        return min_dist;

    }
}
