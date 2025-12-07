package com.pravin.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String > names = Arrays.asList("Pravin","Amol","Pra","Rutuja");

        List<String> nameUp = names.stream()
                .map(String::toUpperCase)       // Instead of passing the every time reference
                                                // for the data just pass the method reference
                .toList();

        nameUp.forEach(System.out::println);

    }
}
