package Array_Exercise;
import java.util.Scanner;

//Ques-- WAP to find out weather a given integer is present in the given array or not?

public class problem3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int ans = -1;
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {

                ans = arr[i];


            }

        }
        System.out.println("Integer "+ n+  " is found at index : " + ans );
    }
}



