package Java_cores;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        /*
            HashMap :
                A data structure that stores key-value pairs
                Keys are unique, but Values can be duplicated
                Does not maintain any order, but is memory efficient
                HashMap<Key, Value>
         */

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("banana", 0.75);
        map.put("orange", 0.25);
        // map.put("orange", 1.5) // This is perimtted but it overrides the already existing value
        // so in a HashMap a key is unique
        System.out.println(map);
        map.remove("apple");
        System.out.println(map);
        System.out.println(map.get("banana"));
        System.out.println(map.containsKey("apple"));
        System.out.println(map.containsValue(0.25));
        System.out.println(map.size());

        // map.KeySet() returns an iterable of 'map' keys
        for (String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }

    }
}
