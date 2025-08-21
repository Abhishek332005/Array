package Array_Exercise;
//QUES-- Calculate the average marks from an array containing marks of all student in physics using for each loop -
public class problem4 {
    public static void main(String[] args) {
        int [] arr = {96,85,96,75,99};
        int avg = 0 ;
        int Average = 0;
        for(int i = 0 ; i < arr.length ; i++){
           avg = avg + arr[i];


        }
        System.out.println("The average is " + avg/arr.length);
    }
}
