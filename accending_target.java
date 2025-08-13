package Array_Exercise;

public class accending_target {

    public static void bubbleSort(int[] arr) {
        for(int turn=0; turn<arr.length; turn++){
            for(int j=0; j<arr.length-turn-1; j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printarray(int[] arr) {
        System.out.println("Assending order of array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(+ arr[i]+" ");
        }
    }
    public static void find(int[] arr, int target) {

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target) {
                System.out.println("\n Number is find at index : " + i);

            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        bubbleSort(arr);
        printarray(arr);
        find(arr, 2);



    }
}
