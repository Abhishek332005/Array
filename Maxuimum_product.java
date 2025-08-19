package Array_Exercise;
import java.util.*;
//Given an integer array nums, find a subarray that has the largest product, and return the product.

public class Maxuimum_product {

    public static void product(int[] nums){
        int max = Integer.MIN_VALUE;
        int cs = 1;
        for(int i=0; i<nums.length; i++){
            cs = cs*nums[i];
            if(cs<0){
                cs =0;
            }
            max = Math.max(max,cs);
        }
        System.out.println(" Maximum product is : " + max );
    }




    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int [] nums = {2,3,-2,4};
        product(nums);

    }
}
