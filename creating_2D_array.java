package _2D_Array;
import java.util.Scanner;

public class creating_2D_array {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        int [] [] matrix = new int[3][3];
        int n = 3, m = 3;
        System.out.println("Enter the element of 2d Array: ");

        //creating 2d array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
