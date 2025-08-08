package Array_4;

public class swap_using_sum_difference {

    static  void swap(int a, int b) {
        System.out.println("Orignal value before swap: ");
        System.out.println("a: " +a);
        System.out.println("b: " +b);

        System.out.println("Orignal value after swap: ");

        a = a+b;  // 9 +3 = 12
        b = a-b; // 12-3 = 9
        a = a-b; // 12- 9 = 3
        System.out.println("a: " +a);
        System.out.println("b: " +b);
    }



    public static void main(String[] args) {
        int a = 9;
        int b = 3 ;
        int [] arr = {1,2,3,4,5};
        swap(a,b);

    }
}
