package Array;
import java.util.*;

public class binary_search {

    public static int binary_Serach(int [] number, int key ){
        int start = 0 ,  end = number.length -1;
        while(start <= end){
            int mid = (start + end)  /2;

            //comparisons
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){
                start =  mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int [] number = {2,4,6,8,10,12,14};
        int key = 14;
        System.out.println("Index for key is : " + binary_Serach(number,key));
    }
}
