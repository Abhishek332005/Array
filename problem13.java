package Array_Exercise;
import java.util.*;

//Find if there is a pair with a given sum in the rotated sorted Array
//Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
//Output: true

public class problem13 {

 public static boolean pair(int[] arr , int target){
     Arrays.sort(arr);
     for(int i=0; i<arr.length; i++){
         for( int j=1; j<arr.length; j++){
             if(arr[i] + arr[j] == target){
                 return true;
             }
         }

     }
     return false;
 }





    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int [] arr = {11, 15, 6, 8, 9, 10};
        System.out.println(pair(arr,16));

    }
}
