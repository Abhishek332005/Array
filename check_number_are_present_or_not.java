//Ques - Given Q querise, check if the given number is present in the array or not.
// Note: Value of all the elements in the array is less than 10 to the power of 5.

package Array_4;
import java.util.Scanner;
public class check_number_are_present_or_not {

    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = makeFrequencyArray(arr);

        System.out.print("Enter the value of querise: ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.print("Enter number to be searched: ");
            int x = sc.nextInt();
            if (freq[x] > 0) {
                System.out.println("Yes");

            }else{
                System.out.println("No");
            }
            q--;
        }
    }
}




