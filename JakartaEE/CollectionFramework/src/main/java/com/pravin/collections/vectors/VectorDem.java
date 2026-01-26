package com.pravin.collections.vectors;

import java.util.Vector;

public class VectorDem {
    public static void main(String[] args) {
        /**
         *  - default capacity is 10
         *  - same as arrayList ,but it is synchronized (Thread safe)
         *  - In single threaded environment use the ArrayList and multi-Threaded env use Vectors
         *  - Doubles the capacity of the vector
         */

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);
        System.out.println(vector);

        System.out.println(vector.size());

        System.out.println(vector.capacity());


    }
}
