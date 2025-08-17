package Array_Exercise;
import java.util.*;

//Given an array arr[] and an integer k where k is smaller than the size of the array,
//the task is to find the kth smallest element in the given array. It is given that all array elements are distinct.
//Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
//Output:  7

public class kth_smallest {

    public static int smallest(int[] arr , int kth){
        Arrays.sort(arr);
        return arr[kth-1];


    }


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int [] arr ={7, 10, 4, 3, 20, 15};
        System.out.println(smallest(arr,3));
    }
}
