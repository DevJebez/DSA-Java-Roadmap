import java.util.*;
class Solution {

    public List<Integer> bruteForce(int[] nums) {
        List<List<Integer>> all = new ArrayList<>();
        Arrays.sort(nums);
        permute(nums, 0, all);
        List<Integer> current = new ArrayList<>();
        for(int num : nums){
            current.add(num);
        }
        for(int i =0; i<all.size(); i++){
            if(all.get(i).equals(current)){
                if(i == all.size()-1){
                    return all.get(0);
                }
                return all.get(i+1);
            }
        }
        return new ArrayList<>();
    }
    private void permute(int[] nums, int start, List<List<Integer>> all){
        if(start == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num: nums) temp.add(num);
            all.add(temp);
            return;
        }
        for(int i = start; i < nums.length; i++){
            swap(nums, i, start);
            permute(nums, start + 1, all);
            swap(nums, i, start); // backtracking
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int[] optimal(int[] arr) {
        int n = arr.length;

        // 1. Find the breaking point
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // 2. If no breakpoint, reverse entire array
        if (index == -1) {
            reverse(arr, 0, n - 1);
            return arr;
        }

        // 3. Find just larger element and swap
        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, i, index);  
                break;
            }
        }

        // 4. Reverse the suffix
        reverse(arr, index + 1, n - 1);

        return arr; 
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}

public class nextPermutation {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1  = {1,2,3};
        System.out.println("Brute Force Approach");
        System.out.println(sol.bruteForce(arr1));
        int[] arr2 = {1,2,3,4,5,6};
        System.out.println("Optimal Approach");
        sol.optimal(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
