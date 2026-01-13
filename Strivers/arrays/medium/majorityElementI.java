import java.util.*;

class Solution{
    public int bruteforce(int[] nums){
        int majority = nums[0];
        int max_count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = i; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
                if( count > max_count){
                    majority = nums[i];
                    max_count = count;
                }
            }
        }
        return majority;
    }
    public int optimal(int[] arr){
        int ele = 0;
        int count = 0;
        int n = arr.length;
        for(int num: arr){
            if(count == 0){
                count = 1;
                ele = num;
            }
            else if(ele == num){
                count++;
            }
            else{
                count--;
            }
        }
        int count1 = 0;
        for(int num:arr){
            if(num == ele){
                count1++;
            }
        }
        if(count1 > (n/2)){
            return ele;
        }
    return -1;
    }
}
public class majorityElement{
    public static void main(String args[]){
        int[] arr = {1,0,1,2,1,3,1};
        Solution s = new Solution();
        System.out.println("Bruteforce/Better Approach:");
        System.out.println(s.bruteforce(arr));
        System.out.println("Optimal Approach:");
        System.out.println(s.optimal(arr));
    }
}