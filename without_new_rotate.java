package Array_4;
import java.util.Scanner;
public class without_new_rotate {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//    static void swap(int[] arr, int i, int j) {
//    }

//    static void reverse(int[] arr) {
//    }

    static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j--;

        }
    }

    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

    }


//    static int[] rotate(int[] arr , int k){
//        int n = arr.length;
//        k = k%n;
//
//        int[] ans = new int[n];
//        int j = 0;
//
//        for(int i=n-k; i<n; i++){
//            ans[j++] = arr[i];
//        }
//        for(int i=0; i<n-k; i++){
//            ans[j++] = arr[i];
//        }
//        return ans;
//   }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the k: ");
        int k = sc.nextInt();

        System.out.println("Original arr: ");
        printArray(arr);
        rotateInPlace(arr ,k);


//        int[] ans = rotate(arr, k);
        System.out.println("Array after rotation: ");

        printArray(arr);


    }
}
