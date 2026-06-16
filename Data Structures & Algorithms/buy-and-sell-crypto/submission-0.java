class Solution {
    public int maxProfit(int[] prices) {

        int[]nextGreater = new int[prices.length];

        nextGreater[prices.length-1] = prices[prices.length-1];

        for(int j=prices.length-2;j>=0;j--){
            if(prices[j]>nextGreater[j+1]){
                nextGreater[j] = prices[j];
            }else{
                nextGreater[j] = nextGreater[j+1];
            }
        }

        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            int profit = nextGreater[i] - prices[i];

            if(profit>0){
                maxProfit = Math.max(profit,maxProfit);
            }
        }

        return maxProfit;
        
    }
}
