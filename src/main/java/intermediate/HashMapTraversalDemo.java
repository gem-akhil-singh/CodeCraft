package intermediate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTraversalDemo {

    public static void main(String[] args) {
        // Create a HashMap with some data
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");

        System.out.println("1. Iterating over entries using for each loop:");
        iterateOverEntries(hashMap);

        System.out.println("\n2. Iterating over keys or values using for each loop:");
        iterateOverKeysOrValues(hashMap);

        System.out.println("\n3. Iterating using Iterator interface:");
        iterateUsingIterator(hashMap);

        System.out.println("\n4. Using Generics:");
        iterateWithGenerics(hashMap);

        System.out.println("\n5. Without Using Generics:");
        iterateWithoutGenerics(hashMap);

        System.out.println("\n6. Iterating over Keys using keySet():");
        iterateOverKeysUsingKeySet(hashMap);
    }

    // 1. Iterating over entries using for each loop
    public static void iterateOverEntries(HashMap<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // 2. Iterating over keys or values using for each loop
    public static void iterateOverKeysOrValues(HashMap<Integer, String> map) {
        System.out.println("Keys:");
        for (Integer key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println("Values:");
        for (String value : map.values()) {
            System.out.print(value + " ");
        }
    }

    // 3. Iterating using Iterator interface
    public static void iterateUsingIterator(HashMap<Integer, String> map) {
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // 4. Using Generics
    public static void iterateWithGenerics(HashMap<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    // 5. Without Using Generics
    public static void iterateWithoutGenerics(HashMap map) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // 6. Iterating over Keys using keySet()
    public static void iterateOverKeysUsingKeySet(HashMap<Integer, String> map) {
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
