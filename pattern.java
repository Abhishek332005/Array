package Array_Exercise;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();
        int count = 0;


        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                count = count + 1;
                System.out.print(count + " ");
            }

            System.out.println();
        }

    }
}
