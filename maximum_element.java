package _2D_Array;
import java.util.*;

public class maximum_element {
        Scanner sc = new Scanner(System.in);

    public static void printMatrix(int[][] matrix) {
//---------------- print 2d array--------------------------
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");


            }
            System.out.println();

        }

    }
    // -------- Find maximum element in the 2D array--------------------

//    public static void Maximum(int[][] matrix) {
//        int maximum = Integer.MIN_VALUE;
//        for(int i=0; i<matrix.length; i++) {
//            for(int j=0; j<matrix[0].length; j++){
//                if(matrix[i][j] > maximum) {
//                    maximum = matrix[i][j];
//
//                }
//
//            }
//
//        }
//        System.out.println(" Maximum element in the 2D array is : " + maximum);
//    }




    public static void main(String[] args) {

        int[] [] matrix = {{1,2,3,4},
                           {5,6,7,8},
                            {9,10,11,12}};
        printMatrix(matrix);
//        Maximum(matrix);



    }
}
