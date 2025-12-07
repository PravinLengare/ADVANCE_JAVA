package com.pravin.Enum;
 enum Status {
     Failed, Pending, Running, Success;
 }

public class IfElseWIthEnum {
    public static void main(String[] args) {
        Status s = Status.Pending;
        if (s == Status.Failed){
            System.out.println("Failing");
        } else if (s == Status.Success) {
            System.out.println("going to clear");
        }
        else if(s == Status.Pending){
            System.out.println("pending now");
        }
        else
            System.out.println("Ok");


        switch (s){
            case Running:
                System.out.println("Got it !");
                break;

            case Success:
                System.out.println("Good luck next time!");
                break;

            case Failed:
                System.out.println("Not good!");
                break;

            default:
                System.out.println("Lets do next time.....");
        }
    }
}
