import java.util.ArrayList;
import java.util.List;

public class Main {
    public static boolean check(int i){
        if (i >= 0){
            return true;
        }
        return false;
    }
    public static int add (int i){
        int add = 0 ;
        add+=i;
        return add;
    }
    public static void checkingN(int a){
        List<Integer> list = new ArrayList<>();
        int ld = a % 10;
        list.add(ld);
        while(a > 0){
            ld = a % 10;
            a = a/10;
            list.add(ld);
        }
        boolean flag = true;
        for (Integer i:list) {
            if (i != ld){
                flag = false;
            }
        }
        if (flag){
            System.out.println("There is same digits");
        }
        else {
            System.out.println("No same digit");
        }
    }
    public static void main(String[] args) {
        int a = 555;
        checkingN(a);

        /**
         * For loop modifications
         */


        // for (Initialization; Condition; Update)

        // 1. Modification in Initialization

        /**
         * Multiple Variables: You can declare as many as you want,
         * but they MUST be of the same type.
         */
        for (int i = 0,j = 10; i < j; i++,j--) {
            System.out.println(i+" "+j);

        }

        // 2. Modification in Condition

        for (int i = 0 ; i < 10 && i%2 == 0 ; i+=2) {
            System.out.println(i);
        }
        for ( ; ; ) {
            System.out.println("This runs forever!");
            break;
        }

        // 3.Modification in Updation

        for(int i = 0 ; i < 3 ; System.out.println("Loop end ! "+i),i++){
            System.out.println("Loop Body "+i);
        }

        for (int i = 0; i < 3 && check(i); System.out.println(add(i)),i++) {
            System.out.println("Checking Successfully "+i);
        }
        ArrayList list = new ArrayList();
        list.add("alfj");
        list.add(12);

        for (Object o : list){
            System.out.println(o);
        }
    }
}