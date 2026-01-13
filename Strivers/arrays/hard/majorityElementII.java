import java.util.*;
class Solution{
    public List<Integer> bruteForce(int[] nums){
        int n = nums.length;
        List<Integer> majority = new ArrayList<>();
        for(int i = 0;i < n ; i++){
            if (majority.size() == 0 || majority.get(0) != nums[i] && (majority.size() < 2 || majority.get(1) != nums[i])){      
                int count = 0;
                for(int j = 0 ;j < n; j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
                if(count > n/3){
                    majority.add(nums[i]);
                }
                if(majority.size() == 2){
                    break;
                }
            }
        }
        return majority;
    }
    public List<Integer> better(int[] nums){
        List<Integer> majority = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;
        int threshold = n / 3 + 1; 
        for(int i = 0; i< n; i++){
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
            if(countMap.get(nums[i]) == threshold){
                majority.add(nums[i]);
            }
            if(majority.size() == 2){
                break;
            }
        }
        return majority;
    }
    public List<Integer> optimal(int[] nums){
        //hint : cancelling out majority with candidate elements
        int n = nums.length;
        int element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;
        for(int num : nums){
            if(count1 > 0 && num == element1){
                count1++;
            }else if(count2 > 0 && num == element2){
                count2++;
            }else if(count1 == 0){
                element1 = num;
                count1 = 1;
            }else if(count2 == 0){
                element2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0; count2 = 0;
        for(int i = 0; i<n;i++){
            if(nums[i]==element1) count1++;
            if(nums[i] == element2) count2++;
        }
        int threshold = n/3 + 1;
        List<Integer> majority = new ArrayList<>();
        if(count1 >= threshold) majority.add(element1);
        if(count2 >= threshold) majority.add(element2);
        return majority;
    }
}

public class majorityElementII{
    public static void main(String args[]){
        int[] arr = {2,2,2,1,1,6,1,4};
        Solution sol =  new Solution();
        System.out.println(sol.bruteForce(arr));
        System.out.println(sol.better(arr));
        System.out.println(sol.optimal(arr));
    }
}