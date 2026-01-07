import java.util.*;
class Solution{
    public int[] Bruteforce(int[] arr){
        int count0= 0, count1 = 0, count2 = 0;
        for(int num:arr){
            if(num == 0) count0++;
            else if(num == 1) count1++;
            else count2++;
        }
        int index = 0;
        while(count0 > 0){
            arr[index] = 0;
            index++;
            count0--;
        }
        while(count1>0){
            arr[index] = 1;
            index++;
            count1--;
        }
        while(count2>0){
            arr[index] = 2;
            index++;
            count2--;
        }
        return arr;
    }
    public int[] Optimal(int[] arr){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        return arr;
    }
}
public class SortColors{
    public static void main(String args[]){
        int[] nums = {0,1,0,2,0,2,2,1};
        Solution s = new Solution();
        System.out.println("Bruteforce:");
        int[] res1 = s.Bruteforce(nums);
        for(int num:res1){
            System.out.print(num+",");
        }
        System.out.println("\nOptimal:");
        int[] res2 = s.Optimal(nums);
        for(int num:res1){
            System.out.print(num+",");
        } 
    }
}