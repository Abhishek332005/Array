package _2D_Array;
import java.util.Scanner;


public class search_element {

    public static void Matrix(int [] [] matrix){
//---------------------This code use for  print 2d array----------------------------------
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
//-------------------------This code use for search key in the 2d array ---------------------------------
    public static boolean Search(int [] [] matrix, int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("The key is found at cell :" + "(" +i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] [] matrix = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        Matrix(matrix);
        Search(matrix, 7);



    }

}
