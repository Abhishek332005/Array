package Array_2;
import java.util.Arrays;
import java.util.Scanner;
public class sorted_smallest_largest {


    static int[] smallestAndLargest(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0],arr[arr.length-1]};
        return ans;
    }




    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr =new int[n];

        System.out.println("Enter the element of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = smallestAndLargest(arr);
        System.out.println("Smallest " +ans[0]);
        System.out.println("Largest " +ans[1]);

    }
}
