package Generics.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyException extends Exception{

   public <T> MyException(T item){
        super("exception related to value :"+
                item.toString() +
                " of type : "       +
                item.getClass().getName());
    }
}
public class simpleException {
    public static void main(String[] args) {
        try{
            throw new MyException("Default");
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        try{
            throw new MyException(123);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }

        List<Integer> l = List.of(1,23);  // we can not add and modify also


        List<Integer> a = Arrays.asList(1,23,43);  // we can not add but can modify
        a.set(1,33);


        System.out.println(a.get(1));
        System.out.println(l.get(1));
    }
}
