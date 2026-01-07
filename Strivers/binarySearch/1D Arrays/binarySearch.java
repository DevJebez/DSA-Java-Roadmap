class Solution {

    public int iterative(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high =  n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public int recursiveSearch(int[] nums, int target,int low,int high) {

        int mid = (low+high)/2;
        if (target == nums[mid]) return mid;
        else if(target > nums[mid]) return recursiveSearch(nums, target, mid+1, high);
        else return recursiveSearch(nums, target, low, mid - 1);

    }
    public int recursiveSearch(int[] nums, int target){
        return recursiveSearch(nums, target, 0, nums.length-1);
    }
}

public class binarySearch {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {-1,0,1,2,5,9,21};
        int target = 21;
        System.out.println("Brute Force Approach");
        System.out.println(sol.iterative(arr,target));

        System.out.println("Optimal Approach");
        System.out.println(sol.recursiveSearch(arr, target));
    }
}
