package com.pravin.exceptionHandling;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inputFromUser {
    public static void main(String[] args) throws IOException {

        /**
         * Here the System is class which can not be instantiated
         * The out is object of PrintStream class
         * The println() is method from PrintStream class
         */

        /**
         * But this is taking the input a number and returns its ascii value
         * so, we sub the 48 from it to get integer value
         * but, it only supports the single digit value
         */

        /*
        System.out.println("Pravin");

        System.out.println("Enter a number : ");
        int n = System.in.read();

        System.out.println(n - 48);

         */


        /**
         * old way of taking input from the user
         */

        /*
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        System.out.println("Enter a number : ");
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

         */

        /**
         * standard way of taking input from the user !
         */

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

}
