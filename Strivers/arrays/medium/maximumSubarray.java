import java.util.*;
class Solution{
    public int BruteForce(int[] nums){
        /* Initialize maximum sum with
           the smallest possible integer */
        int maxi = Integer.MIN_VALUE;

        // Iterate over each starting index of subarrays
        for (int i = 0; i < nums.length; i++) {
            
            /* Iterate over each ending index
               of subarrays starting from i */
            for (int j = i; j < nums.length; j++) {
                
                /* Variable to store the sum
                   of the current subarray */
                int sum = 0;

                // Calculate the sum of subarray nums[i...j]
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                /* Update maxi with the maximum of its current
                   value and the sum of the current subarray */
                maxi = Math.max(maxi, sum);
            }
        }

        // Return the maximum subarray sum found
        return maxi;
    }
    public int Better(int[] nums){
        /* Initialize maximum sum with
           the smallest possible integer */
        int maxi = Integer.MIN_VALUE;

        // Iterate over each starting index of subarrays
        for (int i = 0; i < nums.length; i++) {
            
            /* Variable to store the sum
               of the current subarray */
            int sum = 0; 
            
            /* Iterate over each ending index
               of subarrays starting from i */
            for (int j = i; j < nums.length; j++) {
                
                /* Add the current element nums[j] to
                   the sum i.e. sum of nums[i...j-1] */
                sum += nums[j];

                /* Update maxi with the maximum of its current
                   value and the sum of the current subarray */
                maxi = Math.max(maxi, sum);
            }
        }

        // Return the maximum subarray sum found
        return maxi;
    }
    public int Optimal(int[] nums){
        int sum = 0;
        int maximum = Integer.MIN_VALUE;
        for(int num: nums){
            sum += num;
            if(sum > maximum){
                maximum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maximum;
    }
}

public class maximumSubarray{
    public static void main(String[] args){
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        Solution sol = new Solution();
        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + sol.BruteForce(arr));
        System.out.println("The maximum subarray sum is: " + sol.Better(arr));
        System.out.println("The maximum subarray sum is: " + sol.Optimal(arr));
        
    }
}
