package Array_2;

import java.util.Scanner;
public class count_array {

    static int countOccurrances(int[]arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }






    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];



        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println("Enter x: ");
        int x = sc.nextInt();

        System.out.println("Count of x:" + countOccurrances(arr,x));

    }
}
