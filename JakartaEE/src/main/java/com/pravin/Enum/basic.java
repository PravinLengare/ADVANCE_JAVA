package com.pravin.Enum;

//enum Status{
//    Running , Failed,Pending , Success;
//}
public class basic {
    public static void main(String[] args) {

//        Status s = Status.Success;
//        System.out.println(s.ordinal());

        Status []ss = Status.values();

        for(Status s : ss){
            System.out.println(s.ordinal() + " "+s);

        }
    }
}
