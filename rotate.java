//Ques- Rotate the given array 'a' by k steps, where k is non negative .
//Note: K can be grater than n as well.

package Array_4;
import java.util.Scanner;

public class rotate {

    static  void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }





    static int[] reverse(int[] arr , int k){
        int n = arr.length;
        k = k%n;

        int[] ans = new int[n];
        int j = 0;

        for(int i=n-k; i<n; i++){
            ans[j++] = arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }








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

        int[] ans = reverse(arr, k);
        System.out.println("Array after rotation: ");

       printArray(ans);

    }
}
