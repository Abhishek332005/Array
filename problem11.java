package Array_Exercise;
import java.util.*;


//Given an integer array nums, return an array answer such that answer[i] is equal to
//the product of all the elements of nums except nums[i].
//Example :
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]



public class problem11 {
//ques- 1 ke liye 2*3*4=24
    //2 ke liye 3*4*12
    //3 ke liye 4*1*2=8
    //4 ke liye 1*2*3=6
    public static int[] product(int [] nums) {
        int [] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int a =1;
            for(int j=0; j<nums.length; j++){
                if( i == j) continue;
                a *= nums[j];
            }
            ans[i] = a ;
        }
        return ans ;

    }



    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(product(nums)));



    }
}
