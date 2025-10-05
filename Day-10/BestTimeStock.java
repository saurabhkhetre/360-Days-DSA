public class BestTimeStock {
    public static int maxProfitt(int[] prices) {
        int maxProfit =0;
        int profit = 0;
        for(int i =0;i<prices.length;i++){
            for(int j = i+1;j<prices.length;j++){

                if (prices[j] > prices[i]) {
                    profit =  prices[j] - prices[i];
                    if (maxProfit < profit) {
                        maxProfit = profit;
                    }
                }

            }
        }
        return maxProfit;

    }
    public static void main(String args[]){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfitt(prices));
    }
}
