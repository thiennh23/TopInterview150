package BestTimeToBuyAndSellStock_121_fix;

//LeetCode: 121. Best Time to Buy and Sell Stock

public class Solution {

    public static void main(String[] args) {
        //int[] prices = new int[] {7, 1, 5, 3, 6, 4};
        //int[] prices = new int[] {7,6,4,3,1};
        //int[] prices = new int[] {2,4,1};
        //int[] prices = new int[] {1, 2};
        int[] prices = new int[] {2, 2, 5};
        //int[] prices = new int[] {2, 1, 4};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    //Optimised
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else if (prices[i] - min > profit)
                profit = prices[i] - min;
        }
        return profit;
    }

    //My first accepted code
    /*public static int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int left = 0;
        int right = left + 1;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (left < prices.length && right < prices.length) {
                if (prices[left] >= prices[right]) {
                    left = right;
                    right = left + 1;
                } else if (prices[left] < prices[right]) {
                    if (prices[right] - prices[left] > profit)
                        profit = prices[right] - prices[left];
                    right++;
                }
            }
        }
        return profit;
    }*/
}
