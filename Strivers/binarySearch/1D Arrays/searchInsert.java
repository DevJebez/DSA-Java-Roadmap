class Solution {

    public int bruteForce(int[] nums, int target) {
        int n = nums.length;
        if(n == 1){
            if(nums[0] < target) return 1;
            else return 0;
        }
        for(int i = 0; i < n ; i++){
            if(target <= nums[i]){
                return i;
            }
        }
        return n;
    }
    public int optimal(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] <= target){
                //check right part
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return l;
    }
}

public class searchInsert {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,3,5,6};
        int target = 4;
        System.out.println("Brute Force Approach");
        System.out.println(sol.bruteForce(arr, target));

        System.out.println("Optimal Approach");
        System.out.println(sol.optimal(arr, target));
    }
}
