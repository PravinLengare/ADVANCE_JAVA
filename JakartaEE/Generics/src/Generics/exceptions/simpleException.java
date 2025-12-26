package Generics.exceptions;
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
    }
}
