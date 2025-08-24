package Array_Exercise;

import java.util.Arrays;

//You are given a read only array of n integers from 1 to n.
//Each integer appears exactly once except A which appears twice and B which is missing.
//Return A and B.
public class problem10 {

    public static void Search(int[] arr){
        int count =1;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == count){
                count++;
            }
            else{
                System.out.println(arr[i] + " "+ count);
                break;
            }
        }


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,3};
        Search(arr);
    }
}
