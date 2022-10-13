package Collect;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "BMW");
        map.put(2, "Audi");
        map.put(3, "Mercedes");
        map.put(4, "Lamborghini");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // Adding New Keys and Values in Hash Map

        map.putIfAbsent(5, "TATA");

        // Iterating over Hash Map Again

        System.out.println("New HashMap");

        for (Map.Entry m: map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        map.remove(4);
        System.out.println(map);

        map.remove(5, "TATA");
        System.out.println(map);

        // Replacing the value
        map.replace(2, "Audi", "New");
        System.out.println(map);
        // Replacing the value without giving old value
        map.replace(1, "Nissan");
        System.out.println(map);

        map.replaceAll((k, v) -> "Default");

        System.out.println(map);
    }
}
