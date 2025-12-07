package com.pravin.collectionAPI;

import java.util.HashMap;
import java.util.Map;

public class MapI {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Pravin",98);
        students.put("Amol",78);  students.put("Suraj",99);
        students.put("Suraj",99);
        students.put("Raj",91);

        System.out.println(students);
        System.out.println(students.get("Pravin"));

        System.out.println("Using the method : ");
        System.out.println(students.keySet());


        System.out.println("Using the for loop : ");
        for (String s : students.keySet()){
            System.out.println(s+" : " + students.get(s));
        }


    }
}
