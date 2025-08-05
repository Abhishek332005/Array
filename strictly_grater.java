package Array_2;
import java.util.Scanner;

public class strictly_grater {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];


        System.out.print("Enter the element of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter the comapare value x: ");
        int x = sc.nextInt();


        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] < x){
                count++;
            }

        }


        System.out.println("Number of element is grater than"  + x +  "is " +count);





    }
}
