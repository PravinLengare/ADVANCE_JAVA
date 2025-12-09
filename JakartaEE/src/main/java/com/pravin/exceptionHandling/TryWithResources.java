package com.pravin.exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {

        /*
        BufferedReader bf = null;
        try {

             bf = new BufferedReader( new InputStreamReader(System.in));
             int num = Integer.parseInt(bf.readLine());
        }
        finally {
            bf.close();
        }

         */

        /**
         * Here, I am using the try with resources
         * It simply used to close the resources automatically
         * We don't need to add finally block
         */

        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
                int num = Integer.parseInt(bf.readLine());
                System.out.println(num);
        }
    }
}
