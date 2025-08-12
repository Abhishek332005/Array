package _2D_Array;

public class transpose_matrix {

    public static void transpose(int [][] matrix , int r, int c){
        int[][] trans = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                trans[i][j] = matrix[j][i];
            }
        }
        printmatrix(trans);

    }
    public static void printmatrix(int[][] trans){
        for(int i=0; i<trans.length; i++){
            for(int j=0; j<trans[i].length; j++){
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(matrix,3,3);
    }
}
