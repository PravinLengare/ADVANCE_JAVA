package practice;

public class s {
    public static int ans(int b){
        b = 6;
        return b;
    }
    public static int[] ans(int[] arr){
         arr[0] = 5;
         return arr;
    }
    public static void main(String[] args) {
        int a = 3;
        int result = ans(a);
        System.out.println(result);
        System.out.println(a);
        int []arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;

        System.out.println("After changing the array :");
        int []re = ans(arr);
        for (int i = 0; i < re.length; i++) {
            System.out.println(re[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(re[i]);
        }


    }
}
