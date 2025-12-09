package com.pravin.exceptionHandling;

class custom_exception extends Exception{

    public custom_exception(String m){
        super(m);
    }
}
public class custon {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};
        int index = 5;


        try{
            if (index >= 5)
                throw new custom_exception("This element will not accessible");
            System.out.println(arr[6]);

        }
        catch (custom_exception e){
            System.out.println("I caught :  "+e);
        }
    }
}
