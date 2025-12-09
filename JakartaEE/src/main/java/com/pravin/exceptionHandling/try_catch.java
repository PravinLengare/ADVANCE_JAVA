package com.pravin.exceptionHandling;

public class try_catch {
    public static void main(String[] args) {

        int i = 1;
        int j = 2;

        int arr[] = {1,2,3,4};


        try{
            j = j/i;
            System.out.println(arr[4]);
        }
        catch (ArithmeticException e){
            System.out.println("Went wrong "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("not allow to access ::"+e.getMessage());
        }



        System.out.println(j);
    }
}
