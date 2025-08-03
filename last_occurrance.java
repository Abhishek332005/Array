package Array_2;
import java.util.Scanner;
public class last_occurrance {


    static int lastOccurrence(int[] arr , int x){
        int lastIndex = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return  lastIndex;
    }




    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements of array:");
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
        }


        System.out.println("Enter x: ");
        int x = sc.nextInt();

        System.out.println("Last occurrance  of x " + lastOccurrence(arr,x));


    }
}
