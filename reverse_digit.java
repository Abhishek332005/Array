//Ques- Given a signed 32 bit intger x , return x with its digits reversed.
// if reversing x cause the value to go outside the signed 32 nit intger range[-2^31,2^31-1],then return 0.

package Array_Exercise;

public class reverse_digit {
    public static void main(String[] args) {
        int a = 123;
        int ans = 0;

        while(a>0){

            ans = (ans*10)+ a%10;
            a = a/10;

        }
        System.out.println(ans);
    }
}
