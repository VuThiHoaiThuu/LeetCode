public class Daily_121BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {2,4,1};
        System.out.println(maxProfit(prices));
    }
    
    public static int maxProfit(int[] prices){
        if (prices == null || prices.length < 2)
            return 0;
        int min = prices[0];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > max)
                max = prices[i] - min;
        }
        return max;
    }
}
