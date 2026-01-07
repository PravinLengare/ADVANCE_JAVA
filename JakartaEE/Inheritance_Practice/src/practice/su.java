package practice;

class A1{
    public final void test(){
        System.out.println("Parent");
    }
    public final void test(int a){
        System.out.println(a);
    }
}
//class A2 extends A1{
//    @Override
//    public void test(){
//        System.out.println("Child");
//    }
//}
public class su {
    public static void main(String[] args) {
        A1 a = new A1();
        a.test();
        a.test(2);
    }
}
