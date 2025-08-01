package Array;

public class reverse {
    public static void reverse(int [] number){
        int start = 0 , end = number.length-1;

        while(start < end){
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int [] number = {4,5,6,7,8,9};
        reverse(number);
        for(int i=0; i<number.length;  i++){
            System.out.print(number[i]+" ");

        }
        System.out.println();

    }
}
