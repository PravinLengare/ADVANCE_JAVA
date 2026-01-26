package com.pravin.collections.Map;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        System.out.println("On basis of memory : "+System.identityHashCode(p1));
        System.out.println("On basis of values : "+p1.hashCode());


        map.put(p1, "Engineer");
        map.put(p2, "Designer");
        map.put(p3, "Manager");

        map.put(p1, "Engineer"); // hashcode1 --> index1
        map.put(p2, "Designer"); // hashcode2 --> index2
        map.put(p3, "Manager"); // hashcode1 --> index1 --> equals --> replace

        System.out.println("HashMap Size: " + map.size());
        System.out.println("Value for p1: " + map.get(p1));
        System.out.println("Value for p3: " + map.get(p3));

    }
}
class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }

}
/**
 * 2. The First Batch of Puts map.put(p1, "Engineer");New Entry added.
 * Key: Alice(1), Value: "Engineer".map.put(p2, "Designer");New Entry added. Key: Bob(2), Value: "Designer".map.put(p3, "Manager");Java calculates hash of p3 $\rightarrow$ Same bucket as p1.Java runs p1.equals(p3) $\rightarrow$ Returns true.Action:
 * It does NOT add a new node. It Replaces the value of the existing node.Current State: Alice(1) is now "Manager".
 */

/**
 * Object's hashCode() method -->
 *  The default hashCode() method in the Object class is a Native Method that typically uses the Memory Address of the object to generate a random-looking integer.
 *  public native int hashCode();
 *  native:- This keyword is the most important part. It means the code is not written in Java. It is written in C or C++ and is part of the JVM (Java Virtual Machine) itself.
 *  why native - because java does not access the memory addresses directly
 *  The Consequence:-  Two objects with the exact same data are considered Different because they live at different addresses.
 *
 */