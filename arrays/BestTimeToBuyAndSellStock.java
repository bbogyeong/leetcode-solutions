class Solution {
    public int maxProfit(int[] prices) {
        int min= prices[0];
        int maxProfit= 0;
        // Update minimum price every day
        // Update max profit by comparing today's price minus minimum price
        for(int num= 0; num< prices.length; num++){
            if(prices[num]< min){
                min= prices[num];
            }else if(prices[num]- min> maxProfit){
                maxProfit= prices[num]- min;
            }
        }
        if(maxProfit< 0){
            return 0;
        }else{
            return maxProfit;
        }
    }
}