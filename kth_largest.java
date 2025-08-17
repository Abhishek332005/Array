package Array_Exercise;
import java.util.*;

//Given an integer array nums and an integer k, return the kth largest element in the array.
//Note that it is the kth largest element in the sorted order, not the kth distinct element.
//Can you solve it without sorting?

public class kth_largest {

    public static int  kthLargest(int[] arr , int k) {
        Arrays.sort(arr);
        return arr[arr.length-k];
    }


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int [] arr = {3,2,1,5,6,4};
        System.out.println(kthLargest(arr,1));

    }
}
