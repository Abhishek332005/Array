package _2D_Array;
import java.util.*;
public class minimum_element {

//-----------------print 2D array---------------
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

//----------------------find minimum element------------------

public static void Minimum(int[][] matrix) {
        int minimum = Integer.MAX_VALUE;               //   This is the maxvalue -- ( 2147483647)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minimum) {
                    minimum = matrix[i][j];
                }

            }
        }
        System.out.println(" Minimum element in the 2D array is : " + minimum);
}




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] [] matrix = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

        printMatrix(matrix);
        Minimum(matrix);
    }
}
