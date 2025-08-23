package Array_Exercise;
//Ques --  WAP to find that given array is sorted or not ?


public class problem8 {

   public static boolean isSorted(int[] arr) {


    boolean check = true;
        for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[i - 1]) {
            check = false;
            break;
        }

    }
        return check;
}


    public static void main(String[] args) {
        int [] arr = { 1,2,3,8,5};//false  but when {1,2,3,4,5} return true.
        System.out.println(isSorted(arr));

    }
}
