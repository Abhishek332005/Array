package _2D_Array;

//when we rotate the matrix first we transpose the matrix and then rotate the transpose matrix and end of the all method
//we find rotated matrix

public class ROTATED_90 {

    public static void transpose(int [][] matrix , int r, int c){
        int [][] trans =  new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                trans[i][j] = matrix[j][i];
            }
        }
        for(int i=0; i<trans.length; i++){
            reverse(trans[i]);
        }
        print(trans);

    }

    public static void print(int[][]trans){
        for(int i=0; i< trans.length; i++){
            for(int j=0; j<trans[i].length; j++){
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void reverse(int [] trans){
        int i=0, j=trans.length-1;
        while(i<j){
            int temp = trans[i];
            trans[i] = trans[j];
            trans[j] = temp;
            i++;
            j--;
        }
    }





    public static void main(String[] args) {
        int [] [] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(matrix ,3,3);
    }
}
