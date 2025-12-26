package Generics;

interface Printable{
    void print();
}
class Number{

}

class NumberPrinter{
    <T> NumberPrinter(T item){
        System.out.println(item);
    }
}
//class Boxx<T extends Number & Printable>{
//    private T item;
//
//    Boxx(T item){
//        this.item = item;
//    }
//}
class Box1<T extends Number & Printable> {
    Box1(T item){
        System.out.println("In box "+item);
    }
}

class Boxing extends Number implements Printable{
    <T> Boxing(T item) {
        System.out.println("Items "+item);
    }

    @Override
    public void print() {
        System.out.println("Printing in the Boxing");
    }
}
public class BoundedType extends Number implements Printable {

    private final int value;

    public BoundedType(int value) {
        this.value = value;
    }
    @Override
    public void print() {
        System.out.println("PRnt");
    }

    public static void main(String[] args) {
        BoundedType b = new BoundedType(2);
        Box1<BoundedType> bx = new Box1<>(b);
        System.out.println("Box is doing "+bx);

        new NumberPrinter(100);  // Integer is a subclass of Number
        new NumberPrinter(3.14);
        GenericMethodExample example = new GenericMethodExample();

        example.display(42);         // Calls the Integer display method
        example.display("Generics"); // Calls the generic display method
        Boxing b1 = new Boxing(2);
        Box1<Boxing> bOx = new Box1<>(b1);

    }
}
 class GenericMethodExample {
    public <T> void display(T element) {
        System.out.println("Generic display: " + element);
    }

    public void display(Integer element) {
        System.out.println("Integer display: " + element);
    }

}
