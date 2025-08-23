package Array_Exercise;
//Ques-  Find minimum element in the array.


public class problem7 {

    public static void MinNum(int[] arr){
        int a =0;
        for(int i=0; i<arr.length; i++){
            a = Math.min(arr[i] , a);

        }
        System.out.println(a);
    }


    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,-1};
        MinNum(arr);
    }
}
