class Solution{
    public int BruteForce(int[] stocks){
        int maximum = 0;
        int n = stocks.length;
        for(int i = 0; i< n ; i++){
            for(int j = i+1; j<n ; j++){
                if(stocks[j]>stocks[i]){
                    int difference = stocks[j] - stocks[i];
                    if(difference > maximum){
                        maximum = difference;
                    }
                }
            }
        }
        return maximum;
    }
    public int Optimal(int[] stocks){
        int minimum = stocks[0];
        int profit = 0;
        int n = stocks.length;
        for(int i = 0;i <n;i++){
            int cost = stocks[i] - minimum;
            profit = Math.max(profit, cost);
            minimum = Math.min(minimum, stocks[i]);
        }
        return profit;
    }
}
public class StockBuySell{
    public static void main(String args[]){
        int[] stocks = {7,4,1,3,5,6};
        Solution sol = new Solution();
        System.out.println("BruteForce Approach : "+ sol.BruteForce(stocks));
        System.out.println("Optimal Approach : "+ sol.Optimal(stocks));
    }
}