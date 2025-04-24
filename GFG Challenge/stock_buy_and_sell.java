public class stock_buy_and_sell{
    public static void main(String args[]){
        int arr[] = {100,20,2000,300,34,22};
        int res = 0;
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] > arr[i-1]){
                res += arr[i] - arr[i-1];
            }
        }
        System.out.println(res);
    }
}