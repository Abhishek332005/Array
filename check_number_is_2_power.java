package Array_Exercise;

public class check_number_is_2_power {
    static int pow(int a, int b) {
        int ans = 1;
        for(int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        return ans;
    }

    static boolean isPowerOf2(int n) {
        for (int i = 0; i <= 30; i++) {
            int ans = pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

int a =18;

       System.out.println(isPowerOf2(a));


       }


    }

