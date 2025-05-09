public class smallest_positive_integer{
    public static void main(String args[]){
        int arr[] = {1,-3,4,5,2};
        int n = arr.length;
        for(int i = 0; i< n ; i++){
            while(arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] !=  arr[i]){
                int c = arr[i] -1; 
                int temp = arr[i];
                arr[i] = arr[c];
                arr[c] = temp;
            }
        }
        for(int i = 0; i< n ; i++){
            if(arr[i] != i+1){
                System.out.println(i+1);
                break;
            }
        }
        System.out.println(n+1);
        break;
        
    }
}