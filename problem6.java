package Array_Exercise;
//Ques-- Write a program in java to find maximum element.


public class problem6 {

    public static void MaxNum(int[] arr){
        int a = 0;
        for(int i=0;i<arr.length;i++){
            a = Math.max(arr[i],a);
        }
        System.out.println(a);
    }


    public static void main(String[] args) {
        int [] arr = {1,22,3,4,5,6,7,8,9,10};
        MaxNum(arr);



    }
}
