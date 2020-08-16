public class MaxProfit {
    public int maxProfit(int[] prices) {
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        int i = 0;
        while(i < prices.length - 1){
            while(i < prices.length - 1 && prices[i] >= prices[i+1]){
                i++;
            }
            valley = prices[i];
            while(i < prices.length - 1 && prices[i] <= prices[i+1]){
                i++;
            }
            peak = prices[i];
            maxprofit = maxprofit + ( peak - valley );
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        MaxProfit m = new MaxProfit();
        int[] test = {7,1,5,3,6,4};
        System.out.println(m.maxProfit(test));
    }
}