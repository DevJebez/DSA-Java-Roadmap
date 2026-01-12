import java.util.*;

class Solution {

    // Brute force: O(n^2), works for negative numbers also
    public int bruteForce(int[] arr, int k) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    // Optimal: O(n) using prefix sum + hashmap
    public int optimal(int[] arr, int k) {
        int prefixSum = 0;
        int count = 0;

        // prefixSum -> frequency
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        // Base case: prefix sum 0 occurs once
        prefixSumCount.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            int rem = prefixSum - k;

            if (prefixSumCount.containsKey(rem)) {
                count += prefixSumCount.get(rem);
            }

            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}

public class subarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 3, 3};
        int k = 3;

        Solution sol = new Solution();

        System.out.println("Brute Force Answer: " + sol.bruteForce(arr, k));
        System.out.println("Optimal Answer: " + sol.optimal(arr, k));
    }
}
