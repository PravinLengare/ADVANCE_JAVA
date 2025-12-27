public class Main {
    public static boolean check(int i){
        if (i >= 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
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

        for (int i = 0 ; i < 10 && i%2==0 ; i+=2) {
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
        for (int i = 0; i < 3 && check(i); i++) {
            System.out.println("Checking Successfully "+i);
        }
    }
}