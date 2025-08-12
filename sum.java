package _2D_Array;

public class sum {

    static void addTwo(int[][] arr, int r1, int c1, int[][] brr, int r2, int c2){
        if(r1 != r2 || c1 != c2) {
            System.out.println(" impossible");
            return;
        }
        int[][] sum = new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                sum[i][j] = arr[i][j] + brr[i][j];
            }
        }
        printmatrix(sum);

    }


    public static void printmatrix(int [] [] sum){
        for(int i=0; i<sum.length; i++){
            for(int j=0; j<sum[i].length; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int [][] a = {{1,2,3},{3,2,1}};
        int [][] b ={{4,5,6},{6,5,4}};
        addTwo(a,2,3,b,2,3);
    }
}
