package Array_Exercise;
import java.util.*;
public class problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] num1 = {1, 3};
        int[] num2 = {2,4};

        int[] sum = new int[num1.length + num2.length];

        for (int i = 0; i < num1.length; i++) {
            sum[i] = num1[i];
        }
        for (int i=0; i< num2.length; i++) {
            sum[i + num1.length] = num2[i];

        }
         Arrays.sort(sum);
        if(sum.length % 2 != 0){
            System.out.println(sum.length/2);
        }
        else{
            float p = ( sum[0] + sum[sum.length-1] )/ 2f;
            System.out.println(p) ;
        }
//        int median = sum.length/2;
//        System.out.println(Arrays.toString(sum )+"\nMedian"+ median);

    }



}

