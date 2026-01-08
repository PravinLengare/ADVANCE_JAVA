package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram","Sham","Anuj","Kajal");

        //names.add("lksdf");
        System.out.println(names);

        List<String> stream = names.stream()
                .filter(n -> n.startsWith("K"))
                .map(String::toUpperCase)
                .toList();

        System.out.println(stream);

        // For Each and another methods

        Stream<String> s = (Stream<String>)
                names.stream()
                .filter(n -> n.startsWith("A"))
                .map(n -> n.toUpperCase())
                .toList();



        // for printing the stream this loop should be used

        s.forEach(n -> System.out.println(n));


    }
}
