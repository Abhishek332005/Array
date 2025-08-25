package Array_Exercise;
import java.util.*;
//Find Minimum in Rotated Sorted Array



public class problem12 {

    public static void minimum(int [] arr){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > min){
                ans = arr[i];
                ans++;
            }
        }
        System.out.println(ans);
    }



    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int [] arr = {4,5,6,7,0,1,2};
            minimum(arr);
    }
}
