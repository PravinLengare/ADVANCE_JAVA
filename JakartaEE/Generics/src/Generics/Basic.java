package Generics;
class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class Basic {
    public static void main(String[] args) {
        Box<Integer> b = new Box<>();
        b.setValue(2);
        System.out.println(b.getValue());
    }
}
