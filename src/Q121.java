public class Q121 {
//   You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
// to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0




    public static void main(String[] args) {
      int[] arr ={6,5,1,2,7,2};
        System.out.println(maxProfit(arr));
    }
    static  int maxProfit(int[] prices) {
    for(int i =0; i < prices.length;i++){
         int val = prices[0];
        for (int j =prices.length-1;j>0;j--){
            if(prices[j]-prices[i]>val){
                return val =prices[j]-prices[i];
            }else

val=0;
        }
    return val;
    }

        return 0;
    }
}
