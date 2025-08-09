package _2D_Array;

public class multiplication {

    public static void multiply(int [][] a , int r1, int c1 , int[][] b, int r2, int c2){
        if(c1 != c2){
            System.out.println("Multiplication is not possible");
            return;
        }
        int [] [] mul = new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of two matrix is : ");
        printmatrix(mul);
    }


public static void printmatrix(int[][] mul){
        for(int i=0; i<mul.length; i++){
            for(int j=0; j<mul[i].length; j++){
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
}


    public static void main(String[] args) {
        int [][] a = {{1,2,3},{3,2,1},{1,2,3}};
        int [][] b = {{4,5,6},{7,8,9},{4,5,6}};
        multiply(a,3,3,b,3,3);
    }
}
