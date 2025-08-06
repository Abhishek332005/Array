package Array_3;
import  java.util.Scanner;
public class manipulation_second_max {

    static int firstMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int secondMax(int[] arr){
        int max = firstMax(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = firstMax(arr);
        return secondMax;
    }







    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr =new int[n];

        System.out.print("Enter the element of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Maximum Element: " + secondMax(arr));
    }
}
