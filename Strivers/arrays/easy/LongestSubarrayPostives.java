public class LongestSubarrayPostives{
    public static void main(String args[]){
        int[] arr = {5,5,5,9,10};
        int k = 5;//sum
        System.out.println("Result:"+bruteforce(arr,k));
        System.out.println("Result optimal:" + optimal(arr,k));

    }
    private static int optimal(int[] arr, int k){
        int maxlen = 0;
        int sum = arr[0];
        int left = 0;
        int right = 0;
        int n = arr.length;
        while(right < n){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right ++;
            if(right < n){
                sum += arr[right];
            }
        }
        return maxlen;
    }
    private static int bruteforce(int[] arr,int k){
        int max = Integer.MIN_VALUE;
        int sum;
        int count;
        for(int i = 0 ; i<arr.length;i++){
            sum = 0;
            count = 0;
            for(int j = i ;j < arr.length;j++){
                if(sum + arr[j] > k){
                    break;
                }
                sum += arr[j];
                count++;
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}