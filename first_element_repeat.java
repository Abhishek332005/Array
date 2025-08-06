package Array_3;
import java.util.Scanner;
public class first_element_repeat {

    static int firstrepeat(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }





    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size od array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the element of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("First repeat element is " + firstrepeat(arr));
    }
}
