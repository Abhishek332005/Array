package Array;

public class linear_search {
    public static int linearSearch(int number[] , int key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int  number[]  = {10,12,45,41,14};
        int key = 14;

        int index = linearSearch(number, key);
        if(index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: " + index);
        }

    }
}