package Array;

public class subarray {

    public static void subArray(int[] number) {
        int totaoSubarray = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;

            for (int j = i; j < number.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                totaoSubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(" Total Sub Array is : " +totaoSubarray);
    }




            public static void main (String[]args){
                int[] number = {1, 2, 3, 4, 5};
                subArray(number);

        }
    }

