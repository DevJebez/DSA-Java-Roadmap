import java.util.*;

public class all_permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }

    private static void backtrack(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length) {
            // Convert array to list and add to result
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(new ArrayList<>(permutation));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);                 // Fix current element
            backtrack(nums, start + 1, result);   // Recurse
            swap(nums, start, i);                 // Backtrack
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Main method to test
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = permute(nums);

        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }
}
