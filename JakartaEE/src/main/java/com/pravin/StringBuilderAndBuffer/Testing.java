package com.pravin.StringBuilderAndBuffer;
class  Task extends Thread{

    private final StringBuffer sb;
    public Task(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            sb.append("a");
        }
    }
}
public class Testing {
    public static void main(String[] args) throws InterruptedException {
        /**
         * It will create temporary strings with creating objects
         */

        /*
        String s = "Pravin";
        for (int i = 0; i < 10000; i++) {
            s = s + "HELLO";
        }
        System.out.println(s);

         */
        /**
         * The solution for the immutable string is String Builder and Buffer
         * They will mutable and append without creating the new objects
         * They will modify the existing object
         **/

        /*
        String s = "Great";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < 1000; i++) {        // Modifies the SAME object
            sb.append("Pravin");
        }

        System.out.println(sb.toString());
        System.out.println("-------- USING STRING BUFFER -------------");
        String s1 = "Great";
        StringBuffer sf = new StringBuffer(s1);
        for (int i = 0; i < 1000; i++) {        // Modifies the SAME object
            sf.append("Pravin");
        }

        System.out.println(sb.toString());


         */

        // StringBuilder sb = new StringBuilder();
        StringBuffer sb = new StringBuffer();


        Task t1 = new Task(sb);
        Task t2 = new Task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final length : "+sb.length());


    }
}
