package Array_Exercise;
import java.util.*;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in
//the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


public class buy_sell {

    public static int BuySell(int[] price){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<price.length; i++){
            if(buyprice < price[i]){
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit,profit);
            }
            else{
                buyprice = price[i];

            }
        }
        return maxprofit;
    }




    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int [] price = {7,1,5,3,6,4};
        System.out.println(BuySell(price));

    }
}
