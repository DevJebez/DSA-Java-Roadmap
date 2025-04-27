public class stock_buy_and_sell_maxOne_trans{
    public static void main(String args[]){
        int arr[] = {7, 10, 1, 3, 6, 9, 2};
        int res = 0;
        int minimum = arr[0];
        for(int i = 1;i<arr.length ; i++){
            minimum = Math.min(minimum,arr[i]);
            res = Math.max(res,arr[i]-minimum);
            
        }
        System.out.println(res);
    }
}