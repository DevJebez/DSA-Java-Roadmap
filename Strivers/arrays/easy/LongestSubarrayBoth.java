public class LongestSubarrayBoth{
    public static void main(String args[]){
        int arr[]  = {1,2,3,1,1,1,4,2,3};
        int k = 3;
        System.out.println("Brute Force :"+bruteforce(arr, k));
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
    private static int better(int[] arr, int k){
        int maxlen = Integer.MIN_VALUE;
        int sum = arr[0];
        int left = 0;
        int right = 0;
        while(right < arr.length){
            while(sum > k && left <= right){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxlen = Math.max(maxlen, right - left +1);
            }
            if(right < arr.length){
                sum += arr[right];
                right++;
            }
        }
        return maxlen;
    }
        public int getLongestSubarray(int[] a, int k) {
        int n = a.length;
        Map<Integer, Integer> preSumMap = new HashMap<>(); // prefix sum -> index
        int sum = 0;       // Running sum
        int maxLen = 0;    // Longest subarray length

        for (int i = 0; i < n; i++) {
            sum += a[i]; // Update running prefix sum

            // Case 1: If full subarray from 0 to i has sum = k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: If (sum - k) was seen before
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem); // Length of current valid subarray
                maxLen = Math.max(maxLen, len);
            }

            // Store the first occurrence of a prefix sum
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
    private int Optimal(int[] a, int k) {
        int n = a.length;
        Map<Integer, Integer> preSumMap = new HashMap<>(); // prefix sum -> index
        int sum = 0;       // Running sum
        int maxLen = 0;    // Longest subarray length

        for (int i = 0; i < n; i++) {
            sum += a[i]; // Update running prefix sum

            // Case 1: If full subarray from 0 to i has sum = k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: If (sum - k) was seen before
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem); // Length of current valid subarray
                maxLen = Math.max(maxLen, len);
            }

            // Store the first occurrence of a prefix sum
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
}
