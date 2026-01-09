import java.util.*;
class Solution{
    private boolean linearSearch(int[] nums, int x){
        int n= nums.length;
        for(int i = 0; i<n;i++){
            if(nums[i] == x){
                return true;
            }
        }
        return false;
    }
    public int bruteForce(int[] nums){
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int longest = 1;
        for(int i = 0; i<n ; i++){
            int x = nums[i];
            int count = 1;
            while(linearSearch(nums,x+1)){
                count+=1;
                x+=1;
            }
            longest = Math.max(longest, count);
        }
        
        return longest;
    }
    public int better(int[] nums){
        int n = nums.length;
        if(n == 0) return n;
        Arrays.sort(nums);
        int prev = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;
        for(int i = 0; i<n ;i++){
            if(nums[i] - 1 == prev){
                count+=1;
                prev = nums[i];
            }
            else if(nums[i] != prev){
                count = 1;
                prev = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    public int optimal(int[] nums){
        int n = nums.length;
        if(n == 0) return n;
        int longest = 1;
        Set<Integer>  st = new HashSet<>();
        for(int i =0; i <n ; i++){
            st.add(nums[i]);
        }
        for(int i : st){
            if(!st.contains(i-1)){
                int count = 1;
                int x = i;
                while(st.contains(x+1)){
                    count += 1;
                    x += 1;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }
}
public class longestSequence{
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] arr = {1,2,100,3,4,101,6,103};
        System.out.println("Bruteforce:" + sol.bruteForce(arr)); 
        System.out.println("Optimal approach:"+sol.optimal(arr));
        System.out.println("Better Approach"+sol.better(arr));
    }
}