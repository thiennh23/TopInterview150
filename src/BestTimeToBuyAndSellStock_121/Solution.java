package BestTimeToBuyAndSellStock_121;

//LeetCode: 121. Best Time to Buy and Sell Stock

public class Solution {

    public static void main(String[] args) {
        //int[] prices = new int[] {7, 1, 5, 3, 6, 4};
        //int[] prices = new int[] {7,6,4,3,1};
        int[] prices = new int[] {2,4,1};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {
        int indexBuy = Integer.MAX_VALUE;
        int priceBuy = Integer.MAX_VALUE;
        //Find when to buy
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < priceBuy) {
                priceBuy = prices[i];
                indexBuy = i;
            }
        }
        //Find when to sell
        int priceSell = priceBuy;
        int indexSell = indexBuy;
        for (int j = indexBuy+1; j < prices.length; j++) {
            if (prices[j] > priceSell) {
                indexSell = j;
                priceSell = prices[j];
            }
        }
        return priceSell - priceBuy;
    }
}
