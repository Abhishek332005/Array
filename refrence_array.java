package Array_2;
import java.util.Arrays;
import java.util.Scanner;
public class refrence_array {


    static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();


    }









    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the element of the aray: ");
        //original array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
       printArray(arr);


//copied arr
       // int [] arr_2 = arr;
       // int[] arr_2 = arr.clone();
       //int [] arr_2 = Arrays.copyOf(arr, arr.length);
        int[] arr_2 = Arrays.copyOfRange(arr, 1 ,5);
        System.out.println("Copied array");
      printArray(arr_2);

      //changeing arr_2 value

        arr_2[0] = 122;
        arr_2[1] = 230;


        System.out.println("Original array after changing arr_2");
        printArray(arr);

        System.out.println("arr_2 after chnaging arr_2");
        printArray(arr_2);

    }
}
