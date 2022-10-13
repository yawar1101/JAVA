package Collect;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        map.put(4, "Guava");
//        map.put(3, "Pomegranate");

        for (Map.Entry m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

        System.out.println(map.get(3));
    }

}
