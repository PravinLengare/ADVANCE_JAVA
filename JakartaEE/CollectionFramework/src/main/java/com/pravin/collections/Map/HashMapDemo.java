package com.pravin.collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        /**
         * - A HashMap is a data structure that stores data in Key-Value pairs.
         * - The main superpower of a HashMap is Speed.
         * - ArrayList: To find an item, you might have to check every single box ($O(N)$).
         * - HashMap: You know exactly which box to look in ($O(1)$).
         * - 2. Internal Working (The "Under the Hood" Magic)
         *      Internally, a HashMap is an Array of Nodes (often called "Buckets").
         * - Big change after the Java 8 --> The Java 8 Change:If a single bucket has more than 8 nodes (The Threshold),
         *                                     Java transforms that Linked List into a
         *                                     Red-Black Tree.
         *                                     Benefit: Search speed improves from $O(N)$ to $O(\log N)$.
         *
         */

        /**
         * 1. Load Factor and Rehashing ===>
         *      - Java does not wait to full the array so it has the load factor after the
         *        (load factor * array size) = after this answer you have to resize it like creating new array with double the size
         * 2. Why Strings are the "Best" Keys (Immutability) ===>
         *    when we put the another object which is mutable which can be change later and
         *    our value will not going, get so use the immutable objects instead mutable for the keys
         */

        HashMap<Integer,String> map = new HashMap<>();
        map.put(31, "Shubham");
        map.put(11, "Akshit");
        map.put(2, "Neha");
        map.put(2, "Mehul");
        System.out.println(map);

        String student = map.get(31);
        System.out.println(student);

        System.out.println(map.containsKey(11) +": "+map.containsValue("Mehul"));

//        for(int i: map.keySet()){
//            System.out.println(map.get(i));
//        }

        // entries using the entrySet()
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> map1:map.entrySet()){
            // System.out.println(map1.getValue());
            map1.setValue(map1.getValue().toUpperCase());
        }
        System.out.println(map);


//        System.out.println(map.remove(21));
//        System.out.println(map.remove(21,"Pravin"));
//        System.out.println(map.remove(31,"Shubham"));
        boolean res = map.remove(11,"AKSHIT");
        System.out.println(res);
        System.out.println(map);

    }
}
