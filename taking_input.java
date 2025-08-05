package Array_2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class taking_input {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
            int n = sc.nextInt();

            int [] arr = new int[n];

        System.out.println("Enter the element of array: ");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");

        }


    }
}
