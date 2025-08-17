package Array_Exercise;
import java.util.*;
//ques-Given an array with all distinct elements, find the largest three elements.


public class find_3_largest {
//Brut method
    public static void largest(int [] arr){

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        if(arr.length < 3){
            System.out.println("Invalid Input");
            return;
        }

        for(int i=0; i<arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.println("Three largest elemnet is : "+first +" "+ second +" " + third);

    }
// Best Method
    public static void largest2(int [] arr){
        Arrays.sort(arr);
        for(int i=3; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 4, 3, 50, 23, 90};
//        largest(arr);
        largest2(arr);
    }
}
