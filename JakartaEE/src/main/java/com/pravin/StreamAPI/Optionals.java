package com.pravin.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {

        List<String > names = Arrays.asList("Pravin","Amol","Pra","Rutuja");


        Optional<String> name = names.stream()
                .filter(str -> str.contains("R"))
                .findFirst();


        String name1 = names.stream()
                        .filter(str->str.contains("K"))
                                .findFirst()
                                        .orElse("Not Found !");

        System.out.println(name.get());

        System.out.println(name1);


    }
}
