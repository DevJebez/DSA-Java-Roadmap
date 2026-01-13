import java.util.*;

// Class to solve 3-sum problem
class Solution {

    // Brute force approach
    public List<List<Integer>> bruteForce(int[] arr, int n) {
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(st);
    }  // ✅ MISSING BRACE WAS HERE

    // Better approach using HashSet
    public List<List<Integer>> better(int[] arr, int n) {
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);

                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(temp);
                    ans.add(temp);
                }

                hashset.add(arr[j]);
            }
        }
        return new ArrayList<>(ans);
    }

    // Optimal two-pointer approach
    public List<List<Integer>> optimal(int[] arr, int n) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                }
                else if (sum < 0) left++;
                else right--;
            }
        }
        return ans;
    }
}

// Driver class
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;

        Solution obj = new Solution();

        List<List<Integer>> res1 = obj.bruteForce(arr, n);
        List<List<Integer>> res2 = obj.better(arr, n);
        List<List<Integer>> res3 = obj.optimal(arr, n);

        System.out.println("Brute Force:");
        for (List<Integer> triplet : res1) {
            System.out.println(triplet);
        }

        System.out.println("Better:");
        for (List<Integer> triplet : res2) {
            System.out.println(triplet);
        }

        System.out.println("Optimal:");
        for (List<Integer> triplet : res3) {
            System.out.println(triplet);
        }
    }
}
